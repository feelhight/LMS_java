import java.util.ArrayList;

public class Course {
    ArrayList<Student> students = new ArrayList<>();

    public void watchAllStudentsInCourse(){
        if (students.size() == 0){
            System.out.println(" пока в этом курсе никого нет");
        }
        else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + " " + students.get(i).getName());
            }
        }
        System.out.println();

    }
    public void addStudent(String studentsName, double studentGpv){
        if(students.size() < 10){
            Student student = new Student(studentsName);
            student.setGpa(studentGpv);
            students.add(student);

            System.out.println(studentsName + " был добавлен");
            System.out.println();
        }
        else {
            System.out.println("курс полон и " + studentsName + " не был добавлен");
            System.out.println();
        }
    }
    public void deleteStudentsWithAverageGpv(){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getGpa() == 4){
                System.out.println(students.get(i).getName() + " был удален");
                students.set(i,null);
            }
        }
    }
}
