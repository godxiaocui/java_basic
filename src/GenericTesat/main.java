package GenericTesat;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        GenericMethod.addALL(s, "hello", "world", "java");
        System.out.println(s.toString());
    }

}
