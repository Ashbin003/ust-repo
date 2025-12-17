public class Main {
    public static void main(String[] args){
        Manager manager = new Manager(1, "Ashbin", 60000, 6);
        Developer developer = new Developer(2, "Chriss", 35000, "Java");

        manager.displayDetails();
        developer.displayDetails();
    }
}
