package advance.dev;

class Student extends Person {
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private String studentID;
    private String className;

    public Student() {
    }

    public Student(String name, int age, String phoneNumber, double mathScore, double physicsScore, double chemistryScore, String studentID, String className) {
        super(name, age, phoneNumber);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.studentID = studentID;
        this.className = className;
    }

    public double calculateAverageScore() {
        return (mathScore + physicsScore + chemistryScore) / 3.0;
    }
}
