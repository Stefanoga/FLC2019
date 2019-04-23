package parser;
// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g 2019-04-23 17:32:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CIRCLE", "COMMENT", "CURVE", 
		"ELLIPSE", "FLOAT", "G8", "LINE", "LIST", "RECTANGLE", "RGB", "TEXT", 
		"TRIANGLE", "WS"
	};
	public static final int EOF=-1;
	public static final int CIRCLE=4;
	public static final int COMMENT=5;
	public static final int CURVE=6;
	public static final int ELLIPSE=7;
	public static final int FLOAT=8;
	public static final int G8=9;
	public static final int LINE=10;
	public static final int LIST=11;
	public static final int RECTANGLE=12;
	public static final int RGB=13;
	public static final int TEXT=14;
	public static final int TRIANGLE=15;
	public static final int WS=16;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public G8Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return G8Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g"; }



	// $ANTLR start "begin"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:1: begin : G8 ;
	public final void begin() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:7: ( G8 )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:9: G8
			{
			match(input,G8,FOLLOW_G8_in_begin10); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "begin"



	// $ANTLR start "drawLine"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:1: drawLine : LINE ;
	public final void drawLine() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:9: ( LINE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:11: LINE
			{
			match(input,LINE,FOLLOW_LINE_in_drawLine19); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawLine"



	// $ANTLR start "drawTriangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:1: drawTriangle : TRIANGLE ;
	public final void drawTriangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:13: ( TRIANGLE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:15: TRIANGLE
			{
			match(input,TRIANGLE,FOLLOW_TRIANGLE_in_drawTriangle28); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawTriangle"



	// $ANTLR start "drawRectangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:1: drawRectangle : RECTANGLE ;
	public final void drawRectangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:14: ( RECTANGLE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:16: RECTANGLE
			{
			match(input,RECTANGLE,FOLLOW_RECTANGLE_in_drawRectangle37); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawRectangle"



	// $ANTLR start "drawCurve"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:1: drawCurve : CURVE ;
	public final void drawCurve() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:10: ( CURVE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:12: CURVE
			{
			match(input,CURVE,FOLLOW_CURVE_in_drawCurve46); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawCurve"



	// $ANTLR start "drawCircle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:1: drawCircle : CIRCLE ;
	public final void drawCircle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:11: ( CIRCLE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:13: CIRCLE
			{
			match(input,CIRCLE,FOLLOW_CIRCLE_in_drawCircle55); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawCircle"



	// $ANTLR start "drawEllipse"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:1: drawEllipse : ELLIPSE ;
	public final void drawEllipse() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:12: ( ELLIPSE )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:14: ELLIPSE
			{
			match(input,ELLIPSE,FOLLOW_ELLIPSE_in_drawEllipse64); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drawEllipse"

	// Delegated rules



	public static final BitSet FOLLOW_G8_in_begin10 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINE_in_drawLine19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIANGLE_in_drawTriangle28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECTANGLE_in_drawRectangle37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURVE_in_drawCurve46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CIRCLE_in_drawCircle55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSE_in_drawEllipse64 = new BitSet(new long[]{0x0000000000000002L});
}
