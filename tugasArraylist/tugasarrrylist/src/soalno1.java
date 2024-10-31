import java.util.ArrayList;
import java.util.Scanner;

public class soalno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();
        double totalNilai = 0;

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            nama.add(input.nextLine());
            System.out.print("Nilai: ");
            nilai.add(input.nextInt());
            input.nextLine(); 
            totalNilai += nilai.get(i);
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < jumlahData; i++) {
            String status = nilai.get(i) >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "\t" + nama.get(i) + "\t" + nilai.get(i) + "\t" + status);
        }

        System.out.println("================================");
        double rataRata = totalNilai / jumlahData;
        System.out.println("Jumlah: " + totalNilai);
        System.out.printf("Nilai Rata-rata: %.1f\n", rataRata);
        
        input.close();
    }
}
