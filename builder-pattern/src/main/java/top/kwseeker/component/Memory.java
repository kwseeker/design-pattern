package top.kwseeker.component;

import top.kwseeker.Component;

public class Memory extends Component {

    private String capacity;

    public Memory(String name, String brand, String capacity) {
        super(name, brand);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
