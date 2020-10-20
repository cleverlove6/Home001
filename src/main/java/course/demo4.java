package course;
import java.util.function.Consumer;
import java.util.function.Function;

public class demo4 {
    public static void main(String[] args) {
        testFunction();
        testConsumer();
        testFunc();
    }

    public static void testFunction(){
        Function<String,String> function = s -> s.toUpperCase();
        String funcResp = function.apply("asdf");
        System.out.println(funcResp);
    }

    public static void testConsumer(){
        Consumer<String> consumer = s -> {
            int length = s.length();
            System.out.println(length);
        };
        consumer.accept("aaaa");
    }

    public static void testFunc(){
        Function<String,Integer> str = s -> s.length();
        Integer strLen = str.apply("asdf");
        System.out.println(strLen);
    }
}
