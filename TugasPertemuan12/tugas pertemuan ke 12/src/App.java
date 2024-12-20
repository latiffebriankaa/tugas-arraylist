public class App {
    
    private static void sumofthree(int n,int a,int b,int c ){
        if(n==0)
        return;
        else {
        System.out.print(a + " ");
        sumofthree(n-1, b, c,a+b+c);
        }
    }

    private static void fibonaci(int n,int a,int b ){
        if(n==0)
        return;
        else {
        System.out.print(a + " ");
        fibonaci(n-1, b,a+b);
        }
    }

    private static void hitungmundur(int n) {
        if (n < 1) return ; 
        else {
            System.out.print(n + " ");
            hitungmundur(n-1);
        }
    }

    private static boolean cekpalindrom(String str ,int start , int end){
        if ( start >= end ) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return cekpalindrom(str, start + 1 , end-1 );
    }

    private static boolean mencarielemen ( int[]arr, int n ,int target ){
        if (n == 0){return false;
        }
        if (arr[n - 1 ] == target) {
            return true;
        }
        return mencarielemen(arr, n-1, target);
    }

    private static int mencarimax(int[]arr,int n){
        if (n == 1){
            return arr [0];
        }
        return Math.max(arr[n-1], mencarimax(arr, n-1));
    }

    public static void main(String[] args) throws Exception {
        //sum of three
        sumofthree(6, 1, 1, 1);

        System.out.println();
        //fibonaci 

        fibonaci(5, 0, 1);
        System.out.println();

        //cetak angka mundur 
        hitungmundur(6);
        System.out.println( );

        // cek palindrome
        String str = "apa";
        System.out.println(cekpalindrom(str, 0, str.length() -1 ));

        //mencari elemen array 
        int[]arr = {1,3,5,6,7,10};
        int target = 5;
        System.out.println(mencarielemen(arr, target, target));

        //mencari nilai max 
        System.out.println(mencarimax(arr, arr.length));
    }
}
