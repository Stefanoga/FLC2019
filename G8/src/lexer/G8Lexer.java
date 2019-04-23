package lexer;
// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g 2019-04-23 17:32:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public G8Lexer() {} 
	public G8Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public G8Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g"; }

	// $ANTLR start "G8"
	public final void mG8() throws RecognitionException {
		try {
			int _type = G8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:5: ( 'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT ( LIST )* )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:7: 'TITLE' TEXT 'DRAWSPACE WIDTH' FLOAT 'DRAWSPACE HEIGTH' FLOAT ( LIST )*
			{
			match("TITLE"); 

			mTEXT(); 

			match("DRAWSPACE WIDTH"); 

			mFLOAT(); 

			match("DRAWSPACE HEIGTH"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:69: ( LIST )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='C'||LA1_0=='E'||LA1_0=='L'||LA1_0=='R'||LA1_0=='T') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:70: LIST
					{
					mLIST(); 

					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G8"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:6: ( ( 'LINE' LINE | 'TRIANGLE' TRIANGLE | 'RECT' RECTANGLE | 'CURV' CURVE | 'CIRC' CIRCLE | 'ELLIPS' ELLIPSE ) )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:8: ( 'LINE' LINE | 'TRIANGLE' TRIANGLE | 'RECT' RECTANGLE | 'CURV' CURVE | 'CIRC' CIRCLE | 'ELLIPS' ELLIPSE )
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:8: ( 'LINE' LINE | 'TRIANGLE' TRIANGLE | 'RECT' RECTANGLE | 'CURV' CURVE | 'CIRC' CIRCLE | 'ELLIPS' ELLIPSE )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 'L':
				{
				alt2=1;
				}
				break;
			case 'T':
				{
				alt2=2;
				}
				break;
			case 'R':
				{
				alt2=3;
				}
				break;
			case 'C':
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4=='U') ) {
					alt2=4;
				}
				else if ( (LA2_4=='I') ) {
					alt2=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'E':
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
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:9: 'LINE' LINE
					{
					match("LINE"); 

					mLINE(); 

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:23: 'TRIANGLE' TRIANGLE
					{
					match("TRIANGLE"); 

					mTRIANGLE(); 

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:45: 'RECT' RECTANGLE
					{
					match("RECT"); 

					mRECTANGLE(); 

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:64: 'CURV' CURVE
					{
					match("CURV"); 

					mCURVE(); 

					}
					break;
				case 5 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:79: 'CIRC' CIRCLE
					{
					match("CIRC"); 

					mCIRCLE(); 

					}
					break;
				case 6 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:95: 'ELLIPS' ELLIPSE
					{
					match("ELLIPS"); 

					mELLIPSE(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "LINE"
	public final void mLINE() throws RecognitionException {
		try {
			int _type = LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:7: ( 'XSTARTL' FLOAT 'YSTARTL' FLOAT 'XENDL' FLOAT 'YENDL' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:10: 'XSTARTL' FLOAT 'YSTARTL' FLOAT 'XENDL' FLOAT 'YENDL' FLOAT ( 'COLOR' RGB )? ( 'WIDTH' FLOAT )?
			{
			match("XSTARTL"); 

			mFLOAT(); 

			match("YSTARTL"); 

			mFLOAT(); 

			match("XENDL"); 

			mFLOAT(); 

			match("YENDL"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:70: ( 'COLOR' RGB )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='C') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:71: 'COLOR' RGB
					{
					match("COLOR"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:85: ( 'WIDTH' FLOAT )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='W') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:86: 'WIDTH' FLOAT
					{
					match("WIDTH"); 

					mFLOAT(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE"

	// $ANTLR start "TRIANGLE"
	public final void mTRIANGLE() throws RecognitionException {
		try {
			int _type = TRIANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:11: ( 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:14: 'XA' FLOAT 'YA' FLOAT 'XB' FLOAT 'YB' FLOAT 'XC' FLOAT 'YC' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match("XA"); 

			mFLOAT(); 

			match("YA"); 

			mFLOAT(); 

			match("XB"); 

			mFLOAT(); 

			match("YB"); 

			mFLOAT(); 

			match("XC"); 

			mFLOAT(); 

			match("YC"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:80: ( 'COLORBORDER' RGB )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='C') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='O') ) {
					int LA5_3 = input.LA(3);
					if ( (LA5_3=='L') ) {
						int LA5_4 = input.LA(4);
						if ( (LA5_4=='O') ) {
							int LA5_5 = input.LA(5);
							if ( (LA5_5=='R') ) {
								int LA5_6 = input.LA(6);
								if ( (LA5_6=='B') ) {
									int LA5_7 = input.LA(7);
									if ( (LA5_7=='O') ) {
										int LA5_8 = input.LA(8);
										if ( (LA5_8=='R') ) {
											alt5=1;
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt5) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:81: 'COLORBORDER' RGB
					{
					match("COLORBORDER"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:101: ( 'WIDTHBORDER' FLOAT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='W') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:102: 'WIDTHBORDER' FLOAT
					{
					match("WIDTHBORDER"); 

					mFLOAT(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:124: ( 'COLORBODY' RGB )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='C') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:125: 'COLORBODY' RGB
					{
					match("COLORBODY"); 

					mRGB(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRIANGLE"

	// $ANTLR start "RECTANGLE"
	public final void mRECTANGLE() throws RecognitionException {
		try {
			int _type = RECTANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:12: ( 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:15: 'XSTART' FLOAT 'YSTART' FLOAT 'XEND' FLOAT 'YEND' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match("XSTART"); 

			mFLOAT(); 

			match("YSTART"); 

			mFLOAT(); 

			match("XEND"); 

			mFLOAT(); 

			match("YEND"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:71: ( 'COLORBORDER' RGB )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='C') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='O') ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3=='L') ) {
						int LA8_4 = input.LA(4);
						if ( (LA8_4=='O') ) {
							int LA8_5 = input.LA(5);
							if ( (LA8_5=='R') ) {
								int LA8_6 = input.LA(6);
								if ( (LA8_6=='B') ) {
									int LA8_7 = input.LA(7);
									if ( (LA8_7=='O') ) {
										int LA8_8 = input.LA(8);
										if ( (LA8_8=='R') ) {
											alt8=1;
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt8) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:72: 'COLORBORDER' RGB
					{
					match("COLORBORDER"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:92: ( 'WIDTHBORDER' FLOAT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='W') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:93: 'WIDTHBORDER' FLOAT
					{
					match("WIDTHBORDER"); 

					mFLOAT(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:115: ( 'COLORBODY' RGB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='C') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:36:116: 'COLORBODY' RGB
					{
					match("COLORBODY"); 

					mRGB(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE"

	// $ANTLR start "CURVE"
	public final void mCURVE() throws RecognitionException {
		try {
			int _type = CURVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:8: ( 'XSTARTC' FLOAT 'YSTARTC' FLOAT 'XENDC' FLOAT 'YENDC' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:11: 'XSTARTC' FLOAT 'YSTARTC' FLOAT 'XENDC' FLOAT 'YENDC' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match("XSTARTC"); 

			mFLOAT(); 

			match("YSTARTC"); 

			mFLOAT(); 

			match("XENDC"); 

			mFLOAT(); 

			match("YENDC"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:71: ( 'COLORBORDER' RGB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='C') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='O') ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3=='L') ) {
						int LA11_4 = input.LA(4);
						if ( (LA11_4=='O') ) {
							int LA11_5 = input.LA(5);
							if ( (LA11_5=='R') ) {
								int LA11_6 = input.LA(6);
								if ( (LA11_6=='B') ) {
									int LA11_7 = input.LA(7);
									if ( (LA11_7=='O') ) {
										int LA11_8 = input.LA(8);
										if ( (LA11_8=='R') ) {
											alt11=1;
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt11) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:72: 'COLORBORDER' RGB
					{
					match("COLORBORDER"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:92: ( 'WIDTHBORDER' FLOAT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='W') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:93: 'WIDTHBORDER' FLOAT
					{
					match("WIDTHBORDER"); 

					mFLOAT(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:115: ( 'COLORBODY' RGB )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='C') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:116: 'COLORBODY' RGB
					{
					match("COLORBODY"); 

					mRGB(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURVE"

	// $ANTLR start "CIRCLE"
	public final void mCIRCLE() throws RecognitionException {
		try {
			int _type = CIRCLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:9: ( 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:12: 'XCENTER' FLOAT 'YCENTER' FLOAT 'RADIUS' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match("XCENTER"); 

			mFLOAT(); 

			match("YCENTER"); 

			mFLOAT(); 

			match("RADIUS"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:59: ( 'COLORBORDER' RGB )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='C') ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1=='O') ) {
					int LA14_3 = input.LA(3);
					if ( (LA14_3=='L') ) {
						int LA14_4 = input.LA(4);
						if ( (LA14_4=='O') ) {
							int LA14_5 = input.LA(5);
							if ( (LA14_5=='R') ) {
								int LA14_6 = input.LA(6);
								if ( (LA14_6=='B') ) {
									int LA14_7 = input.LA(7);
									if ( (LA14_7=='O') ) {
										int LA14_8 = input.LA(8);
										if ( (LA14_8=='R') ) {
											alt14=1;
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt14) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:60: 'COLORBORDER' RGB
					{
					match("COLORBORDER"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:80: ( 'WIDTHBORDER' FLOAT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='W') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:81: 'WIDTHBORDER' FLOAT
					{
					match("WIDTHBORDER"); 

					mFLOAT(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:103: ( 'COLORBODY' RGB )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='C') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:42:104: 'COLORBODY' RGB
					{
					match("COLORBODY"); 

					mRGB(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE"

	// $ANTLR start "ELLIPSE"
	public final void mELLIPSE() throws RecognitionException {
		try {
			int _type = ELLIPSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:10: ( 'XCENTERE' FLOAT 'YCENTERE' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )? )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:13: 'XCENTERE' FLOAT 'YCENTERE' FLOAT 'SEMIN' FLOAT 'SEMAX' FLOAT ( 'COLORBORDER' RGB )? ( 'WIDTHBORDER' FLOAT )? ( 'COLORBODY' RGB )?
			{
			match("XCENTERE"); 

			mFLOAT(); 

			match("YCENTERE"); 

			mFLOAT(); 

			match("SEMIN"); 

			mFLOAT(); 

			match("SEMAX"); 

			mFLOAT(); 

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:75: ( 'COLORBORDER' RGB )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='C') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='O') ) {
					int LA17_3 = input.LA(3);
					if ( (LA17_3=='L') ) {
						int LA17_4 = input.LA(4);
						if ( (LA17_4=='O') ) {
							int LA17_5 = input.LA(5);
							if ( (LA17_5=='R') ) {
								int LA17_6 = input.LA(6);
								if ( (LA17_6=='B') ) {
									int LA17_7 = input.LA(7);
									if ( (LA17_7=='O') ) {
										int LA17_8 = input.LA(8);
										if ( (LA17_8=='R') ) {
											alt17=1;
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:76: 'COLORBORDER' RGB
					{
					match("COLORBORDER"); 

					mRGB(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:96: ( 'WIDTHBORDER' FLOAT )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='W') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:97: 'WIDTHBORDER' FLOAT
					{
					match("WIDTHBORDER"); 

					mFLOAT(); 

					}
					break;

			}

			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:119: ( 'COLORBODY' RGB )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='C') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:45:120: 'COLORBODY' RGB
					{
					match("COLORBODY"); 

					mRGB(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSE"

	// $ANTLR start "RGB"
	public final void mRGB() throws RecognitionException {
		try {
			int _type = RGB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:48:5: ( ( '0' .. '9' | 'A' .. 'F' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:48:7: ( '0' .. '9' | 'A' .. 'F' )+
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:48:7: ( '0' .. '9' | 'A' .. 'F' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RGB"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:51:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:51:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:51:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:55:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* '.' ( '0' .. '9' )* | ( '0' .. '9' )+ )
			int alt26=2;
			alt26 = dfa26.predict(input);
			switch (alt26) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:55:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* '.' ( '0' .. '9' )*
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:55:9: ( '0' .. '9' )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:55:25: ( '0' .. '9' )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop23;
						}
					}

					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:55:41: ( '0' .. '9' )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:56:9: ( '0' .. '9' )+
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:56:9: ( '0' .. '9' )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:60:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='/') ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1=='/') ) {
					alt30=1;
				}
				else if ( (LA30_1=='*') ) {
					alt30=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:60:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:60:14: (~ ( '\\n' | '\\r' ) )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '\u0000' && LA27_0 <= '\t')||(LA27_0 >= '\u000B' && LA27_0 <= '\f')||(LA27_0 >= '\u000E' && LA27_0 <= '\uFFFF')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop27;
						}
					}

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:60:28: ( '\\r' )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='\r') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:60:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:61:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:61:14: ( options {greedy=false; } : . )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0=='*') ) {
							int LA29_1 = input.LA(2);
							if ( (LA29_1=='/') ) {
								alt29=2;
							}
							else if ( ((LA29_1 >= '\u0000' && LA29_1 <= '.')||(LA29_1 >= '0' && LA29_1 <= '\uFFFF')) ) {
								alt29=1;
							}

						}
						else if ( ((LA29_0 >= '\u0000' && LA29_0 <= ')')||(LA29_0 >= '+' && LA29_0 <= '\uFFFF')) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:61:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop29;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:65:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:65:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:8: ( G8 | LIST | LINE | TRIANGLE | RECTANGLE | CURVE | CIRCLE | ELLIPSE | RGB | TEXT | FLOAT | COMMENT | WS )
		int alt31=13;
		alt31 = dfa31.predict(input);
		switch (alt31) {
			case 1 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:10: G8
				{
				mG8(); 

				}
				break;
			case 2 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:13: LIST
				{
				mLIST(); 

				}
				break;
			case 3 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:18: LINE
				{
				mLINE(); 

				}
				break;
			case 4 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:23: TRIANGLE
				{
				mTRIANGLE(); 

				}
				break;
			case 5 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:32: RECTANGLE
				{
				mRECTANGLE(); 

				}
				break;
			case 6 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:42: CURVE
				{
				mCURVE(); 

				}
				break;
			case 7 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:48: CIRCLE
				{
				mCIRCLE(); 

				}
				break;
			case 8 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:55: ELLIPSE
				{
				mELLIPSE(); 

				}
				break;
			case 9 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:63: RGB
				{
				mRGB(); 

				}
				break;
			case 10 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:67: TEXT
				{
				mTEXT(); 

				}
				break;
			case 11 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:72: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 12 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:78: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 13 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:86: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA26 dfa26 = new DFA26(this);
	protected DFA31 dfa31 = new DFA31(this);
	static final String DFA26_eotS =
		"\1\uffff\1\3\2\uffff";
	static final String DFA26_eofS =
		"\4\uffff";
	static final String DFA26_minS =
		"\1\60\1\56\2\uffff";
	static final String DFA26_maxS =
		"\2\71\2\uffff";
	static final String DFA26_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA26_specialS =
		"\4\uffff}>";
	static final String[] DFA26_transitionS = {
			"\12\1",
			"\1\2\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "54:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* '.' ( '0' .. '9' )* | ( '0' .. '9' )+ );";
		}
	}

	static final String DFA31_eotS =
		"\1\uffff\3\10\2\22\1\10\1\22\1\uffff\1\22\2\uffff\6\10\1\uffff\4\10\1"+
		"\uffff\22\10\1\uffff\53\10\1\uffff\13\10\1\uffff\1\10\1\uffff\4\10\1\uffff"+
		"\14\10\1\uffff\20\10\1\uffff\63\10\1\uffff\41\10\1\52\102\10\1\151\10"+
		"\10\1\126\24\10\1\u0087\24\10\1\u0087\16\10\1\u0087\4\10\1\142\1\144\3"+
		"\10\1\52\47\10\2\52\1\166\21\10\1\52\10\10\1\u0087\2\10\1\u0087\46\10"+
		"\1\151\15\10\2\142\3\10\1\126\32\10\2\151\1\10\1\u0087\13\10\1\u0087\3"+
		"\10\2\126\3\10\1\151\13\10\1\u0087\6\10\1\126\5\10\4\u0087\1\10\1\u0087"+
		"\10\10\1\144\6\10\1\u0087\5\10\2\u0087\12\10\2\u0087\3\10\1\u0087\3\10"+
		"\2\144\2\10\1\166\3\10\1\u0087\7\10\1\144\10\10\1\u0087\6\10\2\166\12"+
		"\10\1\166\3\10\2\u0087\10\10\1\u0087\13\10\1\u0087\12\10\2\u0087\2\10"+
		"\1\u0087\12\10";
	static final String DFA31_eofS =
		"\u02ca\uffff";
	static final String DFA31_minS =
		"\1\11\2\111\1\105\2\60\1\101\1\56\1\uffff\1\60\2\uffff\1\124\1\111\1\116"+
		"\1\103\2\122\1\uffff\1\114\1\124\1\60\1\105\1\uffff\1\114\1\101\1\105"+
		"\1\124\1\126\1\103\1\111\1\101\1\56\1\116\1\105\1\116\4\130\1\120\1\122"+
		"\1\uffff\1\101\1\124\1\60\1\107\3\123\1\103\1\123\1\124\1\60\1\105\1\60"+
		"\1\114\3\124\1\105\1\130\1\60\1\56\1\122\1\60\1\105\3\101\1\116\1\103"+
		"\2\60\1\56\1\102\2\60\1\130\3\122\1\124\1\105\2\56\1\uffff\1\123\2\60"+
		"\1\56\1\60\1\101\3\124\1\105\1\116\1\uffff\1\123\1\uffff\1\123\1\124\2"+
		"\56\1\uffff\1\103\2\60\1\114\1\60\1\103\1\122\3\124\1\101\1\102\1\uffff"+
		"\1\103\1\105\1\60\1\56\1\60\1\56\2\60\1\105\2\101\1\122\1\60\1\105\1\116"+
		"\1\60\1\uffff\1\101\1\56\1\123\2\56\3\122\1\124\1\56\1\116\1\124\2\60"+
		"\1\123\1\124\1\123\1\103\1\105\2\124\1\60\1\103\1\124\1\105\1\60\1\56"+
		"\1\124\1\101\1\124\1\105\1\60\1\114\1\103\1\56\1\60\1\105\1\122\1\40\1"+
		"\102\1\101\1\122\1\101\1\116\1\56\2\60\1\105\1\56\1\122\1\60\1\uffff\1"+
		"\60\1\122\1\124\1\122\1\124\1\103\2\56\1\116\1\103\1\105\2\56\1\124\1"+
		"\60\1\124\4\105\1\104\2\60\1\101\1\102\1\114\1\56\1\103\1\122\3\116\2"+
		"\60\1\56\1\104\2\60\1\105\2\60\1\124\2\104\1\56\1\117\1\111\1\105\1\111"+
		"\2\56\1\116\2\56\1\105\1\114\1\103\1\105\1\114\1\104\1\115\1\125\1\103"+
		"\1\105\1\104\1\105\1\101\1\122\2\60\1\116\1\117\1\124\1\111\1\123\1\60"+
		"\1\116\1\60\1\116\1\104\1\105\2\56\1\104\1\122\1\110\1\116\1\60\1\56\1"+
		"\104\1\56\1\104\1\111\1\60\2\105\1\60\2\102\2\60\1\103\1\114\1\105\1\103"+
		"\1\125\1\56\2\116\1\60\2\117\1\56\1\117\1\111\2\60\1\116\1\60\1\123\1"+
		"\105\2\104\1\117\1\111\1\104\1\122\1\105\1\114\1\104\1\60\1\56\1\104\1"+
		"\56\1\60\1\115\1\114\1\103\1\114\2\104\1\131\1\104\1\115\1\117\1\124\1"+
		"\117\1\111\1\105\1\60\1\105\1\60\1\111\2\60\1\117\1\124\1\105\1\60\1\105"+
		"\1\101\1\122\1\110\1\114\1\104\1\116\1\60\1\116\1\117\1\111\1\116\2\60"+
		"\1\122\1\110\1\122\1\60\1\122\1\130\2\102\1\117\1\124\1\104\1\117\1\111"+
		"\1\104\1\114\1\104\1\60\1\117\1\111\1\117\1\111\2\102\3\60\2\117\1\122"+
		"\1\110\2\114\1\104\1\103\1\117\1\124\1\56\1\114\1\104\1\114\1\104\2\117"+
		"\3\60\1\104\1\122\2\102\1\60\1\117\1\124\1\60\1\122\1\110\1\105\1\117"+
		"\1\124\1\117\1\124\1\104\1\122\1\60\2\117\1\111\1\104\1\131\1\104\2\117"+
		"\1\60\1\122\1\110\1\60\2\102\1\115\1\122\1\110\1\122\1\110\1\104\1\131"+
		"\1\104\2\114\1\104\1\105\1\60\1\105\1\104\1\122\1\117\1\111\2\102\1\117"+
		"\1\111\2\117\1\101\2\60\2\102\1\105\1\60\1\105\2\117\1\124\1\122\1\60"+
		"\1\122\1\104\1\131\1\104\1\114\1\104\2\117\1\114\2\104\1\122\1\130\2\60"+
		"\2\117\1\122\1\60\3\122\1\110\2\60\1\105\1\60\1\105\1\117\1\124\1\104"+
		"\1\122\1\117\1\124\1\104\1\131\1\104\1\60\1\104\1\122\2\60\3\102\2\60"+
		"\1\122\1\60\2\122\1\110\1\104\1\131\1\104\1\122\1\110\1\105\1\60\1\105"+
		"\1\60\1\104\1\131\1\104\2\60\3\117\1\60\1\117\4\60\1\105\1\60\1\105\2"+
		"\102\1\122\1\60\1\122\1\117\1\111\1\105\1\60\1\105\1\60\1\117\2\104\1"+
		"\122\1\114\4\60\1\122\1\60\1\122\2\117\2\60\1\114\1\104\1\122\1\60\1\122"+
		"\1\114\1\104\1\131\1\104\1\117\1\60\1\117\2\60\1\104\1\122\2\60\1\117"+
		"\1\124\2\60\1\117\1\105\1\60\1\105\1\122\1\114\2\60\1\104\1\131\1\104"+
		"\1\60\1\117\1\122\1\110\2\60\2\122\1\60\1\122\1\102\1\117\1\60\1\117\1"+
		"\105\1\60\1\105\1\114\2\102\1\60\1\117\1\102\2\60\1\117\1\122\1\114\1"+
		"\122\1\60\1\122\3\117\1\114\1\117\2\60\1\104\1\102\1\117\2\60\1\122\1"+
		"\104\1\122\1\117\1\104\1\60\2\117\1\122\2\60\1\102\1\104\1\131\1\104\1"+
		"\122\1\114\1\104\1\102\1\60\2\117\1\105\1\60\1\105\1\102\2\117\1\114\1"+
		"\104\1\122\1\60\1\122\1\117\1\122\1\104\1\117\2\60\1\104\1\102\1\122\2"+
		"\60\1\117\1\102\1\60\1\117\1\104\1\117\1\114\1\104\1\117\1\122\1\102\1"+
		"\117\1\104";
	static final String DFA31_maxS =
		"\1\172\1\122\1\111\1\105\2\172\1\123\1\172\1\uffff\1\172\2\uffff\1\124"+
		"\1\111\1\116\1\103\2\122\1\uffff\1\114\1\124\1\71\1\105\1\uffff\1\114"+
		"\1\101\1\105\1\124\1\126\1\103\1\111\1\101\1\131\1\116\1\105\1\116\4\130"+
		"\1\120\1\122\1\uffff\1\101\1\124\1\172\1\107\3\123\1\103\1\123\1\124\1"+
		"\71\1\105\1\172\1\114\3\124\1\105\1\130\1\114\1\130\1\122\1\172\1\105"+
		"\3\101\1\116\1\103\2\71\1\131\1\102\1\105\1\172\1\130\3\122\1\124\1\105"+
		"\2\131\1\uffff\1\123\2\71\1\131\1\172\1\101\3\124\1\105\1\116\1\uffff"+
		"\1\123\1\uffff\1\123\1\124\2\131\1\uffff\1\103\1\172\1\71\1\114\1\71\1"+
		"\103\1\122\3\124\1\101\1\102\1\uffff\1\103\1\105\1\172\1\131\1\71\1\131"+
		"\2\71\1\105\2\101\1\122\1\71\1\105\1\116\1\172\1\uffff\1\101\1\131\1\123"+
		"\2\131\3\122\1\124\1\130\1\116\1\124\1\172\1\71\1\123\1\124\1\123\1\103"+
		"\1\105\2\124\1\71\1\103\1\124\1\105\1\172\1\130\1\124\1\101\1\124\1\105"+
		"\1\71\1\114\1\103\1\130\1\71\1\105\1\122\1\172\1\102\1\101\1\122\1\101"+
		"\1\116\1\131\2\71\1\105\1\131\1\122\1\71\1\uffff\1\71\1\122\1\124\1\122"+
		"\1\124\1\103\2\130\1\116\1\103\1\105\1\122\1\131\1\124\1\71\1\124\4\105"+
		"\1\104\2\71\1\101\1\102\1\114\1\130\1\103\1\122\3\116\1\71\1\172\1\123"+
		"\1\104\2\71\1\105\2\71\1\124\2\104\1\131\1\117\1\111\1\105\1\111\2\130"+
		"\1\116\1\130\1\122\1\105\1\114\1\103\1\105\1\114\1\104\1\115\1\125\1\103"+
		"\1\105\1\104\1\105\1\101\1\122\2\71\1\116\1\117\1\124\1\111\1\123\1\71"+
		"\1\116\1\71\1\116\1\104\1\105\2\131\1\104\1\122\1\110\1\116\1\71\1\131"+
		"\1\104\1\131\1\104\1\111\1\71\2\105\1\71\2\102\1\71\1\172\1\103\1\114"+
		"\1\105\1\103\1\125\1\123\2\116\1\172\2\117\1\123\1\117\1\111\2\71\1\116"+
		"\1\71\1\123\1\105\2\104\1\117\1\111\2\122\1\105\1\114\1\104\1\172\1\131"+
		"\1\104\1\131\1\71\1\115\1\114\1\103\1\114\2\104\1\131\1\104\1\115\1\117"+
		"\1\124\1\117\1\111\1\105\1\71\1\105\1\172\1\111\2\71\1\117\1\124\1\105"+
		"\1\106\1\105\1\101\1\122\1\110\1\114\1\104\1\116\1\172\1\116\1\117\1\111"+
		"\1\116\2\172\1\122\1\110\1\122\1\172\1\122\1\130\2\102\1\117\1\124\1\104"+
		"\1\117\1\111\1\104\1\114\1\104\1\71\1\117\1\111\1\117\1\111\2\102\1\106"+
		"\2\71\2\117\1\122\1\110\2\114\1\104\1\103\1\117\1\124\1\123\1\114\1\104"+
		"\1\114\1\104\2\117\3\172\2\122\2\102\1\71\1\117\1\124\1\71\1\122\1\110"+
		"\1\105\1\117\1\124\1\117\1\124\2\122\1\172\2\117\1\111\1\104\1\131\1\104"+
		"\2\117\1\172\1\122\1\110\1\172\2\102\1\115\1\122\1\110\1\122\1\110\1\104"+
		"\1\131\1\104\2\114\1\104\1\105\1\106\1\105\2\122\1\117\1\111\2\102\1\117"+
		"\1\111\2\117\1\101\1\106\1\71\2\102\1\105\1\106\1\105\2\117\1\124\1\122"+
		"\1\172\1\122\1\104\1\131\1\104\1\114\1\104\2\117\1\114\1\104\2\122\1\130"+
		"\2\172\2\117\1\122\1\172\3\122\1\110\1\106\1\71\1\105\1\106\1\105\1\117"+
		"\1\124\2\122\1\117\1\124\1\104\1\131\1\104\1\71\2\122\1\106\1\71\3\102"+
		"\2\172\1\122\1\172\2\122\1\110\1\104\1\131\1\104\1\122\1\110\1\105\1\106"+
		"\1\105\1\172\1\104\1\131\1\104\2\172\3\117\1\172\1\117\1\106\1\71\1\106"+
		"\1\71\1\105\1\106\1\105\2\102\1\122\1\172\1\122\1\117\1\111\1\105\1\106"+
		"\1\105\1\172\1\117\1\104\2\122\1\114\4\172\1\122\1\172\1\122\2\117\1\106"+
		"\1\71\1\114\1\104\1\122\1\172\1\122\1\114\1\104\1\131\1\104\1\117\1\172"+
		"\1\117\1\106\1\71\2\122\2\172\1\117\1\124\1\106\1\71\1\117\1\105\1\106"+
		"\1\105\1\122\1\114\2\172\1\104\1\131\1\104\1\172\1\117\1\122\1\110\2\172"+
		"\2\122\1\172\1\122\1\102\1\117\1\172\1\117\1\105\1\106\1\105\1\114\2\102"+
		"\1\172\1\117\1\102\1\106\1\71\1\117\1\122\1\114\1\122\1\172\1\122\3\117"+
		"\1\114\1\117\2\172\1\104\1\102\1\117\1\106\1\71\3\122\1\117\1\104\1\172"+
		"\2\117\1\122\2\172\1\102\1\104\1\131\1\104\1\122\1\114\1\104\1\102\1\172"+
		"\2\117\1\105\1\106\1\105\1\102\2\117\1\114\1\104\1\122\1\172\1\122\1\117"+
		"\1\122\1\104\1\117\1\106\1\71\1\104\1\102\1\122\2\172\1\117\1\102\1\172"+
		"\1\117\1\104\1\117\1\114\1\104\1\117\1\122\1\102\1\117\1\104";
	static final String DFA31_acceptS =
		"\10\uffff\1\12\1\uffff\1\14\1\15\6\uffff\1\11\4\uffff\1\13\22\uffff\1"+
		"\4\53\uffff\1\5\13\uffff\1\3\1\uffff\1\6\4\uffff\1\7\14\uffff\1\10\20"+
		"\uffff\1\2\63\uffff\1\1\u020e\uffff";
	static final String DFA31_specialS =
		"\u02ca\uffff}>";
	static final String[] DFA31_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\16\uffff\1\12\12\7\7\uffff\2\11\1\4"+
			"\1\11\1\5\1\11\5\10\1\2\5\10\1\3\1\10\1\1\3\10\1\6\2\10\6\uffff\32\10",
			"\1\14\10\uffff\1\15",
			"\1\16",
			"\1\17",
			"\12\11\7\uffff\6\11\2\10\1\21\13\10\1\20\5\10\6\uffff\32\10",
			"\12\11\7\uffff\6\11\5\10\1\23\16\10\6\uffff\32\10",
			"\1\25\1\uffff\1\26\17\uffff\1\24",
			"\1\27\1\uffff\12\7\7\uffff\6\11\24\10\6\uffff\32\10",
			"",
			"\12\11\7\uffff\6\11\24\10\6\uffff\32\10",
			"",
			"",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"",
			"\1\36",
			"\1\37",
			"\12\40",
			"\1\41",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52\1\uffff\12\40\37\uffff\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\65",
			"\1\66",
			"\12\67\7\uffff\32\67\6\uffff\32\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\77",
			"\1\100",
			"\12\67\7\uffff\3\67\1\101\26\67\6\uffff\32\67",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\12\112\11\uffff\1\111\10\uffff\1\110",
			"\1\52\1\uffff\12\77\36\uffff\1\113",
			"\1\114",
			"\12\67\7\uffff\3\67\1\101\15\67\1\115\10\67\6\uffff\32\67",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\124",
			"\12\125",
			"\1\126\1\uffff\12\112\37\uffff\1\127",
			"\1\130",
			"\12\132\13\uffff\1\131",
			"\12\67\7\uffff\1\133\2\67\1\101\26\67\6\uffff\32\67",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142\1\uffff\12\124\37\uffff\1\143",
			"\1\144\1\uffff\12\125\37\uffff\1\145",
			"",
			"\1\146",
			"\12\147",
			"\12\150",
			"\1\151\1\uffff\12\132\37\uffff\1\152",
			"\12\67\7\uffff\3\67\1\101\22\67\1\153\3\67\6\uffff\32\67",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"",
			"\1\162",
			"",
			"\1\163",
			"\1\164",
			"\1\52\1\uffff\12\147\37\uffff\1\165",
			"\1\166\1\uffff\12\150\37\uffff\1\167",
			"",
			"\1\170",
			"\12\67\7\uffff\3\67\1\101\16\67\1\171\7\67\6\uffff\32\67",
			"\12\172",
			"\1\173",
			"\12\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\1\u0085",
			"\12\67\7\uffff\3\67\1\101\13\67\1\u0086\12\67\6\uffff\32\67",
			"\1\u0087\1\uffff\12\172\37\uffff\1\u0088",
			"\12\u0089",
			"\1\u0087\1\uffff\12\174\37\uffff\1\u008a",
			"\12\u008b",
			"\12\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\u0091",
			"\1\u0092",
			"\1\u0093",
			"\12\67\7\uffff\1\u0094\2\67\1\101\26\67\6\uffff\32\67",
			"",
			"\1\u0095",
			"\1\u0087\1\uffff\12\u0089\37\uffff\1\u0096",
			"\1\u0097",
			"\1\u0087\1\uffff\12\u008b\37\uffff\1\u0098",
			"\1\u0087\1\uffff\12\u008c\37\uffff\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\52\1\uffff\12\u0091\36\uffff\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\12\67\7\uffff\2\67\1\u00a1\1\101\26\67\6\uffff\32\67",
			"\12\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\12\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\12\67\7\uffff\3\67\1\101\1\u00ae\25\67\6\uffff\32\67",
			"\1\u0087\1\uffff\12\u00a2\36\uffff\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\12\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\126\1\uffff\12\u00aa\36\uffff\1\u00b7",
			"\12\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb\17\uffff\12\67\7\uffff\3\67\1\101\26\67\6\uffff\32\67",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u0087\1\uffff\12\u00b4\37\uffff\1\u00c1",
			"\12\u00c2",
			"\12\u00c3",
			"\1\u00c4",
			"\1\52\1\uffff\12\u00b8\37\uffff\1\u00c5",
			"\1\u00c6",
			"\12\u00c7",
			"",
			"\12\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\142\1\uffff\12\u00c2\36\uffff\1\u00ce",
			"\1\144\1\uffff\12\u00c3\36\uffff\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\151\1\uffff\12\u00c7\30\uffff\1\u00d3",
			"\1\u0087\1\uffff\12\u00c8\37\uffff\1\u00d4",
			"\1\u00d5",
			"\12\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\12\u00dd",
			"\12\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u0087\1\uffff\12\u00d6\36\uffff\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\12\u00e8",
			"\12\u00dd\7\uffff\2\10\1\u00e9\23\10\1\u00ea\3\10\6\uffff\32\10",
			"\1\166\1\uffff\12\u00de\31\uffff\1\u00eb",
			"\1\u00ec",
			"\12\u00ed",
			"\12\u00ee",
			"\1\u00ef",
			"\12\u00f0",
			"\12\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\126\1\uffff\12\u00e8\37\uffff\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u0087\1\uffff\12\u00ed\36\uffff\1\u00fa",
			"\1\u0087\1\uffff\12\u00ee\36\uffff\1\u00fb",
			"\1\u00fc",
			"\1\u0087\1\uffff\12\u00f0\36\uffff\1\u00fd",
			"\1\u0087\1\uffff\12\u00f1\30\uffff\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\12\u010d",
			"\12\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\12\u0114",
			"\1\u0115",
			"\12\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\142\1\uffff\12\u010d\37\uffff\1\u011a",
			"\1\144\1\uffff\12\u010e\37\uffff\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\12\u0120",
			"\1\u0087\1\uffff\12\u0114\37\uffff\1\u0121",
			"\1\u0122",
			"\1\u0087\1\uffff\12\u0116\37\uffff\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\12\u0126",
			"\1\u0127",
			"\1\u0128",
			"\12\u0129",
			"\1\u012a",
			"\1\u012b",
			"\12\u012c",
			"\12\u0120\7\uffff\2\10\1\u012d\23\10\1\u012e\3\10\6\uffff\32\10",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0087\1\uffff\12\u0126\31\uffff\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\12\u0129\7\uffff\2\10\1\u0137\23\10\1\u0138\3\10\6\uffff\32\10",
			"\1\u0139",
			"\1\u013a",
			"\1\166\1\uffff\12\u012c\31\uffff\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\12\u013e",
			"\12\u013f",
			"\1\u0140",
			"\12\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0149\15\uffff\1\u0148",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\12\u013e\7\uffff\2\10\1\u014e\23\10\1\u014f\3\10\6\uffff\32\10",
			"\1\u0087\1\uffff\12\u013f\37\uffff\1\u0150",
			"\1\u0151",
			"\1\u0087\1\uffff\12\u0141\37\uffff\1\u0152",
			"\12\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\12\u0162",
			"\1\u0163",
			"\12\u0153\7\uffff\2\10\1\u0164\23\10\1\u0165\3\10\6\uffff\32\10",
			"\1\u0166",
			"\12\u0167",
			"\12\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\12\u016c\7\uffff\6\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\12\u0162\7\uffff\2\10\1\u0174\23\10\1\u0175\3\10\6\uffff\32\10",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\12\u0167\7\uffff\2\10\1\u017a\23\10\1\u017b\3\10\6\uffff\32\10",
			"\12\u0168\7\uffff\2\10\1\u017c\23\10\1\u017d\3\10\6\uffff\32\10",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\12\u016c\7\uffff\6\u016c\24\10\6\uffff\32\10",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\12\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\12\u0194\7\uffff\6\u0194",
			"\12\u0195",
			"\12\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u0087\1\uffff\12\u018d\31\uffff\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"\12\u0194\7\uffff\2\u0194\1\u01a8\3\u0194\20\10\1\u00ea\3\10\6\uffff"+
			"\32\10",
			"\12\u0195\7\uffff\2\10\1\u01a9\27\10\6\uffff\32\10",
			"\12\u0196\7\uffff\2\10\1\u01aa\23\10\1\u01ab\3\10\6\uffff\32\10",
			"\1\u01ad\15\uffff\1\u01ac",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\12\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\12\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\1\u01bd\15\uffff\1\u01bc",
			"\1\u01be",
			"\12\u0194\7\uffff\2\u0194\1\u01a8\3\u0194\10\10\1\u01bf\7\10\1\u00ea"+
			"\3\10\6\uffff\32\10",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\12\u01b1\7\uffff\2\10\1\u01c7\23\10\1\u01c8\3\10\6\uffff\32\10",
			"\1\u01c9",
			"\1\u01ca",
			"\12\u01b4\7\uffff\2\10\1\u01cb\23\10\1\u01cc\3\10\6\uffff\32\10",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\12\u01db\7\uffff\6\u01db",
			"\1\u01dc",
			"\1\u01de\15\uffff\1\u01dd",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\12\u01e9\7\uffff\6\u01e9",
			"\12\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\1\u01ed",
			"\12\u01ee\7\uffff\6\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\12\u01db\7\uffff\6\u01db\24\10\6\uffff\32\10",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01ff\15\uffff\1\u01fe",
			"\1\u0200",
			"\1\u0201",
			"\12\u01e9\7\uffff\6\u01e9\20\10\1\u017b\3\10\6\uffff\32\10",
			"\12\u01ea\7\uffff\32\10\6\uffff\32\10",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\12\u01ee\7\uffff\6\u01ee\24\10\6\uffff\32\10",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\12\u0209\7\uffff\6\u0209",
			"\12\u020a",
			"\1\u020b",
			"\12\u020c\7\uffff\6\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0211\15\uffff\1\u0210",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\12\u0218",
			"\1\u021a\15\uffff\1\u0219",
			"\1\u021b",
			"\12\u021c\7\uffff\6\u021c",
			"\12\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\12\u0209\7\uffff\2\u0209\1\u0221\3\u0209\20\10\1\u012e\3\10\6\uffff"+
			"\32\10",
			"\12\u020a\7\uffff\2\10\1\u0222\27\10\6\uffff\32\10",
			"\1\u0223",
			"\12\u020c\7\uffff\6\u020c\24\10\6\uffff\32\10",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\12\u022d\7\uffff\6\u022d",
			"\1\u022e",
			"\12\u0218\7\uffff\2\10\1\u022f\23\10\1\u0230\3\10\6\uffff\32\10",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\12\u021c\7\uffff\2\u021c\1\u0234\3\u021c\20\10\1\u0138\3\10\6\uffff"+
			"\32\10",
			"\12\u021d\7\uffff\2\10\1\u0235\27\10\6\uffff\32\10",
			"\1\u0236",
			"\1\u0237",
			"\1\u0238",
			"\12\u0209\7\uffff\2\u0209\1\u0221\3\u0209\10\10\1\u0239\7\10\1\u012e"+
			"\3\10\6\uffff\32\10",
			"\1\u0239",
			"\12\u023a\7\uffff\6\u023a",
			"\12\u023b",
			"\12\u023c\7\uffff\6\u023c",
			"\12\u023d",
			"\1\u023e",
			"\12\u023f\7\uffff\6\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\12\u022d\7\uffff\6\u022d\24\10\6\uffff\32\10",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\12\u0248\7\uffff\6\u0248",
			"\1\u0249",
			"\12\u021c\7\uffff\2\u021c\1\u0234\3\u021c\10\10\1\u024a\7\10\1\u0138"+
			"\3\10\6\uffff\32\10",
			"\1\u024a",
			"\1\u0149",
			"\1\u024c\15\uffff\1\u024b",
			"\1\u024d",
			"\1\u024e",
			"\12\u023a\7\uffff\2\u023a\1\u024f\3\u023a\20\10\1\u014f\3\10\6\uffff"+
			"\32\10",
			"\12\u023b\7\uffff\2\10\1\u0250\27\10\6\uffff\32\10",
			"\12\u023c\7\uffff\6\u023c\20\10\1\u01c8\3\10\6\uffff\32\10",
			"\12\u023d\7\uffff\32\10\6\uffff\32\10",
			"\1\u0251",
			"\12\u023f\7\uffff\6\u023f\24\10\6\uffff\32\10",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"\12\u0255\7\uffff\6\u0255",
			"\12\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\12\u0248\7\uffff\6\u0248\24\10\6\uffff\32\10",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f",
			"\12\u023a\7\uffff\2\u023a\1\u024f\3\u023a\10\10\1\u0260\7\10\1\u014f"+
			"\3\10\6\uffff\32\10",
			"\1\u0260",
			"\12\u0261\7\uffff\6\u0261",
			"\12\u0262",
			"\1\u0264\15\uffff\1\u0263",
			"\1\u0265",
			"\12\u0255\7\uffff\2\u0255\1\u0266\3\u0255\20\10\1\u0165\3\10\6\uffff"+
			"\32\10",
			"\12\u0256\7\uffff\2\10\1\u0267\27\10\6\uffff\32\10",
			"\1\u0268",
			"\1\u0269",
			"\12\u026a\7\uffff\6\u026a",
			"\12\u026b",
			"\1\u026c",
			"\1\u026d",
			"\12\u026e\7\uffff\6\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\12\u0261\7\uffff\2\u0261\1\u0272\3\u0261\20\10\1\u0175\3\10\6\uffff"+
			"\32\10",
			"\12\u0262\7\uffff\2\10\1\u0273\27\10\6\uffff\32\10",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\12\u0255\7\uffff\2\u0255\1\u0266\3\u0255\10\10\1\u0277\7\10\1\u0165"+
			"\3\10\6\uffff\32\10",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\12\u026a\7\uffff\2\u026a\1\u027a\3\u026a\20\10\1\u017d\3\10\6\uffff"+
			"\32\10",
			"\12\u026b\7\uffff\2\10\1\u027b\27\10\6\uffff\32\10",
			"\1\u027c",
			"\1\u027d",
			"\12\u026e\7\uffff\6\u026e\24\10\6\uffff\32\10",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\12\u0261\7\uffff\2\u0261\1\u0272\3\u0261\10\10\1\u0281\7\10\1\u0175"+
			"\3\10\6\uffff\32\10",
			"\1\u0281",
			"\1\u0282",
			"\12\u0283\7\uffff\6\u0283",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\12\u026a\7\uffff\2\u026a\1\u027a\3\u026a\10\10\1\u0288\7\10\1\u017d"+
			"\3\10\6\uffff\32\10",
			"\1\u0288",
			"\1\u0289",
			"\12\u028a\7\uffff\6\u028a",
			"\12\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\12\u0283\7\uffff\6\u0283\24\10\6\uffff\32\10",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\12\u028a\7\uffff\2\u028a\1\u0296\3\u028a\20\10\1\u01ab\3\10\6\uffff"+
			"\32\10",
			"\12\u028b\7\uffff\2\10\1\u0297\27\10\6\uffff\32\10",
			"\1\u01ad",
			"\1\u0298",
			"\1\u0299",
			"\12\u029a\7\uffff\6\u029a",
			"\12\u029b",
			"\1\u029c",
			"\1\u029e\15\uffff\1\u029d",
			"\1\u029f",
			"\1\u02a0",
			"\1\u01bd",
			"\12\u028a\7\uffff\2\u028a\1\u0296\3\u028a\10\10\1\u02a1\7\10\1\u01ab"+
			"\3\10\6\uffff\32\10",
			"\1\u02a1",
			"\1\u02a2",
			"\1\u02a3",
			"\12\u029a\7\uffff\2\u029a\1\u02a4\3\u029a\20\10\1\u01cc\3\10\6\uffff"+
			"\32\10",
			"\12\u029b\7\uffff\2\10\1\u02a5\27\10\6\uffff\32\10",
			"\1\u02a6",
			"\1\u02a7",
			"\1\u02a8",
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"\1\u01de",
			"\1\u02ac",
			"\12\u029a\7\uffff\2\u029a\1\u02a4\3\u029a\10\10\1\u02ad\7\10\1\u01cc"+
			"\3\10\6\uffff\32\10",
			"\1\u02ad",
			"\1\u02ae",
			"\1\u02af",
			"\12\u02b0\7\uffff\6\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u01ff",
			"\1\u02b6",
			"\12\u02b0\7\uffff\6\u02b0\24\10\6\uffff\32\10",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u0211",
			"\1\u02ba",
			"\12\u02bb\7\uffff\6\u02bb",
			"\12\u02bc",
			"\1\u021a",
			"\1\u02bd",
			"\1\u02be",
			"\12\u02bb\7\uffff\2\u02bb\1\u02bf\3\u02bb\20\10\1\u0230\3\10\6\uffff"+
			"\32\10",
			"\12\u02bc\7\uffff\2\10\1\u02c0\27\10\6\uffff\32\10",
			"\1\u02c1",
			"\1\u02c2",
			"\12\u02bb\7\uffff\2\u02bb\1\u02bf\3\u02bb\10\10\1\u02c3\7\10\1\u0230"+
			"\3\10\6\uffff\32\10",
			"\1\u02c3",
			"\1\u024c",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u0264",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u029e"
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( G8 | LIST | LINE | TRIANGLE | RECTANGLE | CURVE | CIRCLE | ELLIPSE | RGB | TEXT | FLOAT | COMMENT | WS );";
		}
	}

}
