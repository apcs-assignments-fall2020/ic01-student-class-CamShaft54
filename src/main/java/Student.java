public class Student extends Person {

    private int classYear;

    public Student(String firstName, String lastName, int year) {
        super(firstName, lastName);
        classYear = year;
    }

    public Student() {
        classYear = 2020;
    }

    public void setClassYear(int year) {
        classYear = year;
    }

    public int getClassYear() {
        return classYear;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + classYear;
    }
}