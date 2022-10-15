import java.util.Scanner;

public class ConversorTemperatura {

    static double CelciusToFahrenheit(double celcius){
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    }

    static void MostrarTemperatura(double valor, String temperatura){
        System.out.println("A " + temperatura + "e " + valor );
    }

    public static void main(String[] args) {

        System.out.println ("####### CONVERSOR DE TEMPERATURA #######");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor da primeira temperatura em celsius para fahrenheit: ");
        MostrarTemperatura(CelciusToFahrenheit(sc.nextDouble()),"fahrenheit ");
        System.out.println("Digite um valor da segunda temperatura em celsius para fahrenheit: ");
        MostrarTemperatura(CelciusToFahrenheit(sc.nextDouble()),"fahrenheit ");


    }

    }


