package compiler.IR;

import java.util.LinkedList;

public class MJBlock extends MJStatement {

	private LinkedList<MJVariable> variables = new LinkedList<MJVariable>();
	private LinkedList<MJStatement> statements = new LinkedList<MJStatement>();

	public MJBlock() {}
	
	public MJBlock(LinkedList<MJVariable> vdl, LinkedList<MJStatement> sdl) {
		this.variables = vdl;
		this.statements = sdl;
	}

	public LinkedList<MJVariable> getVariables() {
		return this.variables;
	}

	public LinkedList<MJStatement> getStatements() {
		return this.statements;
	}

	public int requiredStackSize() { 
		
		int maxsize = 0;
		
		for (MJStatement s : this.statements) {
			maxsize = Math.max(maxsize, s.requiredStackSize());
		}
		return maxsize;
	}

}
