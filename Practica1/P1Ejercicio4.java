import java.util.Scanner;

public class P1Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, f, x, y;
        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        int cant4 = 0;

        System.out.print("Cantidad de puntos a ingresar: ");
        n = teclado.nextInt();

        for (f = 1; f <= n; f++){
            System.out.print("Ingrese coordenada X: ");
            x = teclado.nextInt();
            System.out.print("Ingrese coordenada Y: ");
            y = teclado.nextInt();

            if (x>0 && y>0) {
                cant1++;
            } else {
                if (x<0 && y>0) {
                    cant2++;
                } else {
                    if (x<0 && y<0) {
                        cant3++;
                    } else {
                        if (x>0 && y<0) {
                        	cant4++;
                        }
                    }
                }
            }

        }
        System.out.print("Cantidad de puntos en el primer cuadrante:");
        System.out.println(cant1);
        System.out.print("Cantidad de puntos en el segundo cuadrante:");
        System.out.println(cant2);
        System.out.print("Cantidad de puntos en el tercer cuadrante:");
        System.out.println(cant3);
        System.out.print("Cantidad de puntos en el cuarto cuadrante:");
        System.out.println(cant4);

        teclado.close();


    }
}
