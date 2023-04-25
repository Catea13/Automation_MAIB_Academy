package core.Lesson3_Methods;

public class StaticMethod {
    public static void main(String[] args) {
        suma();
        suma(4.8,5.8);

    }
    /**Without parameters**/
    public static void suma(){
        int suma=5+6;
        System.out.println(suma);
    }
    /**With parameters**/
    public static void suma(double a,double b){
        double suma=a+b;
        System.out.println(suma);
    }

}
