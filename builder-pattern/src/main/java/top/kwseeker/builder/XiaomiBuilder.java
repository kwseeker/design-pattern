package top.kwseeker.builder;

import top.kwseeker.Computor;
import top.kwseeker.IComputerBuilder;
import top.kwseeker.component.*;

public class XiaomiBuilder implements IComputerBuilder {

    private Computor computor = new Computor();

    public void buildBox() {
        computor.setBox(new Box("先知3", "俊朗","中塔"));
    }

    public void buildMotherBoard() {
        computor.setMotherBoard(new MotherBoard("Z-730", "华硕"));
    }
    public void buildCpu() {
        computor.setCpu(new Cpu("I9-4380", "英特尔"));
    }
    public void buildMemory() {
        computor.setMemory(new Memory("极客3", "金士顿", "16G"));
    }
    public void buildPower() {
        computor.setPower(new Power("酷电2代", "微星", "450W"));
    }
    public void buildHardDisk() {
        computor.setHardDisk(new HardDisk("WD-2350", "西数", "530Mb/s"));
    }

    public Computor getComputer() {
        return computor;
    }

}
