package per.menggi.web.datascript;

import java.util.Arrays;

public class BigTopHeap {
    public static void main(String[] args) {
        BigTopHeap bigTopHeap = new BigTopHeap();
        int [] a = {5,4,3,6,1,7,1,5,23,5,8,56};
        //构建大顶堆
        for(int i =a.length/2;i>=0;i--){
            bigTopHeap.cerate(a,i,a.length);
        }

        for(int i = a.length-1;i>0;i--){
            //堆顶和末尾交换
            bigTopHeap.swap(a,0,i);
            //重新调整
            bigTopHeap.cerate(a,0,i);
        }
        System.out.println(Arrays.toString(a));
    }
    private void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void cerate(int[] arr,int i,int len){
        //暂存当前节点
        int temp = arr[i];
        //大数上浮
        for(int k = 2*i;k<len;k=2*k){
            if(k+1<len &&arr[k] < arr[k+1]){
                k++;
            }

            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                //没有变化
                break;
            }

        }
        //小数下沉到指定位置
        arr[i] = temp;

    }
}
