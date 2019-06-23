package top.kwseeker;

/**
 * 构建各个组件以及获取成品接口
 */
public interface IComputerBuilder {

    void buildBox();
    void buildMotherBoard();
    void buildCpu();
    void buildMemory();
    void buildPower();
    void buildHardDisk();

    Computor getComputer();
}
