package core.Lesson3_Methods;

public class NonStaticMethods {
    public static void main(String[] args) {
        /**When method is not static we should creade instance**/
        NonStaticMethods nonStaticMethods = new NonStaticMethods();
        nonStaticMethods.suma();
        nonStaticMethods.suma(4.9,8.9);
    }
        public  void suma(){
            int suma=5+6;
            System.out.println(suma);
        }
        /**With parameters**/
        public  void suma(double a,double b){
            double suma=a+b;
            System.out.println(suma);
        }

    }



