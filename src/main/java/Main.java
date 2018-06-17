import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test logic

        List list = Arrays.asList("hello","world");

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //
        // if sonarqube execute, It would announce waring message.
    }
}
