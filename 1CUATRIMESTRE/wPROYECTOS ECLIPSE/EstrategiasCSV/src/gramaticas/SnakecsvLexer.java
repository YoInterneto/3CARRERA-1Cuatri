// Generated from D:/Escritorio/UNIVERSIDAD/3º CARRERA/1 CUATRIMESTRE/wPROYECTOS ECLIPSE/EstrategiasCSV/src/gramaticas/SnakecsvLexer.g4 by ANTLR 4.7.1

	package gramaticas;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnakecsvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, INCLUDE=2, WHILE=3, IF=4, ELSE=5, BEGIN=6, END=7, TIPO=8, 
		ID=9, INT=10, FLOAT=11, STRING=12, COMENTARIO_LINEA=13, COMENTARIO_BLOQUE=14, 
		NEWLINE=15, PI=16, PD=17, COMA=18, OPERACION=19, FINAL=20, ASIGNAR=21, 
		DOBLEPUNTO=22, WS=23, TAB=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTION", "INCLUDE", "WHILE", "IF", "ELSE", "BEGIN", "END", "TIPO", 
		"ID", "ID_LETRA", "DIGITO", "INT", "FLOAT", "STRING", "COMENTARIO_LINEA", 
		"COMENTARIO_BLOQUE", "NEWLINE", "PI", "PD", "COMA", "OPERACION", "FINAL", 
		"ASIGNAR", "DOBLEPUNTO", "WS", "TAB"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "INCLUDE", "WHILE", "IF", "ELSE", "BEGIN", "END", "TIPO", 
		"ID", "INT", "FLOAT", "STRING", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
		"NEWLINE", "PI", "PD", "COMA", "OPERACION", "FINAL", "ASIGNAR", "DOBLEPUNTO", 
		"WS", "TAB"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SnakecsvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SnakecsvLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\7\n"+
		"v\n\n\f\n\16\ny\13\n\3\13\3\13\3\f\3\f\3\r\6\r\u0080\n\r\r\r\16\r\u0081"+
		"\3\16\6\16\u0085\n\16\r\16\16\16\u0086\3\16\3\16\7\16\u008b\n\16\f\16"+
		"\16\16\u008e\13\16\3\16\3\16\6\16\u0092\n\16\r\16\16\16\u0093\5\16\u0096"+
		"\n\16\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\7\20\u00a5\n\20\f\20\16\20\u00a8\13\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21\u00b2\n\21\f\21\16\21\u00b5\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00bf\n\22\r\22\16\22\u00c0\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d6\n\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\6\32\u00e0\n\32\r\32\16\32\u00e1\3\32\3\32\3\33\6\33\u00e7"+
		"\n\33\r\33\16\33\u00e8\3\33\3\33\5\u009b\u00a6\u00b3\2\34\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\3\2\7\4\2C\\c|\3\2\62;\4\2"+
		"\f\f\17\17\5\2,-//\61\61\4\2>>@@\2\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5"+
		"@\3\2\2\2\7H\3\2\2\2\tN\3\2\2\2\13Q\3\2\2\2\rV\3\2\2\2\17\\\3\2\2\2\21"+
		"p\3\2\2\2\23r\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31\177\3\2\2\2\33\u0095"+
		"\3\2\2\2\35\u0097\3\2\2\2\37\u00a0\3\2\2\2!\u00ad\3\2\2\2#\u00be\3\2\2"+
		"\2%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c9\3\2\2\2+\u00d5\3\2\2\2-\u00d7"+
		"\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2\63\u00df\3\2\2\2\65\u00e6\3\2"+
		"\2\2\678\7h\2\289\7w\2\29:\7p\2\2:;\7e\2\2;<\7v\2\2<=\7k\2\2=>\7q\2\2"+
		">?\7p\2\2?\4\3\2\2\2@A\7k\2\2AB\7p\2\2BC\7e\2\2CD\7n\2\2DE\7w\2\2EF\7"+
		"f\2\2FG\7g\2\2G\6\3\2\2\2HI\7y\2\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2"+
		"M\b\3\2\2\2NO\7k\2\2OP\7h\2\2P\n\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2\2TU"+
		"\7g\2\2U\f\3\2\2\2VW\7d\2\2WX\7g\2\2XY\7i\2\2YZ\7k\2\2Z[\7p\2\2[\16\3"+
		"\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_\20\3\2\2\2`a\7p\2\2ab\7w\2\2bc\7o"+
		"\2\2cd\7g\2\2de\7t\2\2eq\7q\2\2fg\7e\2\2gh\7c\2\2hi\7f\2\2ij\7g\2\2jk"+
		"\7p\2\2kq\7c\2\2lm\7x\2\2mn\7q\2\2no\7k\2\2oq\7f\2\2p`\3\2\2\2pf\3\2\2"+
		"\2pl\3\2\2\2q\22\3\2\2\2rw\5\25\13\2sv\5\25\13\2tv\5\27\f\2us\3\2\2\2"+
		"ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\24\3\2\2\2yw\3\2\2\2z{\t\2\2"+
		"\2{\26\3\2\2\2|}\t\3\2\2}\30\3\2\2\2~\u0080\5\27\f\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\32\3\2\2\2"+
		"\u0083\u0085\5\27\f\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\7\60\2\2"+
		"\u0089\u008b\5\27\f\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7\60\2\2\u0090\u0092\5\27\f\2\u0091\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0084\3\2\2\2\u0095\u008f\3\2\2\2\u0096\34\3\2\2\2\u0097\u009b\7$\2\2"+
		"\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7$\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61\2"+
		"\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\20\2\2\u00ac \3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7,\2\2"+
		"\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\5#\22\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\21\2\2\u00bc"+
		"\"\3\2\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7"+
		"*\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5(\3\2\2\2\u00c6\u00ca\7."+
		"\2\2\u00c7\u00c8\7.\2\2\u00c8\u00ca\7\"\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca*\3\2\2\2\u00cb\u00d6\t\5\2\2\u00cc\u00cd\7?\2\2\u00cd"+
		"\u00d6\7?\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d6\7?\2\2\u00d0\u00d6\t\6\2"+
		"\2\u00d1\u00d2\7>\2\2\u00d2\u00d6\7?\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d6"+
		"\7?\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6,\3\2\2\2"+
		"\u00d7\u00d8\7=\2\2\u00d8.\3\2\2\2\u00d9\u00da\7<\2\2\u00da\u00db\7?\2"+
		"\2\u00db\60\3\2\2\2\u00dc\u00dd\7<\2\2\u00dd\62\3\2\2\2\u00de\u00e0\7"+
		"\"\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\32\2\2\u00e4\64\3\2\2"+
		"\2\u00e5\u00e7\7\13\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\33"+
		"\2\2\u00eb\66\3\2\2\2\23\2puw\u0081\u0086\u008c\u0093\u0095\u009b\u00a6"+
		"\u00b3\u00c0\u00c9\u00d5\u00e1\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}