package start;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import lexer.G8Lexer;
import parser.G8Parser;

public class G8 {

	public static void main(String[] args) {
		 ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
	     G8Lexer lexer = new G8Lexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8Parser parser = new G8Parser(tokens);
	     parser.begin();

	}

}
