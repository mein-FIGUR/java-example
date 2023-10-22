package org.example.examples;

import java.util.List;

public class StreamMatch {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean anyMatchNumberOver3 = nums.stream().anyMatch(n -> {
            System.out.print(n + " ");
            return n > 3;});
        System.out.println("\nAny match number over 3 = " + anyMatchNumberOver3);
        // Any match number over 3 = true
        boolean anyMatchNumberOver10 = nums.stream().anyMatch(n -> {
            System.out.print(n + " ");
            return n > 10;});
        System.out.println("\nAny match number over 10 = " + anyMatchNumberOver10);
        // Any match number over 10 = false


        boolean allMatchNumberOver9 = nums.stream().allMatch(n -> {
            System.out.print(n + " ");
            return n > 9;});
        System.out.println("\nAll match number over 9 = " + allMatchNumberOver9);
        // All match number over 9 = false
        boolean allNumbersOver0 = nums.stream().allMatch(n -> {
            System.out.print(n + " ");
            return n > 0;});
        System.out.println("\nAll match number over 0 = " + allNumbersOver0);
        // All match number over 0 = true

        boolean noneMatchNumberOver7 = nums.stream().noneMatch(n -> {
            System.out.print(n + " ");
            return n > 7;});
        System.out.println("\nNone match number over 7 = " + noneMatchNumberOver7);
        // None match number over 9 = false
        boolean noneMatchNumberOver10 = nums.stream().noneMatch(n -> {
            System.out.print(n + " ");
            return n > 10;});
        System.out.println("\nNone match number over 10 = " + noneMatchNumberOver10);
        // None match number over 10 = true

    }

}
