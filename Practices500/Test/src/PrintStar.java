import java.util.Scanner;

/**
 * 打印五角星
 */
public class PrintStar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入:");
        int n=input.nextInt();
        String[][] arr=new String[4*n-3][6*n-5];
        int triangleLine=3*n-2; //三角行数
        int middle=(6*n-5)/2+1;
        boolean isEmpty=true;
        for(int i=0;i<triangleLine;i++) {
            int finalTraingleLine=4*n-3-i-1;
            arr[i][middle-i-1]="*";
            arr[i][middle+i-1]="*";
            arr[finalTraingleLine][middle-i-1]="*";
            arr[finalTraingleLine][middle+i-1]="*";
            if(i==triangleLine-1) {
                isEmpty=true;
                for(int j=middle-i;j<=middle+i-2;j++) {
                    if(isEmpty) {
                        isEmpty=false;
                    }else {
                        arr[i][j]="*";
                        arr[finalTraingleLine][j]="*";
                        isEmpty=true;
                    }
                }
            }
        }
        for(String[] i : arr) {
            for(String j : i) {
                if(j==null) {
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        input.close();
    }
}

