package com.testingJUnit.mathematic;

public class Mathemator implements Addition, Substraction, Multiply,Division {

	@Override
	public long substraction(long... operands) {
		long ret = operands[0];
		for (int i = 1;i<operands.length; i++){
			ret -= operands[i];
		}
		return ret;
	}

	@Override
	public long addition(long... operands) {
		long ret = 0;
		for (long operand : operands){
			ret += operand;
		}
		return ret;
	}

	@Override
	public long multiply(long... operands) {
		long ret = operands[0];
		for (int i = 0;i<operands.length;i++){
			if(i!=operands.length-1)	
				ret *= operands[i+1];
		} 
		return ret;
	}

	@Override
	public long divide2(long... operands) {
		long ret = operands[0];
		for (int i = 0;i<operands.length;i++){
			if(i!=operands.length-1)	
				ret /= operands[i+1];
		} 
		return ret;
	}

}
