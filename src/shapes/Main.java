package shapes;

public class Main {

    //метод вычисляет сумму площадей для каждой фигуры в массиве
    static void calculateSumArea(Computational[] shapesArray) {
        double sumArea = 0;
        for (Computational eachShape : shapesArray) {
            sumArea += eachShape.calculateArea();
        }
        System.out.printf("%.2f", sumArea);
    }

    public static void main(String[] args) {

        Computational circle = new Circle(4);
        Computational triangle = new Triangle(6, 2, 5);
        Computational square = new Square(7);

        Computational[] shapesArray = new Computational[]{circle, triangle, square};

        calculateSumArea(shapesArray);
    }
}

