package com.cychew.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Consumer {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ali", Gender.MALE, 123));
        employeeList.add(new Employee("Siti", Gender.FEMALE, 456));
        employeeList.add(new Employee("Muthu", Gender.MALE, 789));
        employeeList.add(new Employee("Ah Hock", Gender.MALE, 1111));

        //print employee
        java.util.function.Consumer<Employee> printEmployee = e -> System.out.println(e.toString());

        System.out.println("===Consumer forEach===");
        employeeList.stream().forEach(printEmployee);

        System.out.println("===Consumer chain===");
        java.util.function.Consumer<Employee> printName = e -> System.out.println(e.getName());
        java.util.function.Consumer<Employee> printGender = e -> System.out.println(e.getGender());
        //print name and follow by gender
        printName
                .andThen(printGender)
                .accept(new Employee("Ah Ming", Gender.MALE, 2222));

        System.out.println("===BiConsumer===");
        //take two parameter
        BiConsumer<Employee, String> biConsumer = (e, g) -> {
                System.out.println("Department -> " + g);
                System.out.println("Employee -> " + e);
            };

        //print first employee with department
        biConsumer.accept(employeeList.get(0), "IT");
    }
}
