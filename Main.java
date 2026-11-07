//create a class
class Employee{
    //class variables
    String name;
    int age;
    String title;
    double salary;
    //create a construtor-assign values to a class
    Employee(String name, int age, String title, double salary){
        this.name=name;
        this.age=age;
        this.title=title;
        this.salary=salary;
    }
    //class methods-to perform speciifc tasks
    void display(){
        //display employee information
        System.out.println("---Emplyee Details---");
        System.out.println("Name:"+name);
        System.out.println("Age:" + age);
        System.out.println("Title:" + title);
        System.out.println("Salary:" + salary);
    }
    //method to calculate the annual salary
    double calcutatesalary(){
        return salary*12;
    }
    //method to print user name and title
    void work(){
        System.out.println(name + "is working as a" + title);
    }
}
//main class
public class Main {
    //main method
    public static void main(String[] args) {
        //class objects to execute the class
        Employee employee1=new Employee("Grace Abrams", 25, "Accountant", 3570);
        //execute the class method
        employee1.display();
        employee1.work();
        double annualsalary=employee1.calcutatesalary();
        System.out.println("Annual Salary for " +employee1.name +":"+annualsalary);
    }
}