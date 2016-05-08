package algorithm;

import java.util.Arrays;

/**
 * 插入排序
 * @author liang
 * 插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入

 * 算法步骤：

 * 1）将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。

 * 2）从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 *
 */
public class InsertSort
{
    public static int[] InsertSort(int[] array)
    {
        if(array == null || array.length < 2){
            return array;
        }
        int i,j;
        int insertNote;//要插入的数据
        //int[] array=arr;

        //从数组的第二个元素开始循环将数组中的元素插入
        for (i=1;i<array.length;i++)
        {
            //设置数组中的第2个元素为第一次循环要播讲的数据
            insertNote = array[i];
            j=i-1;
            while(j>=0&&insertNote<array[j])
            {
                //如果要播讲的元素小于第j个元素,就将第j个元素向后移动
                array[j+1]=array[j];
                j--;
            }
            //直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            array[j+1]=insertNote;
        }
        //打印排序后的数组
        System.out.println(Arrays.toString(array));
        return array;

    }


    public static void InsertSort1(int a[]){
        int length=a.length; //数组长度
        int j;               //当前值的位置
        int i;               //指向j前的位置
        int key;             //当前要进行插入排序的值
        //从数组的第二个位置开始遍历值
        for(j=1;j<length;j++){
            key=a[j];
            i=j-1;
            //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移
            while(i>=0 && a[i]>key){
                a[i+1]=a[i]; //将a[i]值后移
                i--;         //i前移
            }//跳出循环(找到要插入的中间位置或已遍历到0下标)
            a[i+1]=key;    //将当前值插入
        }
    }


    public static void main(String[] args)
    {
        int[] arr= new int[]{800,9,3,6,12,54,35,411,3,245,1,0,4};
        InsertSort.InsertSort1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
    }
}
