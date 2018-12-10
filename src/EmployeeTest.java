import java.io.*;
public class EmployeeTest{

    public static void main(String args[]){
        /* Создание двух объектов с помощью конструктора. */
        Employee empOne = new Employee("Олег Олегов");
        Employee empTwo = new Employee("Иван Иванов");

        // Вызов метода для каждого созданного объекта.
        empOne.empAge(26);
        empOne.empDesignation("Старший инженер-программист");
        empOne.empSalary(1000);
        empOne.empYearsInComp(5);
        empOne.printEmployee();
        empOne.choosePlaceForEmp();
        empOne.printV();

        empTwo.empAge(21);
        empTwo.empDesignation("Инженер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
        empTwo.empYearsInComp(7);
        empTwo.choosePlaceForEmp();
        empTwo.printV();
    }
}
