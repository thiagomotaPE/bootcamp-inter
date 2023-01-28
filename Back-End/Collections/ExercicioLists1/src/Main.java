import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* gato 1 = nome: Jon, idade: 18, cor: preto
* gato 1 = nome: Simba, idade: 6, cor: tigrado
* gato 1 = nome: Jon, idade: 12, cor: amarelo
 */
public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{               //criei uma lista do tipo "Gato" (que é uma classe que eu ja tinha criado anteriormente
            add(new Gato("Jon", 18, "preto"));  // e dentro da propria lista criei o objeto (do tipo gato) passando ja os parametros do construtor
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};



        //mostrando na ordem de inserção
        System.out.println("mostrando na ordem de inserção: ");
        System.out.println(meusGatos);

        //mostrando na ordem aleatoria
        System.out.println("mostrando na ordem aleatoria: ");
        Collections.shuffle(meusGatos);  //faz com que troque a ordem dos elemntos da lista
        System.out.println(meusGatos);   //mostra a lista

        //mostrando na ordem natural(usa o comparable)
        System.out.println("mostrando na ordem natural: ");
        Collections.sort(meusGatos);//o metodo sort compara a lista atravez do comparable
        System.out.println(meusGatos);

        //mostrando por ordem de idade (necessario criar uma classe Comparator)
        System.out.println("mostrando por ordem de idade: ");
        //Collections.sort(meusGatos, new ComparatorIdade()); //<-- a classe que foi criada
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        //mostrando por ordem de cor(usa o comparable)
        System.out.println("mostrando por ordem de cor: ");
        //Collections.sort(meusGatos, new ComparatorCor()); //<-- a classe que foi criada
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        //mostrando por ordem de nome / cor / idade
        System.out.println("mostrando por ordem de nome / cor / idade: ");
        //Collections.sort(meusGatos, new ComparatorAll()); //<-- a classe que foi criada
        meusGatos.sort(new ComparatorAll());
        System.out.println(meusGatos);
    }
}



class Gato implements Comparable<Gato>{//implementei o comparable para comparar objeto gato

    //atributs
    private String nome;
    private int idade;
    private String cor;

    //constructor
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //toString --- caso eu não use o toString quando eu pesquisar o nome na list so vai aparecer o endereço de memoria
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) { //sobrescrevi o metoto para comparar os gatos pelo nome
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}




class ComparatorIdade implements Comparator<Gato> { //classe criada para mostrar os elementos da lista por idade
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> { //classe criada para mostrar os elementos da lista por cor
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorAll implements Comparator<Gato> { //classe criada para mostrar os elementos da lista por Nome, cor, idade
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

        /*essa classe faz com que os gatos primeiros sejam ordenados por nome
        * caso algum nome seja repedito entao o criterio de desempate sera a
        * cor, e caso a cor seja repetida o criterio de desempate sera a idade.*/
    }
}