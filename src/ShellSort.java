public class ShellSort {
    public void sort(int[] a) {
        int len = a.length;
        int dk = len / 2;
        while (dk >= 1) {
            shellSort(a, dk);
            dk /= 2;
        }
    }

    public void shellSort(int[] a, int dk) {
        int len = a.length;
        for (int i = dk; i < len; ++i) {
            if (a[i] < a[i - dk]) {          //若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j = i - dk;
                int x = a[i];           //复制为哨兵，即存储待排序元素
                a[i] = a[i - dk];         //首先后移一个元素
                while (j >= 0 && x < a[j]) {     //查找在有序表的插入位置
                    a[j + dk] = a[j];
                    j -= dk;             //元素后移
                }
                a[j + dk] = x;            //插入到正确位置
            }
            //print(a, n,i );
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 5, 7, 2, 4, 9, 6};
        ShellSort sort = new ShellSort();
        sort.sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

}
