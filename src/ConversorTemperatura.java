import java.util.Scanner;

public class ConversorTemperatura {

    static double CelciusToFahrenheit(double celcius){
        final double FATOR1 = 9/5;
        final double FATOR2 = 32;
        double fahrenheit = (celcius * FATOR1) + FATOR2;
        return fahrenheit;
    }
    static void MostrarTemperatura(double valor, String temperatura){
        System.out.println("A temperatura em " + temperatura + " é " + valor + "º");
    }

    public static void main(String[] args) {

        System.out.println ("####### CONVERSOR DE TEMPERATURA #######");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira temperatura em celsius : ");
        MostrarTemperatura(CelciusToFahrenheit(sc.nextDouble()),"fahrenheit ");

        System.out.println("Digite o valor da segunda temperatura em celsius : ");
        MostrarTemperatura(CelciusToFahrenheit(sc.nextDouble()),"fahrenheit ");

        System.out.println("obrigada!!!");


    }


    }


