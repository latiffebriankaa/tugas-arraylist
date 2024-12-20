public class cek {

    public static void main(String[] args) {
        Main main = new Main();

        // Fibonacci
        int n = 5;
        System.out.println("Fibonacci ke-" + n + ": " + main.fibonacci(n));

        // Mencetak Angka Mundur
        System.out.print("Angka mundur dari " + n + ": ");
        main.printReverse(n);
        System.out.println();

        // Memeriksa Palindrom
        String str = "radar";
        System.out.println("Apakah \"" + str + "\" adalah palindrom? " + main.isPalindrome(str, 0, str.length() - 1));

        // Mencari Elemen dalam Array
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Apakah array mengandung " + target + "? " + main.contains(arr, arr.length, target));

        // Mencari Nilai Maksimum dalam Array
        System.out.println("Nilai maksimum dalam array: " + main.findMax(arr, arr.length));
    }

    // Fungsi untuk menghitung Fibonacci
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Fungsi untuk mencetak angka mundur
    public void printReverse(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }

    // Fungsi untuk memeriksa palindrom
    public boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    // Fungsi untuk mencari elemen dalam array
    public boolean contains(int[] arr, int length, int target) {
        if (length == 0) {
            return false;
        }
        if (arr[length - 1] == target) {
            return true;
        }
        return contains(arr, length - 1, target);
    }

    // Fungsi untuk mencari nilai maksimum dalam array
    public int findMax(int[] arr, int length) {
        if (length == 1) {
            return arr[0];
        }
        return Math.max(arr[length - 1], findMax(arr, length - 1));
    }
}