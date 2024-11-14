package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    public boolean estado;
    private int precio = 500;
    private int volumen = 1;
    private Control control;
    static private int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        addCount();
    }

    // metodos para acceder a la cuenta de televisores.
    public static void setNumTV(int nNumTV) {
        numTV = nNumTV;
    }
    public static int getNumTV() {
        return numTV;
    }
    public void addCount(){
        numTV++;
    }
    public void reduceCount(){
        numTV--;
    }
    // metodos para cambia el estado
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }

    //metodos de cambio de canal y volumen
    public void canalUp(){
        if (this.canal<120) {
            this.setCanal(this.canal + 1);
        }
    }
    public void canalDown(){
        if (this.canal>1) {
            this.setCanal(this.getCanal() - 1);
        }
    }
    public void volumenUp(){
        if (this.volumen<7) {
            this.setVolumen(this.getVolumen() + 1);
        }
    }
    public void volumenDown(){
        if (this.volumen>0) {
            this.setVolumen(this.getVolumen() - 1);
        }
    }

    //set method's
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setMarca(Marca nMarca){
        this.marca = nMarca;
    }
    public void setControl(Control nControl){
        this.control = nControl;
    }
    public void setPrecio(int nPrecio){
        this.precio = nPrecio;
    }

    public void setCanal(int nCanal){
        if (nCanal>=1 && nCanal<=120 && this.estado){
            this.canal = nCanal;
        }
    }
    public void setVolumen(int nVolumen){
        if (nVolumen>=0 && nVolumen<=7 && this.estado) {
            this.volumen = nVolumen;
        }
    }

    // get method's
    public boolean getEstado(){
        return this.estado;
    }
    public Marca getMarca() {
        return marca;
    }
    public int getPrecio() {
        return precio;
    }
    public Control getControl() {
        return control;
    }

    public int getCanal() {
        return canal;
    }
    public int getVolumen() {
        return volumen;
    }
}
