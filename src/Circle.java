public class Circle {

    private double radius;
    private double centerpoint;

    public Circle(){
        radius = -1;
        centerpoint = -1;
    }

    public void setRadius(double r){
        radius = r;}

    public double getRadius(){
        return radius;}


        public void computeArea(){
        double area = 3.14*(radius*radius);
        System.out.print(area);
    }

}
