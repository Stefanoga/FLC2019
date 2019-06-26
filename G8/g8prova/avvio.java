package start;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import lexer.G8newLexer;
import parser.G8newParser;

public class avvio {

	public static void main(String[] args) throws RecognitionException {
		
		ANTLRStringStream in = new ANTLRStringStream("TITLE culoprova DRAWSPACE WIDTH 500 DRAWSPACE HEIGTH 500 " +
		"LINE: NAME linea1 XSTART 300 YSTART 300 XEND 400 YEND 400 WIDTH 5 " + 
		"TRIANGLE: NAME triangolo1 XA 1 YA 1 XB 1 YB 200 XC 200 YC 200 WIDTH 5 " +
		"END");
	     G8newLexer lexer = new G8newLexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8newParser parser = new G8newParser(tokens);
	     parser.begin();
	}
}