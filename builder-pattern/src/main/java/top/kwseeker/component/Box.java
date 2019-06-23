package top.kwseeker.component;

import top.kwseeker.Component;

/**
 * 机箱
 */
public class Box extends Component {

    private String size;

    public Box(String name, String brand, String size) {
        super(name, brand);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
