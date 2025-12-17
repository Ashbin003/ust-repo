public class Employee {
        protected int employeeID;
        protected String name;
        protected double salary;

        public Employee(int employeeID, String name, double salary){
            this.employeeID = employeeID;
            this.name = name;
            this.salary = salary;
        }

        public void displayDetails(){
            System.out.println("Employee Details");
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }
