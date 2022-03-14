abstract class Employee{
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    void label(){
        System.out.println("Employee data:\nGRADE:"+getGrade()+"\nSALARY:"+getSalary());
    }

}
public class Engineer extends Employee {
    private int salary;
    private String grade;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public static void main(String[] args){
        Engineer e = new Engineer();
        e.setGrade("B");
        e.setSalary(30000);
        e.label();
    }
}
