package edu;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor2 = (Vendedor) new Funcionario(); //não funcionou
        /*o downcast deve ser evitado porque como a atributos na classe filha que serão
        * retiradas para que o objeto tenha só os atributos da classe mae o java não sabe
        * muito bem oque fazer com esses dados que sobraram por isso da erro.*/
    }
}