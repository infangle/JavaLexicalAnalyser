package Lexer;

import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {

    public static final List<String> keyword = List.of("int");

    public List<Token> analyze(String input){
        List<Token> tokens = new ArrayList<>();
        input = input.replace(";", " ;");
        input = input.replace("=", " = ");
        String[] lexems = input.split("\\s+");

        for(String lexeme: lexems){
            Token token = identifyToken(lexeme);
            tokens.add(token);
        }

        return tokens;
    }

    private Token identifyToken(String word){
        if (keyword.contains(word)){
            return new Token(TokenType.KEYWORD, word);
        }
        else if (word.matches("[a-zA-Z][a-zA-Z0-9]*")) {
            return new Token(TokenType.IDENTIFIER, word);
        } else if (word.equals("=")) {
            return new Token(TokenType.OPERATOR, word);
        } else if (word.matches("[0-9]+")) {
            return new Token(TokenType.NUMBER, word);
        } else if (word.equals(";")) {
            return new Token(TokenType.DELIMITER, word);
        } else {
            return new Token(TokenType.UNKNOWN, word);
        }
    }

}
