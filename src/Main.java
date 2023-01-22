import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un número para sumarlos ente sí. (faltan 3)");
        int param1 = read.nextInt();
        System.out.println("Ingresa el siguiente número. (faltan 2)");
        int param2 = read.nextInt();
        System.out.println("Ingresa el siguiente número. (falta 1)");
        int param3 = read.nextInt();
        suma(param1,param2,param3);
    }

    public static void suma(int param1, int param2, int param3) {
        int resultado = 0;
        resultado = param1 + param2 + param3;
        System.out.println("La suma de los números " + param1 + ", " + param2 + " y " + param3 +
                ", dan como resultado: " + resultado);
    }
}