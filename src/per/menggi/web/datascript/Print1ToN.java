package per.menggi.web.datascript;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        char[] str = new char[n];
        print(str,0);
    }

    public static void print(char[] str,int level){
        if(level == str.length){
            printNum(str);
            return;
        }
        for(int i =0; i < 10;i++){
            str[level] = (char)(i+'0');
            print(str,level+1);
        }
    }

    private static void printNum(char[] str){
        int index =0,len = str.length ;
        while(index < len){
            if(str[index] != '0') break;
                index++;
        }
        while(index < len){
            System.out.print(str[index++]);
        }
        System.out.println();
    }
}
