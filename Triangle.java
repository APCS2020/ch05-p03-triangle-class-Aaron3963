public class Triangle{
    private double base;
    private double hight;

    public Triangle(double b, double h){
        base = b;
        hight = h;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }
    /**
     * @return the hight
     */
    public double getHight() {
        return hight;
    }

    public double getArea(){
        return base*hight*0.5;
    }
}