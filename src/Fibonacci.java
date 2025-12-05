
import java.util.ArrayList;

public class Fibonacci {
    public static void fib(int num,ArrayList<Integer> l){
        int i = 2;
        int a=0,b=0;
        while(i<num){
            a=l.get(i-1);
            b=l.get(i-2);
            int sum = a+b;
            l.add(sum);
            i++;
        }
        
    }
    public static void main(String[] args) {
        int num = 8;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        fib(num,list);
        System.out.println(list.toString());
    }
}