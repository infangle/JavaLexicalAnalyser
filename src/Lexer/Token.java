package Lexer;

public class Token {
    private TokenType type;
    private String value;

    // initialize
    public Token (TokenType type, String value){
        this.type = type;
        this.value = value;
    }
    // getters
    public TokenType getType(){
        return type;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "Token{" + "type=" + type + ", value='" + value + '\'' + '}';        
    }

    

}
