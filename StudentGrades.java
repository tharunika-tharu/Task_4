import java.util.HashMap;

public class StudentGrades {
    public HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }
    //method to add student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }
    //method to remove student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name+" removed");
        } else {
            System.out.println("Student does not exist.");
        }
    }

    //method to display student
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.print("Name: " +name+", ");
            System.out.println("Grade: "+studentGrades.get(name));
        } else {
            System.out.println("Student does not exist.");
        }
    }
}
