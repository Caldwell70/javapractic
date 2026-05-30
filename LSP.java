abstract class Person {
    protected String name;
    public Person(String name) { this.name = name; }
    public void introduce() { System.out.println("Я " + name); }
}

interface ExamTaker { void takeExam(); }
interface HomeworkGiver { void giveHomework(); }

class Student extends Person implements ExamTaker {
    public Student(String name) { super(name); }
    public void takeExam() { System.out.println(name + " сдает экзамен"); }
}

class Teacher extends Person implements HomeworkGiver {
    public Teacher(String name) { super(name); }
    public void giveHomework() { System.out.println(name + " задает ДЗ"); }
}

public class LSP {
    public static void main(String[] args) {
        Student s = new Student("Анна");
        Teacher t = new Teacher("Иван");
        
        s.takeExam();
        t.giveHomework();
    }
}
