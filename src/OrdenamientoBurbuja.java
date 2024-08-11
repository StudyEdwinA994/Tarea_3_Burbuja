public class OrdenamientoBurbuja {
    //Funcion para imprimir el arreglo
    private void verArreglo() {
        for (int i : arregloTarea) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Declaracion de la variable para el arreglo
    private int[] arregloTarea;

    //Constructor de la clase
    public OrdenamientoBurbuja(int[] array) {
        this.arregloTarea = array;
    }

    //Funcion que contiene el metodo burbuja
    public void ordenarArreglo() {
        int tamanoArreglo = arregloTarea.length;
        boolean cambioPosicion;

        for (int i = 0; i < tamanoArreglo - 1; i++) {
            cambioPosicion = false;
            System.out.println("+ Validación de posiciones #" + (i + 1) + ": ");

            for (int j = 0; j < tamanoArreglo - i - 1; j++) {
                System.out.println("Comparando los numeros " + arregloTarea[j] + " y " + arregloTarea[j + 1]);

                if (arregloTarea[j] > arregloTarea[j + 1]) {
                    // Condicional encargado de validar e intercambiar posiciones
                    System.out.println("Si requiere intercambio de posición el " + arregloTarea[j] + " con el " + arregloTarea[j + 1]);
                    int temporal = arregloTarea[j];
                    arregloTarea[j] = arregloTarea[j + 1];
                    arregloTarea[j + 1] = temporal;
                    cambioPosicion = true;
                } else {
                    System.out.println("No requiere intercambio de posición.");
                }

                //Llamado a la funcion para imprimir el arreglo
                verArreglo();
                System.out.println("---------------------------------------------------");
            }

            System.out.println("Resultado del arreglo, validación " + (i + 1) + ":");
            verArreglo();

            //Condicional que interrumpe el ciclo cuando ya esta ordenado
            if (!cambioPosicion) {
                break;
            }
            System.out.println("");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        //Imprimiendo el resultado final del arreglo
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ARREGLO ORDENADO CON METODO BURBUJA");
        verArreglo();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}