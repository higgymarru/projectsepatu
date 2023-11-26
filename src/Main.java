import Controller.ControllerSepatu;
import Database.AllModel;
import View.ViewSepatu;

import java.util.Scanner;

public class Main {
    static  void insertStaticSepatu(){
        AllModel.sepatu.insertBook("Adiddas",40);
        AllModel.sepatu.insertBook("New Balance",43);
    }
    static void menu_utama(){
        Scanner input = new Scanner(System.in);
        ViewSepatu viewsepatu = new ViewSepatu();
        ControllerSepatu controlsepatu = new ControllerSepatu(AllModel.sepatu, viewsepatu);
        System.out.println("Program Toko Sepatu");
        System.out.println();

        int pil_menuUtama = 0;
        while (pil_menuUtama != 6){
            System.out.println("Menu Utama");
            System.out.println("1. Manajemen Sepatu");
            System.out.println("2. Manajemen Pegawai");
            System.out.println("3. Manajemen Anggota");
            System.out.println("4. Transaksi Peminjaman");
            System.out.println("5. Transaksi Pengembalian");
            System.out.println("6. EXIT");
            System.out.println();
            System.out.println("masukkan pilihan anda : ");
            pil_menuUtama = input.nextInt();
            switch (pil_menuUtama){
                case 1:
                    int pil_menuBuku = 0;
                    while (pil_menuBuku != 7)
                    {
                        System.out.println("anda masuk pilihan menu Manajemen Sepeda");
                        System.out.println("");
                        System.out.println("1. Cetak semua daftar sepatu");
                        System.out.println("2. Tambah sepatu");
                        System.out.println("3. Update stok sepatu");
                        System.out.println("4. Update data sepatu");
                        System.out.println("5. Delete sepatu");
                        System.out.println("6. Pencarian sepatu");
                        System.out.println("7. Kembali ke Menu Utama");
                        System.out.println("masukkan pilihan : ");
                        pil_menuBuku = input.nextInt();
                        switch (pil_menuBuku){
                            case 1:
                                System.out.println(" daftar Sepatu ");
                                controlsepatu.ViewAllSepatu();
                                break;
                            case 2:
                                System.out.println(" tambah Sepatu ");
                                controlsepatu.insertSepatu();
                                break;
                            case 3:
                                System.out.println(" update stok sepatu ");
                                controlsepatu.updateStokSepatu();
                                break;
                            case 4:
                                System.out.println(" update data sepatu ");
                                break;
                            case 5:
                                System.out.println(" delete sepatu ");
                                break;
                            case 6:
                                System.out.println(" pencarian sepatu ");
                                controlsepatu.viewSepatu();
                                break;
                            case 7:
                                System.out.println(" kembali ke Menu Utama ");
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("anda masuk pilihan menu Manajemen Pegawai");
                    break;
                case 3:
                    System.out.println("anda masuk pilihan menu Manajemen Anggota");
                    break;
                case 4:
                    System.out.println("anda masuk pilihan menu Transaksi Peminjaman");
                    break;
                case 5:
                    System.out.println("anda masuk pilihan menu Transaksi Pengembalian");
                    break;
                case 6:
                    System.out.println("- EXIT -");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!!");
            }
        }
    }
    public static void main(String[] args) {
        insertStaticSepatu();
        menu_utama();
        /*ModelBuku obj = new ModelBuku();
        obj.insertBook("Laskar Pelangi-1", "andrea hinata");
        obj.insertBook("Laskar Pelangi-2", "andrea hinata");
        ArrayList books = obj.viewBooks();*/

    }
}