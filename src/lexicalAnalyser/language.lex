package lexicalAnalyser;

import java_cup.runtime.*;
import util.Token;

%%

%{

private Token createToken(String name, String value) {
    return new Token( name, value, yyline);
}

%}

%public
%class LexicalAnalyzer
%type Token
%line

/*IDS*/
CHARACTERS       = [A-Za-z_]+
NUMBERS  = [1-9][0-9]* | {NUMBERS_Z}
NUMBERS_Z  = [0-9]*
VALID_IDENTIFIER = ({CHARACTERS})({CHARACTERS}{NUMBERS}_)*
NUMBER_LITERAL = \"{NUMBERS_Z}\"

CHARS_GENERAL  = [a-zA-Z0-9|"#$%&'()*+,-./:;<=>!?@[\]\^_`{|}~"|\n|\t|\s]+
CHAR_LITERAL = \"{CHARS_GENERAL}\"

/*DELIMITERS*/
LINE_MARKERS = \n|\r|\t|\s
DELIMITERS = ";" | "[" | "]" | "(" | ")" | "'" |"{" | "}" | ":" | "," |"."|"`" | "\"" | "$" | "\\"
LINE_COMMENTS =  "//"
BLOCK_COMMENTS = \/\*{CHARS_GENERAL}\*\/
COMMENTS = {BLOCK_COMMENTS}

/*OPERATORS*/
ARITHMETIC_OPERATOR = "+" | "-" | "*" | "/" | "%" | "++" | "--"
COMPARISON_OPERATOR = "==" | "===" | "!=" | "!==" | ">" | ">=" | "<" | "<="
LOGICAL_OPERATOR = "&&" | "||" | "!"
BITWISE_OPERATOR = "&" | "|" | "^"| "~"| ">>" | "<<" | ">>>"
ASSIGNMENT_OPERATOR = "=" | "+=" | "-="| "*=" | "/=" | "%="
TERNARY_OPERATOR = "?"
TYPE_OPERATOR = "in" | "delete"| "typeof" | "instanceof"

OPERATOR = {ARITHMETIC_OPERATOR} | {COMPARISON_OPERATOR} | {LOGICAL_OPERATOR} | {BITWISE_OPERATOR} | {ASSIGNMENT_OPERATOR} | {TERNARY_OPERATOR} | {TYPE_OPERATOR}

/*KEYWORDS*/
RESERVED_WORDS = "break" | "case" | "catch" | "class" | "const" | "continue" | "debugger" | "default" | "delete" | "do" | "else" | "enum" | "export" | "extends" | "false" | "finally" | "for" | "function" | "if" | "import" | "in" | "instanceof" | "new" | "null" | "return" | "super" | "switch" | "this" | "throw" | "true" | "try" | "typeof" | "var" | "void" | "while" | "with"
STRICT_MODE = "as" | "implements" | "interface"| "let"|"package"|"private"|"protected"| "public"| "static"| "yield"
CONTEXTUAL_WORDS = "any" | "boolean" |"constructor" |"declare" |"get" |"module" |"require" |"number" |"set" |"string" |"symbol" | "type" | "from" | "of"

KEYWORDS = {RESERVED_WORDS} | {STRICT_MODE} | {CONTEXTUAL_WORDS}

/*SIMPLE TYPES*/
BASIC_TYPES = "boolean" | "number" | "string" | "enum" | "any" | "object" | "list" | "undefined" | "null"
BASIC_TYPES_TITLE = "Boolean" | "Number" | "String" | "Enum" | "Any" | "Object" | "List" | "Undefined" | "Null"

SIMPLE_TYPES = {BASIC_TYPES} | {BASIC_TYPES_TITLE}

%%

{COMMENTS} {return createToken("COMMENTS", yytext());}
{KEYWORDS} { return createToken("KEYWORD", yytext());}
{SIMPLE_TYPES} { return createToken("TYPE", yytext()); }
{OPERATOR} { return createToken("OPERATOR", yytext());}
{NUMBERS} {return createToken("NUMBER", yytext());}
{NUMBER_LITERAL} {return createToken("LITERAL", yytext());}
{CHAR_LITERAL} {return createToken("LITERAL", yytext());}
{DELIMITERS} { return createToken("DELIMITER", "\""+ yytext() + "\"");}
{VALID_IDENTIFIER} {return createToken("IDENTIFIER", yytext());}
{LINE_MARKERS} { /**/ }

. { throw new RuntimeException("Caractere inválido " + yytext() + " na linha " + yyline); }