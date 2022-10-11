package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student studentZero = new Student("George");
        studentZero.addGrade(95);
        studentZero.addGrade(100);
        studentZero.addGrade(89);
        Student studentOne = new Student("Joe");
        studentOne.addGrade(85);
        studentOne.addGrade(90);
        studentOne.addGrade(93);
        System.out.println(studentZero.grades);
        System.out.println(studentZero.getGradeAverage());
        System.out.println(studentOne.grades);
        System.out.println(studentOne.getGradeAverage());

    }

}
