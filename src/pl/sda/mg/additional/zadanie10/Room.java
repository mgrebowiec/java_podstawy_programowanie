package pl.sda.mg.additional.zadanie10;

public class Room {
    private String name;
    private int height;
    private int length;
    private int width;
    private int doorsCount;
    private int windowsCount;

    public Room(String name, int height, int length, int width, int doorsCount, int windowsCount) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
        this.doorsCount = doorsCount;
        this.windowsCount = windowsCount;
    }

    public int getArea() {
        return length * width;
    }

    public int getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", doorsCount=" + doorsCount +
                ", windowsCount=" + windowsCount +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
