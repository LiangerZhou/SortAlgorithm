package algorithm;

/**
 * Created by liang on 2016/4/26.
 * ϣ������Ҳ�Ƶݼ����������㷨���ǲ��������һ�ָ���Ч�ĸĽ��汾����ϣ�������Ƿ��ȶ������㷨��

 ϣ�������ǻ��ڲ�������������������ʶ�����Ľ������ģ�

 ���������ڶԼ����Ѿ��ź�������ݲ���ʱ��Ч�ʸߣ������Դﵽ���������Ч�ʡ�

 ����������һ����˵�ǵ�Ч�ģ����������ÿ��ֻ�ܽ������ƶ�һλ��

 ϣ������Ļ���˼���ǣ��Ƚ�����������ļ�¼���зָ��Ϊ���������зֱ����ֱ�Ӳ������򣬴����������еļ�¼����������ʱ���ٶ�ȫ���¼��������ֱ�Ӳ�������

 �㷨���裺

 1��ѡ��һ����������t1��t2������tk������ti>tj��tk=1��

 2�����������и���k�������н���k ������

 3��ÿ�����򣬸��ݶ�Ӧ������ti�����������зָ�����ɳ���Ϊm �������У��ֱ�Ը��ӱ����ֱ�Ӳ������򡣽���������Ϊ1 ʱ������������Ϊһ�������������ȼ�Ϊ�������еĳ��ȡ�
 */
public class ShellSort {

    //�Ӵ�С��
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

    //��С��������
    public static void shellSort1(int[] arr) {
        int j;
        int len = arr.length;
        for(int val=len>>1; val>0; val>>=1) {
        //�����ǶԱ��ε����з�����ֱ�Ӳ�������
            for(int i=val; i<len; i++) {
                int temp = arr[i];
				/*
				 * Ϊʲôÿ�ζ���temp�Ƚ��أ�
				 * ��Ϊֱ�Ӳ�������ҵ�temp�ĺ���λ�á�
				 * Ϊʲôtemp<arr[j-val]����������Է���for���أ�
				 * ��Ϊԭ�������������Ѿ������ҵ�λ�þ�ֹͣ���ǡ�
				 * ��������ȥ��ֱ�Ӳ�������ɡ�
				 */
                for(j=i; j>=val&&temp<arr[j-val]; j-=val) {
					/*
					 * Ϊʲô��arr[j-val]����arr[j]�أ�
					 * ��Ϊj=i��ʼ�ģ�����������j>=val&&temp<arr[j-val]
					 */
                    arr[j] = arr[j-val];
                }
				/*
				 * ע�ⲻ��arr[i] = temp
				 * ֱ�Ӳ�������Ҳ�������ġ�
				 * Ϊʲô�أ�
				 * ��Ϊj��λ�ã�i�Ǵ�����Ԫ��
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
