import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> namesOfClass = nameStudent();

        String newNameInClass = "Luca";
        Set<String> newPepole = new HashSet<>();
        newPepole.add(newNameInClass);

        if (namesOfClass.contains(newNameInClass)) {
            System.out.println("Yes it contains :" + newNameInClass + "\n" + namesOfClass);
        } else {
            System.out.println("No ," + newNameInClass + " is not on :\n" + namesOfClass);
        }

    }
    public static HashSet<String> nameStudent() {
        HashSet<String> nameStudent = new HashSet<>();
        nameStudent.add("Sergio");
        nameStudent.add("Fabrizzio");
        nameStudent.add("Jacopo");
        nameStudent.add("Lorenzo");
        nameStudent.add("Riccardo");
        return nameStudent;
    }


}