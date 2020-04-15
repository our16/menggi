package per.menggi.web.datascript;

import java.util.HashMap;

public class KuaiShou3 {
    public static void main(String[] args) {
        for(String syt:args){
            System.out.println(syt);
        }
        int[] c = {1,8,9,7,5};
        int[] b = {1,5,8,3,6};
        int[] a = new KuaiShou3().WaitInLine(c,b);
        for(int d:a){
            System.out.println(d);
        }
    }

    public int[] WaitInLine (int[] a, int[] b) {

        // write code here
        int len = a.length;
        int[] turn = new int[len];
        HashMap<Integer,Integer> map  = new HashMap();
        for(int i =0; i < len;i++){
            map.put(a[i],i);
        }
        for(int i =0; i < len;i++){
            for(int j=i;j < len;j++){
                if(count(a[i],b[i],i,len) < count(a[j],b[j],j,len)){
                    swap(a,i,j);
                    swap(b,i,j);
                }
            }

        }
        int index = 0;
        for(int i = 0 ;i < len;i++){
            turn[index++] = map.get(a[i])+1;
        }
        return turn;
    }
    private void swap(int[]arr,int j,int i){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private int count(int ai,int bi,int j,int n){
        return ai*(j-1)+bi*(n-j);
    }
}
