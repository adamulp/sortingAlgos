package sortingalgos;

/**
 * https://github.com/adamulp/sortingAlgos/
 *
 * @authors:
 *           Alexis Allendez        https://github.com/AlexisAllendez
 *           Enzo Casalegno         https://github.com/EnzoCasalegno
 *           Nicolás Hollmann       https://github.com/HollmannCod3
 *           Adam Rigg              https://github.com/adamulp/
 */

/*
Ejercicio 1
Definir una clase ordenamiento que contenga el atributo datos (un array de
enteros) en el cual se agregarán los métodos:

    Carga(): que llena el arreglo con 10000 números aleatorios.
    Muestra()
    bubbleSort()
    insertionSort()
    shellSort()

El método main() de la clase principal, tiene que crear un objeto de la clase
ordenamiento e invocar a los métodos y mostrar el arreglo antes y después de
ordenar.
*/
public class SortingAlgos {

    public static void main(String[] args) {
        Ordenamiento testCarga = new Ordenamiento();
        testCarga.cargar();
//        testCarga.muestra(20);
        testCarga.insertionSort();
        testCarga.muestra(20);

    }
    
}
