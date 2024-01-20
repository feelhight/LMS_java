public class Student {
    private String name;
    private double gpa;
    public String getName() {
        return name;
    }
    public Student(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if(gpa > 0 && gpa < 5){
            this.gpa = gpa;
        }
    }
}
