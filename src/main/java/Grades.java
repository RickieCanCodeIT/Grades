import java.util.ArrayList;
import java.util.List;

public class Grades {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> grades = new ArrayList<>();
        names.add("Sam");
        grades.add(70);
        names.add("Chris");
        grades.add(95);
        names.add("Casey");
        grades.add(85);
        names.add("Rufio");
        grades.add(30);
        System.out.println("Student grades:");
        double sum = 0.0;

        for (int counter = 0; counter < grades.size(); counter++) {
            System.out.println(names.get(counter) + " received a grade of " + grades.get(counter));
            sum = grades.get(counter);
        }
        double average = sum / grades.size();
        System.out.println("Average grade: " + average);
    }
}
