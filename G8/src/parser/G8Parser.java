package parser;

// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g 2019-04-25 22:40:08

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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:1: list : ( 'LINE:' line | 'TRIANGLE:' triangle | 'RECT:' rectangle | 'CURV:' curve | 'CIRC:' circle | 'ELLIPS:' ellipse ) ;
	public final void list() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:6: ( ( 'LINE:' line | 'TRIANGLE:' triangle | 'RECT:' rectangle | 'CURV:' curve | 'CIRC:' circle | 'ELLIPS:' ellipse ) )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:8: ( 'LINE:' line | 'TRIANGLE:' triangle | 'RECT:' rectangle | 'CURV:' curve | 'CIRC:' circle | 'ELLIPS:' ellipse )
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:8: ( 'LINE:' line | 'TRIANGLE:' triangle | 'RECT:' rectangle | 'CURV:' curve | 'CIRC:' circle | 'ELLIPS:' ellipse )
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
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:9: 'LINE:' line
					{
					match(input,18,FOLLOW_18_in_list42); 
					pushFollow(FOLLOW_line_in_list44);
					line();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:24: 'TRIANGLE:' triangle
					{
					match(input,26,FOLLOW_26_in_list48); 
					pushFollow(FOLLOW_triangle_in_list50);
					triangle();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:47: 'RECT:' rectangle
					{
					match(input,20,FOLLOW_20_in_list54); 
					pushFollow(FOLLOW_rectangle_in_list56);
					rectangle();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:67: 'CURV:' curve
					{
					match(input,13,FOLLOW_13_in_list60); 
					pushFollow(FOLLOW_curve_in_list62);
					curve();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:83: 'CIRC:' circle
					{
					match(input,10,FOLLOW_10_in_list66); 
					pushFollow(FOLLOW_circle_in_list68);
					circle();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:100: 'ELLIPS:' ellipse
					{
					match(input,16,FOLLOW_16_in_list72); 
					pushFollow(FOLLOW_ellipse_in_list74);
					ellipse();
					state._fsp--;

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
	// $ANTLR end "list"



	// $ANTLR start "line"
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:1: line : 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ;
	public final void line() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:7: ( 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:10: 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )?
			{
			match(input,34,FOLLOW_34_in_line87); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line89); 
			match(input,41,FOLLOW_41_in_line91); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line93); 
			match(input,32,FOLLOW_32_in_line95); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line97); 
			match(input,39,FOLLOW_39_in_line99); 
			match(input,FLOAT,FOLLOW_FLOAT_in_line101); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:66: ( 'COLOR' RGB )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==11) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:67: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_line104); 
					match(input,RGB,FOLLOW_RGB_in_line106); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:81: ( 'WIDTH' FLOAT )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==27) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:82: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_line111); 
					match(input,FLOAT,FOLLOW_FLOAT_in_line113); 
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:1: triangle : 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void triangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:11: ( 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:14: 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,28,FOLLOW_28_in_triangle128); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle130); 
			match(input,35,FOLLOW_35_in_triangle132); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle134); 
			match(input,29,FOLLOW_29_in_triangle136); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle138); 
			match(input,36,FOLLOW_36_in_triangle140); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle142); 
			match(input,30,FOLLOW_30_in_triangle144); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle146); 
			match(input,37,FOLLOW_37_in_triangle148); 
			match(input,FLOAT,FOLLOW_FLOAT_in_triangle150); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:80: ( 'COLOR' RGB )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==11) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:81: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_triangle153); 
					match(input,RGB,FOLLOW_RGB_in_triangle155); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:95: ( 'WIDTH' FLOAT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==27) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:96: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_triangle160); 
					match(input,FLOAT,FOLLOW_FLOAT_in_triangle162); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:112: ( 'COLORBODY' RGB )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==12) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:113: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_triangle167); 
					match(input,RGB,FOLLOW_RGB_in_triangle169); 
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:1: rectangle : 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void rectangle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:12: ( 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:15: 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,34,FOLLOW_34_in_rectangle183); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle185); 
			match(input,41,FOLLOW_41_in_rectangle187); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle189); 
			match(input,32,FOLLOW_32_in_rectangle191); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle193); 
			match(input,39,FOLLOW_39_in_rectangle195); 
			match(input,FLOAT,FOLLOW_FLOAT_in_rectangle197); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:71: ( 'COLOR' RGB )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==11) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:72: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_rectangle200); 
					match(input,RGB,FOLLOW_RGB_in_rectangle202); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:86: ( 'WIDTH' FLOAT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==27) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:87: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_rectangle207); 
					match(input,FLOAT,FOLLOW_FLOAT_in_rectangle209); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:103: ( 'COLORBODY' RGB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==12) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:104: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_rectangle214); 
					match(input,RGB,FOLLOW_RGB_in_rectangle216); 
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:1: curve : 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void curve() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:8: ( 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:11: 'XSTART' FLOAT 'YSTART' FLOAT 'XMIDDLE' FLOAT 'YMIDDLE' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,34,FOLLOW_34_in_curve230); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve232); 
			match(input,41,FOLLOW_41_in_curve234); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve236); 
			match(input,33,FOLLOW_33_in_curve238); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve240); 
			match(input,40,FOLLOW_40_in_curve242); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve244); 
			match(input,32,FOLLOW_32_in_curve246); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve248); 
			match(input,39,FOLLOW_39_in_curve250); 
			match(input,FLOAT,FOLLOW_FLOAT_in_curve252); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:99: ( 'COLOR' RGB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==11) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:100: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_curve255); 
					match(input,RGB,FOLLOW_RGB_in_curve257); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:114: ( 'WIDTH' FLOAT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==27) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:115: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_curve262); 
					match(input,FLOAT,FOLLOW_FLOAT_in_curve264); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:131: ( 'COLORBODY' RGB )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==12) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:132: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_curve269); 
					match(input,RGB,FOLLOW_RGB_in_curve271); 
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:1: circle : 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void circle() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:9: ( 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:12: 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,31,FOLLOW_31_in_circle285); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle287); 
			match(input,38,FOLLOW_38_in_circle289); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle291); 
			match(input,19,FOLLOW_19_in_circle293); 
			match(input,FLOAT,FOLLOW_FLOAT_in_circle295); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:59: ( 'STARTANGLE' FLOAT )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==24) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:60: 'STARTANGLE' FLOAT
					{
					match(input,24,FOLLOW_24_in_circle298); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle300); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:81: ( 'ENDANGLE' FLOAT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==17) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:82: 'ENDANGLE' FLOAT
					{
					match(input,17,FOLLOW_17_in_circle305); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle307); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:101: ( 'COLOR' RGB )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==11) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:102: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_circle312); 
					match(input,RGB,FOLLOW_RGB_in_circle314); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:116: ( 'WIDTH' FLOAT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==27) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:117: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_circle319); 
					match(input,FLOAT,FOLLOW_FLOAT_in_circle321); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:133: ( 'COLORBODY' RGB )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==12) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:134: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_circle326); 
					match(input,RGB,FOLLOW_RGB_in_circle328); 
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
	// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:1: ellipse : 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? ;
	public final void ellipse() throws RecognitionException {
		try {
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:10: ( 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:13: 'XCENTER' FLOAT 'YCENTER' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'STARTANGLE' FLOAT )? ( 'ENDANGLE' FLOAT )? ( 'ROTATION' ROTATION )? ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match(input,31,FOLLOW_31_in_ellipse342); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse344); 
			match(input,38,FOLLOW_38_in_ellipse346); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse348); 
			match(input,23,FOLLOW_23_in_ellipse350); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse352); 
			match(input,22,FOLLOW_22_in_ellipse354); 
			match(input,FLOAT,FOLLOW_FLOAT_in_ellipse356); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:73: ( 'STARTANGLE' FLOAT )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==24) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:74: 'STARTANGLE' FLOAT
					{
					match(input,24,FOLLOW_24_in_ellipse359); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse361); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:95: ( 'ENDANGLE' FLOAT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==17) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:96: 'ENDANGLE' FLOAT
					{
					match(input,17,FOLLOW_17_in_ellipse366); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse368); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:115: ( 'ROTATION' ROTATION )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==21) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:116: 'ROTATION' ROTATION
					{
					match(input,21,FOLLOW_21_in_ellipse373); 
					match(input,ROTATION,FOLLOW_ROTATION_in_ellipse375); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:138: ( 'COLOR' RGB )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==11) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:139: 'COLOR' RGB
					{
					match(input,11,FOLLOW_11_in_ellipse380); 
					match(input,RGB,FOLLOW_RGB_in_ellipse382); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:153: ( 'WIDTH' FLOAT )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==27) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:154: 'WIDTH' FLOAT
					{
					match(input,27,FOLLOW_27_in_ellipse387); 
					match(input,FLOAT,FOLLOW_FLOAT_in_ellipse389); 
					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:170: ( 'COLORBODY' RGB )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==12) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:171: 'COLORBODY' RGB
					{
					match(input,12,FOLLOW_12_in_ellipse394); 
					match(input,RGB,FOLLOW_RGB_in_ellipse396); 
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
	public static final BitSet FOLLOW_18_in_list42 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_line_in_list44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_list48 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_triangle_in_list50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_list54 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_rectangle_in_list56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_list60 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_curve_in_list62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_list66 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_circle_in_list68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_list72 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ellipse_in_list74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_line87 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line89 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_line91 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line93 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_line95 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line97 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_line99 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line101 = new BitSet(new long[]{0x0000000008000802L});
	public static final BitSet FOLLOW_11_in_line104 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_line106 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_line111 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_line113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_triangle128 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle130 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_triangle132 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle134 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_triangle136 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle138 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_triangle140 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle142 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_triangle144 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle146 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_triangle148 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle150 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_triangle153 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle155 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_triangle160 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_triangle162 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_triangle167 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_triangle169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_rectangle183 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle185 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_rectangle187 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle189 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_rectangle191 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle193 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_rectangle195 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle197 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_rectangle200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle202 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_rectangle207 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_rectangle209 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_rectangle214 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_rectangle216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_curve230 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve232 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_curve234 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve236 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_curve238 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve240 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_curve242 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve244 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_curve246 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve248 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_curve250 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve252 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_curve255 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve257 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_curve262 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_curve264 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_curve269 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_curve271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_circle285 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle287 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_circle289 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle291 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_circle293 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle295 = new BitSet(new long[]{0x0000000009021802L});
	public static final BitSet FOLLOW_24_in_circle298 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle300 = new BitSet(new long[]{0x0000000008021802L});
	public static final BitSet FOLLOW_17_in_circle305 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle307 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_circle312 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle314 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_circle319 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_circle321 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_circle326 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_circle328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_ellipse342 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse344 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_ellipse346 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse348 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_ellipse350 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse352 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_ellipse354 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse356 = new BitSet(new long[]{0x0000000009221802L});
	public static final BitSet FOLLOW_24_in_ellipse359 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse361 = new BitSet(new long[]{0x0000000008221802L});
	public static final BitSet FOLLOW_17_in_ellipse366 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse368 = new BitSet(new long[]{0x0000000008201802L});
	public static final BitSet FOLLOW_21_in_ellipse373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ROTATION_in_ellipse375 = new BitSet(new long[]{0x0000000008001802L});
	public static final BitSet FOLLOW_11_in_ellipse380 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse382 = new BitSet(new long[]{0x0000000008001002L});
	public static final BitSet FOLLOW_27_in_ellipse387 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FLOAT_in_ellipse389 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ellipse394 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RGB_in_ellipse396 = new BitSet(new long[]{0x0000000000000002L});
}
