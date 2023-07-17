package Polymorphism;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int hight) {
        this.height = hight;
    }

    @Override
    public double getArea() {
        return .5*getBase()* getHeight();
    }

    @Override
    public String toString() {
        System.out.println(super.toString()+"\nthe height of the triangle: "+getHeight()+"\nthe base of the triangle: "+getBase());
        return "";
    }


}
