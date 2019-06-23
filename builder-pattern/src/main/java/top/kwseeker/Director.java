package top.kwseeker;

/**
 * 组装流程(基本不变)
 */
public class Director {

    public Computor constructComputer(IComputerBuilder builder) {
        builder.buildBox();
        builder.buildMotherBoard();
        builder.buildCpu();
        builder.buildMemory();
        builder.buildHardDisk();
        builder.buildPower();

        return builder.getComputer();
    }
}
