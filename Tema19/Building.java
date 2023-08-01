package Tema19;
public class Building {
    private float area;
    private String address;

    public Building(float area, String address) {
        this.area = area;
        this.address = address;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building: area=" + area + ", address='" + address + "'";
    }
}