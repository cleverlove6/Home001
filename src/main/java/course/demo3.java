package course;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class demo3 {
    public static void main(String[] args) {
        // lambda + strea m 阿拉水电费
        ArrayList<String> strings = Lists.newArrayList("a1","a2","a3","b","c","d","d1");
//        String result = strings.stream().map(str->str.toUpperCase()).collect(Collectors.joining("+"));
        String result = strings.stream().filter(str->str.startsWith("a")).map(String::toUpperCase).collect(Collectors.joining("+"));
        System.out.println(result);
    }
}
