import Lexer.LexicalAnalyzer ;
import Lexer.Token;

import java.util.List;

public class Main{
    public static void main(String[] args){
        LexicalAnalyzer lexer = new LexicalAnalyzer();
        String input = "int age = 25 ;";

        List <Token> tokens = lexer.analyze(input);

        tokens.forEach(System.out::println);

    }
}