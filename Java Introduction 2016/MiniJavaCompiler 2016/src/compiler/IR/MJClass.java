package compiler.IR;

import java.util.LinkedList;

public class MJClass extends IR {

	private String name;
	private MJType superClass;
	private LinkedList<MJMethod> methodList = new LinkedList<MJMethod>();
	private LinkedList<MJVariable> fieldList = new LinkedList<MJVariable>();

	private int size;
	private int fieldOffsets = -1;
	private boolean isTop = false;

	public MJClass() {}
	
	// this we have just for the main class

	public MJClass(String name, MJMethod md) {
		this.name = name;
		LinkedList<MJMethod> methodList = new LinkedList<MJMethod>();
		methodList.addFirst(md);
		this.methodList = methodList;
		this.superClass = MJType.getClassType("Object");
	}

	// and this is for the general case

	public MJClass(String name, String superClassName,
			LinkedList<MJVariable> vdl, LinkedList<MJMethod> mdl) {
		this.name = name;
		this.fieldList = vdl;
		this.methodList = mdl;
		this.superClass = MJType.getClassType(superClassName);
	}

	public MJClass(String name, LinkedList<MJVariable> vdl, LinkedList<MJMethod> mdl) {
		this.name = name;
		this.fieldList = vdl;
		this.methodList = mdl;
		this.isTop = true;
	}

	public LinkedList<MJMethod> getMethodList() {
		return methodList;
	}

	public String getName() {
		return name;
	}

	public LinkedList<MJVariable> getFieldList() {
		return fieldList;
	}

	public void setSuperClass(MJType superClass) {
		this.superClass = superClass;
	}

	public MJType getSuperClass() {
		return superClass;
	}

	public boolean isTop() {
		return this.isTop;
	}

	public void setAsTop() {
		this.isTop = true;
		
	}
	
	public void setSize(int size) {
		this.size = size;		
	}

	public int getSize() {
		return this.size;		
	}
	
	public void setFieldOffsets(int i) {
		this.fieldOffsets = i;
	}
	
	public int getFieldOffsets() {
		return this.fieldOffsets;
	}

}
