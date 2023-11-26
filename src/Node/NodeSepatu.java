package Node;

public class NodeSepatu {
    public int kode_sepatu;
    public String nama_sepatu;
    public int stok_sepatu;
    public int ukuran;

    public NodeSepatu(int kode_sepatu, String nama_sepatu, int ukuran) {
        this.kode_sepatu = kode_sepatu;
        this.nama_sepatu = nama_sepatu;
        this.ukuran = ukuran;
    }

    public void updateStok(int newStok){
        this.stok_sepatu = this.stok_sepatu + newStok;
    }
}