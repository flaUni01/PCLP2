public class prob2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0, "red", true);
        System.out.println(rectangle);

        Square square = new Square(5.0, "blue", false);
        System.out.println(square);

        // Check if you can cast a Square object to a Rectangle object
        if (square instanceof Rectangle) {
            Rectangle rectangleFromSquare = (Rectangle) square;
            System.out.println(rectangleFromSquare);
        }

        // Check if you can cast a Square object to a Shape object
        if (square instanceof Shape) {
            Shape shapeFromSquare = (Shape) square;
            System.out.println(shapeFromSquare);
        }

        // Check if you can cast a Square object to a Circle object
        if (square instanceof Circle) {
            Circle circleFromSquare = (Circle) square;
            System.out.println(circleFromSquare);
        } else {
            System.out.println("Cannot cast Square to Circle");
        }
    }
}
