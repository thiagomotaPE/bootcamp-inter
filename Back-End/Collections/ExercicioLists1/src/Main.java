import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* gato 1 = nome: Jon, idade: 18, cor: preto
* gato 1 = nome: Simba, idade: 6, cor: tigrado
* gato 1 = nome: Jon, idade: 12, cor: amarelo
 */
public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{               //criei uma lista do tipo "Gato" (que é uma classe que eu ja tinha criado anteriormente
            add(new Gato("Jon", 18, "preto"));   // e dentro da propria lista criei o objeto (do tipo gato) passando ja os parametros do construtor
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        //mostrando na ordem de inserção
        System.out.println(meusGatos);

        //mostrando na ordem aleatoria
        Collections.shuffle(meusGatos);  //faz com que troque a ordem dos elemntos da lista
        System.out.println(meusGatos);   //mostra a lista

        //mostrando na ordem natural
        Collections.sort(meusGatos);//o metodo sort compara a lista atravez do comparable
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