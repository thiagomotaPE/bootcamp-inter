import java.util.*;

public class Main {
    public static void main(String[] args) {

        //como chamar o metodo SET
        System.out.println("Crie um conjunto e adicione as notas: ");
        //Set<Double> notas = new HashSet<>(); forma generica
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        /*por estar usando o SET os elementos não ficam
        na ordem de inserção e os elementos repetidos só
        entram na lista uma vez*/

        /*a biblioteca SET não trabalha com o index dos itens
        * do conjunto(lista).
        * então não da pra fazer nenhuma ação que precise saber
        * a posição do item*/


        //conferindo se um valor especifico esta  no conjunto
        System.out.println("o conjunto 'notas' possui alguma nota 5.0 ? " + notas.contains(5d));

        //exibindo a menor nota
        System.out.println("a menor nota é: " + Collections.min(notas));

        //exibindo a maior nota
        System.out.println("a maior nota é: " + Collections.max(notas));

        //exibindo a soma de todos os valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("soma dos valores: " + soma);

        //exibindo a media das notas
        System.out.println("media de todas as notas:" + (soma / notas.size()));

        //removendo um valor do conjunto
        System.out.println("remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        //removendo notas menores que 7
        //System.out.println("remova nota menores que 7: ");
        //Iterator<Double> iterator1 = notas.iterator();
        //while (iterator1.hasNext()) {
        //     Double next = iterator.next();
        //     if (next < 7d) iterator1.remove();
        //}
        //System.out.println(notas);

        //mostraNDO O CONJUNTO NA ORDEM DE INSERÇÃO


        //exibindo na ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println("ordem crescente: " + notas3);

        // apague todo conjunto
        notas.clear();
        System.out.println(notas);

        //confira se o conjunto apagado esta vazio
        System.out.println("apagou? " + notas.isEmpty());


        //ORDENANDO O CONJUNTO
        
    }

}