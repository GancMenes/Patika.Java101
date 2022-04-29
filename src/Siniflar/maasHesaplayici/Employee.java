package Siniflar.maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;
    double newSalary;

    public Employee(String name, double salary,
                    int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){
        if ( this.salary < 1000)  {
            tax = 0;
        } else if ( this.salary > 1000) {
            tax = this.salary * 0.3;
        }
        return tax;
    }

    public double bonus() {
        if ( this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        int workYears = 2021 - this.hireYear;
        double raise;

        if ( workYears < 10) {
            raise = 0.05;
            raise = this.salary * raise;
        } else if( workYears > 9 && workYears < 20) {
            raise = 0.1;
            raise = this.salary * raise;
        }else {
            raise = 0.15;
            raise = this.salary * raise;
        }
        return raise;
    }

    public double totalSalary() {
        newSalary = this.salary+
                this.raise + this.bonus + this.tax;
        return newSalary;
    }

    public void toString(Employee employee) {
        tax();
        bonus();
        raiseSalary();
        totalSalary();
        System.out.println("Adı : " + employee.name);
        System.out.println("Maaşı : " + employee.salary);
        System.out.println("Başlangıç Yılı : " + employee.hireYear);
        System.out.println("Vergi : " + tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (this.newSalary - this.raise));

        System.out.println("Toplam Maaş : " + this.newSalary );
    }

}
