import java.util.List;

public class StreamAPIPractice {
    public static void main(String[] args) {

        //✅ Question 1: Double Each Number
        //
        //Given a list of integers:
        //[2, 4, 6, 8, 10]
        //Use Stream API to create a new list where each number is doubled.
        //Expected Output:
        //[4, 8, 12, 16, 20]

        List<Integer> num = List.of(2,4,6,8,10);
        List<Integer> doubleNum = num.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(doubleNum);

        //✅ Question 2: Convert List of Strings to Uppercase
        //
        //Given a list of names:
        //["alice", "bob", "charlie"]
        //Use Stream API to convert each name to uppercase.
        //Expected Output:
        //["ALICE", "BOB", "CHARLIE"]
        List<String> lowerNames = List.of("alice","bob","charlie");
        List<String> upperNames = lowerNames.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperNames);

        //✅ Question 3: Find the Length of Each String
        //
        //Given a list of words:
        //["apple", "banana", "kiwi"]
        //Use Stream API to create a list of the length of each word.
        //Expected Output:
        //[5, 6, 4]
        List<String> fruits = List.of("apple","banana","kiwi");
        List<Integer> fruitsLength = fruits.stream()
                .map(String::length)
                .toList();
        System.out.println(fruits +" "+ fruitsLength);
        //✅ Question 4: Square Each Number.
        //
        //Given a list of integers:
        //[1, 2, 3, 4, 5]
        //Use Stream API to create a new list of squares of each number.
        //Expected Output:
        //[1, 4, 9, 16, 25]
        List<Integer> nums = List.of(1,2,3,4,5);
        List<Integer> numsSquare = nums.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(nums +" "+ numsSquare);

        //✅ Question 5: Add “Hello” Before Each Name
        //
        //Given a list of names:
        //["john", "mike", "sara"]
        //Use Stream API to create a list like this:
        //["Hello John", "Hello Mike", "Hello Sara"]
        //
        //⚡ Practice Tip:
        //Try these two variations for every question:
        //✔ Create a Stream from a List using .stream()
        //✔ Create a Stream directly using Stream.of()
        //
        //Do you want me to write the solutions for all 5 questions in Java, step-by-step (with explanation), or should I just give hints so you can try first?
        //
        //You said:
        //provide me 10 more questions,
        //ChatGPT said:
        //
        //Here are 10 more beginner-friendly Stream API practice questions focused on map() and toList(), keeping them simple yet slightly more creative:
        List<String> names = List.of("john","mike","sara");
        List<String> greetName = names.stream()
                .map(name -> "Hello "+name)
                .toList();
        System.out.println(greetName);


        //✅ Question 6: Convert Celsius to Fahrenheit
        //
        //Given a list of temperatures in Celsius:
        //[0, 20, 37, 100]
        //Convert each to Fahrenheit using the formula:
        //F = (C * 9/5) + 32
        //Expected Output:
        //[32.0, 68.0, 98.6, 212.0]
        List<Double> tempCelsius = List.of(0.0,20.0,37.0,100.0);
        List<Double> tempFahrenheit = tempCelsius.stream()
                .map(cel -> ((cel * 9 / 5) +32))
                .toList();
        System.out.println(tempFahrenheit);


        //✅ Question 7: Add Exclamation Marks
        //
        //Given a list of words:
        //["wow", "amazing", "java"]
        //Add an exclamation mark (!) at the end of each word.
        //Expected Output:
        //["wow!", "amazing!", "java!"]
        List<String> str = List.of("wow","amazing","java");
        List<String> strUpdated = str.stream()
                .map(string -> string + "!")
                .toList();
        System.out.println(strUpdated);

        //✅ Question 8: Convert List of Integers to Strings
        //
        //Given:
        //[10, 20, 30]
        //Convert each integer into a string with the prefix "Number:".
        //Expected Output:
        //["Number: 10", "Number: 20", "Number: 30"]
        List<Integer> numbers = List.of(10,20,30);
        List<String> numbersStr = numbers.stream()
                .map(n -> "Number: " + n)
                .toList();
        System.out.println(numbersStr);

        //✅ Question 9: Extract First Character of Each String
        //
        //Given a list of names:
        //["apple", "banana", "cherry"]
        //Create a list of their first characters.
        //Expected Output:
        //["a", "b", "c"]
        List<String> charList = fruits.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .toList();
        System.out.println(charList);


        //✅ Question 10: Cube Each Number
        //
        //Given:
        //[1, 2, 3, 4]
        //Return a list of cubes of these numbers.
        //Expected Output:
        //[1, 8, 27, 64]
        List<Integer> numsCube = nums.stream()
                .map(n -> (int) Math.pow(n,3))
                .toList();
        System.out.println(numsCube);


        //✅ Question 11: Convert Strings to Their Length Squared
        //
        //Given:
        //["hi", "hello", "world"]
        //Map each string to the square of its length.
        //Expected Output:
        //[4, 25, 25]
        List<Integer> strLengthSquare = fruitsLength.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(strLengthSquare);


        //✅ Question 12: Prefix Each Name with Its Index
        //
        //Given:
        //["alpha", "beta", "gamma"]
        //Create:
        //["0-alpha", "1-beta", "2-gamma"]
        //(Hint: Use IntStream.range() or a trick inside map().)
//        List<String> strWithIndex = str.stream()
//                .map()
//                .toList();
        


        //✅ Question 13: Reverse Each String
        //
        //Given:
        //["abc", "xyz", "hello"]
        //Return:
        //["cba", "zyx", "olleh"]
        //(Hint: Use StringBuilder or StringBuffer inside map().)



        //✅ Question 14: Convert to Binary Representation
        //
        //Given:
        //[2, 4, 6, 8]
        //Convert each number to its binary string representation.
        //Expected Output:
        //["10", "100", "110", "1000"]



        //✅ Question 15: Calculate Price with GST
        //
        //Given a list of product prices (in ₹):
        //[100, 200, 300]
        //Add 18% GST to each price.
        //Expected Output:
        //[118.0, 236.0, 354.0]



        //✅ Question 16: Extract Last Character of Each Word
        //
        //Given:
        //["java", "stream", "api"]
        //Return:
        //["a", "m", "i"]
    }

}
