public class MathFunctions {
    static double e=2.71828182846, π=3.14159265359;
    double r;
    double a,b,c;

    public MathFunctions(double r, double a, double b, double c) {
        this.r = r;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void circleArea(){
        double s=π*Math.pow(r,2);
        System.out.println("Circle area size: "+s);
    }
    public void ePow(){
        double spow=Math.pow(e,a);
        System.out.println("e^a: "+spow);
    }
    public void TrianArea(){
        double p,s;
        p=(a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S: ");
    }
}
