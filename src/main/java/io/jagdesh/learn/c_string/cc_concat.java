package io.jagdesh.learn.c_string;

public class cc_concat {
    public static void main(String[] args) {
        String str = "Jagdesh";
        str = str.concat(".dev");
        System.out.println("My personal website is : " + str);

        System.out.println("You".concat("'re") + " Welcome");
    }
}
