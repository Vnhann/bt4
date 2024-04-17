package advance.dev;

class Teacher extends Person {
    String teacherID;
    double salaryCoefficient;

    public Teacher(String name, int age, String phoneNumber, String teacherID, double salaryCoefficient) {
        super(name, age, phoneNumber);
        this.teacherID = teacherID;
        this.salaryCoefficient = salaryCoefficient;
    }

    public double calculateSalary() {
        // Giả sử lương được tính dựa trên hệ số lương
        return 1000 * salaryCoefficient;
    }
}