package Controller;

import ModelBuku.ModelSepatu;
import View.ViewSepatu;

public class ControllerSepatu {
    ModelSepatu modelSepatu;
    ViewSepatu viewSepatu;

    public ControllerSepatu(ModelSepatu modelSepatu, ViewSepatu viewSepatu) {
        this.modelSepatu = modelSepatu;
        this.viewSepatu = viewSepatu;
    }

    public void ViewAllSepatu(){

        viewSepatu.cetakAllSepatu(modelSepatu.viewSepatu());
    }
    public void insertSepatu(){
        viewSepatu.insertSepatu(modelSepatu);
    }
    public void viewSepatu(){
        viewSepatu.cetaksepatu(modelSepatu);
    }
    public void updateStokSepatu(){
        viewSepatu.updateStokSepatu(modelSepatu);
    }
}
