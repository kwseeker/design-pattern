package top.kwseeker.pattern.visitor.shardinjdbcdemo;

public class SelectContext implements ParseTree {

    @Override
    public Object accept(ParseTreeVisitor visitor) {
        return ((MySQLDMLVisitor) visitor).visitSelect(this);
    }
}
