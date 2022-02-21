package top.kwseeker.pattern.visitor.shardinjdbcdemo;

/**
 * 元素对象
 * SQL解析出的AST
 */
public interface ParseTree {

    Object accept(ParseTreeVisitor visitor);
}
