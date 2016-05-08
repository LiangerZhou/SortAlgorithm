package algorithm;

import java.util.Arrays;

/**
 * ��������
 * @author liang
 * ����������һ�����ֱ�۵������㷨�����Ĺ���ԭ����ͨ�������������У�����δ�������ݣ��������������дӺ���ǰɨ�裬�ҵ���Ӧλ�ò�����

 * �㷨���裺

 * 1������һ���������е�һ��Ԫ�ؿ���һ���������У��ѵڶ���Ԫ�ص����һ��Ԫ�ص�����δ�������С�

 * 2����ͷ��β����ɨ��δ�������У���ɨ�赽��ÿ��Ԫ�ز����������е��ʵ�λ�á�������������Ԫ�������������е�ĳ��Ԫ����ȣ��򽫴�����Ԫ�ز��뵽���Ԫ�صĺ��档��
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
        int insertNote;//Ҫ���������
        //int[] array=arr;

        //������ĵڶ���Ԫ�ؿ�ʼѭ���������е�Ԫ�ز���
        for (i=1;i<array.length;i++)
        {
            //���������еĵ�2��Ԫ��Ϊ��һ��ѭ��Ҫ����������
            insertNote = array[i];
            j=i-1;
            while(j>=0&&insertNote<array[j])
            {
                //���Ҫ������Ԫ��С�ڵ�j��Ԫ��,�ͽ���j��Ԫ������ƶ�
                array[j+1]=array[j];
                j--;
            }
            //ֱ��Ҫ�����Ԫ�ز�С�ڵ�j��Ԫ��,��insertNote���뵽������
            array[j+1]=insertNote;
        }
        //��ӡ����������
        System.out.println(Arrays.toString(array));
        return array;

    }


    public static void InsertSort1(int a[]){
        int length=a.length; //���鳤��
        int j;               //��ǰֵ��λ��
        int i;               //ָ��jǰ��λ��
        int key;             //��ǰҪ���в��������ֵ
        //������ĵڶ���λ�ÿ�ʼ����ֵ
        for(j=1;j<length;j++){
            key=a[j];
            i=j-1;
            //a[i]�ȵ�ǰֵ��ʱ��a[i]����һλ,�ճ�i��λ�ã�������һ��ѭ����ֵ����
            while(i>=0 && a[i]>key){
                a[i+1]=a[i]; //��a[i]ֵ����
                i--;         //iǰ��
            }//����ѭ��(�ҵ�Ҫ������м�λ�û��ѱ�����0�±�)
            a[i+1]=key;    //����ǰֵ����
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
