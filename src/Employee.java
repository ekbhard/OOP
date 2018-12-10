public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    double yearsInComp;
    double v;


    Employee(String n, int a , String desi, double years, double sal){
        name=n;
        age=a;
        designation=desi;
        yearsInComp=years;
        salary=sal;
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