package compiler.Exceptions;

@SuppressWarnings("serial")
public class ParseError extends Exception {

	public ParseError(String string) {
		super(string);
	}

}
