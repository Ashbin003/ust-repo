public class Manager extends Employee{
    private int teamSize;

    public Manager(int employeeID, String name, double salary, int teamSize) {
        super(employeeID, name, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails(){
        System.out.println("Manager Details");
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}
