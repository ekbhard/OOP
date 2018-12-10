public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    double yearsInComp;
    double v;

    // Это конструктор класса Employee.
    public Employee(String name) {
        this.name = name;
    }

    public void empYearsInComp(double empYearsInComp ){
        yearsInComp=empYearsInComp; }
    // Присвоение возраста работника переменной age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Присвоение переменной designation. */
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Присвоение переменной salary. */
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Вывод подробной информации. */
    public void printEmployee() {
        System.out.println("Имя:" + name);
        System.out.println("Возраст:" + age);
        System.out.println("Наименование:" + designation);
        System.out.println("Заработная плата:" + salary);
    }

    public void choosePlaceForEmp(){
        v = salary + yearsInComp * 0.05 * salary * 0.03;
    }

    public void printV(){
        System.out.println(v);
    }

}