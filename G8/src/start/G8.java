package start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import gui.Ide;
import lexer.G8Lexer;
import parser.G8Parser;
import parser.G8Parser.SameNameError;
import parser.G8Parser.ShapeLayoutError;

public class G8 {

	public static void main(String[] args) throws RecognitionException, IOException, SameNameError, ShapeLayoutError {
	     
	     Ide window = new Ide();
		 window.frame.setVisible(true);
		 window.frame.setTitle("G8 IDE");
		 window.frame.setResizable(false);
		 window.frame.setLocationRelativeTo(null);

	}
	
	
	public static void save(String nameFile, String dir, String code) throws IOException {
		
		
		File outputFile = new File(dir+"\\"+nameFile);
		outputFile.delete();
		outputFile.createNewFile();
		
		FileWriter out = new FileWriter(outputFile, true);
		
		out.append(code);
		
		out.close();
		
	}
	
	public static String load(String nameFile, String dir) throws IOException {
			
		File inputFile = new File(dir+"\\"+nameFile);
			
		InputStream is = new FileInputStream(inputFile); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
			
		String line = buf.readLine(); 
		StringBuilder sb = new StringBuilder();
			
		while(line != null){
			sb.append(line).append("\n"); 
			line = buf.readLine(); 
		} 
			
		String fileAsString = sb.toString();
			
		buf.close();
			
		return fileAsString;
		
	}

	public static void draw(String nameFile, String dir, String code) throws IOException, RecognitionException, SameNameError, ShapeLayoutError, parser.G8Parser.SameNameError, parser.G8Parser.ShapeLayoutError {
		
		ANTLRStringStream in = new ANTLRStringStream(code);
	    G8Lexer lexer = new G8Lexer(in);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    G8Parser parser = new G8Parser(tokens);
	    parser.begin(nameFile, dir);
	}
	
public static void writeHTML(String toWrite, String nameFile, String dir) throws IOException {
		
		File outputFile = new File(dir+"\\"+nameFile);
		
		FileWriter out = new FileWriter(outputFile, true);
		
		out.append(toWrite);
		
		if(toWrite != "</html>") {
			out.append("\n");
		}
		
		out.close();
		
	}

}