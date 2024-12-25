public class Solution2 {
    //exception Class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    //voter class
    public static class Voter {
        public int voterID;
        public String name;
        public int age;

        public Voter(int voterID, String name, int age) throws InvalidAgeException {
            this.voterID = voterID;
            this.name = name;

            if (age < 18) {
                throw new InvalidAgeException("Invalid age for voter");
            }
            this.age = age;
        }
    }

    public static void main(String[] args) {
        try {
            Solution2.Voter voter1 = new Solution2.Voter(123, "tharunika", 18);
            System.out.println("Valid age for voter");
        } catch (Solution2.InvalidAgeException e) {
            System.err.println("Error: "+e.getMessage());
        }
    }

}
