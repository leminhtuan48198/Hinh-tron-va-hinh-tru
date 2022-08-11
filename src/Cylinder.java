public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "Hinh tru co ban kinh la "+getRadius()+", chieu cao la "+getHeight()+", the tich la "+getVolum()+", mau sac la mau "+getColor();
    }
    public double getVolum(){
        return getArea()*height;
    }
}
