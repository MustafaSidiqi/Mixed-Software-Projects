package compiler.IR;

import java.util.LinkedList;

import compiler.CODE.LC3.LC3label;

public class MJMethod extends IR {

	private MJType returnType;
	private String name;
	private LinkedList<MJVariable> parameters;
	private MJBlock body;
	private boolean isStatic;
	private boolean isPublic;
	private boolean isEntry;

	// this represents the offset into the virtual method table

	private LC3label label;
	private int varCount = 0;
	private int MSS;

	public MJMethod() {}
	
	public MJMethod(MJType returnType, String name, LinkedList<MJVariable> parList,
			MJBlock b, boolean isStatic, boolean isPublic) {
		this(returnType, name, parList, b, isStatic, isPublic, false);
	}
	
	public MJMethod(MJType returnType, String name, LinkedList<MJVariable> parList,
			MJBlock b, boolean isStatic, boolean isPublic, boolean isEntry) {
		this.returnType = returnType;
		this.name = name;
		this.parameters = parList;
		this.body = b;
		this.isStatic = isStatic;
		this.isPublic = isPublic;
		this.isEntry = isEntry;

	}

	public String getName() {
		return name;
	}

	public LinkedList<MJVariable> getParameters() {
		return parameters;
	}

	public MJType getReturnType() {
		return returnType;
	}

	public MJBlock getBody() {
		return body;
	}

	public boolean isStatic() {
		return this.isStatic;
	}

	public boolean isPublic() {
		return this.isPublic;
	}

	public boolean isEntry() {
		return isEntry;
	}

	public void setEntry() {
		this.isEntry=true;
	}
	
	public void setLabel(LC3label newLabel) {
		this.label = newLabel;
	}

	public LC3label getLabel() {
		return this.label;
	}

	public void setVarCount(int cnt) {
		this.varCount = cnt;
	}

	public int getVarCount() {
		return this.varCount;
	}

	public void setMaxStackSize(int maxStackSize) {
		this.MSS = maxStackSize;
	}

	public int getMaxStackSize() {
		return this.MSS;
	}

}
