package compiler.IR;

public class MJIfElse extends MJIf {

	private MJBlock elseBlock;

	public MJIfElse() {}
	
	public MJIfElse(MJExpression condition, MJBlock ifBlock, MJBlock elseBlock) {
		super(condition, ifBlock);
		this.elseBlock = elseBlock;
	}

	public MJBlock getElseBlock() {
		return this.elseBlock;
	}

	public int requiredStackSize() {
		int maxstack = super.requiredStackSize();	
		maxstack = Math.max(maxstack, this.getElseBlock().requiredStackSize());
		return maxstack;
	}


}
