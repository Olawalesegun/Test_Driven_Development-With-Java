public class NestedLoops {
    public static void main(String[] args){
        int n = 10;
        int i;
        for(i=1; i<=n; i++){
            int j;
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing a Left Sided Triangle
        for(i=1; i<=n; i++){
            int j;
            for(j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Printing Right Sided Triangle
        for(i=1; i<=n; i++){
            int j;
            for(j=i; j<=n; j++){
                System.out.print("  ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //RIght SIDED TRAINGLE
        for(i=1; i<=n; i++){
            int j;
            for(j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; i<=n; i++){
            int j;
            for(j=1; j<=n; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        //Real Tree( UPSIDE DOWN TRIANGLE)
        for(i=1; i<=n; i++){
            int j;
            for(j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Triangle to the Right
        for (i=1; i<=n; i++){
            int j;
            for(j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Diagonal Line from the Left
        for(i=1; i<=n; i++){
            int j;
            for(j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(j=i; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Tree Upside Down (Real Triangle)
        for (i=1; i<=n; i++) {
            int j;
            for(j=i; j<=n; j++) {
                System.out.print("  ");
            }
            for(j=1; j<i; j++) {
                System.out.print("* ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Printing 1 to 5
        for(i=1; i<=n; i++){
            int j;
            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
                System.out.println();
        }

        int a=3;
        int b=5;
        int c;
        System.out.println(a);
        System.out.println(b);
        c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int q=10;
        int l;
        int z = 0;
        int r = 1;
        int p=0;
        for(l=0; l<=q; l++){
            p = z+r;
            System.out.print(p);
            z=r;
            r = p;
        }

       // for(l=0; l<=q; l++){
            z = p + r;
            p = r + z;
            r = z + p;
            System.out.printf("%d  %d %d", z, p, r);

       // }


       // for(i=1; i<=n; i++){
       //     int j;
        //    for(j)
       // }
    }
}