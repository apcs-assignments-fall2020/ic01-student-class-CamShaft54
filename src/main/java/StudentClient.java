public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student("Cam", "Shaft", 1854);
        System.out.println(s2.toString());
        s2.setClassYear(1864);
        System.out.println(s2.getClassYear());
    }
}