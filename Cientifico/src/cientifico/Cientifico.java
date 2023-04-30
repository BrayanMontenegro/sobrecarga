/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cientifico;

/**
 *
 * @author Oreki
 */
public class Cientifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] palabrasC = {"Artículo", "Científico", "Java"};
        ArticuloCientifico articulo = new ArticuloCientifico("Cómo modelar un artículo científico", "Elizabeth castillo", palabrasC, "Revista de Ciencias", 2023, "En este artículo se explica cómo modelar un artículo científico.");
        articulo.imprimirArticulo();
    }
}
