package app;

import java.util.Scanner;

public class Matrices2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int c,d,m,n;
        
        int first[][] = new int[][];
        int second[][] = new int[][];
        int sum[][] = new int [][];

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                first[c][d]=m;
                m++;
                second[c][d]=n;
                n--;
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(first[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(second[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                sum[c][d]=first[c][d]+second[c][d];
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(sum[c][d]+"\t");
            }
            System.out.println();
        }

    }
}