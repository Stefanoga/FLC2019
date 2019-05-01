package culoprova;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class avvio {

	public static void main(String[] args) throws RecognitionException {
		
		ANTLRStringStream in = new ANTLRStringStream("TITLE culoprova DRAWSPACE WIDTH 6 DRAWSPACE HEIGTH 4 LINE: XSTART 3 "
				+ "YSTART 7 XEND 14 YEND 45 END");
	     G8provaLexer lexer = new G8provaLexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8provaParser parser = new G8provaParser(tokens);
	     parser.begin();

	}

}
