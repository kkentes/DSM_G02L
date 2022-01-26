import java.util.Scanner;

public class P1Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("**Programa que calcula si dos numeros son divisibles entre si**");
        System.out.println("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();

        if (num1 % num2 == 0)
        {
            System.out.println(num1 + " es divisible entre " + num2);
        }
        else
        {
            System.out.println(num1 + " no es divisible entre " + num2);
        }

        teclado.close();;

    }
}

