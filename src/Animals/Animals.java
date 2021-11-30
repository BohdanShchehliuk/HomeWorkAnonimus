package Animals;

public enum Animals {
    Lion(10, "great"), Dog(20, "awsome"), Cat(30, "good");

    public int year;
    public String string;

    Animals(int year, String string) {
        this.year = year;
        this.string = string;
    }

    public String toString() {
        return name() + " " + year + " " + string;
    }
}

class Main {

    public static void main(String[] arg) {
        System.out.println(Animals.Lion.toString());
        System.out.println(Animals.Dog.toString());
        System.out.println(Animals.Cat.toString());
    }
}


