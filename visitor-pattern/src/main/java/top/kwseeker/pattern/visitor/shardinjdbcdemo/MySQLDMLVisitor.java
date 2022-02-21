package top.kwseeker.pattern.visitor.shardinjdbcdemo;

public class MySQLDMLVisitor implements ParseTreeVisitor {

    @Override
    public Object visit(ParseTree parseTree) {
        System.out.println("mysql dml visit ...");
        return parseTree.accept(this);
    }

    public Object visitSelect(SelectContext selectContext) {
        System.out.println("mysql create select statement ...");
        return new Object();
    }
}
