import java.io.*;
public class EmployeeTest{

    public static void main(String args[]){
        /* Создание двух объектов с помощью конструктора. */
        Employee empOne = new Employee("Олег Олегов",22,"Старший инженер-программист",6,500);
        Employee empTwo = new Employee("Иван Иванов",18,"Инженер-программист",2,300);

        // Вызов метода для каждого созданного объекта.

        empOne.printEmployee();
        empOne.choosePlaceForEmp();
        empOne.printV();


        empTwo.printEmployee();
        empTwo.choosePlaceForEmp();
        empTwo.printV();
    }
}
