package oocpsDay1;

public class Constructor_Address {
    private String socityName;
    private String Area;
    private int pincode;

    public Constructor_Address() {
        this.socityName = "test";
    }

    public String getSocityName() {
        return socityName;
    }

    public void setSocityName(String socityName) {
        this.socityName = socityName;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
