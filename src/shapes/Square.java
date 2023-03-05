package shapes;

public class Square implements Computational {
    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Поля должны быть >=0");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
