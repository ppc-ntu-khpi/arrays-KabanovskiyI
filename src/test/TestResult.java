package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int[] numbers = new int[100000];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        int excluded = Exercise.count(numbers);
        System.out.println("Кількість номерів, які потрібно виключити: " + excluded);
    }
}
