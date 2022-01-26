import java.util.Scanner;

public class P1Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mayores, menores, x, nota;
        mayores = 0;
        menores = 0;
        x = 1;

        while (x <= 10){
            System.out.print("Ingrese la nota: ");
            nota = teclado.nextInt();

            if (nota >= 7){
                mayores = mayores+1;
            }
            else{
                menores = menores+1;
            }
            x = x+1;
        }

        System.out.println("Cantidad de notas de alumnos mayores o iguales a 7: " + mayores);
        System.out.println("Cantidad de notas de alumnos menores a 7: " + menores);

        teclado.close();
    }
}
