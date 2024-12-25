public class Solution4 extends StudentGrades{
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        //Add students
        grades.addStudent("Amrutha", 85);
        grades.addStudent("Priya", 92);
        grades.addStudent("Divya", 78);

        //display grades
        grades.displayGrade("Amrutha");
        grades.displayGrade("Priya");

        //remove a student
        grades.removeStudent("Divya");

    }
}
