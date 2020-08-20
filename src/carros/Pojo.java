

package carros;

import javax.swing.JOptionPane;

public class Pojo {
    private int matricula;
    private String marca;
    private int modelo;
    private float precio;
    private boolean estado;

    public Pojo(int matricula, String marca, int modelo, float precio, boolean estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estado = estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }
    public void getInfo(){
        String dat="";
        dat+="The cars information is:\n";
        dat+="License Plate: "+matricula+"\n";
        dat+="Brand: "+marca+"\n";
        dat+="Model: "+modelo+"\n";
        dat+="Price: "+precio+"\n";
        if(estado){
            dat += "Estate : Sold \n";
        }else{
            dat += "Estate : Available for sale \n";
        }
       
        JOptionPane.showMessageDialog(null, dat);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
