package Ej6_3;

import javax.swing.JOptionPane;

public class Coche {
    private String matricula;
    private String marca = "SEAT";
    private String modelo = "ALTEA";
    private String color = "blanco";
    private boolean techoSolar = false;
    private double kilometros = 0;
    private int numPuertas = 3;
    private int numPlazas = 5;

    public Coche() {

    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche(int numPuertas, int numPlazas) {
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void avanzar(double kilometros){
        this.kilometros += kilometros;
        JOptionPane.showMessageDialog(null,"has avanzao' "+kilometros+" kilometros"+
                "\n Total km =" +this.kilometros);
    }

    public void tunear(){
        kilometros = 0;
        JOptionPane.showMessageDialog(null,"Cuentakilometros reestablecido"
        + "\n Instalando techo solar");
        techoSolar = true;
    }

    public void tunear(String color){
        //String color;
        JOptionPane.showMessageDialog(null,"Pintando el coche de color " + color);
        this.color = color;
        kilometros = 0;
        JOptionPane.showMessageDialog(null,"Pintando el coche de color \" + color"+"\nCuentakilometros reestablecido"
                + "\n Instalando techo solar");
        techoSolar = true;
    }

    public void matricular(String matricula){
        JOptionPane.showMessageDialog(null,"Matriculando la matricula: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        if (numPlazas > 0 && numPlazas <= 7) {
            this.numPlazas = numPlazas;
        }else{
            JOptionPane.showMessageDialog(null,"El numero de plazas no puede ser mayor a 7");
        }
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        if (numPuertas > 0 && numPuertas <= 5) {
            this.numPuertas = numPuertas;
        }else{
            JOptionPane.showMessageDialog(null,"El numero de puertas no puede ser mayor que 5");
        }
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar)
    {
        this.techoSolar = techoSolar;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
