package parser;

// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g 2019-04-25 22:55:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "RGB", "ROTATION", 
		"TEXT", "WS", "'CIRC:'", "'COLOR'", "'COLORBODY'", "'CURV:'", "'DRAWSPACE HEIGTH'", 
		"'DRAWSPACE WIDTH'", "'ELLIPS:'", "'ENDANGLE'", "'LINE:'", "'RADIUS'", 
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


	public G8Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return G8Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g"; }



	// $ANTLR start "begin"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:1: begin : 'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT ( list )* ;
	public final void begin() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:7: ( 'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT ( list )* )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:9: 'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT ( list )*
			{
			match(input,25,FOLLOW_25_in_begin10); 
			match(input,TEXT,FOLLOW_TEXT_in_begin12); 
			match(input,15,FOLLOW_15_in_begin14); 
			match(input,FLOAT,FOLLOW_FLOAT_in_begin16); 
			match(input,14,FOLLOW_14_in_begin18); 
			match(input,FLOAT,FOLLOW_FLOAT_in_begin20); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:71: ( list )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==10||LA1_0==13||LA1_0==16||LA1_0==18||LA1_0==20||LA1_0==26) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:72: list
					{
					pushFollow(FOLLOW_list_in_begin23);
					list();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:1: list : ( line | triangle | rectangle | curve | circle | ellipse );
	public final void list() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:6: ( line | triangle | rectangle | curve | circle | ellipse )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt2=1;
				}
				break;
			case 26:
				{
				alt2=2;
				}
				break;
			case 20:
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
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:8: line
					{
					pushFollow(FOLLOW_line_in_list41);
					line();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:16: triangle
					{
					pushFollow(FOLLOW_triangle_in_list46);
					triangle();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:28: rectangle
					{
					pushFollow(FOLLOW_rectangle_in_list51);
					rectangle();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:41: curve
					{
					pushFollow(FOLLOW_curve_in_list56);
					curve();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:50: circle
					{
					pushFollow(FOLLOW_circle_in_list61);
					circle();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:60: ellipse
					{
					pushFollow(FOLLOW_ellipse_in_list66);
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:1: line : 'LINE:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ;
	public final void line() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:7: ( 'LINE:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:11: 'LINE:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )?
			{
			match(input,18,FOLLOW_18_in_line79); 
			match(input,34,FOLLOW_34_in_line81); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line83); 
			match(input,41,FOLLOW_41_in_line85); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line87); 
			match(input,32,FOLLOW_32_in_line89); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line91); 
			match(input,39,FOLLOW_39_in_line93); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line95); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:75: ( 'COLOR' RGB )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==11) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:76: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_line98); 
					match(input,RGB,FOLLOW_RGB_in_line100); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:90: ( 'WIDTH' FLOAT )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==27) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:91: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_line105); 
					match(input,FLOAT,FOLLOW_FLOAT_in_line107); 
					}
					break;

			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:1: triangle : 'TRIANGLE:' 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void triangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:11: ( 'TRIANGLE:' 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:13: 'TRIANGLE:' 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,26,FOLLOW_26_in_triangle121); 
			match(input,28,FOLLOW_28_in_triangle123); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle125); 
			match(input,35,FOLLOW_35_in_triangle127); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle129); 
			match(input,29,FOLLOW_29_in_triangle131); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle133); 
			match(input,36,FOLLOW_36_in_triangle135); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle137); 
			match(input,30,FOLLOW_30_in_triangle139); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle141); 
			match(input,37,FOLLOW_37_in_triangle143); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle145); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:91: ( 'COLOR' RGB )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==11) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:92: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_triangle148); 
					match(input,RGB,FOLLOW_RGB_in_triangle150); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:106: ( 'WIDTH' FLOAT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==27) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:107: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_triangle155); 
					match(input,FLOAT,FOLLOW_FLOAT_in_triangle157); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:123: ( 'COLORBODY' RGB )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==12) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:124: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_triangle162); 
					match(input,RGB,FOLLOW_RGB_in_triangle164); 
					}
					break;

			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:1: rectangle : 'RECT:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void rectangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:12: ( 'RECT:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:14: 'RECT:' 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,20,FOLLOW_20_in_rectangle177); 
			match(input,34,FOLLOW_34_in_rectangle179); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle181); 
			match(input,41,FOLLOW_41_in_rectangle183); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle185); 
			match(input,32,FOLLOW_32_in_rectangle187); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle189); 
			match(input,39,FOLLOW_39_in_rectangle191); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle193); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:78: ( 'COLOR' RGB )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==11) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:79: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_rectangle196); 
					match(input,RGB,FOLLOW_RGB_in_rectangle198); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:93: ( 'WIDTH' FLOAT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==27) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:94: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_rectangle203); 
					match(input,FLOAT,FOLLOW_FLOAT_in_rectangle205); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:110: ( 'COLORBODY' RGB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==12) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:111: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_rectangle210); 
					match(input,RGB,FOLLOW_RGB_in_rectangle212); 
					}
					break;

			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:1: curve : 'CURV:' 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void curve() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:8: ( 'CURV:' 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:10: 'CURV:' 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,13,FOLLOW_13_in_curve225); 
			match(input,34,FOLLOW_34_in_curve227); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve229); 
			match(input,41,FOLLOW_41_in_curve231); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve233); 
			match(input,33,FOLLOW_33_in_curve235); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve237); 
			match(input,40,FOLLOW_40_in_curve239); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve241); 
			match(input,32,FOLLOW_32_in_curve243); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve245); 
			match(input,39,FOLLOW_39_in_curve247); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve249); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:106: ( 'COLOR' RGB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==11) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:107: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_curve252); 
					match(input,RGB,FOLLOW_RGB_in_curve254); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:121: ( 'WIDTH' FLOAT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==27) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:122: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_curve259); 
					match(input,FLOAT,FOLLOW_FLOAT_in_curve261); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:138: ( 'COLORBODY' RGB )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==12) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:139: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_curve266); 
					match(input,RGB,FOLLOW_RGB_in_curve268); 
					}
					break;

			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:1: circle : 'CIRC:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void circle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:9: ( 'CIRC:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:11: 'CIRC:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,10,FOLLOW_10_in_circle281); 
			match(input,31,FOLLOW_31_in_circle283); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle285); 
			match(input,38,FOLLOW_38_in_circle287); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle289); 
			match(input,19,FOLLOW_19_in_circle291); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle293); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:66: ( 'STARTANGLE' FLOAT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==24) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:67: 'STARTANGLE' FLOAT
					{
					match(input,24,FOLLOW_24_in_circle296); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle298); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:88: ( 'ENDANGLE' FLOAT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==17) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:89: 'ENDANGLE' FLOAT
					{
					match(input,17,FOLLOW_17_in_circle303); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle305); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:108: ( 'COLOR' RGB )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==11) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:109: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_circle310); 
					match(input,RGB,FOLLOW_RGB_in_circle312); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:123: ( 'WIDTH' FLOAT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==27) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:124: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_circle317); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle319); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:140: ( 'COLORBODY' RGB )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==12) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:141: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_circle324); 
					match(input,RGB,FOLLOW_RGB_in_circle326); 
					}
					break;

			}

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:1: ellipse : 'ELLIPS:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void ellipse() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:10: ( 'ELLIPS:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:12: 'ELLIPS:' 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,16,FOLLOW_16_in_ellipse339); 
			match(input,31,FOLLOW_31_in_ellipse341); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse343); 
			match(input,38,FOLLOW_38_in_ellipse345); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse347); 
			match(input,23,FOLLOW_23_in_ellipse349); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse351); 
			match(input,22,FOLLOW_22_in_ellipse353); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse355); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:82: ( 'STARTANGLE' FLOAT )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==24) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:83: 'STARTANGLE' FLOAT
					{
					match(input,24,FOLLOW_24_in_ellipse358); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse360); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:104: ( 'ENDANGLE' FLOAT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==17) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:105: 'ENDANGLE' FLOAT
					{
					match(input,17,FOLLOW_17_in_ellipse365); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse367); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:124: ( 'ROTATION' ROTATION )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==21) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:125: 'ROTATION' ROTATION
					{
					match(input,21,FOLLOW_21_in_ellipse372); 
					match(input,ROTATION,FOLLOW_ROTATION_in_ellipse374); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:147: ( 'COLOR' RGB )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==11) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:148: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_ellipse379); 
					match(input,RGB,FOLLOW_RGB_in_ellipse381); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:162: ( 'WIDTH' FLOAT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==27) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:163: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_ellipse386); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse388); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:179: ( 'COLORBODY' RGB )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==12) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:180: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_ellipse393); 
					match(input,RGB,FOLLOW_RGB_in_ellipse395); 
					}
					break;

			}

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

	// Delegated rules



	public static final BitSet FOLLOW_25_in_begin10 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TEXT_in_begin12 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_begin14 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin16 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_begin18 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_begin20 = new BitSet(new long[]{0x0000000004152402L});
	public static final BitSet FOLLOW_list_in_begin23 = new BitSet(new long[]{0x0000000004152402L});
	public static final BitSet FOLLOW_line_in_list41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triangle_in_list46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rectangle_in_list51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_curve_in_list56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_circle_in_list61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ellipse_in_list66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_line79 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_line81 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line83 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_line85 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line87 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_line89 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line91 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_line93 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line95 = new BitSet(new long[]{0x0000000008000802L});
	public static final BitSet FOLLOW_11_in_line98 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_line100 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_line105 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_triangle121 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_triangle123 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle125 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_triangle127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle129 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_triangle131 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle133 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_triangle135 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle137 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_triangle139 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle141 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_triangle143 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle145 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_triangle148 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle150 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_triangle155 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle157 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_triangle162 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rectangle177 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_rectangle179 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle181 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_rectangle183 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle185 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_rectangle187 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle189 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_rectangle191 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle193 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_rectangle196 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle198 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_rectangle203 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle205 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_rectangle210 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_curve225 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_curve227 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve229 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_curve231 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve233 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_curve235 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve237 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_curve239 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve241 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_curve243 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve245 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_curve247 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve249 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_curve252 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve254 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_curve259 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve261 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_curve266 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_circle281 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_circle283 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle285 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_circle287 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle289 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_circle291 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle293 = new BitSet(new long[]{0x0000000009021802L});
	public static final BitSet FOLLOW_24_in_circle296 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle298 = new BitSet(new long[]{0x0000000008021802L});
	public static final BitSet FOLLOW_17_in_circle303 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle305 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_circle310 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle312 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_circle317 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle319 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_circle324 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ellipse339 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_ellipse341 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse343 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_ellipse345 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse347 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_ellipse349 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse351 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_ellipse353 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse355 = new BitSet(new long[]{0x0000000009221802L});
	public static final BitSet FOLLOW_24_in_ellipse358 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse360 = new BitSet(new long[]{0x0000000008221802L});
	public static final BitSet FOLLOW_17_in_ellipse365 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse367 = new BitSet(new long[]{0x0000000008201802L});
	public static final BitSet FOLLOW_21_in_ellipse372 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ROTATION_in_ellipse374 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_ellipse379 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse381 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_ellipse386 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse388 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ellipse393 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse395 = new BitSet(new long[]{0x0000000000000002L});
}
