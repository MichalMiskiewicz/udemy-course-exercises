package pl.mmiskiewicz;

public class Main {
    public static void main(String[] args) {
        Square<Integer> squareInteger = new Square<>(10);
        Square<Float> squareFloat = new Square<>(5.7f);

        System.out.println("int square area " + squareInteger.getSurfaceArea());
        System.out.println("float square area " + squareFloat.getSurfaceArea());
    }
}