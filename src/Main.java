import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Course biology = new Course();
        System.out.println(" добро пожаловать!");
        while (true) {
            System.out.println("Выберите что вы хотите зделать \n");
            System.out.println("1 что-бы добавить студента\n2 что-бы посмотреть всех студентов\n3 что-бы удалить студентов со средним баллом");
            int tempInt = scan.nextInt();

            if(tempInt == 1){
                System.out.println("Напишите имя студента");
                String name = scan.next();
                System.out.println("Напишите его средний бал");
                int gpv = scan.nextInt();

                biology.addStudent(name, gpv);
            } else if (tempInt == 2) {
                biology.watchAllStudentsInCourse();

            } else if (tempInt == 3) {
                biology.deleteStudentsWithAverageGpv();
            }
        }
    }
}