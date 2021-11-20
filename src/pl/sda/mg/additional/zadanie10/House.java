package pl.sda.mg.additional.zadanie10;

public class House {
    private Room[][] rooms;

    public House(Room[][] rooms) {
        this.rooms = rooms;
    }

    public int getAreaForLevel(int level) {
        int globalArea = 0;
        for (Room room : rooms[level - 1]) {
            globalArea += room.getArea();
        }
        return globalArea;
    }

    public void showLevel(int level) {
        System.out.println("Pokoje na pietrze " + level + ": {");
        for (Room room : rooms[level - 1]) {
            System.out.println(room.toString());
        }
        System.out.println("}");
    }

    public void showAllRooms() {
        for(Room[] level : rooms) {
            System.out.println("{");
            for (Room room : level) {
                System.out.println(room.toString());
            }
            System.out.println("}");
        }
    }
}
