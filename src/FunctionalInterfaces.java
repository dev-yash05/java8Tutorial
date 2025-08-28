


import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

public class FunctionalInterfaces {
    //Function Practice Questions (10 Questions)
//Function<T, R> takes one argument of type T and returns a value of type R.

//1.Write a lambda expression for a Function that takes an Integer and returns its square.
    Function<Integer, Integer> getSquare = number -> number * number;
//2.Create a Function that takes a String and returns its length.
    Function<String, Integer> getStrLength = str -> str.length();
//3.Implement a Function that takes a Double and converts it to a long by casting.
    Function<Double, Long> toLong = num -> Double.doubleToLongBits(num);
//4.Write a Function that takes a String and returns the String in uppercase.
    Function<String, String > toUpperCase = str -> str.toUpperCase();
//5.Create a Function that takes a String and returns the String with all whitespace removed.
    Function<String, String> removeStrWhitespace = str -> str.replaceAll("\\s", "");
//6.Write a Function that takes a List<Integer> and returns the sum of all elements.
    Function<List<Integer>, Integer> sumOfElements = list -> {
        int sum = 0;
        for(int x : list){
            sum += x;
        }
        return sum;
    };
//7.Implement a Function that takes a String and checks if it's a palindrome, returning Boolean.
    Function<String, Boolean> isStrPalindrome = str -> {
    String cleanedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
    String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    };
//8.Create a Function that takes a LocalDateTime object and returns the month as a String.
//    Function<Objects<LocalDateTime>, String> getMonth = dateAndTime -> {
//        return dateAndTime.toString();
//    };
//9.Write a Function that takes a Double and returns its square root.
    Function<Double, Double> doubleToSqRoot = num -> Math.pow(num, (double) -1/2);
//10.Create a Function that takes a List<String> and returns a new List containing the lengths of each String.
    Function<List<String>, List<Integer>> getStrListLength = strlist -> {
        List<Integer> length = new ArrayList<>();
        for(String str : strlist){
            length.add(str.length());
        }
        return length;
    };

}
