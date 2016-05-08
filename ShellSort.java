package algorithm;

/**
 * Created by liang on 2016/4/26.
 * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。但希尔排序是非稳定排序算法。

 希尔排序是基于插入排序的以下两点性质而提出改进方法的：

 插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率。

 但插入排序一般来说是低效的，因插入排序每次只能将数据移动一位。

 希尔排序的基本思想是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。

 算法步骤：

 1）选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；

 2）按增量序列个数k，对序列进行k 趟排序；

 3）每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {

    //从大到小排
    public static void shellSort(int[] data) {
        int j;
        int temp;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i; j >= increment; j -= increment) {
                    if(temp > data[j - increment]){
                        data[j] = data[j - increment];
                    }else{
                        break;
                    }
                }
                data[j] = temp;
            }
        }
    }

    //从小到大排序
    public static void shellSort1(int[] arr) {
        int j;
        int len = arr.length;
        for(int val=len>>1; val>0; val>>=1) {
        //下面是对本次的所有分组做直接插入排序
            for(int i=val; i<len; i++) {
                int temp = arr[i];
				/*
				 * 为什么每次都用temp比较呢？
				 * 因为直接插入就是找到temp的合适位置。
				 * 为什么temp<arr[j-val]这个条件可以放在for内呢？
				 * 因为原来的组内数据已经有序，找到位置就停止便是。
				 * 不甚理解的去看直接插入排序吧。
				 */
                for(j=i; j>=val&&temp<arr[j-val]; j-=val) {
					/*
					 * 为什么是arr[j-val]不是arr[j]呢？
					 * 因为j=i开始的，而且条件是j>=val&&temp<arr[j-val]
					 */
                    arr[j] = arr[j-val];
                }
				/*
				 * 注意不是arr[i] = temp
				 * 直接插入排序也是这样的。
				 * 为什么呢？
				 * 因为j是位置，i是待插入元素
				 */
                arr[j] = temp;
            }
        }
    }

    public static void main(String args[]){
        int[] arr={1,3,5,2,8,4,0,9,7,6};
        shellSort1(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
