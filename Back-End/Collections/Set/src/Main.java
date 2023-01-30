import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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


        //Exibindo a posição de algum elemento especifico
        System.out.println("posição da nota 5.0: ");
    }
}