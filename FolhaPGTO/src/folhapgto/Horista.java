/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapgto;

/**
 * NOME: Gustavo Demetrius dos Santos RGM: 11211102302
 * NOME: Lucas dos Santos Reis RGM: 11211100722
 */
public class Horista extends Empregado {

    private double horas;

    // Construtor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    // Metodos de acesso
    public void set_horas(double h) {
        horas = h;
    }

    public double get_horas() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }
}