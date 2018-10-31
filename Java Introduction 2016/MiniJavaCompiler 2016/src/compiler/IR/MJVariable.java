package compiler.IR;

public class MJVariable extends IR {

	private MJType type;
	private String name;
	private boolean isField = false; 
	private MJExpression init;
	
	// this stores information for the code generator
	// for fields this means offset into the object's memory
	// for variables and parameters this means offset into the call frame
	
	private int offset = -1;

	public MJVariable() {}
	
	public MJVariable(MJType t, String name) {
		this.type = t;
		this.name = name;
	}

	public MJType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public boolean isField() {
		return this.isField;
	}

	public void setIsField() {
		this.isField = true;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public int getOffset() {
		return this.offset;
	}

	public MJExpression getInit() {
		return this.init;
	}

}
