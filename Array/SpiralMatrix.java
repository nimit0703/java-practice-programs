
// import java.io.File;
// import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // spiral print
        int rstart = 0;
        int cstart = 0;
        int rend = row - 1;
        int cend = col - 1;
        System.out.println();

        System.out.println("  Spiral is given as :");
        System.out.println();

        while (rstart <= rend && cstart <= cend) {

            for (int i = cstart; i <= cend; i++) {
                System.out.print(mat[rstart][i] + " ");

            }
            rstart++;

            for (int i = rstart; i <= rend; i++) {
                System.out.print(mat[i][cend] + " ");

            }
            cend--;

            for (int i = cend; i >= cstart; i--) {
                System.out.print(mat[rend][i] + " ");

            }
            rend--;

            for (int i = rend; i >= rstart; i--) {
                System.out.print(mat[i][cstart] + " ");

            }
            cstart++;

            sc.close();

        }

    }
}
