// Generated from /home/user/Documents/antlr example/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.5.3
package org.antlr.jetbrains.sample.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, COLON=3, COMMA=4, LBRACK=5, RBRACK=6, LBRACE=7, RBRACE=8, 
		EQUAL=9, SUB=10, BANG=11, MUL=12, DIV=13, ADD=14, LT=15, LE=16, EQUAL_EQUAL=17, 
		NOT_EQUAL=18, GT=19, GE=20, OR=21, AND=22, DOT=23, IF=24, ELSE=25, WHILE=26, 
		VAR=27, RETURN=28, PRINT=29, FUNC=30, TYPEINT=31, TYPEFLOAT=32, TYPESTRING=33, 
		TYPEBOOLEAN=34, TRUE=35, FALSE=36, LINE_COMMENT=37, COMMENT=38, ID=39, 
		INT=40, FLOAT=41, STRING=42, WS=43, ERRCHAR=44;
	public static final int
		RULE_script = 0, RULE_function = 1, RULE_formal_args = 2, RULE_formal_arg = 3, 
		RULE_type = 4, RULE_block = 5, RULE_statement = 6, RULE_vardef = 7, RULE_expr = 8, 
		RULE_operator = 9, RULE_call_expr = 10, RULE_expr_list = 11, RULE_primary = 12;
	public static final String[] ruleNames = {
		"script", "function", "formal_args", "formal_arg", "type", "block", "statement", 
		"vardef", "expr", "operator", "call_expr", "expr_list", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "','", "'['", "']'", "'{'", "'}'", "'='", "'-'", 
		"'!'", "'*'", "'/'", "'+'", "'<'", "'<='", "'=='", "'!='", "'>'", "'>='", 
		"'||'", "'&&'", "' . '", "'if'", "'else'", "'while'", "'var'", "'return'", 
		"'print'", "'func'", "'int'", "'float'", "'string'", "'boolean'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", 
		"RBRACE", "EQUAL", "SUB", "BANG", "MUL", "DIV", "ADD", "LT", "LE", "EQUAL_EQUAL", 
		"NOT_EQUAL", "GT", "GE", "OR", "AND", "DOT", "IF", "ELSE", "WHILE", "VAR", 
		"RETURN", "PRINT", "FUNC", "TYPEINT", "TYPEFLOAT", "TYPESTRING", "TYPEBOOLEAN", 
		"TRUE", "FALSE", "LINE_COMMENT", "COMMENT", "ID", "INT", "FLOAT", "STRING", 
		"WS", "ERRCHAR"
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

	@Override
	public String getGrammarFileName() { return "SampleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SampleLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SampleLanguageParser.EOF, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << FUNC) | (1L << ID))) != 0)) {
				{
				setState(29);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(26);
					vardef();
					}
					break;
				case FUNC:
					{
					setState(27);
					function();
					}
					break;
				case LBRACE:
				case IF:
				case WHILE:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(28);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SampleLanguageParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SampleLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SampleLanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SampleLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(FUNC);
			setState(37);
			match(ID);
			setState(38);
			match(LPAREN);
			setState(40);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(39);
				formal_args();
				}
			}

			setState(42);
			match(RPAREN);
			setState(45);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(43);
				match(COLON);
				setState(44);
				type();
				}
			}

			setState(47);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argsContext extends ParserRuleContext {
		public List<Formal_argContext> formal_arg() {
			return getRuleContexts(Formal_argContext.class);
		}
		public Formal_argContext formal_arg(int i) {
			return getRuleContext(Formal_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SampleLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SampleLanguageParser.COMMA, i);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFormal_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFormal_args(this);
		}
	}

	public final Formal_argsContext formal_args() throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			formal_arg();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				formal_arg();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SampleLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Formal_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterFormal_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitFormal_arg(this);
		}
	}

	public final Formal_argContext formal_arg() throws RecognitionException {
		Formal_argContext _localctx = new Formal_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
			setState(58);
			match(COLON);
			setState(59);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(SampleLanguageParser.TYPEINT, 0); }
		public TerminalNode TYPEFLOAT() { return getToken(SampleLanguageParser.TYPEFLOAT, 0); }
		public TerminalNode TYPESTRING() { return getToken(SampleLanguageParser.TYPESTRING, 0); }
		public TerminalNode TYPEBOOLEAN() { return getToken(SampleLanguageParser.TYPEBOOLEAN, 0); }
		public TerminalNode LBRACK() { return getToken(SampleLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SampleLanguageParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case TYPEINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(TYPEINT);
				}
				break;
			case TYPEFLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(TYPEFLOAT);
				}
				break;
			case TYPESTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(TYPESTRING);
				}
				break;
			case TYPEBOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(TYPEBOOLEAN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(LBRACK);
				setState(66);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SampleLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SampleLanguageParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LBRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(72);
				switch (_input.LA(1)) {
				case LBRACE:
				case IF:
				case WHILE:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(70);
					statement();
					}
					break;
				case VAR:
					{
					setState(71);
					vardef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SampleLanguageParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SampleLanguageParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SampleLanguageParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SampleLanguageParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(SampleLanguageParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SampleLanguageParser.EQUAL, 0); }
		public TerminalNode LBRACK() { return getToken(SampleLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SampleLanguageParser.RBRACK, 0); }
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(SampleLanguageParser.PRINT, 0); }
		public TerminalNode RETURN() { return getToken(SampleLanguageParser.RETURN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(IF);
				setState(80);
				match(LPAREN);
				setState(81);
				expr(0);
				setState(82);
				match(RPAREN);
				setState(83);
				statement();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(84);
					match(ELSE);
					setState(85);
					statement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(WHILE);
				setState(89);
				match(LPAREN);
				setState(90);
				expr(0);
				setState(91);
				match(RPAREN);
				setState(92);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ID);
				setState(95);
				match(EQUAL);
				setState(96);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(ID);
				setState(98);
				match(LBRACK);
				setState(99);
				expr(0);
				setState(100);
				match(RBRACK);
				setState(101);
				match(EQUAL);
				setState(102);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				call_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(PRINT);
				setState(106);
				match(LPAREN);
				setState(108);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACK) | (1L << SUB) | (1L << BANG) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(107);
					expr(0);
					}
				}

				setState(110);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(RETURN);
				setState(112);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SampleLanguageParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SampleLanguageParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(VAR);
			setState(117);
			match(ID);
			setState(118);
			match(EQUAL);
			setState(119);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(SampleLanguageParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BANG() { return getToken(SampleLanguageParser.BANG, 0); }
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(SampleLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SampleLanguageParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(SampleLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SampleLanguageParser.RPAREN, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122);
				match(SUB);
				setState(123);
				expr(6);
				}
				break;
			case 2:
				{
				setState(124);
				match(BANG);
				setState(125);
				expr(5);
				}
				break;
			case 3:
				{
				setState(126);
				call_expr();
				}
				break;
			case 4:
				{
				setState(127);
				match(ID);
				setState(128);
				match(LBRACK);
				setState(129);
				expr(0);
				setState(130);
				match(RBRACK);
				}
				break;
			case 5:
				{
				setState(132);
				match(LPAREN);
				setState(133);
				expr(0);
				setState(134);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(136);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(139);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(140);
					operator();
					setState(141);
					expr(8);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SampleLanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SampleLanguageParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SampleLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SampleLanguageParser.SUB, 0); }
		public TerminalNode GT() { return getToken(SampleLanguageParser.GT, 0); }
		public TerminalNode GE() { return getToken(SampleLanguageParser.GE, 0); }
		public TerminalNode LT() { return getToken(SampleLanguageParser.LT, 0); }
		public TerminalNode LE() { return getToken(SampleLanguageParser.LE, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(SampleLanguageParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SampleLanguageParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(SampleLanguageParser.OR, 0); }
		public TerminalNode AND() { return getToken(SampleLanguageParser.AND, 0); }
		public TerminalNode DOT() { return getToken(SampleLanguageParser.DOT, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << LT) | (1L << LE) | (1L << EQUAL_EQUAL) | (1L << NOT_EQUAL) | (1L << GT) | (1L << GE) | (1L << OR) | (1L << AND) | (1L << DOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SampleLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SampleLanguageParser.RPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(LPAREN);
			setState(153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACK) | (1L << SUB) | (1L << BANG) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(152);
				expr_list();
				}
			}

			setState(155);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SampleLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SampleLanguageParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expr(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				expr(0);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SampleLanguageParser.ID, 0); }
		public TerminalNode INT() { return getToken(SampleLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SampleLanguageParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SampleLanguageParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(SampleLanguageParser.LBRACK, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SampleLanguageParser.RBRACK, 0); }
		public TerminalNode TRUE() { return getToken(SampleLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SampleLanguageParser.FALSE, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SampleLanguageListener ) ((SampleLanguageListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(STRING);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(LBRACK);
				setState(170);
				expr_list();
				setState(171);
				match(RBRACK);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6F\n\6\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13"+
		"\n\3\13\3\13\3\f\3\f\3\f\5\f\u009c\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u00a3\n"+
		"\r\f\r\16\r\u00a6\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00b2\n\16\3\16\2\3\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2"+
		"\3\4\2\f\f\16\31\u00c9\2!\3\2\2\2\4&\3\2\2\2\6\63\3\2\2\2\b;\3\2\2\2\n"+
		"E\3\2\2\2\fG\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22\u008b\3\2\2\2\24\u0096"+
		"\3\2\2\2\26\u0098\3\2\2\2\30\u009f\3\2\2\2\32\u00b1\3\2\2\2\34 \5\20\t"+
		"\2\35 \5\4\3\2\36 \5\16\b\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2"+
		" #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%\3\3"+
		"\2\2\2&\'\7 \2\2\'(\7)\2\2(*\7\3\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,\3"+
		"\2\2\2,/\7\4\2\2-.\7\5\2\2.\60\5\n\6\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2"+
		"\2\2\61\62\5\f\7\2\62\5\3\2\2\2\638\5\b\5\2\64\65\7\6\2\2\65\67\5\b\5"+
		"\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2"+
		"\2;<\7)\2\2<=\7\5\2\2=>\5\n\6\2>\t\3\2\2\2?F\7!\2\2@F\7\"\2\2AF\7#\2\2"+
		"BF\7$\2\2CD\7\7\2\2DF\7\b\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2"+
		"EC\3\2\2\2F\13\3\2\2\2GL\7\t\2\2HK\5\16\b\2IK\5\20\t\2JH\3\2\2\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\n\2\2P\r\3"+
		"\2\2\2QR\7\32\2\2RS\7\3\2\2ST\5\22\n\2TU\7\4\2\2UX\5\16\b\2VW\7\33\2\2"+
		"WY\5\16\b\2XV\3\2\2\2XY\3\2\2\2Yu\3\2\2\2Z[\7\34\2\2[\\\7\3\2\2\\]\5\22"+
		"\n\2]^\7\4\2\2^_\5\16\b\2_u\3\2\2\2`a\7)\2\2ab\7\13\2\2bu\5\22\n\2cd\7"+
		")\2\2de\7\7\2\2ef\5\22\n\2fg\7\b\2\2gh\7\13\2\2hi\5\22\n\2iu\3\2\2\2j"+
		"u\5\26\f\2kl\7\37\2\2ln\7\3\2\2mo\5\22\n\2nm\3\2\2\2no\3\2\2\2op\3\2\2"+
		"\2pu\7\4\2\2qr\7\36\2\2ru\5\22\n\2su\5\f\7\2tQ\3\2\2\2tZ\3\2\2\2t`\3\2"+
		"\2\2tc\3\2\2\2tj\3\2\2\2tk\3\2\2\2tq\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vw\7"+
		"\35\2\2wx\7)\2\2xy\7\13\2\2yz\5\22\n\2z\21\3\2\2\2{|\b\n\1\2|}\7\f\2\2"+
		"}\u008c\5\22\n\b~\177\7\r\2\2\177\u008c\5\22\n\7\u0080\u008c\5\26\f\2"+
		"\u0081\u0082\7)\2\2\u0082\u0083\7\7\2\2\u0083\u0084\5\22\n\2\u0084\u0085"+
		"\7\b\2\2\u0085\u008c\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5\22\n\2"+
		"\u0088\u0089\7\4\2\2\u0089\u008c\3\2\2\2\u008a\u008c\5\32\16\2\u008b{"+
		"\3\2\2\2\u008b~\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008e\f\t"+
		"\2\2\u008e\u008f\5\24\13\2\u008f\u0090\5\22\n\n\u0090\u0092\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\23\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\t\2\2\2\u0097\25"+
		"\3\2\2\2\u0098\u0099\7)\2\2\u0099\u009b\7\3\2\2\u009a\u009c\5\30\r\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\4"+
		"\2\2\u009e\27\3\2\2\2\u009f\u00a4\5\22\n\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3"+
		"\5\22\n\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00b2"+
		"\7)\2\2\u00a8\u00b2\7*\2\2\u00a9\u00b2\7+\2\2\u00aa\u00b2\7,\2\2\u00ab"+
		"\u00ac\7\7\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\b\2\2\u00ae\u00b2\3"+
		"\2\2\2\u00af\u00b2\7%\2\2\u00b0\u00b2\7&\2\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2\2\22\37!*"+
		"/8EJLXnt\u008b\u0093\u009b\u00a4\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}