//wap to find area of rectangle and box using this and super keyword
class rectangle {
    double length;
    double width;

    void area() {
        double area;
        // using this keyword to instance current class
        area = this.length * this.width;
        System.out.println("The area of rectangle is:" + area);

    }

    void perimeter() {
        double perimeter;
        perimeter = 2 * (this.length + this.width);
        System.out.println("The perimeter of rectangle is:" + perimeter);
    }
}

// making a class for box
class box {
    double side = 5.6; // side variable in parent box class

}

class box2 extends box {
    double side = 3.6;

    void area() {
        double area;
        area = super.side * super.side;// using super keyword to refer parent class variable (here ,side = 5.6 not 3.6)
        System.out.println("Area of box is:" + area);
    }

}

public class AreaClass {
    public static void main(String args[]) {

        // creating a object for rectangle class
        rectangle rect = new rectangle();

        rect.length = 5.6;
        rect.width = 3.6;
        rect.area();// calling area method from rectangle class
        rect.perimeter();// calling perimeter method from rectangle class
        // Here we have created a object for the box class
        box2 obj = new box2();
        obj.area();

    }

}
// program by prince gautam
