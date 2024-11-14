package taller3.televisores;

public class Control {
    private TV tv;
    public void enlazar(TV tv){
        setTv(tv);
        this.tv.setControl(this);
    }
    //metodos para manejar el encendio y apagado.
    public void turnOn(){
        this.tv.turnOn();
    }
    public void turnOff(){
        this.tv.turnOff();
    }
    // control de canales
    public void setCanal(int nCanal){
        this.tv.setCanal(nCanal);
    }
    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }

    //control de volumen
    public void setVolumen(int nVolumen){
        this.tv.setVolumen(nVolumen);
    }
    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }

    //get y set
    public TV getTv(){
        return this.tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
