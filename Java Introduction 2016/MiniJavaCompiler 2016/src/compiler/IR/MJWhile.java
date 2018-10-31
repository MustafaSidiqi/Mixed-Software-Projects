package compiler.IR;

public class MJWhile extends MJStatement {

	private MJExpression condition;
	private MJBlock block;

	public MJWhile() {}
	
	public MJWhile(MJExpression condition, MJBlock block) {
		this.condition = condition;
		this.block = block;
	}

	public MJExpression getCondition() {
		return this.condition;
	}

	public MJBlock getBlock() {
		return block;
	}

	public void setCondition(MJExpression _condition) {
		this.condition = _condition;
	}

	public int requiredStackSize() { 
		return Math.max(this.condition.requiredStackSize(), 1 + this.block.requiredStackSize());
	}

}
