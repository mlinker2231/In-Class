/*
 * Create a Rectangle Class that has double properties of height and width.
 * The class should have a default constructor and an argument constructor.
 * All Rectangle object should have a method named getArea which returns
 * the area of the rectangle. Now create a Square class that is a child
 * of the Rectangle class. It should also have a default constructor and
 * an argument constructor. It also should have a method named getArea
 * which returns the area of the Square.
 */
public class WarmUp11_2 {
    public static void main(String args[])
    {
    }
}
class Rectangle {
    double height,width;
    public double getArea() {
        return height * width;
    }
}
class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(int l) {

    }
//    public int getArea() {
//        return super.getArea();
//    }
}
