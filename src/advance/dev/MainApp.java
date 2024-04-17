package advance.dev;

public class MainApp {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        input(persons);
        print(persons);
        findTeacher(persons);
    }

    public static void input(Person[] persons) {
        // Nhập thông tin cho 4 giáo viên
        persons[0] = new Teacher("Teacher1", 35, "123456789", "T1", 2.5);
        persons[1] = new Teacher("Teacher2", 40, "987654321", "T2", 2.8);
        persons[2] = new Teacher("Teacher3", 45, "567891234", "T3", 3.0);
        persons[3] = new Teacher("Teacher4", 50, "321654987", "T4", 3.2);

        // Nhập thông tin cho 6 sinh viên
        persons[4] = new Student("Student1", 20, "111111111", 7.5, 8.0, 9.0, "S1", "ClassA");
        persons[5] = new Student("Student2", 21, "222222222", 8.5, 7.0, 9.5, "S2", "ClassB");
        persons[6] = new Student("Student3", 22, "333333333", 9.0, 8.0, 7.5, "S3", "ClassC");
        persons[7] = new Student("Student4", 20, "444444444", 6.5, 7.5, 8.5, "S4", "ClassA");
        persons[8] = new Student("Student5", 21, "555555555", 8.0, 9.0, 7.0, "S5", "ClassB");
        persons[9] = new Student("Student6", 22, "666666666", 9.5, 8.5, 8.0, "S6", "ClassC");
    }

    public static void print(Person[] persons) {
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Teacher: " + teacher.name + ", Salary: $" + teacher.calculateSalary());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student: " + student.name + ", Average Score: " + student.calculateAverageScore());
            }
        }
    }

    public static void findTeacher(Person[] persons) {
        Teacher highestPaidTeacher = null;
        double maxSalary = Double.MIN_VALUE;

        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                double salary = teacher.calculateSalary();
                if (salary > maxSalary) {
                    maxSalary = salary;
                    highestPaidTeacher = teacher;
                }
            }
        }

        if (highestPaidTeacher != null) {
            System.out.println("Highest Paid Teacher: " + highestPaidTeacher.name + ", Salary: $" + highestPaidTeacher.calculateSalary());
        }
    }
}