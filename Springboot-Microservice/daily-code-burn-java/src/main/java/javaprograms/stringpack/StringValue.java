package javaprograms.stringpack;
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
            System.out.println("s1 != s3");//false
        }
        

        if(s1 == s4){
            System.out.println("s1 = pass ");
        } else {
            System.out.println("s1 = false");//false
        }
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("s1 equalsIgnoreCases3 pass ");//pass
        } else {
            System.out.println("s1 equalsIgnoreCase s3 false");
        }

        if(s1.equalsIgnoreCase(s4)){
            System.out.println("s1 equalsIgnoreCases4 pass ");//pass
        } else {
            System.out.println("s1 equalsIgnoreCases4 false");
        }
        
        String localPrefix = "297"; //1
        String prefix = "297"; //2

        String localPre = new String("297"); //3
        String prefixNew = new String(); //4
        prefixNew = "297";                    /////////////////////////  important
        
        String new1 = new String("Syed");
        String new2 = new String("Syed");
        String new3 = "Syed";    /// string pool
        String new4 = new String("Syed").intern(); // string pool
        String new5 = new String();  
        new5 = "Syed";  // string pool
        System.out.println("new comparisions");
        System.out.println(new1==new2);//false
        System.out.println(new2==new3);//false
        System.out.println(new3==new4);//true
        System.out.println(new4==new5);//true
        System.out.println(new3==new5);//true
        System.out.println(new2==new5);//false
        System.out.println(new2==new4);//false
        
        if (prefix == localPrefix){
            System.out.println("30 Strings are equal" );//true
        } else {
            System.out.println("Strings are different");
        }

        if (prefix == prefixNew){
            System.out.println("prefixNew Strings are equal" );//true
        } else {
            System.out.println("prefixNew Strings are different");
        }

        if (prefix == localPre){
            System.out.println("localPre Strings are equal" );
        } else {
            System.out.println("localPre Strings are different");//false
        }
        
        if (localPre == prefixNew){
            System.out.println("localPreprefixNew Strings are equal" );
        } else {
            System.out.println("localPre prefixNew Strings are different");//false
        }


    }
}