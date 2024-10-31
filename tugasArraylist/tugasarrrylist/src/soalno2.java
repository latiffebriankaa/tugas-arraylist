import java.util.ArrayList;
import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
        ArrayList<ItemBuah> buah = new ArrayList<>();
        buah.add(new ItemBuah("apel", 35000));
        buah.add(new ItemBuah("jeruk", 50000));
        buah.add(new ItemBuah("mangga", 25000));
        buah.add(new ItemBuah("duku", 15000));
        buah.add(new ItemBuah("semangka", 20000));

        ArrayList<ItemBelanja> daftarBelanja = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("List harga buah:");
                    for (int i = 0; i < buah.size(); i++) {
                        System.out.printf("%d. \t%s\t%d\n", i + 1, buah.get(i).nama, buah.get(i).harga);
                    }
                    System.out.print("Masukkan nomor buah yang ingin dibeli: ");
                    int indexBuah = input.nextInt() - 1;
                    System.out.print("Masukkan jumlah buah yang ingin dibeli: ");
                    int jumlah = input.nextInt();
                    ItemBuah selectedBuah = buah.get(indexBuah);

                    daftarBelanja.add(new ItemBelanja(selectedBuah.nama, jumlah, selectedBuah.harga));
                    break;

                case 2:
                    cetakStruk(daftarBelanja);
                    break;

                case 3:
                    continueShopping = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

    private static void cetakStruk(ArrayList<ItemBelanja> daftarBelanja) {
        int total = 0;
        System.out.println("Daftar Belanja:");
        System.out.println("========================================");
        System.out.println("No.\tNama\tBuah\tJumlah\tHarga\tSubtotal");

        for (int i = 0; i < daftarBelanja.size(); i++) {
            ItemBelanja item = daftarBelanja.get(i);
            int subtotal = item.jumlah * item.harga;
            total += subtotal;
            System.out.printf("%-2d\t%-10s\t%-6d\t%-7d\t%-8d\n", i + 1, item.namaBuah, item.jumlah, item.harga, subtotal);
        }

        int discount = (int) (total * 0.15);
        int totalBayar = total - discount;

        System.out.println("========================================");
        System.out.printf("Total: %d\n", total);
        System.out.printf("Discount (15%%): %d\n", discount);
        System.out.printf("Total bayar: %d\n", totalBayar);
    }

    static class ItemBelanja {
        String namaBuah;
        int jumlah;
        int harga;

        ItemBelanja(String namaBuah, int jumlah, int harga) {
            this.namaBuah = namaBuah;
            this.jumlah = jumlah;
            this.harga = harga;
        }
    }

    static class ItemBuah {
        String nama;
        int harga;

        ItemBuah(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }
    }
}

