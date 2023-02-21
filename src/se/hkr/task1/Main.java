package se.hkr.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Manager(
                1, "John", "R&D", 100000, new String[]{"PPG Signal", "Thorax Signal"});
        Employee employee2 = new Tester(
                2, "Anna", "R&D",80000, new String[]{"Selenium", "TestingWhiz", "Ranorex"});
        Employee employee3 = new Developer(
                3, "Rickard", "R&D", 10, "Quantum Computer Algorithms");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        main.printEmployees(employees);
    }

    private void printEmployees(ArrayList<Employee> employees){

        for (Employee e :
                employees) {
            if (e instanceof Manager) {
                System.out.printf("%s is Manager!\n", e.getName());
            }
            else if (e instanceof Tester) {
                System.out.printf("%s is Tester!\n", e.getName());
            }
            else if (e instanceof Developer) {
                System.out.printf("%s is Developer!\n", e.getName());
            }
            e.work();

        }
    }
}