package start;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		
		 String stringa = "TITLE prova DRAWSPACE WIDTH 6 DRAWSPACE HEIGTH 2.0 LINE: XSTART 3.0 YSTART 4.0 XEND 7.0 YEND 8.0";
		 ANTLRStringStream in = new ANTLRStringStream(stringa);
	     G8Lexer lexer = new G8Lexer(in);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     G8Parser parser = new G8Parser(tokens);
	     parser.begin();
	     
	     //test file
	     readFile();
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
	
	public static void readFile() throws IOException {
		
		File inputFile = new File("C:\\Users\\matte\\git\\FLC2019\\G8\\file\\input.g8");
		
		InputStream is = new FileInputStream(inputFile); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
		
		String line = buf.readLine(); 
		StringBuilder sb = new StringBuilder();
		
		while(line != null){
			sb.append(line).append(" "); 
			line = buf.readLine(); 
		} 
		
		String fileAsString = sb.toString();
		
		System.out.println("Input : " + fileAsString);
		buf.close();
	}
	
	public static void writeFile(String toWrite) throws IOException {
		
		File outputFile = new File("C:\\Users\\matte\\git\\FLC2019\\G8\\file\\output.html");
		
		FileWriter out = new FileWriter(outputFile, true);
		BufferedWriter buf  = new BufferedWriter(out);
		
		out.append(toWrite);
		
		out.close();
		
	}

}