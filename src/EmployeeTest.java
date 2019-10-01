public class EmployeeTest{

    public static void main(String args[]){
        /* Создание двух объектов с помощью конструктора. */
        Employee empOne = new Employee("Олег Олегов",22,"Старший инженер-программист",1400,2015);
        Employee empTwo = new Employee("Иван Иванов",18,"Инженер-программист",2000,2000);
        Employee empThree= new Employee("Иван Иванов",18,"Инженер-программист",1800,2016);

        // Вызов метода для каждого созданного объекта.
        Employee.message = "Hi , i am " + empOne.getName();

        empOne.printEmployee();
        System.out.println(empOne.increaseSalaryForEmp());
        System.out.println(empOne.calculateYearsToRetirement());

        empOne.setName("Вася Васин");
        empOne.printEmployee();




//        empTwo.printEmployee();
//        System.out.println(empTwo.increaseSalaryForEmp());
//        System.out.println(empTwo.calculateYearsToRetirement());

    }
}
