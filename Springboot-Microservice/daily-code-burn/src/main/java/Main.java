import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        String localPrefix = "297"; //1
        String prefix = "297"; //2

        String localPre = new String("297"); //3
        String prefixNew = new String(); //4
        prefixNew = "297";
        if (prefix == localPrefix){
            System.out.println("Strings are equal" );
        } else {
            System.out.println("Strings are different");
        }

        if (prefix == localPre){
            System.out.println("localPre Strings are equal" );
        } else {
            System.out.println("localPre Strings are different");
        }

        if (prefix == prefixNew){
            System.out.println("prefixNew Strings are equal" );
        } else {
            System.out.println("prefixNew Strings are different");
        }

        if (localPre == prefixNew){
            System.out.println("localPreprefixNew Strings are equal" );
        } else {
            System.out.println("localPre prefixNew Strings are different");
        }


        // String created using String literal
        String s1 = "TAT";
        String s2 = "TAT";

        // String created using 'new' keyword
        String s3 = new String("TAT");
        String s4 = new String("TAT").intern();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        if(s1 == s3){
            System.out.println("s1 == s3 pass ");
        } else {
            System.out.println("s1 == s3 false");
        }

        if(s1 == s4){
            System.out.println("s1 = pass ");
        } else {
            System.out.println("s1 = false");
        }
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("s1 equalsIgnoreCases3 pass ");
        } else {
            System.out.println("s1 equalsIgnoreCase s3 false");
        }

        if(s1.equalsIgnoreCase(s4)){
            System.out.println("s1 equalsIgnoreCases4 pass ");
        } else {
            System.out.println("s1 equalsIgnoreCases4 false");
        }



        //creating two matrices
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};

//creating another matrix to store the sum of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns

//adding and printing addition of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];    //use - for subtraction
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }

        List<String> str = new ArrayList<String>();
        str.add("Syed");
        str.add("Syed1");
        str.add("Syed2");


    }

}
