package prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("aaa");
        student.setAge(11);
        Student clone = (Student)student.clone();
        System.out.println(clone);
    }
}
