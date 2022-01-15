import java.util.*;

public class Transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int mat[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }

        }
        System.out.println();
        System.out.println();


        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
