public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int employeeID, String name, double salary, String programmingLanguage){
        super(employeeID, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        System.out.println("Developer Details");
        System.out.println("Developer ID: " + employeeID);
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println();
    }
}
