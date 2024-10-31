import java.util.ArrayList;

class Mahasiswa {
    String nama;
    double nilai;
    int no;
    String status;

    public Mahasiswa(int no, String nama, double nilai, String status) {
        this.no = no;
        this.nama = nama;
        this.nilai = nilai;
        this.status = status;
    }
}

public class soalno11 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        mhs.add(new Mahasiswa(1, "santi", 100, "lulus"));
        mhs.add(new Mahasiswa(2, "aldi", 50, "tidak lulus"));
        mhs.add(new Mahasiswa(3, "riko", 100, "lulus"));
        mhs.add(new Mahasiswa(4, "rahmi", 90, "lulus"));
        mhs.add(new Mahasiswa(5, "koko", 50, "tidak lulus"));

        System.err.println("no\tNama\tnilai\tstatus");
        System.out.println("=========================================");
        double totalNilai = 0;

        for (Mahasiswa s : mhs) {
            System.out.println(s.no + "\t" + s.nama + "\t" + s.nilai + "\t" + s.status);
            totalNilai += s.nilai;
        }

        System.out.println("=========================================");
        System.out.println("jumlah : " + totalNilai);
        double rataRata = totalNilai / mhs.size();
        System.out.printf("nilai rata-rata : %.1f\n", rataRata);
    }
}

