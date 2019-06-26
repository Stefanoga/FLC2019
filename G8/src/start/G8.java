package start;

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

import lexer.G8Lexer;
import parser.G8Parser;

public class G8 {

	public static void main(String[] args) throws RecognitionException, IOException {
		
		 String stringa = readFile();
		 
		 //test to delete
		 System.out.println(stringa);
		 
		 ANTLRStringStream in = new ANTLRStringStream(stringa);
	     G8Lexer lexer = new G8Lexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8Parser parser = new G8Parser(tokens);
	     parser.begin();
	     
	     //testOutputFile to delete
	     //testFile();
	     
	     //testLineMethod
	     /*
		 ANTLRStringStream in2 = new ANTLRStringStream("TITLE prova DRAWSPACE WIDTH 500 DRAWSPACE HEIGTH 500 " +
					"LINE: XSTART 300 YSTART 300 XEND 400 YEND 400 WIDTH 5 " + 
					"TRIANGLE: XA 1 YA 1 XB 1 YB 200 XC 200 YC 200 WIDTH 5 " +
					"END");
	     G8Lexer lexer2 = new G8Lexer(in2);
	     CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
	     G8Parser parser2 = new G8Parser(tokens2);
	     parser2.line();*/

	}
	
	public static String readFile() throws IOException {
		
		File inputFile = new File("C:\\\\Users\\\\matte\\\\git\\\\FLC2019\\\\G8\\\\files\\\\input.g8");
		
		InputStream is = new FileInputStream(inputFile); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
		
		String line = buf.readLine(); 
		StringBuilder sb = new StringBuilder();
		
		while(line != null){
			sb.append(line).append(""); 
			line = buf.readLine(); 
		} 
		
		String fileAsString = sb.toString();
		
		buf.close();
		
		return fileAsString;
	}
	
	public static void writeFile(String toWrite) throws IOException {
		
		File outputFile = new File("C:\\\\Users\\\\matte\\\\git\\\\FLC2019\\\\G8\\\\files\\\\input.g8");
		
		FileWriter out = new FileWriter(outputFile, true);
		BufferedWriter buf  = new BufferedWriter(out);
		
		out.append(toWrite);
		
		out.close();
		
	}
	
	public static void testFile() throws IOException {

	     writeFile("<!DOCTYPE HTML>\r\n" + 
	     		"\r\n" + 
	     		"<html>\r\n" + 
	     		"   <head>\r\n" + 
	     		"   \r\n" + 
	     		"      <style>\r\n" + 
	     		"         #mycanvas{border:1px solid red;}\r\n" + 
	     		"      </style>\r\n" + 
	     		"   </head>\r\n" + 
	     		"   \r\n" + 
	     		"   <body>\r\n" + 
	     		"      <canvas id = \"mycanvas\" width = \"100\" height = \"100\"></canvas>\r\n" + 
	     		"   </body>\r\n" + 
	     		"</html>");
	}

}