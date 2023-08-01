package Tema19;

public class House extends Building {
    private int numberOfFloors;
    private String ownerName;

    public House(float area, String address, int numberOfFloors, String ownerName) {
        super(area, address);
        this.numberOfFloors = numberOfFloors;
        this.ownerName = ownerName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "House: area=" + getArea() + ", address='" + getAddress() + "', numberOfFloors=" + numberOfFloors + ", ownerName='" + ownerName + "'";
    }
}
