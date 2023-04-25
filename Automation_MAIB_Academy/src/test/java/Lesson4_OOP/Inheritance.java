package Lesson4_OOP;
/**In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

 subclass (child) - the class that inherits from another class
 superclass (parent) - the class being inherited from
 To inherit from a class, use the extends keyword.**/
public class Inheritance extends Employee {

    public Inheritance(String name, String jobName, int salary) {
        super(name, jobName, salary);
    }

    public static void main(String[] args) {
        Employee test1=new Employee("Test1","QA Automation",500000);
        Employee test2=new Employee("Test1","QA Manual",400000);
        Employee tes3=new Employee("Test1","Java Developer",500000);
        test1.setSalary(60000000);
        System.out.println(test1.getName().concat(test1.getJobName()).concat(String.valueOf(test1.getSalary())));

    }
}