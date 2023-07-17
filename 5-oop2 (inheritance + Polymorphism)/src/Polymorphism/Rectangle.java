package Polymorphism;

public class Rectangle extends Shape{

    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getWidth()*getHeight();
    }

    @Override
    public String toString() {
        System.out.println(super.toString()+"\nthe height of the rectangle : "+getHeight()+"\nthe width of the rectangle : "+getWidth());
        return "";
    }

}
