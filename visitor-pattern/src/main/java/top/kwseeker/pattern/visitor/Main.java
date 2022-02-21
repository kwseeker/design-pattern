package top.kwseeker.pattern.visitor;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        FileStructure fs = new FileStructure(new File("./visitor-pattern"));

        Visitor visitor = new JavaFileVisitor();
        fs.handle(visitor);

        System.out.println("---------------------------");

        ClassFileCleanerVisitor visitor1 = new ClassFileCleanerVisitor();
        fs.handle(visitor1);
    }
}
