import java.util.Scanner;

public class P1Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int n, f;
        int valor;

        System.out.print("Ingrese la cantidad de valores a ingresar: ");
        n = teclado.nextInt();

        for (f = 0; f < n ; f++)
        {
            System.out.println("Ingrese un valor: ");
            valor = teclado.nextInt();

            if (valor % 2 == 0){
                pares = pares+1;
            }
            else{
                impares = impares+1;
            }
            
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);

        teclado.close();
    }
}
