public class ParOuImpar {
    public static void main(String[] args) {
        int valor = Integer.parseInt(args[0]);
        String resultado = (valor % 2 == 0) ? "O número é PAR" : "O número é IMPAR";
        System.out.println(resultado);
        }
    }
//Criar uma classe com uma função main que vai receber um número via args e dizer se esse número é par ou impar.
// O método main deve ter a menor quantidade de linhas possíveis.