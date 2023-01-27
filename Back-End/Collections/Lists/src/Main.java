import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("crie uma lista de nome notas");

        //criando um objeto do tipo List ArrayList
        List<Double> notas = new ArrayList<Double>();

        //adicionando dados a List
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //mostrando a lista inteira no console
        System.out.println(notas.toString());//o toString é opcional neste caso

        //mostrando a posição que um elemnto se encontra dentro da lista
        System.out.println("exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        //adicionando um elemento em uma posição especifica da lista
        System.out.println("adicione a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        //substituindo um elemnto da lista por outro
        System.out.println("substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);// mostrando todos os itens da lista sem utilizar o metodo toString(como falei ele é opcional)

        //conferindo se um elemento existe dentro da lista
        System.out.println("confira se a nota 5.0 esta na lista: " + notas.contains(5.0));//o metodo contains retorna um boolean

        //exiba a list de forma ordenada e na vertical
        for (Double nota: notas) System.out.println(nota); // um foreach para mostrar as notas na vertical

        //mostrando o elemento que esta numa posição especifica:
        System.out.println("mostre o elemento que esta na posição 3: " + notas.get(2));

        //mostrando a menor nota da lista
        System.out.println("exiba a menor nota: " + Collections.min(notas));

        //mostrando a maior nota da lista
        System.out.println("exiba a maior nota: " + Collections.max(notas));

        //mostrando a soma de todos os elementos da lista
        System.out.println("exiba a soma de todas as notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 00.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //mostrando a media das notas da lista
        System.out.println("media das notas: " + (soma/notas.size()));

        //removendo um elemento da lista
        notas.remove(0.0);
        System.out.println(notas);

        //removendo todas as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        //while(iterator1.hasNext()) {
           // Double next = iterator.next();
           // if(next < 7) iterator1.remove();
        //}
       // System.out.println(notas);

        //apagando toda a lista
        notas.clear();
        System.out.println(notas.isEmpty());
    }
}