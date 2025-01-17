package fr.bluechipit.algo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://medium.com/@vivekkadiyanits/java-lead-7-to-10-years-interview-mastery-covered-question-has-asked-in-more-than-9-service-base-d55ffbb0009c
 */
public class Exo1 {
    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();
        exo1.exo1();
        exo1.exo2();
        exo1.exo3();

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
                .map(e -> e.getKey())
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
}
