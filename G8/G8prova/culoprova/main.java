package culoprova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import culoprova.culoprovaLexer;
import culoprova.culoprovaParser;

public class main {

	public static void main(String[] args) throws RecognitionException, IOException {
		 
		 ANTLRStringStream in = new ANTLRStringStream("TITLE culoprova DRAWSPACE WIDTH 6 DRAWSPACE HEIGTH 4");
	     culoprovaLexer lexer = new culoprovaLexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     culoprovaParser parser = new culoprovaParser(tokens);
	     parser.begin();
	     
	}

}