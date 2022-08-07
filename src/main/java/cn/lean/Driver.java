package cn.lean;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author mkf
 * @implNote
 */
public class Driver {
    public static void main(String[] args) {
        String query = "3.1*(6.3-4.51)";
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRInputStream(query));
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        CalculatorVisitor visitor = new MyCalculatorBaseVisitor();
        System.out.println(visitor.visit(parser.expr()));
    }
}
