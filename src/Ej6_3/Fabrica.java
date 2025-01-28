package Ej6_3;

import javax.swing.JOptionPane;

public class Fabrica {
    public static void main(String[] args) {
        Coche car1 = new Coche();
        car1.setMatricula("1234-DF");
        car1.setMarca("Seat");
        car1.setModelo("Toledo");
        car1.setColor("azul");
        car1.setTechoSolar(false);
        car1.setKilometros(200);

        Coche car2 = new Coche("5678-AG");
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.setColor("rojo");
        car2.setTechoSolar(true);
        car2.setKilometros(300);
        car2.setNumPlazas(2);

        Coche car3 = new Coche(5,5);
        car3.setMatricula("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("gris");
        car3.setTechoSolar(false);
        car3.setKilometros(400);
        car2.setNumPuertas(5);

        Coche car4 = new Coche("VW","Caddy","blanco");
        car4.setMatricula("3456-XS");
        car4.setTechoSolar(true);
        car4.setKilometros(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);


        Coche[] Catalogo = new Coche[4];
        Catalogo[0] = car1;
        Catalogo[1] = car2;
        Catalogo[2] = car3;
        Catalogo[3] = car4;
        int cont=1;
        for(Coche cocheActual :Catalogo) {
            JOptionPane.showMessageDialog(null, "Coche: "+cont+"\n"+caracteristicas(cocheActual));
            cont++;
        }

    }

    public static String caracteristicas(Coche coches){
        return "Matricula: " + coches.getMatricula() + "\n"+
               "Marca: " + coches.getMarca() + "\n"+
               "Modelo: " + coches.getModelo() + "\n"+
               "Color: " + coches.getColor() + "\n"+
               "Techo solar: " + (coches.isTechoSolar() ? "SI" : "NO") + "\n"+
               "kilómetros: " + coches.getKilometros() + "\n"+
               "Numero Puertas: " + coches.getNumPuertas() + "\n"+
               "Numero Plazas " + coches.getNumPlazas() + "\n";
    }
}