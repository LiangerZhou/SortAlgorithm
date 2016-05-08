package algorithm;

/**
 * Created by liang on 2016/4/25.
 *
 * 冒泡排序（Bubble Sort）也是一种简单直观的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。

 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。

 算法步骤：

 1）比较相邻的元素。如果第一个比第二个大，就交换他们两个。

 2）对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

 3）针对所有的元素重复以上的步骤，除了最后一个。

 4）持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {

    public static void Bubblesort(int[] arr){
        int i,j;
        int t;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void Bubblesort1(int[] values) {

        int temp=0;

        for (int i = 0; i < values.length; i++) {//趟数

            for (int j = 0; j < values.length - i - 1; j++) {//比较次数

                if (values[j] > values[j + 1]) {

                    temp = values[j];

                    values[j] = values[j + 1];

                    values[j + 1] = temp;

                }
            }
        }
    }

    public static void Bubblesort2(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }



    public static void main(String args[]){
        int[] arr={1,3,4,6,2,0,8,7,5};
        BubbleSort.Bubblesort1(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+",");
       }
    }
}
