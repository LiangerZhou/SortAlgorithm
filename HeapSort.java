package algorithm;

/**
 * Created by liang on 2016/5/1.
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。

 堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。

 堆排序的平均时间复杂度为Ο(nlogn) 。

 算法步骤：

 1）创建一个堆H[0..n-1]；

 2）把堆首（最大值）和堆尾互换；

 3）把堆的尺寸缩小1，并调用shift_down(0),目的是把新的数组顶端数据调整到相应位置；

 4） 重复步骤2，直到堆的尺寸为1。
 */
public class HeapSort {

        public static void swap(int[] data, int i, int j) {
            if (i == j) {
                return;
            }
            data[i] = data[i] + data[j];
            data[j] = data[i] - data[j];
            data[i] = data[i] - data[j];
        }

        public static void heapSort(int[] data) {
            for (int i = 0; i < data.length; i++) {
                createMaxdHeap(data, data.length - 1 - i);
                swap(data, 0, data.length - 1 - i);
                print(data);
            }
        }

        public static void createMaxdHeap(int[] data, int lastIndex) {
            for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
                // 保存当前正在判断的节点
                int k = i;
                // 若当前节点的子节点存在
                while (2 * k + 1 <= lastIndex) {
                    // biggerIndex总是记录较大节点的值,先赋值为当前判断节点的左子节点
                    int biggerIndex = 2 * k + 1;
                    if (biggerIndex < lastIndex) {
                        // 若右子节点存在，否则此时biggerIndex应该等于 lastIndex
                        if (data[biggerIndex] < data[biggerIndex + 1]) {
                            // 若右子节点值比左子节点值大，则biggerIndex记录的是右子节点的值
                            biggerIndex++;
                        }
                    }
                    if (data[k] < data[biggerIndex]) {
                        // 若当前节点值比子节点最大值小，则交换2者得值，交换后将biggerIndex值赋值给k
                        swap(data, k, biggerIndex);
                        k = biggerIndex;
                    } else {
                        break;
                    }
                }
            }
        }

        public static void print(int[] data) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + "\t");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int[] data5 = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        print(data5);
        heapSort(data5);
        System.out.println("堆排序后的数组：");
        print(data5);
    }
}
