package helloword.Ch01_Introduction;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by User on 14.07.2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int x=3;
        while (x>0){
            if (x>2){
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x=x-1;
            }
        }
        System.out.println("Hello world");
        System.out.println("Изменение 1");
    }
}