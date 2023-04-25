package Lesson4_OOP;

public class QA_Automation extends Abstraction {
    public static void main(String[] args) {
        QA_Automation qaAutomation=new QA_Automation();
        qaAutomation.writeCode();

    }

    @Override
    public void writeCode() {

        System.out.println("QA Automation write code in java");
    }
}
