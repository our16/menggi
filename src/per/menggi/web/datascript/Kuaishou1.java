package per.menggi.web.datascript;

import java.util.Scanner;
import java.util.Stack;

public class Kuaishou1 {

    /**
     * 1*2+(3+3)))(((
     *
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        new Kuaishou1().count(line);
    }
    Stack<Character> stack = new Stack<>();
    public void count(String line){
        int len = line.length();
        int l =0,sum =0,lsum=0,rsum=0;
        while(l < len){
            if(line.charAt(l) == '('){
                stack.push('(');
            }
            if(line.charAt(l) == ')'){
                if(!stack.empty()){
                    sum++;
                    stack.pop();
                }else{
                    rsum++;
                }
            }
            l++;
        }
        lsum = stack.size();

        System.out.println(sum+" "+lsum+" "+rsum);
    }
}
