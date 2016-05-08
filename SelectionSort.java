package algorithm;

/**
 * Created by liang on 2016/4/26.
 * 选择排序(Selection sort)也是一种简单直观的排序算法。
 * 选择排序也是比较简单的一种排序方法，原理也比较容易理解，它与冒泡排序的比较次数相同，
 * 但选择排序的交换次数少于冒泡排序。冒泡排序是在每次比较之后，若比较的两个元素顺序与待排序顺序相反，
 * 则要进行交换，而选择排序在每次遍历过程中只记录下来最小的一个元素的下标，待全部比较结束之后，
 * 将最小的元素与未排序的那部分序列的最前面一个元素交换，这样就降低了交换的次数，提高了排序效率

 算法步骤：

 1）首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。

 2）再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。

 3）重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void SelectionSort(int[] a) {
        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int min = i; /* 将当前下标定义为最小值下标 */

            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) { /* 如果有小于当前最小值的关键字 */
                    min = j; /* 将此关键字的下标赋值给min */
                }
            }
            if (i != min) {/* 若min不等于i，说明找到最小值，交换 */
                int tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
            }
        }
    }

    public static void main(String args[]){
        int[] arr={1,3,5,2,8,4,0,9,7,6};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
