/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cientifico;

/**
 *
 * @author Oreki
 */
public class ArticuloCientifico {

    private String nombreA;
    private String autor;
    private String[] palabrasC;
    private String nombreP;
    private int ano;
    private String resumen;

    public ArticuloCientifico(String nombreArticulo, String autor) {
        this.nombreA = nombreA;
        this.autor = autor;
    }

    public ArticuloCientifico(String nombreA, String autor, String[] palabrasC, String nombreP, int ano) {
        this(nombreA, autor);
        this.palabrasC = palabrasC;
        this.nombreP = nombreP;
        this.ano = ano;
    }

    public ArticuloCientifico(String nombreArticulo, String autor, String[] palabrasC, String nombreP, int ano, String resumen) {
        this(nombreArticulo, autor, palabrasC, nombreP, ano);
        this.resumen = resumen;
    }

    public void imprimirArticulo() {
        System.out.println("Nombre: " + nombreA);
        System.out.println("Autor: " + autor);
        System.out.print("Palabras claves: ");
        for (int i = 0; i < palabrasC.length; i++) {
            System.out.print(palabrasC[i]);
            if (i != palabrasC.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Nombre de la publicación: " + nombreP);
        System.out.println("Año: " + ano);
        System.out.println("Resumen: " + resumen);
    }
}
