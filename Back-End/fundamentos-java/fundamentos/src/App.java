public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "thiago";
        String segundoNome = "mota";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String SegundoNome){
        return primeiroNome.concat(" ").concat(SegundoNome);
    }
}
