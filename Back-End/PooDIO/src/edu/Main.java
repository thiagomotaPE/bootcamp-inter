package edu;
public class Main {
    //estudos de poo
    /* aqui estão alguns codigos para treinar e colocar em pratica
     * conceitos baicos de programação orientada a objetos*/
    public static void main(String[] args) {

        Carro chevrolet = new Carro();

        chevrolet.setCor("cinza");
        chevrolet.setModelo("celta");
        chevrolet.setCapacidadeTaque(14.1);

        System.out.println(chevrolet.getModelo());
        System.out.println(chevrolet.getCor());
        System.out.println(chevrolet.getCapacidadeTaque());
        System.out.println(chevrolet.totalValorTanque(4.59));

        Carro ford = new Carro("branca",  "ranger", 10);

        System.out.println(ford.getModelo());
        System.out.println(ford.getCor());
        System.out.println(ford.getCapacidadeTaque());
        System.out.println(chevrolet.totalValorTanque(4.59));
    }
}