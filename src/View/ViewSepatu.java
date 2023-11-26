package View;

import ModelBuku.ModelSepatu;
import Node.NodeSepatu;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewSepatu {

    public void cetakAllSepatu(ArrayList<NodeSepatu> books){
        for (int i = 0; i<books.size(); i++){
            System.out.println("Kode sepatu : "+books.get(i).kode_sepatu);
            System.out.println("Nama sepatu : "+books.get(i).nama_sepatu);
            System.out.println("ukuran sepatu : "+books.get(i).ukuran);
            System.out.println("Stok sepatu : "+books.get(i).stok_sepatu);
            System.out.println("--------------------------------------------");
        }
    }

    public void insertSepatu(ModelSepatu modelSepatu){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Sepatu: ");
        String NamaSepatu = input.nextLine();
        System.out.println("Masukkan ukuran sepatu: ");
        int ukuran = input.nextInt();
        modelSepatu.insertBook(NamaSepatu, ukuran);
    }

    public void cetaksepatu(ModelSepatu modelSepatu){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan judul buku : ");
        String NamaSepatu = input.nextLine();
        NodeSepatu buku = modelSepatu.searchSepatu(NamaSepatu);
        if (buku != null) {
            System.out.println("Kode Buku : "+buku.kode_sepatu);
            System.out.println("Nama Sepatu : "+buku.nama_sepatu);
            System.out.println("Ukuran : "+buku.ukuran);
        }else {
            System.out.println("data sepatu tidak ditemukan");
        }
    }
    public void updateStokSepatu(ModelSepatu modelSepatu){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan Nama Sepatu : ");
        String NamaSepatu = input.nextLine();
        System.out.println("stok sepatu : ");
        int newstok = input.nextInt();
        modelSepatu.updateStok(newstok,NamaSepatu);
    }
}
