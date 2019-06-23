package top.kwseeker.component;

import top.kwseeker.Component;

public class Power extends Component {

    String rate;

    public Power(String name, String brand, String rate) {
        super(name, brand);
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
