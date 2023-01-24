package Poo;

public class Carro {

    //atributos da classe
    private String cor;
    private String modelo;
    private int capacidadeTanque;


    //metodo construtor (tem oo mesmo nome que a classe)

    Carro() {
        
    }
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    //metodos
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }


    //getters ad setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTaque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTaque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
