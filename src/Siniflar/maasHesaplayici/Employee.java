package Siniflar.maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;

    public Employee(String name, double salary,
                    int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){
        if ( salary < 1000)  {
            tax = 0;
        } else if ( salary > 1000) {
            tax = salary * 0.3;
        }
        return tax;
    }

    public double bonus() {
        if ( workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        int workYears = 2021 - hireYear;
        double salaryIncrease;

        if ( workYears < 10) {
            raise = 0.05;
            salaryIncrease = salary * raise;
        } else if( workYears > 9 && workYears < 20) {
            raise = 0.1;
            salaryIncrease = salary * raise;
        }else {
            raise = 0.15;
            salaryIncrease = salary * raise;
        }
        return salaryIncrease;
    }

    public void toString(Employee employee) {
        System.out.println("Adı : " + employee.name);
        System.out.println("Maaşı : " + employee.salary);
        System.out.println("Başlangıç Yılı : " + employee.hireYear);
        System.out.println("Vergi : " + employee.tax);
        System.out.println("Bonus : " + employee.bonus);
        System.out.println("Maaş Artışı : " + employee.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + employee.salary+
                employee.raise + employee.bonus);
        System.out.println("Toplam Maaş : " + employee.salary+
                employee.raise + employee.bonus + employee.tax);
    }

}
