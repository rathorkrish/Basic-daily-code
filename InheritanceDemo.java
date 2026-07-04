class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// -------------------- Employee --------------------

class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
        System.out.println("Employee Constructor Called");
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary      : " + salary);
    }

    void work() {
        System.out.println("Employee is working...");
    }
}

// -------------------- Developer --------------------

class Developer extends Employee {
    String language;

    Developer(String name, int age, int empId, double salary, String language) {
        super(name, age, empId, salary);
        this.language = language;
        System.out.println("Developer Constructor Called");
    }

    @Override
    void work() {
        System.out.println("Developer is writing " + language + " code.");
    }

    void coding() {
        System.out.println("Coding in " + language);
    }
}

// -------------------- Tester --------------------

class Tester extends Employee {

    Tester(String name, int age, int empId, double salary) {
        super(name, age, empId, salary);
        System.out.println("Tester Constructor Called");
    }

    @Override
    void work() {
        System.out.println("Tester is testing software.");
    }

    void testing() {
        System.out.println("Executing Test Cases...");
    }
}

// -------------------- Manager --------------------

class Manager extends Employee {

    int teamSize;

    Manager(String name, int age, int empId, double salary, int teamSize) {
        super(name, age, empId, salary);
        this.teamSize = teamSize;
        System.out.println("Manager Constructor Called");
    }

    @Override
    void work() {
        System.out.println("Manager is managing team.");
    }

    void meeting() {
        System.out.println("Conducting Team Meeting");
    }
}

// -------------------- Senior Developer --------------------

class SeniorDeveloper extends Developer {

    int experience;

    SeniorDeveloper(String name, int age, int empId, double salary,
                    String language, int experience) {
        super(name, age, empId, salary, language);
        this.experience = experience;
        System.out.println("Senior Developer Constructor Called");
    }

    @Override
    void work() {
        System.out.println("Senior Developer develops enterprise applications.");
    }

    void mentor() {
        System.out.println("Mentoring Junior Developers");
    }

    void displaySeniorDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : " + language);
        System.out.println("Experience           : " + experience + " Years");
    }
}

// -------------------- Main Class --------------------

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("========== Senior Developer ==========");

        SeniorDeveloper sd = new SeniorDeveloper(
                "Krishna Rathor",
                19,
                101,
                80000,
                "Java",
                5);

        sd.displaySeniorDeveloper();
        sd.work();
        sd.coding();
        sd.mentor();

        System.out.println();

        System.out.println("========== Tester ==========");

        Tester t = new Tester(
                "Rahul",
                24,
                102,
                45000);

        t.displayEmployee();
        t.work();
        t.testing();

        System.out.println();

        System.out.println("========== Manager ==========");

        Manager m = new Manager(
                "Amit",
                35,
                103,
                120000,
                15);

        m.displayEmployee();
        m.work();
        m.meeting();

        System.out.println();

        System.out.println("========== Runtime Polymorphism ==========");

        Employee e;

        e = new Developer("Rohit", 23, 104, 60000, "Python");
        e.work();

        e = new Tester("Priya", 22, 105, 50000);
        e.work();

        e = new Manager("Suresh", 40, 106, 150000, 20);
        e.work();
    }
}
