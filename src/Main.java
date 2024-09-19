import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre ="Tony Starck";
        String tipocuenta ="Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("***********************************");
        System.out.println("\nNombre del cliente; " + nombre);
        System.out.println("El tipo de cuenta es: " + tipocuenta);
        System.out.println("Su saldo disponible es: " + saldo);

        System.out.println("\n***********************************");
        String menu = """
                ** Escribe el numero de la opcion deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + " $");
                    break;
                case 2:
                    System.out.println("Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Saldo restante: " + saldo + " $");
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que vas a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + " $");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }
}