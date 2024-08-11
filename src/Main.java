/*
 * PRESENTACIÓN DEL TRABAJO Unidad 3: Tarea (12%) - Algoritmos de ordenamiento y búsqueda
 * Trabajo realizado por: Edwin Leonardo Alzate Avendaño
 * Asignatura: Lenguaje de Programación Avanzado 1 - 2407B04G1G2
 * Docente: Nixon Duarte Acosta.
 * Fecha entrega: 11/08/2024
 * Github: https://github.com/StudyEdwinA994/Tarea_3_Burbuja
 */
public class Main {
    public static void main(String[] args) {

        int[] arregloTarea = {21, 40, 4, 9, 10, 35};

        //Instanciando la clase OrdenamientoBurbuja
        OrdenamientoBurbuja arregloDatos = new OrdenamientoBurbuja(arregloTarea);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+              ORDENAMIENTO BURBUJA               +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Uso del metodo para ordenar e imprimir
        arregloDatos.ordenarArreglo();
    }
}               