package top.kwseeker.pattern.visitor.shardinjdbcdemo;

public class DeleteContext implements ParseTree {

    @Override
    public Object accept(ParseTreeVisitor visitor) {
        return ((MySQLDDLVisitor) visitor).visitDelete(this);
    }
}
