package hello.core.javaStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public void stream(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();
        System.out.println("intStream = " + intStream.collect(Collectors.toList()));
//        intStream.forEach(System.out::println);

        for(Integer a : list){
            System.out.println("a = " + a);
        }

        Stream<Integer> intStream1 = list.stream();
        intStream1.forEach(System.out::println);

    }
}
