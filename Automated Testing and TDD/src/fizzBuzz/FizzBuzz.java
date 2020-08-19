package fizzBuzz;

public class FizzBuzz {
    public static String printFizzBuzz(int number) {
        String result = "";
        if (number<1) {
            result = "Wrong number";
        } else {
            boolean isCompletelyDivisibleBy3 = isCompletelyDivisibleBy3(number);
            boolean isCompletelyDivisibleBy5 = isCompletelyDivisibleBy5(number);
            boolean isContain3 = isContain3(number);
            boolean isContain5 = isContain5(number);
            if (isCompletelyDivisibleBy3 && isCompletelyDivisibleBy5) {
                result = "FizzBuzz";
            } else if (isCompletelyDivisibleBy3 || isContain3) {
                result = "Fizz";
            } else if (isCompletelyDivisibleBy5 || isContain5) {
                result = "Buzz";
            } else result = "";
            if (isContain3) {
                result += "Fizz";
            }
            if (isContain5) {
                result += "Buzz";
            }
        }

        return result;
    }

    public static boolean isCompletelyDivisibleBy3(int number) {
        boolean isCompletelyDivisibleBy3 = false;
        String stringNumber = String.valueOf(number);
        int sum = 0;
        for (int i=0; i<stringNumber.length();i++) {
            Character selectedChar = stringNumber.charAt(i);
            String selectedString = Character.toString(selectedChar);
            int selectedNumber = Integer.parseInt(selectedString);
            sum += selectedNumber;
        }
        isCompletelyDivisibleBy3 = sum%3 == 0 ? true : false;
        return isCompletelyDivisibleBy3;
    }

    public static boolean isCompletelyDivisibleBy5(int number) {
        boolean isCompletelyDivisibleBy5 = false;
        String stringNumber = String.valueOf(number);
        int indexOfLastChar = stringNumber.length() - 1;
        Character lastCharacter = stringNumber.charAt(indexOfLastChar);
        String lastElement = Character.toString(lastCharacter);
        Integer lastNumber = Integer.parseInt(lastElement);
        if (lastNumber==0 || lastNumber==5) {
            isCompletelyDivisibleBy5 = true;
        }
        return isCompletelyDivisibleBy5;
    }

    public static boolean isContain3(int number) {
        String stringNumber = String.valueOf(number);
        boolean isContain3 = stringNumber.contains("3");
        return isContain3;
    }

    public static boolean isContain5(int number) {
        String stringNumber = String.valueOf(number);
        boolean isContain5 = stringNumber.contains("5");
        return isContain5;
    }


}
