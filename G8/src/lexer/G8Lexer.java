package lexer;

// $ANTLR 3.5.1 D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g 2019-04-25 19:54:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class G8Lexer extends Lexer {
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

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:2:7: ( 'CIRC:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:2:9: 'CIRC:'
			{
			match("CIRC:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:7: ( 'COLOR' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:3:9: 'COLOR'
			{
			match("COLOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:4:7: ( 'COLORBODY' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:4:9: 'COLORBODY'
			{
			match("COLORBODY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:5:7: ( 'CURV:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:5:9: 'CURV:'
			{
			match("CURV:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:7: ( 'DRAWSPACE HEIGTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:6:9: 'DRAWSPACE HEIGTH'
			{
			match("DRAWSPACE HEIGTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:7:7: ( 'DRAWSPACE WIDTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:7:9: 'DRAWSPACE WIDTH'
			{
			match("DRAWSPACE WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:8:7: ( 'ELLIPS:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:8:9: 'ELLIPS:'
			{
			match("ELLIPS:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:7: ( 'ENDANGLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:9:9: 'ENDANGLE'
			{
			match("ENDANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:10:7: ( 'LINE:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:10:9: 'LINE:'
			{
			match("LINE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:11:7: ( 'RADIUS' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:11:9: 'RADIUS'
			{
			match("RADIUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:7: ( 'RECT:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:12:9: 'RECT:'
			{
			match("RECT:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:13:7: ( 'ROTATION' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:13:9: 'ROTATION'
			{
			match("ROTATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:14:7: ( 'SEMAX' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:14:9: 'SEMAX'
			{
			match("SEMAX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:7: ( 'SEMIN' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:15:9: 'SEMIN'
			{
			match("SEMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:16:7: ( 'STARTANGLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:16:9: 'STARTANGLE'
			{
			match("STARTANGLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:17:7: ( 'TITLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:17:9: 'TITLE'
			{
			match("TITLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:7: ( 'TRIANGLE:' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:18:9: 'TRIANGLE:'
			{
			match("TRIANGLE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:19:7: ( 'WIDTH' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:19:9: 'WIDTH'
			{
			match("WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:20:7: ( 'XA' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:20:9: 'XA'
			{
			match("XA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:7: ( 'XB' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:21:9: 'XB'
			{
			match("XB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:22:7: ( 'XC' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:22:9: 'XC'
			{
			match("XC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:23:7: ( 'XCENTER' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:23:9: 'XCENTER'
			{
			match("XCENTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:7: ( 'XEND' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:24:9: 'XEND'
			{
			match("XEND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:25:7: ( 'XMIDDLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:25:9: 'XMIDDLE'
			{
			match("XMIDDLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:26:7: ( 'XSTART' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:26:9: 'XSTART'
			{
			match("XSTART"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:7: ( 'YA' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:9: 'YA'
			{
			match("YA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:28:7: ( 'YB' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:28:9: 'YB'
			{
			match("YB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:29:7: ( 'YC' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:29:9: 'YC'
			{
			match("YC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:7: ( 'YCENTER' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:9: 'YCENTER'
			{
			match("YCENTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:31:7: ( 'YEND' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:31:9: 'YEND'
			{
			match("YEND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:32:7: ( 'YMIDDLE' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:32:9: 'YMIDDLE'
			{
			match("YMIDDLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:7: ( 'YSTART' )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:9: 'YSTART'
			{
			match("YSTART"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "RGB"
	public final void mRGB() throws RecognitionException {
		try {
			int _type = RGB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:5: ( '#' ( '0' .. '9' | 'A' .. 'F' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:7: '#' ( '0' .. '9' | 'A' .. 'F' )+
			{
			match('#'); 
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:27:11: ( '0' .. '9' | 'A' .. 'F' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			{
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:30:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:11: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:33:27: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
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
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:34:7: ( '0' .. '9' )+
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:34:7: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
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
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
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

	// $ANTLR start "ROTATION"
	public final void mROTATION() throws RecognitionException {
		try {
			int _type = ROTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:37:10: ( '-' ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '-' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
			int alt13=4;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:37:12: '-' ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					match('-'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:37:16: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:37:32: ( '0' .. '9' )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
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
							break loop8;
						}
					}

					}
					break;
				case 2 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:38:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:38:7: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match('.'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:38:23: ( '0' .. '9' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
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
							break loop10;
						}
					}

					}
					break;
				case 3 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:7: '-' ( '0' .. '9' )+
					{
					match('-'); 
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:39:11: ( '0' .. '9' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
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
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					}
					break;
				case 4 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:40:7: ( '0' .. '9' )+
					{
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:40:7: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
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
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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
	// $ANTLR end "ROTATION"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:43:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='/') ) {
					alt17=1;
				}
				else if ( (LA17_1=='*') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:43:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:43:18: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
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
							break loop14;
						}
					}

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:43:32: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:43:32: '\\r'
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
					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:44:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:44:14: ( options {greedy=false; } : . )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='*') ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1=='/') ) {
								alt16=2;
							}
							else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
								alt16=1;
							}

						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:44:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop16;
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
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:47:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:47:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RGB | TEXT | FLOAT | ROTATION | COMMENT | WS )
		int alt18=38;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:184: T__39
				{
				mT__39(); 

				}
				break;
			case 31 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:190: T__40
				{
				mT__40(); 

				}
				break;
			case 32 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:196: T__41
				{
				mT__41(); 

				}
				break;
			case 33 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:202: RGB
				{
				mRGB(); 

				}
				break;
			case 34 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:206: TEXT
				{
				mTEXT(); 

				}
				break;
			case 35 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:211: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 36 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:217: ROTATION
				{
				mROTATION(); 

				}
				break;
			case 37 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:226: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 38 :
				// D:\\Stefano\\Università\\Magistrale Bergamo\\Quinto Anno\\Linguaggi Formali e Compilatori\\Progetto\\G8.g:1:234: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA6_eotS =
		"\1\uffff\1\3\2\uffff";
	static final String DFA6_eofS =
		"\4\uffff";
	static final String DFA6_minS =
		"\1\60\1\56\2\uffff";
	static final String DFA6_maxS =
		"\2\71\2\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA6_specialS =
		"\4\uffff}>";
	static final String[] DFA6_transitionS = {
			"\12\1",
			"\1\2\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "33:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ );";
		}
	}

	static final String DFA13_eotS =
		"\2\uffff\1\5\1\7\4\uffff";
	static final String DFA13_eofS =
		"\10\uffff";
	static final String DFA13_minS =
		"\1\55\1\60\2\56\4\uffff";
	static final String DFA13_maxS =
		"\4\71\4\uffff";
	static final String DFA13_acceptS =
		"\4\uffff\1\2\1\4\1\1\1\3";
	static final String DFA13_specialS =
		"\10\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\2\uffff\12\2",
			"\12\3",
			"\1\4\1\uffff\12\2",
			"\1\6\1\uffff\12\3",
			"",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "37:1: ROTATION : ( '-' ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '-' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
		}
	}

	static final String DFA18_eotS =
		"\1\uffff\12\15\1\uffff\1\15\4\uffff\17\15\1\74\1\75\1\77\3\15\1\103\1"+
		"\104\1\106\3\15\1\113\17\15\2\uffff\1\15\1\uffff\3\15\2\uffff\1\15\1\uffff"+
		"\3\15\1\113\1\uffff\21\15\1\165\3\15\1\171\2\15\1\uffff\1\175\1\uffff"+
		"\3\15\1\uffff\1\15\1\uffff\1\15\1\u0083\1\u0084\1\15\1\u0086\1\15\1\u0088"+
		"\1\15\1\uffff\3\15\1\uffff\3\15\1\uffff\3\15\1\u0093\1\15\2\uffff\1\15"+
		"\1\uffff\1\15\1\uffff\2\15\1\u0099\2\15\1\u009c\2\15\1\uffff\1\15\1\uffff"+
		"\3\15\1\u00a3\1\u00a4\1\uffff\1\u00a5\1\u00a6\1\uffff\2\15\1\u00a9\1\u00aa"+
		"\2\15\4\uffff\1\u00ad\1\15\2\uffff\1\15\3\uffff\1\u00b2\3\uffff";
	static final String DFA18_eofS =
		"\u00b3\uffff";
	static final String DFA18_minS =
		"\1\11\1\111\1\122\1\114\1\111\1\101\1\105\2\111\2\101\1\uffff\1\56\4\uffff"+
		"\1\122\1\114\1\122\1\101\1\114\1\104\1\116\1\104\1\103\1\124\1\115\1\101"+
		"\1\124\1\111\1\104\3\60\1\116\1\111\1\124\3\60\1\116\1\111\1\124\1\60"+
		"\1\103\1\117\1\126\1\127\1\111\1\101\1\105\1\111\1\124\2\101\1\122\1\114"+
		"\1\101\1\124\2\uffff\1\116\1\uffff\2\104\1\101\2\uffff\1\116\1\uffff\2"+
		"\104\1\101\1\60\1\uffff\1\72\1\122\1\72\1\123\1\120\1\116\1\72\1\125\1"+
		"\72\1\124\1\130\1\116\1\124\1\105\1\116\1\110\1\124\1\60\1\104\1\122\1"+
		"\124\1\60\1\104\1\122\1\uffff\1\60\1\uffff\1\120\1\123\1\107\1\uffff\1"+
		"\123\1\uffff\1\111\2\60\1\101\1\60\1\107\1\60\1\105\1\uffff\1\114\1\124"+
		"\1\105\1\uffff\1\114\1\124\1\117\1\uffff\1\101\1\72\1\114\1\60\1\117\2"+
		"\uffff\1\116\1\uffff\1\114\1\uffff\1\122\1\105\1\60\1\122\1\105\1\60\1"+
		"\104\1\103\1\uffff\1\105\1\uffff\1\116\1\107\1\105\2\60\1\uffff\2\60\1"+
		"\uffff\1\131\1\105\2\60\1\114\1\72\4\uffff\1\60\1\40\2\uffff\1\105\2\uffff"+
		"\1\110\1\60\3\uffff";
	static final String DFA18_maxS =
		"\1\172\1\125\1\122\1\116\1\111\1\117\1\124\1\122\1\111\2\123\1\uffff\1"+
		"\71\4\uffff\1\122\1\114\1\122\1\101\1\114\1\104\1\116\1\104\1\103\1\124"+
		"\1\115\1\101\1\124\1\111\1\104\3\172\1\116\1\111\1\124\3\172\1\116\1\111"+
		"\1\124\1\71\1\103\1\117\1\126\1\127\1\111\1\101\1\105\1\111\1\124\1\101"+
		"\1\111\1\122\1\114\1\101\1\124\2\uffff\1\116\1\uffff\2\104\1\101\2\uffff"+
		"\1\116\1\uffff\2\104\1\101\1\71\1\uffff\1\72\1\122\1\72\1\123\1\120\1"+
		"\116\1\72\1\125\1\72\1\124\1\130\1\116\1\124\1\105\1\116\1\110\1\124\1"+
		"\172\1\104\1\122\1\124\1\172\1\104\1\122\1\uffff\1\172\1\uffff\1\120\1"+
		"\123\1\107\1\uffff\1\123\1\uffff\1\111\2\172\1\101\1\172\1\107\1\172\1"+
		"\105\1\uffff\1\114\1\124\1\105\1\uffff\1\114\1\124\1\117\1\uffff\1\101"+
		"\1\72\1\114\1\172\1\117\2\uffff\1\116\1\uffff\1\114\1\uffff\1\122\1\105"+
		"\1\172\1\122\1\105\1\172\1\104\1\103\1\uffff\1\105\1\uffff\1\116\1\107"+
		"\1\105\2\172\1\uffff\2\172\1\uffff\1\131\1\105\2\172\1\114\1\72\4\uffff"+
		"\1\172\1\40\2\uffff\1\105\2\uffff\1\127\1\172\3\uffff";
	static final String DFA18_acceptS =
		"\13\uffff\1\41\1\uffff\1\42\1\44\1\45\1\46\53\uffff\1\23\1\24\1\uffff"+
		"\1\25\3\uffff\1\32\1\33\1\uffff\1\34\4\uffff\1\43\30\uffff\1\1\1\uffff"+
		"\1\4\3\uffff\1\11\1\uffff\1\13\10\uffff\1\27\3\uffff\1\36\3\uffff\1\2"+
		"\5\uffff\1\15\1\16\1\uffff\1\20\1\uffff\1\22\10\uffff\1\7\1\uffff\1\12"+
		"\5\uffff\1\31\2\uffff\1\40\6\uffff\1\26\1\30\1\35\1\37\2\uffff\1\10\1"+
		"\14\1\uffff\1\21\1\3\2\uffff\1\5\1\6\1\17";
	static final String DFA18_specialS =
		"\u00b3\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\2\uffff\1\13\11\uffff\1\16\1\uffff\1"+
			"\17\12\14\7\uffff\2\15\1\1\1\2\1\3\6\15\1\4\5\15\1\5\1\6\1\7\2\15\1\10"+
			"\1\11\1\12\1\15\6\uffff\32\15",
			"\1\21\5\uffff\1\22\5\uffff\1\23",
			"\1\24",
			"\1\25\1\uffff\1\26",
			"\1\27",
			"\1\30\3\uffff\1\31\11\uffff\1\32",
			"\1\33\16\uffff\1\34",
			"\1\35\10\uffff\1\36",
			"\1\37",
			"\1\40\1\41\1\42\1\uffff\1\43\7\uffff\1\44\5\uffff\1\45",
			"\1\46\1\47\1\50\1\uffff\1\51\7\uffff\1\52\5\uffff\1\53",
			"",
			"\1\54\1\uffff\12\14",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\4\15\1\76\25\15\6\uffff\32\15",
			"\1\100",
			"\1\101",
			"\1\102",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\4\15\1\105\25\15\6\uffff\32\15",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\112",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126\7\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"",
			"\1\134",
			"",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"",
			"\1\140",
			"",
			"\1\141",
			"\1\142",
			"\1\143",
			"\12\112",
			"",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\172",
			"\1\173",
			"",
			"\12\15\7\uffff\1\15\1\174\30\15\6\uffff\32\15",
			"",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"",
			"\1\u0081",
			"",
			"\1\u0082",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u0085",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u0087",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u0089",
			"",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u0094",
			"",
			"",
			"\1\u0095",
			"",
			"\1\u0096",
			"",
			"\1\u0097",
			"\1\u0098",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u009a",
			"\1\u009b",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u009d",
			"\1\u009e",
			"",
			"\1\u009f",
			"",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"",
			"\1\u00a7",
			"\1\u00a8",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"",
			"",
			"",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"\1\u00ae",
			"",
			"",
			"\1\u00af",
			"",
			"",
			"\1\u00b0\16\uffff\1\u00b1",
			"\12\15\7\uffff\32\15\6\uffff\32\15",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RGB | TEXT | FLOAT | ROTATION | COMMENT | WS );";
		}
	}

}
