package compiler.IR;

public final class MJNoExpression extends MJExpression {

	public MJNoExpression() {		
	}

	public int requiredStackSize() { 
		return 0;
	}

}
