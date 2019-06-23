package top.kwseeker.builder;

import top.kwseeker.Computor;
import top.kwseeker.IComputerBuilder;
import top.kwseeker.component.*;

public class MacBuilder implements IComputerBuilder {

    private Computor computor = new Computor();

    public void buildBox() {
        computor.setBox(new Box("机甲2代", "苹果","小塔"));
    }

    public void buildMotherBoard() {
        computor.setMotherBoard(new MotherBoard("极致5", "苹果"));
    }
    public void buildCpu() {
        computor.setCpu(new Cpu("A13", "苹果"));
    }
    public void buildMemory() {
        computor.setMemory(new Memory("M-238A", "闪迪", "16G"));
    }
    public void buildPower() {
        computor.setPower(new Power("酷电2代", "苹果", "400W"));
    }
    public void buildHardDisk() {
        computor.setHardDisk(new HardDisk("INTEL-24D", "英特尔", "500Mb/s"));
    }

    public Computor getComputer() {
        return computor;
    }

}
