/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package po23s.model;

import java.util.ArrayList;

/**
 *
 * @author MG-11-04-23
 */
public class Book {
    
    private String Titulo;
    private ArrayList <String> Autores;
    private String Editora;
    private boolean DisponivelPDF;
    private double Valor;
    
    public Book(){
        Autores = new ArrayList<>();
    }

    public Book(String Titulo, String Editora, boolean DisponivelPDF, double Valor) {
        this.Titulo = Titulo;
        this.Editora = Editora;
        this.DisponivelPDF = DisponivelPDF;
        this.Valor = Valor;
        Autores = new ArrayList<>();
    }

    public Book(String Titulo, ArrayList<String> Autores, String Editora, boolean DisponivelPDF, double Valor) {
        this.Titulo = Titulo;
        this.Autores = Autores;
        this.Editora = Editora;
        this.DisponivelPDF = DisponivelPDF;
        this.Valor = Valor;
    }

   
    
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public ArrayList<String> getAutores() {
        return Autores;
    }

    public void setAutores(ArrayList<String> Autores) {
        this.Autores = Autores;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public boolean isDisponivelPDF() {
        return DisponivelPDF;
    }

    public void setDisponivelPDF(boolean DisponivelPDF) {
        this.DisponivelPDF = DisponivelPDF;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return Titulo + " - " + Autores;
    }
    
    
    
    
    
}
