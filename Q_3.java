/*Q3 : Write a program to create a class named shape. In this class we have three
        subclasses circle, triangle and square, each class has two member function
        named draw () and erase (). Create these using Runtime Polymorphism concepts.*/


class Shape
{
    void draw()
    {
        System.out.println("this is Draw of Shape");
    }
    void erase()
    {
        System.out.println("This is Erase of Shape");
    }

}

class Circle extends Shape
        {
            void draw()
            {
                System.out.println("this is Draw of Circle");
            }
            void erase()
            {
                System.out.println("This is Erase of Circle");
            }
        }

class Triangle extends Shape
{
    void draw()
    {
        System.out.println("this is Draw of Triangle");
    }
    void erase()
    {
        System.out.println("This is Erase of Triangle");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("this is Draw of Square");
    }
    void erase()
    {
        System.out.println("This is Erase of Square");
    }
}
public class Q_3 {
    public static void main(String args[])
    {
        Shape shape = new Shape();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();
        Shape c1 = new Circle();

        shape.draw();
        shape.erase();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
        c1.draw();
        c1.erase();
    }
}
