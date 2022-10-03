package com.cychew.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ali", Gender.MALE, 123));
        employeeList.add(new Employee("Siti", Gender.FEMALE, 456));
        employeeList.add(new Employee("Muthu", Gender.MALE, 789));
        employeeList.add(new Employee("Ah Hock", Gender.MALE, 1111));

        Predicate<Employee> isMale = e -> Gender.MALE.equals(e.getGender());
        Predicate<Employee> lesser500 = e -> e.getId() < 500;

        System.out.println("===Get Male Only===");
        employeeList.forEach(e -> {
            if (isMale.test(e))
                System.out.println(e.toString());
        });

        System.out.println("===Get Male or Id < 500===");
        employeeList.forEach(e -> {
            if (isMale.or(lesser500).test(e))
                System.out.println(e.toString());
        });

        BiPredicate<Gender, Integer> biPredicate =
                (gender, id) -> Gender.MALE.equals(gender) && id < 500;

        System.out.println("===BiPredicate===");
        employeeList.forEach(e -> {
            if (biPredicate.test(e.getGender(), e.getId()))
                System.out.println(e.toString());
        });
    }
}
