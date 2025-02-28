package domain;

public class Exercise {
    public static int count(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            String number = Integer.toString(numbers[i]);
            if(number.contains("4") || number.contains("13")){
                count++;
            }
        }
        return count;
    }
}
