
public class StringCalculator {

    int add(String numbers){
    if(numbers != ""){
        int result = 0;
        String [] arrayOfNumbers = numbers.split(",");
        for (String number : arrayOfNumbers){
            Integer intNumber;
            intNumber = Integer.valueOf(number);
            result += intNumber;
        }
    }
        return 0;
    }
}
