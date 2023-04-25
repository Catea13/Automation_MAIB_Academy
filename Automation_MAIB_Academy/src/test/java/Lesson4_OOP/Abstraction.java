package Lesson4_OOP;
/**Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

 Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
**/
 public abstract class Abstraction {
    public String name;
    public String job;

    public abstract void writeCode();

}
