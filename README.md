# Java Lexical Analyzer

A simple lexical analyzer built in Java to tokenize basic programming statements like `int age = 25 ;`. This tool recognizes and categorizes tokens such as keywords, identifiers, operators, numbers, and symbols (e.g., semicolons).

## Features

- Recognizes tokens for simple variable declarations and assignments in Java-like syntax.
- Token types include:
  - `KEYWORD` (e.g., `int`, `float`, `char`)
  - `IDENTIFIER` (e.g., variable names like `age`)
  - `OPERATOR` (e.g., assignment operator `=`)
  - `NUMBER` (e.g., integer values like `25`)
  - `SEMICOLON` (e.g., `;` at the end of statements)
- Outputs tokens with their type and value in a structured format.

## Folder Structure

- **`src/`**: Contains all source files for the lexical analyzer.
  - **`lexer/`**: A dedicated package for core analyzer classes.
    - `LexicalAnalyzer.java`: Main logic for identifying and tokenizing input.
    - `Token.java`: Defines a `Token` class with type and value properties.
    - `TokenType.java`: Enum for defining different token types.
  - `Main.java`: Entry point to execute the lexical analyzer.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

### Clone the Repository

```bash
git clone https://github.com/infangle/JavaLexicalAnalyzer.git
cd JavaLexicalAnalyzer
```

### Compile the Project

Navigate to the project directory and compile the code:

```bash
javac -d bin -sourcepath src src/Main.java src/lexer/*.java
```

### Run the Lexical Analyzer

Use the following command to execute the analyzer:

```bash
java -cp bin Main
```

## Example Usage

With the input: `int age = 25 ;`, the output will look like this:

```plaintext
Token{type=KEYWORD, value='int'}
Token{type=IDENTIFIER, value='age'}
Token{type=OPERATOR, value='='}
Token{type=NUMBER, value='25'}
Token{type=SEMICOLON, value=';'}
```

## How It Works

The `LexicalAnalyzer` reads the input line, splits it into individual parts, and categorizes each part based on predefined rules:
- **Keywords**: Matches predefined words such as `int`, `float`, `char`.
- **Identifiers**: Matches variable names and other identifiers.
- **Operators**: Detects assignment operators like `=`.
- **Numbers**: Matches integer values.
- **Symbols**: Recognizes semicolons (`;`).

Each identified part is then wrapped into a `Token` object, which stores its type and value.

## Future Improvements

Considerations for future enhancements:
- Support for additional token types (e.g., floating-point numbers, multi-character operators).
- Support for more complex language constructs like loops and conditionals.
