package ModelBuku;

import Node.NodeSepatu;

import java.util.ArrayList;

public class ModelSepatu {
    public ArrayList<NodeSepatu> sepatu;
    private int kode_update = -1;

    public ModelSepatu() {
        this.sepatu = new ArrayList<>();
    }
    public void insertBook(String namasepatu, int ukuran){
        this.kode_update++;
        this.sepatu.add(new NodeSepatu(this.kode_update, namasepatu, ukuran));
    }
    public ArrayList<NodeSepatu> viewSepatu(){
        return sepatu;
    }
    public void updateStok(int newstok, String namasepatu){
        NodeSepatu sepatu = searchSepatu(namasepatu);
        sepatu.updateStok(newstok);
    }
    public NodeSepatu searchSepatu(String namasepatu){
        NodeSepatu buku = null;
        for (int i = 0; i<sepatu.size(); i++){
            if (namasepatu.equals(sepatu.get(i).nama_sepatu)){
                buku = sepatu.get(i);
            }
        }
        return buku;
    }
}
