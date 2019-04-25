package start;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import lexer.G8Lexer;
import parser.G8Parser;

public class G8 {

	public static void main(String[] args) throws RecognitionException {
		 String stringa = "TITLE prova DRAWSPACE WIDTH 6 DRAWSPACE HEIGTH 2.0 LINE: XSTART 3.0 YSTART 4.0 XEND 7.0 YEND 8.0";
		 ANTLRStringStream in = new ANTLRStringStream(stringa);
	     G8Lexer lexer = new G8Lexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8Parser parser = new G8Parser(tokens);
	     parser.begin();

	}

}