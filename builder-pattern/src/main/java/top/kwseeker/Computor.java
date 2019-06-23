package top.kwseeker;

import top.kwseeker.component.*;

/**
 * 目标产品
 */
public class Computor  {

    private Box box;
    private MotherBoard motherBoard;
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;
    private Power power;

    public String introduction() {
        StringBuilder sb = new StringBuilder();
        sb.append("配置: ");
        sb.append("\n\tBox: " + getBox().toString());
        sb.append("\n\tMotherBoard: " + getMotherBoard().toString());
        sb.append("\n\tCpu: " + getCpu().toString());
        sb.append("\n\tMemory: " + getMemory().toString());
        sb.append("\n\tHardDisk: " + getHardDisk().toString());
        sb.append("\n\tPower: " + getPower().toString());
        return sb.toString();
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }
}
