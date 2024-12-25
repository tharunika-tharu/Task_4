public class Solution1 {

    //exception classes
    static class AgeNotWithinRangeException extends Exception {
        public AgeNotWithinRangeException(String message) {
            super(message);
        }
    }

    static class NameNotValidException extends Exception {
        public NameNotValidException(String message) {
            super(message);
        }
    }

    //student class
    public static class Student {

        public int rollNo;
        public String name;
        public int age;
        public String course;

        //parameterized constructor
        public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.course = course;

            //validate age
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("Student age must be between 15 and 21 years old.");
            }
            //validate name
            if (!name.matches("^[a-zA-Z ]+$")) {
                throw new NameNotValidException("Student name must only contain letters and spaces.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student(123, "tharunika", 18, "Computer Science");
            System.out.println("Student created successfully!");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
