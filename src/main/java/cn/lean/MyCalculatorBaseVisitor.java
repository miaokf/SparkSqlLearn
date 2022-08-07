package cn.lean;


/**
 * @author mkf
 * @implNote
 */
public class MyCalculatorBaseVisitor extends CalculatorBaseVisitor<Object> {
    @Override
    public Object visitAddOrSubtract(CalculatorParser.AddOrSubtractContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);
        if ("+".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 + (Float) obj1;
        } else if ("-".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 - (Float) obj1;
        }
        return 0f;
    }

    @Override
    public Object visitFloat(CalculatorParser.FloatContext ctx) {
        return Float.parseFloat(ctx.getText());
    }
}
