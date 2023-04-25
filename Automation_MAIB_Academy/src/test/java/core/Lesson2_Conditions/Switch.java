package core.Lesson2_Conditions;

public class Switch {
    public static void main(String[] args) {

        String comapany = "MAIB";
        switch (comapany) {
            case "MAIB":
                System.out.println("Best bank");
                break;
            case "Allied Testing":
                System.out.println("Main focus of QA");
                break;
            case "EST Computer":
                System.out.println("Main focus of Fronted");
                break;
            default:
                System.out.println("This company not existed");
        }

    }
}
