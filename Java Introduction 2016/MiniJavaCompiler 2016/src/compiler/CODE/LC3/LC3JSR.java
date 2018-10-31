package compiler.CODE.LC3;


public class LC3JSR extends LC3Instruction {

	private LC3label offset;
	
	protected LC3JSR() {}
	
	public LC3JSR(LC3label o) {
		this.offset = o;
	}
	
	public String toString() {
		return "JSR "+this.offset;
	}

}
