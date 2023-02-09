import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
            }catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Valor inserido invalido!");
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "O numero 0 não pode ser o denominador!");
            }finally {
                System.out.println("rodou ate o final");
            }
    }

    public static int dividir(int a, int b) { return a / b; }
}