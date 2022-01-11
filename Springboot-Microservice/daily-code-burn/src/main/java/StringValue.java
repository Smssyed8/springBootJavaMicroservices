import java.io.*;

class StringValue {
    public static void main(String[] args) {
        // String created using String literal
        String s1 = "TAT";
        String s2 = "TAT";

        // String created using 'new' keyword
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        if(s1 == s3){
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 == s3");
        }
    }
}