import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionalInterfaces {
    //BiFunction Practice Questions (10 Questions)
    //BiFunction<T, U, R> takes two arguments of types T and U and returns a value of type R.
    //
    //1.Write a lambda expression for a BiFunction that takes two Integers and returns their sum.
        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
    //2.Create a BiFunction that takes two Strings and returns a new String that is the concatenation of the two.
        BiFunction<String, String, String> addStr = (str1, str2) -> str1 + str2;
    //3.Implement a BiFunction that takes a String and an Integer and returns a Boolean indicating if the Integer is the length of the String.
        BiFunction<String,Integer, Boolean> isStrLength = (str, length) -> {
            return str.length() == length;
    };
    //4.Write a BiFunction that takes a Double and a Double and returns the larger of the two.
        BiFunction<Double, Double, Double> largestOfTwo = (num1, num2) -> {
            if(num1>num2){
                return num1;
            }else {
                return num2;
            }
    };
    //5.Create a BiFunction that takes a String and a char and returns the count of that character in the String.
        BiFunction<String, Character, Integer> getNoOfChar = (str, character) -> {
        char[] strCharList = str.toCharArray();
        int count = 0;
        for(char c : strCharList){
            if(c == character){
                count++;
            }
        }
        return count;
    };
    //6.Implement a BiFunction that takes a String and a String and checks if the first String contains the second String, returning a Boolean.
        BiFunction<String, String,Boolean> containsStr = (str1, str2) -> {
        return str1.contains(str2);
    };
    //7.Write a BiFunction that takes two Integers and returns their product.
        BiFunction<Integer, Integer, Integer> getProduct = (num1, num2) -> num1 * num2;
    //8.Create a BiFunction that takes a List<String> and an Integer and returns the String at that index.
        BiFunction<List<String>, Integer, String> getStrAt = (strlist, targetStr) -> strlist.get(targetStr);
    //9.Implement a BiFunction that takes a Double and an Integer and returns the Double raised to the power of the Integer.
        BiFunction<Double, Integer, Double> getRaisedToPower = (num, pow) -> Math.pow(num, (double) pow);
    //10.Write a BiFunction that takes a List<String> and another List<String> and returns a new List containing all elements from both.
        BiFunction<List<String>, List<String>, List<String>> mergeTwoStrLists = (list1, list2) -> {
            List<String> list3 = new ArrayList<>();
            for(String str : list1) {
                list3.add(str);
            }
            for(String str : list2){
                list3.add(str);
            }
            return list3;
    };
}
