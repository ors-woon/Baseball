package main.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test logic

        List list = Arrays.asList("hello","world");
        String str = "";
        for(int i = 0; i<list.size(); i++){
            str += list.get(i);
        }
        System.out.println(str.toString());
        // if sonarqube execute, It would announce waring message.
    }
}
