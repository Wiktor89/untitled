package pattern.generative.builder;


public class Car {

    private String brend;

    private String power;

    public String getBrend () {
        return brend;
    }

    public void setBrend (String brend) {
        this.brend = brend;
    }

    public String getPower () {
        return power;
    }

    public void setPower (String power) {
        this.power = power;
    }

    @Override
    public String toString () {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
