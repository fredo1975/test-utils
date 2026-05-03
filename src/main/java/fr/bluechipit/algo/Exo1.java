package fr.bluechipit.algo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://medium.com/@vivekkadiyanits/java-lead-7-to-10-years-interview-mastery-covered-question-has-asked-in-more-than-9-service-base-d55ffbb0009c
 */
public class Exo1 {
    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();
        /*
        exo1.exo1();
        exo1.exo2();
        exo1.exo3();
        exo1.exo4();*/
        exo1.exo5();

    }
    /**
     * Write a program to find the duplicate characters in list of string . Only java stream will be accepted
     */
    public void exo1(){
        Stream<String> str = Stream.of("azerty","querty");
        List<Character> result = str.map(String::chars)
                .flatMap(intStream -> intStream.mapToObj(i -> (char)i))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * Find the duplicate element and its occurrence in a given string ? Only java stream will be accepted ?
     */
    public void exo2(){
        Stream<String> str = Stream.of("azerty","querty");

        List<String> result = str.map(s -> s.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * You have an arrays of zeros (0) and (1) keep all zeros at the left hand side and all 1 to right hand side ?
     * e.g Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]
     */
    public void exo3(){

        Integer array[] = {1,1,0,1,0 };
        List<Integer> result = Arrays.stream(array)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * Find the longest string in a list of strings using Java streams
     */
    public void exo4(){
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
        longestString.ifPresent(System.out::println);
    }

    /**
     * write a programm to detect a palindrome
     */
    public void exo5(){
        String str = "abccba";
        List<Character> l = str.chars().mapToObj(i -> (char)i).collect(Collectors.toList());
        int left=0;
        int right = str.length()-1;
        boolean res = true;
        while(left<right){
            if(!l.get(left).equals(l.get(right))){
                res = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(res);
    }
}
