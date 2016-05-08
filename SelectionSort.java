package algorithm;

/**
 * Created by liang on 2016/4/26.
 * ѡ������(Selection sort)Ҳ��һ�ּ�ֱ�۵������㷨��
 * ѡ������Ҳ�ǱȽϼ򵥵�һ�����򷽷���ԭ��Ҳ�Ƚ�������⣬����ð������ıȽϴ�����ͬ��
 * ��ѡ������Ľ�����������ð������ð����������ÿ�αȽ�֮�����Ƚϵ�����Ԫ��˳���������˳���෴��
 * ��Ҫ���н�������ѡ��������ÿ�α���������ֻ��¼������С��һ��Ԫ�ص��±꣬��ȫ���ȽϽ���֮��
 * ����С��Ԫ����δ������ǲ������е���ǰ��һ��Ԫ�ؽ����������ͽ����˽����Ĵ��������������Ч��

 �㷨���裺

 1��������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�á�

 2���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��

 3���ظ��ڶ�����ֱ������Ԫ�ؾ�������ϡ�
 */
public class SelectionSort {
    public static void SelectionSort(int[] a) {
        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int min = i; /* ����ǰ�±궨��Ϊ��Сֵ�±� */

            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */
                    min = j; /* ���˹ؼ��ֵ��±긳ֵ��min */
                }
            }
            if (i != min) {/* ��min������i��˵���ҵ���Сֵ������ */
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
