public class InsertSort {
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 5, 7, 2, 4, 9, 6};
        InsertSort sort = new InsertSort();
        sort.sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
