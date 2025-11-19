import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        InsertionSort insert = new InsertionSort();

        //Creamos y delcaramos el arreglo
        int[] temperaturas = {12,40,32,60,14,28,18};
        //lo imprimimos
        System.out.println("Arreglo Original: "+Arrays.toString(temperaturas));
        //lo ordenamos
        insert.sort(temperaturas);

        //Ya ordenado el valor mínimo estara al inicio
        int min = temperaturas[0];
        //la temperatura máxima se encuentra al final asi que a la posición le restamos 1
        int max = temperaturas[temperaturas.length-1];
        //Creamos el rango restando ambas
        int rango = max - min;

        System.out.println("Temperatura Maxima: "+max);
        System.out.println("Temperatura Minima: "+min);
        System.out.println("Rango: "+rango);

        int limiteMax = Math.min(3, temperaturas.length);
        System.out.print("Top 3 más altas: ");
        for (int i = temperaturas.length - 1; i >= temperaturas.length - limiteMax; i--) {
        System.out.print(temperaturas[i] + " ");
        }
        System.out.println();

        // Si hay menos de 3 elementos, se imprimen los que haya
        int limiteMin = Math.min(3, temperaturas.length);

        System.out.print("Top 3 mas bajas: ");
        //Aquí i vale 0 y si es menor a las temperaturas minimas incrementa e imprime
        for (int i = 0; i < limiteMin; i++) {
            System.out.print(temperaturas[i] + " ");
        }
    }
}