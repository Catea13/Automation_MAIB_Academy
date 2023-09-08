package Lesson4_OOP;
/**public -	The code is accessible for all classes
 private  -	The code is only accessible within the declared class
 protected -	The code is accessible in the same package and subclasses.
 final	The class cannot be inherited by other classes
 abstract	The class cannot be used to create objects **/
public  class Modifiers {
    public static void main(String[] args) {
        Modifiers modifiers=new Modifiers();
        System.out.println(modifiers.a);
        System.out.println(modifiers.b);
        System.out.println(modifiers.d);
        modifiers.d=9;
        System.out.println(modifiers.d);


    }
     final    int a = 5;
        public int d=7;

        private int b = 5;

    public int getB() {
        return b;
    }
// a=6;//will generate an error: we cannot change a final variable

    }
//Inner class
     class Test{
         public static void main(String[] args) {

        Modifiers modifiers=new Modifiers();
             System.out.println(modifiers.a);
             System.out.println(modifiers.d);
             System.out.println(modifiers.getB());
             // private variables can only be accessed within the same class

         }
     }


