public class Manager extends Employee {
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
    public static void main(String args[]){
        Manager m = new Manager();
        m.setGrade("A");
        m.setSalary(60000);
        m.label();
    }
    
}
