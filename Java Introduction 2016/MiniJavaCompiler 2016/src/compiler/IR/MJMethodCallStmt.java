package compiler.IR;

import java.util.LinkedList;

public class MJMethodCallStmt extends MJStatement {

	
	private MJMethodCallExpr methodCall;

	public MJMethodCallStmt() {}
	
	public MJMethodCallStmt(MJIdentifierClass object, String methodName, LinkedList<MJExpression> arguments) {
			this(new MJMethodCallExpr(object, methodName, arguments));
	}

	public MJMethodCallStmt(MJMethodCallExpr call) {
		this.methodCall = call;
	}

	public MJMethodCallExpr getMethodCallExpr() {
		return this.methodCall;
	}

	public void setMethodCallExpr(MJMethodCallExpr methodCallExpr) {	
		this.methodCall = methodCallExpr;
	}
	
	public int requiredStackSize() {
		
		int maxsize = 0;
		
		maxsize += this.methodCall.getArguments().size();
		
		for (MJExpression arg : this.methodCall.getArguments()) {
			maxsize += arg.requiredStackSize();
		}
		
		maxsize += 6;
		
		return maxsize;
	}


}
