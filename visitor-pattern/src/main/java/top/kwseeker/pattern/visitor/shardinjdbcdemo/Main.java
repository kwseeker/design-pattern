package top.kwseeker.pattern.visitor.shardinjdbcdemo;

public class Main {

    public static void main(String[] args) {
        ParseTree parseTree1 = new SelectContext();
        new MySQLDMLVisitor().visit(parseTree1);
        ParseTree parseTree2 = new DeleteContext();
        new MySQLDDLVisitor().visit(parseTree2);
    }
}
