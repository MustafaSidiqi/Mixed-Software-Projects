package compiler.Phases;

import compiler.CODE.CODE;
import compiler.Exceptions.*;
import compiler.IR.*;
import compiler.Compiler;

public class Backend {

	public static void generateCode(IR ir) throws CodeGenException {
		
		if (Compiler.isDebug()) {
			PrettyPrint.print(ir);
		}
		
		CODE code = GenerateCode.generate(ir);
		code.dump();		
	}
}
