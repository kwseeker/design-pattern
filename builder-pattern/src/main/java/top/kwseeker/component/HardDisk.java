package top.kwseeker.component;

import top.kwseeker.Component;

public class HardDisk extends Component {

    private String speed;

    public HardDisk(String name, String brand, String speed) {
        super(name, brand);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
