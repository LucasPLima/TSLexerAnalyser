/* The following code was generated by JFlex 1.7.0 */

package lexicalAnalyser;

import java_cup.runtime.*;
import util.Token;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Users/lucas/IdeaProjects/TSLexerAnalyser/src/lexicalAnalyser/language.lex</tt>
 */
public class LexicalAnalyzer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\6\1\6\1\6\1\6\22\0\1\6\1\16\1\4"+
    "\1\5\1\7\1\14\1\21\1\7\1\7\1\7\1\14\1\12\1\7"+
    "\1\13\1\7\1\11\1\3\11\2\1\7\1\7\1\20\1\15\1\17"+
    "\1\23\1\5\1\61\1\55\2\1\1\60\6\1\1\63\1\1\1\56"+
    "\1\62\3\1\1\57\1\1\1\64\5\1\1\7\1\10\1\7\1\23"+
    "\1\1\1\7\1\37\1\41\1\40\1\26\1\27\1\35\1\46\1\44"+
    "\1\24\1\54\1\43\1\30\1\47\1\25\1\34\1\33\1\53\1\42"+
    "\1\36\1\31\1\45\1\52\1\51\1\50\1\32\1\1\1\7\1\22"+
    "\1\7\1\23\6\0\1\6\32\0\1\6\u15df\0\1\6\u097f\0\13\6"+
    "\35\0\1\6\1\6\5\0\1\6\57\0\1\6\u0fa0\0\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\12\6"+
    "\34\2\1\0\1\7\1\10\1\6\2\11\132\2\1\12"+
    "\11\2\1\11\42\2\1\11\32\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[213];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\65\0\65\0\u0109"+
    "\0\u013e\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1"+
    "\0\65\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424"+
    "\0\u0459\0\u048e\0\u04c3\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc"+
    "\0\u0601\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774"+
    "\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\324\0\65\0\65"+
    "\0\u08b2\0\u08e7\0\152\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0"+
    "\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98"+
    "\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40"+
    "\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\u0f1d\0\u0f52\0\u0f87\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090"+
    "\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u1199\0\u11ce\0\u1203\0\u1238"+
    "\0\u126d\0\u12a2\0\u12d7\0\u130c\0\u1341\0\u1376\0\u13ab\0\u13e0"+
    "\0\u1415\0\u144a\0\u147f\0\u14b4\0\u14e9\0\u151e\0\u1553\0\u1588"+
    "\0\u15bd\0\u15f2\0\u1627\0\u165c\0\u1691\0\u16c6\0\u16fb\0\u1730"+
    "\0\u1765\0\u179a\0\u17cf\0\u1804\0\u1839\0\u186e\0\u18a3\0\u18d8"+
    "\0\u190d\0\u1942\0\u1977\0\u19ac\0\u19e1\0\u1a16\0\u1a4b\0\u1a80"+
    "\0\u1ab5\0\u1aea\0\u1b1f\0\u1b54\0\u1b89\0\152\0\u1bbe\0\u1bf3"+
    "\0\u1c28\0\u1c5d\0\u1c92\0\u1cc7\0\u1cfc\0\u1d31\0\u1d66\0\u1d9b"+
    "\0\u1dd0\0\u1e05\0\u1e3a\0\u1e6f\0\u1ea4\0\u1ed9\0\u1f0e\0\u1f43"+
    "\0\u1f78\0\u1fad\0\u1fe2\0\u2017\0\u204c\0\u2081\0\u20b6\0\u20eb"+
    "\0\u2120\0\u2155\0\u218a\0\u21bf\0\u21f4\0\u2229\0\u225e\0\u2293"+
    "\0\u22c8\0\u22fd\0\u2332\0\u2367\0\u239c\0\u23d1\0\u2406\0\u243b"+
    "\0\u2470\0\u24a5\0\u24da\0\u250f\0\u2544\0\u2579\0\u25ae\0\u25e3"+
    "\0\u2618\0\u264d\0\u2682\0\u26b7\0\u26ec\0\u2721\0\u2756\0\u278b"+
    "\0\u27c0\0\u27f5\0\u282a\0\u285f\0\u2894\0\u28c9\0\u28fe\0\u2933"+
    "\0\u1d9b\0\u2968\0\u299d\0\u29d2\0\u2a07";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[213];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\2\1\6\2\7"+
    "\1\10\1\11\1\12\1\13\2\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\2\3\1\41\1\42\1\43\1\3\1\44\1\45"+
    "\2\3\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\41\66\0\1\3\1\55\21\0\41\3\2\0\2\4"+
    "\62\0\3\56\1\57\3\56\1\0\54\56\11\0\1\60"+
    "\3\0\1\21\61\0\1\21\2\0\1\21\62\0\1\21"+
    "\1\0\1\21\64\0\1\21\64\0\1\13\64\0\1\21"+
    "\1\0\1\61\62\0\1\21\2\0\1\21\65\0\1\21"+
    "\65\0\1\21\43\0\1\3\1\55\21\0\1\3\1\62"+
    "\7\3\1\63\11\3\1\64\15\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\65\15\3\1\66\17\3\1\0\1\3"+
    "\1\55\21\0\3\3\1\67\4\3\1\63\30\3\1\0"+
    "\1\3\1\55\21\0\1\3\1\70\2\3\1\71\17\3"+
    "\1\72\14\3\1\0\1\3\1\55\21\0\1\73\2\3"+
    "\1\74\35\3\1\0\1\3\1\55\21\0\6\3\1\75"+
    "\7\3\1\76\1\3\1\77\20\3\1\0\1\3\1\55"+
    "\21\0\1\100\40\3\1\0\1\3\1\55\21\0\13\3"+
    "\1\101\2\3\1\102\2\3\1\103\17\3\1\0\1\3"+
    "\1\55\21\0\11\3\1\63\3\3\1\104\23\3\1\0"+
    "\1\3\1\55\21\0\1\105\7\3\1\106\2\3\1\107"+
    "\2\3\1\110\2\3\1\111\17\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\74\1\3\1\112\1\113\12\3\1\114"+
    "\3\3\1\115\13\3\1\0\1\3\1\55\21\0\1\3"+
    "\1\116\10\3\1\63\26\3\1\0\1\3\1\55\21\0"+
    "\4\3\1\117\3\3\1\120\2\3\1\121\25\3\1\0"+
    "\1\3\1\55\21\0\10\3\1\122\5\3\1\123\22\3"+
    "\1\0\1\3\1\55\21\0\3\3\1\124\35\3\1\0"+
    "\1\3\1\55\21\0\1\3\1\125\37\3\1\0\1\3"+
    "\1\55\21\0\3\3\1\74\35\3\1\0\1\3\1\55"+
    "\21\0\10\3\1\126\30\3\1\0\1\3\1\55\21\0"+
    "\1\127\17\3\1\130\20\3\1\0\1\3\1\55\21\0"+
    "\10\3\1\131\2\3\1\106\25\3\1\0\1\3\1\55"+
    "\21\0\10\3\1\132\30\3\1\0\1\3\1\55\21\0"+
    "\21\3\1\133\17\3\1\0\1\3\1\55\21\0\5\3"+
    "\1\134\33\3\1\0\1\3\1\55\21\0\1\3\1\135"+
    "\37\3\1\0\1\3\1\55\21\0\1\3\1\136\37\3"+
    "\1\0\1\3\1\55\21\0\15\3\1\104\23\3\1\0"+
    "\1\3\1\55\21\0\1\73\40\3\1\0\1\3\2\55"+
    "\20\0\41\3\17\0\1\21\46\0\1\3\1\55\21\0"+
    "\5\3\1\137\4\3\1\140\26\3\1\0\1\3\1\55"+
    "\21\0\7\3\1\141\31\3\1\0\1\3\1\55\21\0"+
    "\25\3\1\63\13\3\1\0\1\3\1\55\21\0\4\3"+
    "\1\142\16\3\1\143\15\3\1\0\1\3\1\55\21\0"+
    "\4\3\1\144\4\3\1\145\2\3\1\146\1\147\23\3"+
    "\1\0\1\3\1\55\21\0\21\3\1\150\17\3\1\0"+
    "\1\3\1\55\21\0\12\3\1\151\26\3\1\0\1\3"+
    "\1\55\21\0\5\3\1\152\1\3\1\153\31\3\1\0"+
    "\1\3\1\55\21\0\12\3\1\154\26\3\1\0\1\3"+
    "\1\55\21\0\5\3\1\63\33\3\1\0\1\3\1\55"+
    "\21\0\7\3\1\155\31\3\1\0\1\3\1\55\21\0"+
    "\6\3\1\63\12\3\1\151\17\3\1\0\1\3\1\55"+
    "\21\0\1\156\15\3\1\157\22\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\160\35\3\1\0\1\3\1\55\21\0"+
    "\14\3\1\161\24\3\1\0\1\3\1\55\21\0\1\162"+
    "\7\3\1\163\30\3\1\0\1\3\1\55\21\0\15\3"+
    "\1\164\23\3\1\0\1\3\1\55\21\0\30\3\1\165"+
    "\10\3\1\0\1\3\1\55\21\0\1\3\1\166\37\3"+
    "\1\0\1\3\1\55\21\0\16\3\1\63\22\3\1\0"+
    "\1\3\1\55\21\0\4\3\1\71\34\3\1\0\1\3"+
    "\1\55\21\0\10\3\1\150\30\3\1\0\1\3\1\55"+
    "\21\0\1\3\1\167\37\3\1\0\1\3\1\55\21\0"+
    "\13\3\1\170\2\3\1\171\22\3\1\0\1\3\1\55"+
    "\21\0\23\3\1\172\15\3\1\0\1\3\1\55\21\0"+
    "\7\3\1\173\31\3\1\0\1\3\1\55\21\0\1\174"+
    "\40\3\1\0\1\3\1\55\21\0\6\3\1\63\32\3"+
    "\1\0\1\3\1\55\21\0\13\3\1\175\25\3\1\0"+
    "\1\3\1\55\21\0\1\3\1\176\37\3\1\0\1\3"+
    "\1\55\21\0\5\3\1\177\4\3\1\151\26\3\1\0"+
    "\1\3\1\55\21\0\10\3\1\200\30\3\1\0\1\3"+
    "\1\55\21\0\3\3\1\201\35\3\1\0\1\3\1\55"+
    "\21\0\5\3\1\202\21\3\1\203\11\3\1\0\1\3"+
    "\1\55\21\0\2\3\1\204\36\3\1\0\1\3\1\55"+
    "\21\0\2\3\1\205\36\3\1\0\1\3\1\55\21\0"+
    "\5\3\1\206\33\3\1\0\1\3\1\55\21\0\1\207"+
    "\40\3\1\0\1\3\1\55\21\0\1\210\40\3\1\0"+
    "\1\3\1\55\21\0\10\3\1\211\30\3\1\0\1\3"+
    "\1\55\21\0\4\3\1\212\16\3\1\213\15\3\1\0"+
    "\1\3\1\55\21\0\16\3\1\214\22\3\1\0\1\3"+
    "\1\55\21\0\21\3\1\215\17\3\1\0\1\3\1\55"+
    "\21\0\6\3\1\216\32\3\1\0\1\3\1\55\21\0"+
    "\3\3\1\217\35\3\1\0\1\3\1\55\21\0\5\3"+
    "\1\220\33\3\1\0\1\3\1\55\21\0\4\3\1\221"+
    "\3\3\1\222\30\3\1\0\1\3\1\55\21\0\4\3"+
    "\1\63\34\3\1\0\1\3\1\55\21\0\15\3\1\173"+
    "\23\3\1\0\1\3\1\55\21\0\3\3\1\223\35\3"+
    "\1\0\1\3\1\55\21\0\13\3\1\224\25\3\1\0"+
    "\1\3\1\55\21\0\4\3\1\225\34\3\1\0\1\3"+
    "\1\55\21\0\21\3\1\226\17\3\1\0\1\3\1\55"+
    "\21\0\23\3\1\63\15\3\1\0\1\3\1\55\21\0"+
    "\3\3\1\63\35\3\1\0\1\3\1\55\21\0\3\3"+
    "\1\227\35\3\1\0\1\3\1\55\21\0\10\3\1\222"+
    "\30\3\1\0\1\3\1\55\21\0\5\3\1\216\33\3"+
    "\1\0\1\3\1\55\21\0\3\3\1\230\35\3\1\0"+
    "\1\3\1\55\21\0\12\3\1\63\26\3\1\0\1\3"+
    "\1\55\21\0\10\3\1\65\30\3\1\0\1\3\1\55"+
    "\21\0\4\3\1\210\34\3\1\0\1\3\1\55\21\0"+
    "\17\3\1\231\21\3\1\0\1\3\1\55\21\0\26\3"+
    "\1\232\12\3\1\0\1\3\1\55\21\0\5\3\1\233"+
    "\33\3\1\0\1\3\1\55\21\0\4\3\1\234\34\3"+
    "\1\0\1\3\1\55\21\0\3\3\1\235\35\3\1\0"+
    "\1\3\1\55\21\0\13\3\1\236\25\3\1\0\1\3"+
    "\1\55\21\0\14\3\1\237\24\3\1\0\1\3\1\55"+
    "\21\0\5\3\1\234\33\3\1\0\1\3\1\55\21\0"+
    "\1\240\40\3\1\0\1\3\1\55\21\0\15\3\1\241"+
    "\23\3\1\0\1\3\1\55\21\0\3\3\1\106\35\3"+
    "\1\0\1\3\1\55\21\0\5\3\1\177\33\3\1\0"+
    "\1\3\1\55\21\0\12\3\1\156\26\3\1\0\1\3"+
    "\1\55\21\0\5\3\1\242\4\3\1\243\26\3\1\0"+
    "\1\3\1\55\21\0\14\3\1\206\24\3\1\0\1\3"+
    "\1\55\21\0\4\3\1\244\34\3\1\0\1\3\1\55"+
    "\21\0\13\3\1\245\25\3\1\0\1\3\1\55\21\0"+
    "\21\3\1\246\17\3\1\0\1\3\1\55\21\0\21\3"+
    "\1\247\17\3\1\0\1\3\1\55\21\0\3\3\1\250"+
    "\35\3\1\0\1\3\1\55\21\0\21\3\1\207\17\3"+
    "\1\0\1\3\1\55\21\0\20\3\1\63\20\3\1\0"+
    "\1\3\1\55\21\0\4\3\1\151\34\3\1\0\1\3"+
    "\1\55\21\0\2\3\1\63\36\3\1\0\1\3\1\55"+
    "\21\0\4\3\1\251\34\3\1\0\1\3\1\55\21\0"+
    "\4\3\1\216\34\3\1\0\1\3\1\55\21\0\15\3"+
    "\1\252\23\3\1\0\1\3\1\55\21\0\1\253\40\3"+
    "\1\0\1\3\1\55\21\0\23\3\1\216\15\3\1\0"+
    "\1\3\1\55\21\0\16\3\1\254\22\3\1\0\1\3"+
    "\1\55\21\0\13\3\1\255\25\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\256\35\3\1\0\1\3\1\55\21\0"+
    "\16\3\1\74\22\3\1\0\1\3\1\55\21\0\5\3"+
    "\1\151\33\3\1\0\1\3\1\55\21\0\21\3\1\257"+
    "\17\3\1\0\1\3\1\55\21\0\13\3\1\260\25\3"+
    "\1\0\1\3\1\55\21\0\22\3\1\261\16\3\1\0"+
    "\1\3\1\55\21\0\1\3\1\262\37\3\1\0\1\3"+
    "\1\55\21\0\10\3\1\263\30\3\1\0\1\3\1\55"+
    "\21\0\13\3\1\264\25\3\1\0\1\3\1\55\21\0"+
    "\13\3\1\223\25\3\1\0\1\3\1\55\21\0\3\3"+
    "\1\265\35\3\1\0\1\3\1\55\21\0\1\266\40\3"+
    "\1\0\1\3\1\55\21\0\14\3\1\154\24\3\1\0"+
    "\1\3\1\55\21\0\4\3\1\267\34\3\1\0\1\3"+
    "\1\55\21\0\5\3\1\270\33\3\1\0\1\3\1\55"+
    "\21\0\1\3\1\271\37\3\1\0\1\3\1\55\21\0"+
    "\10\3\1\142\30\3\1\0\1\3\1\55\21\0\1\272"+
    "\40\3\1\0\1\3\1\55\21\0\5\3\1\273\33\3"+
    "\1\0\1\3\1\55\21\0\3\3\1\274\35\3\1\0"+
    "\1\3\1\55\21\0\17\3\1\63\21\3\1\0\1\3"+
    "\1\55\21\0\16\3\1\275\22\3\1\0\1\3\1\55"+
    "\21\0\1\260\40\3\1\0\1\3\1\55\21\0\11\3"+
    "\1\276\27\3\1\0\1\3\1\55\21\0\3\3\1\277"+
    "\35\3\1\0\1\3\1\55\21\0\3\3\1\300\35\3"+
    "\1\0\1\3\1\55\21\0\1\3\1\301\37\3\1\0"+
    "\1\3\1\55\21\0\11\3\1\302\27\3\1\0\1\3"+
    "\1\55\21\0\1\3\1\303\37\3\1\0\1\3\1\55"+
    "\21\0\23\3\1\304\15\3\1\0\1\3\1\55\21\0"+
    "\4\3\1\74\34\3\1\0\1\3\1\55\21\0\16\3"+
    "\1\151\22\3\1\0\1\3\1\55\21\0\22\3\1\173"+
    "\16\3\1\0\1\3\1\55\21\0\2\3\1\156\36\3"+
    "\1\0\1\3\1\55\21\0\11\3\1\63\27\3\1\0"+
    "\1\3\1\55\21\0\22\3\1\151\16\3\1\0\1\3"+
    "\1\55\21\0\14\3\1\305\24\3\1\0\1\3\1\55"+
    "\21\0\14\3\1\63\24\3\1\0\1\3\1\55\21\0"+
    "\4\3\1\116\34\3\1\0\1\3\1\55\21\0\1\306"+
    "\40\3\1\0\1\3\1\55\21\0\22\3\1\63\16\3"+
    "\1\0\1\3\1\55\21\0\1\3\1\307\37\3\1\0"+
    "\1\3\1\55\21\0\16\3\1\310\22\3\1\0\1\3"+
    "\1\55\21\0\13\3\1\275\25\3\1\0\1\3\1\55"+
    "\21\0\1\3\1\63\37\3\1\0\1\3\1\55\21\0"+
    "\1\311\40\3\1\0\1\3\1\55\21\0\13\3\1\312"+
    "\25\3\1\0\1\3\1\55\21\0\16\3\1\216\22\3"+
    "\1\0\1\3\1\55\21\0\22\3\1\216\16\3\1\0"+
    "\1\3\1\55\21\0\13\3\1\313\25\3\1\0\1\3"+
    "\1\55\21\0\14\3\1\314\24\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\315\35\3\1\0\1\3\1\55\21\0"+
    "\5\3\1\316\33\3\1\0\1\3\1\55\21\0\10\3"+
    "\1\275\30\3\1\0\1\3\1\55\21\0\21\3\1\151"+
    "\17\3\1\0\1\3\1\55\21\0\21\3\1\317\17\3"+
    "\1\0\1\3\1\55\21\0\1\3\1\320\37\3\1\0"+
    "\1\3\1\55\21\0\1\3\1\216\37\3\1\0\1\3"+
    "\1\55\21\0\14\3\1\151\24\3\1\0\1\3\1\55"+
    "\21\0\3\3\1\321\35\3\1\0\1\3\1\55\21\0"+
    "\1\3\1\322\37\3\1\0\1\3\1\55\21\0\3\3"+
    "\1\210\35\3\1\0\1\3\1\55\21\0\14\3\1\323"+
    "\24\3\1\0\1\3\1\55\21\0\3\3\1\324\35\3"+
    "\1\0\1\3\1\55\21\0\5\3\1\156\33\3\1\0"+
    "\1\3\1\55\21\0\5\3\1\325\33\3\1\0\1\3"+
    "\1\55\21\0\2\3\1\216\36\3\1\0\1\3\1\55"+
    "\21\0\10\3\1\106\30\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10812];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\11\1\1\11\34\1\1\0"+
    "\2\11\245\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[213];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

private Token createToken(String name, String value) {
    return new Token( name, value, yyline);
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicalAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 232) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("Caractere inválido " + yytext() + " na linha " + yyline);
            } 
            // fall through
          case 11: break;
          case 2: 
            { return createToken("IDENTIFIER", yytext());
            } 
            // fall through
          case 12: break;
          case 3: 
            { return createToken("NUMBER", yytext());
            } 
            // fall through
          case 13: break;
          case 4: 
            { return createToken("DELIMITER", "\""+ yytext() + "\"");
            } 
            // fall through
          case 14: break;
          case 5: 
            { /**/
            } 
            // fall through
          case 15: break;
          case 6: 
            { return createToken("OPERATOR", yytext());
            } 
            // fall through
          case 16: break;
          case 7: 
            { return createToken("LITERAL", yytext());
            } 
            // fall through
          case 17: break;
          case 8: 
            { return createToken("COMMENTS", yytext());
            } 
            // fall through
          case 18: break;
          case 9: 
            { return createToken("KEYWORD", yytext());
            } 
            // fall through
          case 19: break;
          case 10: 
            { return createToken("TYPE", yytext());
            } 
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
