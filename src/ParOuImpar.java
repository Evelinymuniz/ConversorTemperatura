public class ParOuImpar {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            i = i % 2;
            if (i == 0) {
                System.out.println("O numero é PAR: ");
            } else {
                System.out.println("O numero é IMPAR: ");
            }
        }
    }
}