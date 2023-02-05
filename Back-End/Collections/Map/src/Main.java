import java.util.*;

public class Main {
    public static void main(String[] args) {

        //criando e chamando o MAP
        System.out.println("crie um dicionario  que relacione os modelos de carros e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            /*No metodo MAP não é possivel utilizar o metodo
             * "add" para adicionar elementos, por isso, utiliza-se
             * o metodo "put"*/
            put("gol", 14.4); //o nome dos carros são as keys
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 16.6);
        }};
        System.out.println(carrosPopulares);
        /*como eu utilizei o hashmap a ordem que os itens ficaram
        * foi aleatoria*/

        //alterando o valor de um item pela key(put)
        System.out.println("mude o consumo do gol para 15.2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //conferindo se uma chave existe no dicionario (containsKey)
        System.out.println("confira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));

        //exibindo o valor que esta numa key
        System.out.println("exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //exiba as keys do dicionario
        System.out.println("exiba todos os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //exiba os valores de cada key
        System.out.println("exiba o consumo de cada carro: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        //exiba o maior valor do dicionario
        System.out.println("exiba o carro mais economico: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        String modeloMaisEficiente = "";
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(melhorConsumo))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente+ " = " + melhorConsumo);

        //exiba o menor valor do dicionario
        System.out.println("exiba o carro menos economico: ");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(piorConsumo))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println(modeloMenosEficiente+ " = " + piorConsumo);

        //exiba a soma dos valores
        System.out.println("exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        //exiba a media dos valores do dicionario
        System.out.println("exiba a media dos consumos: " + (soma / carrosPopulares.size()));


        //removendo keys
        System.out.println("remova os modelos que tem o consumo de 15,6km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carrosPopulares);


        //exibir keys na ordem de inserção
        System.out.println("exiba os modelos na ordem que foram adicionados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 16.6);
        }};
        System.out.println(carrosPopulares1);
        /*como eu utilizei o linkedhashmap a ordem que os itens ficaram
         * foi na ordem de inserção*/


        //exibir o dicionario por ordem alfabetica
        System.out.println("exiba os modelos na ordem alfabetica: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        //apague todo o dicionario
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        //confira se o dicionario esta vazio
        System.out.println("o dicionario esta vazio? " + carrosPopulares.isEmpty());


    }
}