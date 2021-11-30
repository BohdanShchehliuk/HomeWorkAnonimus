package Vehicles;

public enum Vehicles {
    BMW(1000, "black"), Mersedess(999, "white"), Toyota(800, "blue");

    private int price;
    public String colour;

    Vehicles(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return name() + "_Vehicles{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] arg) {
        System.out.println(Vehicles.BMW.toString());
        System.out.println(Vehicles.Mersedess.toString());
        System.out.println(Vehicles.Toyota.toString());
    }
}

