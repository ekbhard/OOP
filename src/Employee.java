import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {

    private String name;
    private int age;
    private String designation;
    private double startSalary;
    private double workStartDate;
    private double v;

    public Employee(String name, int age, String designation, double startSalary, double workStartDate) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.startSalary = startSalary;
        this.workStartDate = workStartDate;
    }

    /* Вывод подробной информации. */
    void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Start salary:" + startSalary);
    }

    double increaseSalaryForEmp(){
        Calendar calendar =new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        int yearsOnWork ;
        yearsOnWork = (int) (currentYear - workStartDate);
       return v = startSalary + yearsOnWork * startSalary * 0.05;
    }

    int calculateYearsToRetirement(){
        int years;
        years = 65-age;
        assert years > 0 ;
        return years;
    }

}