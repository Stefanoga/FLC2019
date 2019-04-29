package culoprova;

// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g 2019-04-29 17:11:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8provaParser extends Parser {
	
	String Titolo;
	float DrawspaceWidth, DrawspaceHeigth;
	
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "RGB", "ROTATION", 
		"TEXT", "WS", "'CIRC:'", "'COLOR'", "'COLORBODY'", "'CURV:'", "'DRAWSPACE HEIGTH'", 
		"'DRAWSPACE WIDTH'", "'ELLIPS:'", "'END'", "'ENDANGLE'", "'LINE:'", "'RADIUS'", 
		"'RECT:'", "'ROTATION'", "'SEMAX'", "'SEMIN'", "'STARTANGLE'", "'TITLE'", 
		"'TRIANGLE:'", "'WIDTH'", "'XA'", "'XB'", "'XC'", "'XCENTER'", "'XEND'", 
		"'XMIDDLE'", "'XSTART'", "'YA'", "'YB'", "'YC'", "'YCENTER'", "'YEND'", 
		"'YMIDDLE'", "'YSTART'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int COMMENT=4;
	public static final int FLOAT=5;
	public static final int RGB=6;
	public static final int ROTATION=7;
	public static final int TEXT=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public G8provaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8provaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return G8provaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g"; }



	// $ANTLR start "begin"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:3:1: begin : 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end ;
	public final void begin() throws RecognitionException {
		Token b1=null;
		Token b2=null;
		Token b3=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:3:7: ( 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:3:9: 'TITLE' b1= TEXT 'DRAWSPACE WIDTH' b2= FLOAT 'DRAWSPACE HEIGTH' b3= FLOAT ( list )* end
			{
			match(input,26,FOLLOW_26_in_begin10); 
			b1=(Token)match(input,TEXT,FOLLOW_TEXT_in_begin14); 
			Titolo=(b1!=null?b1.getText():null);
			match(input,15,FOLLOW_15_in_begin18); 
			b2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_begin22); 
			DrawspaceWidth=Float.valueOf((b2!=null?b2.getText():null));
			match(input,14,FOLLOW_14_in_begin26); 
			b3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_begin30); 
			DrawspaceHeigth=Float.valueOf((b3!=null?b3.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:3:154: ( list )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==10||LA1_0==13||LA1_0==16||LA1_0==19||LA1_0==21||LA1_0==27) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:3:155: list
					{
					pushFollow(FOLLOW_list_in_begin35);
					list();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_end_in_begin39);
			end();
			state._fsp--;

			System.out.println("<!doctype html>");
					 System.out.println("<html>");
					 System.out.println("<head>");
					 System.out.println("<title> " + Titolo + " </title>");
					 System.out.println("<style> canvas {border: 1px #000 dotted;} </style>");
					 System.out.println("<script>");
					 System.out.println("window.onload = function () {");
			 		 	System.out.println("var canvas = document.getElementById('" + Titolo + "');");
					 	System.out.println("var context = canvas.getContext('2d');");
					
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



	// $ANTLR start "list"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:1: list : ( line | triangle | rectangle | curve | circle | ellipse );
	public final void list() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:6: ( line | triangle | rectangle | curve | circle | ellipse )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt2=1;
				}
				break;
			case 27:
				{
				alt2=2;
				}
				break;
			case 21:
				{
				alt2=3;
				}
				break;
			case 13:
				{
				alt2=4;
				}
				break;
			case 10:
				{
				alt2=5;
				}
				break;
			case 16:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:8: line
					{
					pushFollow(FOLLOW_line_in_list59);
					line();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:16: triangle
					{
					pushFollow(FOLLOW_triangle_in_list64);
					triangle();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:28: rectangle
					{
					pushFollow(FOLLOW_rectangle_in_list69);
					rectangle();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:41: curve
					{
					pushFollow(FOLLOW_curve_in_list74);
					curve();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:50: circle
					{
					pushFollow(FOLLOW_circle_in_list79);
					circle();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:16:60: ellipse
					{
					pushFollow(FOLLOW_ellipse_in_list84);
					ellipse();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "list"



	// $ANTLR start "line"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:1: line : 'LINE:' 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )? ;
	public final void line() throws RecognitionException {
		Token l1=null;
		Token l2=null;
		Token l3=null;
		Token l4=null;
		Token l5=null;
		Token l6=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:7: ( 'LINE:' 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:9: 'LINE:' 'XSTART' l1= FLOAT 'YSTART' l2= FLOAT 'XEND' l3= FLOAT 'YEND' l4= FLOAT ( 'COLOR' l5= RGB )? ( 'WIDTH' l6= FLOAT )?
			{
			match(input,19,FOLLOW_19_in_line95); 
			match(input,35,FOLLOW_35_in_line97); 
			l1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line101); 
			float xstart=Float.valueOf((l1!=null?l1.getText():null));
			match(input,42,FOLLOW_42_in_line105); 
			l2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line109); 
			float ystart=Float.valueOf((l2!=null?l2.getText():null));
			match(input,33,FOLLOW_33_in_line113); 
			l3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line117); 
			float xend=Float.valueOf((l3!=null?l3.getText():null));
			match(input,40,FOLLOW_40_in_line121); 
			l4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line125); 
			float yend=Float.valueOf((l4!=null?l4.getText():null));
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:181: ( 'COLOR' l5= RGB )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==11) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:182: 'COLOR' l5= RGB
					{
					match(input,11,FOLLOW_11_in_line130); 
					l5=(Token)match(input,RGB,FOLLOW_RGB_in_line134); 
					String color=(l5!=null?l5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:224: ( 'WIDTH' l6= FLOAT )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				alt4=1;
			}
			
			float width = 0, color=0;
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:19:225: 'WIDTH' l6= FLOAT
					{
					match(input,28,FOLLOW_28_in_line141); 
					l6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_line145); 
					width=Float.valueOf((l6!=null?l6.getText():null));
					}
					break;

			}

			System.out.println("context.beginPath();");
					 System.out.println("context.lineWidth = " + width + ";");
					 System.out.println("context.strokeStyle = " + color + ";");
					 System.out.println("context.moveTo( " + xstart + ", " + ystart + ");");
					 System.out.println("context.lineTo( " + xend + ", " + yend + ");");
					 System.out.println("context.stroke();");
					 System.out.println("context.closePath();");
					
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
	// $ANTLR end "line"



	// $ANTLR start "triangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:1: triangle : 'TRIANGLE:' 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )? ;
	public final void triangle() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;
		Token t5=null;
		Token t6=null;
		Token t7=null;
		Token t8=null;
		Token t9=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:11: ( 'TRIANGLE:' 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:13: 'TRIANGLE:' 'XA' t1= FLOAT 'YA' t2= FLOAT 'XB' t3= FLOAT 'YB' t4= FLOAT 'XC' t5= FLOAT 'YC' t6= FLOAT ( 'COLOR' t7= RGB )? ( 'WIDTH' t8= FLOAT )? ( 'COLORBODY' t9= RGB )?
			{
			match(input,27,FOLLOW_27_in_triangle165); 
			match(input,29,FOLLOW_29_in_triangle167); 
			t1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle171); 
			float xa=(t1!=null?t1.getText():null);
			match(input,36,FOLLOW_36_in_triangle175); 
			t2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle179); 
			float ya=(t2!=null?t2.getText():null);
			match(input,30,FOLLOW_30_in_triangle183); 
			t3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle187); 
			float xb=(t3!=null?t3.getText():null);
			match(input,37,FOLLOW_37_in_triangle191); 
			t4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle195); 
			float yb=(t4!=null?t4.getText():null);
			match(input,31,FOLLOW_31_in_triangle199); 
			t5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle203); 
			float xc=(t5!=null?t5.getText():null);
			match(input,38,FOLLOW_38_in_triangle207); 
			t6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle211); 
			float yc=(t6!=null?t6.getText():null);
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:235: ( 'COLOR' t7= RGB )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==11) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:236: 'COLOR' t7= RGB
					{
					match(input,11,FOLLOW_11_in_triangle216); 
					t7=(Token)match(input,RGB,FOLLOW_RGB_in_triangle220); 
					String color=(t7!=null?t7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:278: ( 'WIDTH' t8= FLOAT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==28) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:279: 'WIDTH' t8= FLOAT
					{
					match(input,28,FOLLOW_28_in_triangle227); 
					t8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_triangle231); 
					float width=(t8!=null?t8.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:322: ( 'COLORBODY' t9= RGB )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==12) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:30:323: 'COLORBODY' t9= RGB
					{
					match(input,12,FOLLOW_12_in_triangle238); 
					t9=(Token)match(input,RGB,FOLLOW_RGB_in_triangle242); 
					String colorbody=(t9!=null?t9.getText():null);
					}
					break;

			}

			System.out.println("context.beginPath();");
					 	 System.out.println("context.lineWidth = " + width + ";");
					 	 System.out.println("context.strokeStyle = " + color + ";");
					 	 System.out.println("context.moveTo(" + xa + ", " + ya + ");");
					 	 System.out.println("context.lineTo(" + xb + ", " + yb + ");");
						 System.out.println("context.lineTo(" + xc + ", " + yc + ");");
						 System.out.println("context.stroke();");
						 System.out.println("context.fillStyle= " + colorbody + ";");
						 System.out.println("context.fill();");
						 System.out.println("context.closePath();");
						
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
	// $ANTLR end "triangle"



	// $ANTLR start "rectangle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:1: rectangle : 'RECT:' 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )? ;
	public final void rectangle() throws RecognitionException {
		Token r1=null;
		Token r2=null;
		Token r3=null;
		Token r4=null;
		Token r5=null;
		Token r6=null;
		Token r7=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:12: ( 'RECT:' 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:14: 'RECT:' 'XSTART' r1= FLOAT 'YSTART' r2= FLOAT 'XEND' r3= FLOAT 'YEND' r4= FLOAT ( 'COLOR' r5= RGB )? ( 'WIDTH' r6= FLOAT )? ( 'COLORBODY' r7= RGB )?
			{
			match(input,21,FOLLOW_21_in_rectangle262); 
			match(input,35,FOLLOW_35_in_rectangle264); 
			r1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle268); 
			float xstart=(r1!=null?r1.getText():null);
			match(input,42,FOLLOW_42_in_rectangle272); 
			r2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle276); 
			float ystart=(r2!=null?r2.getText():null);
			match(input,33,FOLLOW_33_in_rectangle280); 
			r3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle284); 
			float xend=(r3!=null?r3.getText():null);
			match(input,40,FOLLOW_40_in_rectangle288); 
			r4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle292); 
			float yend=(r4!=null?r4.getText():null);
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:186: ( 'COLOR' r5= RGB )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==11) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:187: 'COLOR' r5= RGB
					{
					match(input,11,FOLLOW_11_in_rectangle297); 
					r5=(Token)match(input,RGB,FOLLOW_RGB_in_rectangle301); 
					String color=(r5!=null?r5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:229: ( 'WIDTH' r6= FLOAT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==28) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:230: 'WIDTH' r6= FLOAT
					{
					match(input,28,FOLLOW_28_in_rectangle308); 
					r6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_rectangle312); 
					float width=(r6!=null?r6.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:273: ( 'COLORBODY' r7= RGB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==12) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:44:274: 'COLORBODY' r7= RGB
					{
					match(input,12,FOLLOW_12_in_rectangle319); 
					r7=(Token)match(input,RGB,FOLLOW_RGB_in_rectangle323); 
					String colorbody=(r7!=null?r7.getText():null);
					}
					break;

			}

			float heigth=r4-r2;
						 float breadth=r3-r1;
						 System.out.println("context.beginPath();");
						 System.out.println("context.lineWidth = " + width + ";");
						 System.out.println("context.strokeStyle = " + color + ";");
						 System.out.println("context.rect( " + xstart + ", " + ystart + ", " + heigth + ", " + breadth + ");");
						 System.out.println("context.stroke();");
						 System.out.println("context.fillStyle= " + colorbody + ";");
						 System.out.println("context.fill();");
						 System.out.println("context.closePath();");
						
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
	// $ANTLR end "rectangle"



	// $ANTLR start "curve"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:1: curve : 'CURV:' 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )? ;
	public final void curve() throws RecognitionException {
		Token cu1=null;
		Token cu2=null;
		Token cu3=null;
		Token cu4=null;
		Token cu5=null;
		Token cu6=null;
		Token cu7=null;
		Token cu8=null;
		Token cu9=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:8: ( 'CURV:' 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:10: 'CURV:' 'XSTART' cu1= FLOAT 'YSTART' cu2= FLOAT 'XMIDDLE' cu3= FLOAT 'YMIDDLE' cu4= FLOAT 'XEND' cu5= FLOAT 'YEND' cu6= FLOAT ( 'COLOR' cu7= RGB )? ( 'WIDTH' cu8= FLOAT )? ( 'COLORBODY' cu9= RGB )?
			{
			match(input,13,FOLLOW_13_in_curve343); 
			match(input,35,FOLLOW_35_in_curve345); 
			cu1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve349); 
			float xstart=(cu1!=null?cu1.getText():null);
			match(input,42,FOLLOW_42_in_curve353); 
			cu2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve357); 
			float ystart=(cu2!=null?cu2.getText():null);
			match(input,34,FOLLOW_34_in_curve361); 
			cu3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve365); 
			float xmiddle=(cu3!=null?cu3.getText():null);
			match(input,41,FOLLOW_41_in_curve369); 
			cu4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve373); 
			float ymiddle=(cu4!=null?cu4.getText():null);
			match(input,33,FOLLOW_33_in_curve377); 
			cu5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve381); 
			float xend=(cu5!=null?cu5.getText():null);
			match(input,40,FOLLOW_40_in_curve385); 
			cu6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve389); 
			float yend=(cu6!=null?cu6.getText():null);
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:284: ( 'COLOR' cu7= RGB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==11) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:285: 'COLOR' cu7= RGB
					{
					match(input,11,FOLLOW_11_in_curve394); 
					cu7=(Token)match(input,RGB,FOLLOW_RGB_in_curve398); 
					String color=(cu7!=null?cu7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:329: ( 'WIDTH' cu8= FLOAT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==28) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:330: 'WIDTH' cu8= FLOAT
					{
					match(input,28,FOLLOW_28_in_curve405); 
					cu8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_curve409); 
					float width=(cu8!=null?cu8.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:375: ( 'COLORBODY' cu9= RGB )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==12) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:58:376: 'COLORBODY' cu9= RGB
					{
					match(input,12,FOLLOW_12_in_curve416); 
					cu9=(Token)match(input,RGB,FOLLOW_RGB_in_curve420); 
					String colorbody=(cu9!=null?cu9.getText():null);
					}
					break;

			}

			System.out.println("context.beginPath();");
					 System.out.println("context.lineWidth = " + width + ";");
					 System.out.println("context.strokeStyle = " + color + ";");
					 System.out.println("context.moveTo( " + xstart + ", " + ystart + ");");
					 System.out.println("context.quadraticCurveTo( " + xmiddle + ", " + ymiddle + ", " + xend + ", " + yend + ");");
					 System.out.println("context.stroke();");
					 System.out.println("context.fillStyle = " + colorbody + ";");
					 System.out.println("context.fill();");
					 System.out.println("context.closePath();");
					
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
	// $ANTLR end "curve"



	// $ANTLR start "circle"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:1: circle : 'CIRC:' 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )? ;
	public final void circle() throws RecognitionException {
		Token ci1=null;
		Token ci2=null;
		Token ci3=null;
		Token ci4=null;
		Token ci5=null;
		Token ci6=null;
		Token ci7=null;
		Token ci8=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:9: ( 'CIRC:' 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:11: 'CIRC:' 'XCENTER' ci1= FLOAT 'YCENTER' ci2= FLOAT 'RADIUS' ci3= FLOAT ( 'STARTANGLE' ci4= FLOAT )? ( 'ENDANGLE' ci5= FLOAT )? ( 'COLOR' ci6= RGB )? ( 'WIDTH' ci7= FLOAT )? ( 'COLORBODY' ci8= RGB )?
			{
			match(input,10,FOLLOW_10_in_circle439); 
			match(input,32,FOLLOW_32_in_circle441); 
			ci1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle445); 
			float xcenter=(ci1!=null?ci1.getText():null);
			match(input,39,FOLLOW_39_in_circle449); 
			ci2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle453); 
			float ycenter=(ci2!=null?ci2.getText():null);
			match(input,20,FOLLOW_20_in_circle457); 
			ci3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle461); 
			float radius=(ci3!=null?ci3.getText():null);
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:158: ( 'STARTANGLE' ci4= FLOAT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==25) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:159: 'STARTANGLE' ci4= FLOAT
					{
					match(input,25,FOLLOW_25_in_circle466); 
					ci4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle470); 
					float startangle=(ci4!=null?ci4.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:214: ( 'ENDANGLE' ci5= FLOAT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==18) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:215: 'ENDANGLE' ci5= FLOAT
					{
					match(input,18,FOLLOW_18_in_circle477); 
					ci5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle481); 
					float endangle=(ci5!=null?ci5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:266: ( 'COLOR' ci6= RGB )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==11) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:267: 'COLOR' ci6= RGB
					{
					match(input,11,FOLLOW_11_in_circle488); 
					ci6=(Token)match(input,RGB,FOLLOW_RGB_in_circle492); 
					String color=(ci6!=null?ci6.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:311: ( 'WIDTH' ci7= FLOAT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==28) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:312: 'WIDTH' ci7= FLOAT
					{
					match(input,28,FOLLOW_28_in_circle499); 
					ci7=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_circle503); 
					float width=(ci7!=null?ci7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:357: ( 'COLORBODY' ci8= RGB )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==12) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:71:358: 'COLORBODY' ci8= RGB
					{
					match(input,12,FOLLOW_12_in_circle510); 
					ci8=(Token)match(input,RGB,FOLLOW_RGB_in_circle514); 
					String colorbody=(ci8!=null?ci8.getText():null);
					}
					break;

			}

			System.out.println("context.beginPath();");
					 System.out.println("var centerX = " + xcenter + ";");
					 System.out.println("var centerY = " + ycenter + ";");
					 System.out.println("var radius = " + radius + ";");
					 System.out.println("var startAngle = " + startangle + "* Math.PI;");
					 System.out.println("var endAngle = " + endangle + "* Math.PI;");
					 System.out.println("context.arc (centerX, centerY, radius, startAngle, endAngle);");
					 System.out.println("context.lineWidth = " + width + ";");
					 System.out.println("context.strokeStyle= " + color + ";");
					 System.out.println("context.stroke();");
					 System.out.println("context.fillStyle= " + colorbody + ";");
					 System.out.println("context.fill();");
					 System.out.println("context.closePath();");
					
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
	// $ANTLR end "circle"



	// $ANTLR start "ellipse"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:1: ellipse : 'ELLIPS:' 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )? ;
	public final void ellipse() throws RecognitionException {
		Token e1=null;
		Token e2=null;
		Token e3=null;
		Token e4=null;
		Token e5=null;
		Token e6=null;
		Token e7=null;
		Token e8=null;
		Token e9=null;
		Token e10=null;

		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:10: ( 'ELLIPS:' 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:12: 'ELLIPS:' 'XCENTER' e1= FLOAT 'YCENTER' e2= FLOAT 'SEMIN' e3= FLOAT 'SEMAX' e4= FLOAT ( 'STARTANGLE' e5= FLOAT )? ( 'ENDANGLE' e6= FLOAT )? ( 'ROTATION' e7= ROTATION )? ( 'COLOR' e8= RGB )? ( 'WIDTH' e9= FLOAT )? ( 'COLORBODY' e10= RGB )?
			{
			match(input,16,FOLLOW_16_in_ellipse533); 
			match(input,32,FOLLOW_32_in_ellipse535); 
			e1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse539); 
			float xcenter=(e1!=null?e1.getText():null);
			match(input,39,FOLLOW_39_in_ellipse543); 
			e2=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse547); 
			float ycenter=(e2!=null?e2.getText():null);
			match(input,24,FOLLOW_24_in_ellipse551); 
			e3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse555); 
			float semin=(e3!=null?e3.getText():null);
			match(input,23,FOLLOW_23_in_ellipse559); 
			e4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse563); 
			float semax=(e4!=null?e4.getText():null);
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:194: ( 'STARTANGLE' e5= FLOAT )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==25) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:195: 'STARTANGLE' e5= FLOAT
					{
					match(input,25,FOLLOW_25_in_ellipse568); 
					e5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse572); 
					float startangle=(e5!=null?e5.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:248: ( 'ENDANGLE' e6= FLOAT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==18) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:249: 'ENDANGLE' e6= FLOAT
					{
					match(input,18,FOLLOW_18_in_ellipse579); 
					e6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse583); 
					float endangle=(e6!=null?e6.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:298: ( 'ROTATION' e7= ROTATION )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==22) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:299: 'ROTATION' e7= ROTATION
					{
					match(input,22,FOLLOW_22_in_ellipse590); 
					e7=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_ellipse594); 
					float rotation=(e7!=null?e7.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:351: ( 'COLOR' e8= RGB )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==11) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:352: 'COLOR' e8= RGB
					{
					match(input,11,FOLLOW_11_in_ellipse601); 
					e8=(Token)match(input,RGB,FOLLOW_RGB_in_ellipse605); 
					String color=(e8!=null?e8.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:394: ( 'WIDTH' e9= FLOAT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==28) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:395: 'WIDTH' e9= FLOAT
					{
					match(input,28,FOLLOW_28_in_ellipse612); 
					e9=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_ellipse616); 
					float width=(e9!=null?e9.getText():null);
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:438: ( 'COLORBODY' e10= RGB )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==12) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:88:439: 'COLORBODY' e10= RGB
					{
					match(input,12,FOLLOW_12_in_ellipse623); 
					e10=(Token)match(input,RGB,FOLLOW_RGB_in_ellipse627); 
					String colorbody=(e10!=null?e10.getText():null);
					}
					break;

			}

			System.out.println("context.beginPath();");
					 	 System.out.println("var centerX = " + xcenter + ";");
					 	 System.out.println("var centerY = " + ycenter + ";");
					 	 System.out.println("var radiusMax = " + semax + ";");
					 	 System.out.println("var radiusMin= " + semin + ";");
					 	 System.out.println("var rotation= " + rotation + "*Math.PI/180;");
					 	 System.out.println("var startAngle=" + startangle +"*Math.PI/180;");
					 	 System.out.println("var endAngle=" + endangle + "*Math.PI/180;");
					 	 System.out.println("context.ellipse(centerX, centerY, radiusMax, radiusMin, rotation, startAngle, endAngle);");
					 	 System.out.println("context.lineWidth = " + width + ";");
					 	 System.out.println("context.strokeStyle= " + color + ";");
					 	 System.out.println("context.stroke();");
					 	 System.out.println("context.fillStyle= " + colorbody + ";");
					 	 System.out.println("context.fill();");
					 	 System.out.println("context.closePath();");
						
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
	// $ANTLR end "ellipse"



	// $ANTLR start "end"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:107:1: end : 'END' ;
	public final void end() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:107:5: ( 'END' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8prova.g:107:7: 'END'
			{
			match(input,17,FOLLOW_17_in_end646); 
			System.out.println("}");
				 System.out.println("</script>");
				 System.out.println("</head>");
			 	 System.out.println("<body>");
				 System.out.println("<canvas id='" + Titolo + "' width='" + DrawspaceWidth + "' height='" + DrawspaceHeigth + "'></canvas>");
				 System.out.println("</body>");
				 System.out.println("</html>");
				
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
	// $ANTLR end "end"

	// Delegated rules



	public static final BitSet FOLLOW_26_in_begin10 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_begin14 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_begin18 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin22 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_begin26 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin30 = new BitSet(new long[]{0x00000000082B2400L});
	public static final BitSet FOLLOW_list_in_begin35 = new BitSet(new long[]{0x00000000082B2400L});
	public static final BitSet FOLLOW_end_in_begin39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_list59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triangle_in_list64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rectangle_in_list69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_curve_in_list74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_circle_in_list79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ellipse_in_list84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_line95 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_line97 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line101 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_line105 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line109 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_line113 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line117 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_line121 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line125 = new BitSet(new long[]{0x0000000010000802L});
	public static final BitSet FOLLOW_11_in_line130 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_line134 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_line141 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_triangle165 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_triangle167 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle171 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_triangle175 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle179 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_triangle183 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle187 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_triangle191 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle195 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_triangle199 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle203 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_triangle207 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle211 = new BitSet(new long[]{0x0000000010001802L});
	public static final BitSet FOLLOW_11_in_triangle216 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle220 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_28_in_triangle227 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle231 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_triangle238 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rectangle262 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_rectangle264 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle268 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_rectangle272 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle276 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_rectangle280 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle284 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_rectangle288 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle292 = new BitSet(new long[]{0x0000000010001802L});
	public static final BitSet FOLLOW_11_in_rectangle297 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle301 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_28_in_rectangle308 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle312 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_rectangle319 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_curve343 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_curve345 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve349 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_curve353 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve357 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_curve361 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve365 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_curve369 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve373 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_curve377 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve381 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_curve385 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve389 = new BitSet(new long[]{0x0000000010001802L});
	public static final BitSet FOLLOW_11_in_curve394 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve398 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_28_in_curve405 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve409 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_curve416 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_circle439 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_circle441 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle445 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_circle449 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle453 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_circle457 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle461 = new BitSet(new long[]{0x0000000012041802L});
	public static final BitSet FOLLOW_25_in_circle466 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle470 = new BitSet(new long[]{0x0000000010041802L});
	public static final BitSet FOLLOW_18_in_circle477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle481 = new BitSet(new long[]{0x0000000010001802L});
	public static final BitSet FOLLOW_11_in_circle488 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle492 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_28_in_circle499 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle503 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_circle510 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ellipse533 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_ellipse535 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse539 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_ellipse543 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse547 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ellipse551 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse555 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_ellipse559 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse563 = new BitSet(new long[]{0x0000000012441802L});
	public static final BitSet FOLLOW_25_in_ellipse568 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse572 = new BitSet(new long[]{0x0000000010441802L});
	public static final BitSet FOLLOW_18_in_ellipse579 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse583 = new BitSet(new long[]{0x0000000010401802L});
	public static final BitSet FOLLOW_22_in_ellipse590 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ROTATION_in_ellipse594 = new BitSet(new long[]{0x0000000010001802L});
	public static final BitSet FOLLOW_11_in_ellipse601 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse605 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_28_in_ellipse612 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse616 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ellipse623 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_end646 = new BitSet(new long[]{0x0000000000000002L});
}
