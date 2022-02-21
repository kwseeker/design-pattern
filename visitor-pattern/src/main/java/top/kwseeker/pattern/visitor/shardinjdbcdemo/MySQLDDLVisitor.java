package top.kwseeker.pattern.visitor.shardinjdbcdemo;

public class MySQLDDLVisitor implements ParseTreeVisitor {

    @Override
    public Object visit(ParseTree parseTree) {
        System.out.println("mysql ddl visit ...");
        return parseTree.accept(this);
    }

    public Object visitDelete(DeleteContext deleteContext) {
        System.out.println("mysql create delete statement ...");
        return new Object();
    }
}
