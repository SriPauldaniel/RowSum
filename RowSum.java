import java.util.Scanner;
public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] arr1 = findRowSum(arr, n, m);
        for(int i=0;i<n;i++) {
            System.out.println(arr1[i]);
        }
        sc.close();
    }

    static int[] findRowSum(int[][] arr,int n,int m) {
        int[] arr1 = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum = 0;
            for(int j=0;j<m;j++) {
                sum += arr[i][j];
            }
            arr1[i] = sum;
        }
        return arr1;
    }
}