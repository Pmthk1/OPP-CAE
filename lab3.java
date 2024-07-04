import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;
    private int exp;

    public Employee(String name, double salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double calBonus() {
        return (salary * exp) * 0.3;
    }
}

class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void setEmpSalary(String name, double newSalary) {
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                emp.setSalary(newSalary);
                break;
            }
        }
    }

    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        for (Employee emp : employees) {
            System.out.println("Name: " + emp.getName() + 
                               " Salary: " + emp.getSalary() + 
                               " Experience: " + emp.getExp() + 
                               " Bonus: " + emp.calBonus());
        }
    }
}

public class lab3 {
    public static void main(String[] args) {
        Company myComp = new Company("UP");
        myComp.addEmployee(new Employee("Pluem1", 20000, 5));
        myComp.addEmployee(new Employee("Pluem2", 30000, 7));
        
        myComp.displayInfo();
        
        myComp.setEmpSalary("Pluem1", 25000);
        myComp.displayInfo();
        
        myComp.setEmpSalary("Pluem2", 35000);
        myComp.displayInfo();
    }
}


