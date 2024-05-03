package org.example;


public class Main {

    public static void main(String[] args) {
        char abecedario[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < abecedario.length; i++) {
            System.out.println("Letra :" + abecedario[i]);
            identificaVocales(abecedario[i]);
            identificaVocalesReducido(abecedario[i]);
            identificaVocalesIf(abecedario[i]);
        }

        sumaMultiplosDe5(4,8);
        sumaMultiplosDe5(8,3);
        sumaMultiplosDe5(-1,7);
        sumaMultiplosDe5(0,100);
        sumaMultiplosDe5(100,200);
        sumaMultiplosDe5(200,300);
        sumaMultiplosDe5(100,1000);
    }

    private static void identificaVocales(char vocal) {

        switch (Character.toUpperCase(vocal)) {
            case 'A':
                System.out.println("Vocal introducida: A");
                break;
            case 'E':
                System.out.println("Vocal introducida: E");
                break;
            case 'I':
                System.out.println("Vocal introducida: I");
                break;
            case 'O':
                System.out.println("Vocal introducida: O");
                break;
            case 'U':
                System.out.println("Vocal introducida: U");
                break;
            default:
                System.out.println("Error: no se ha introducido ninguna vocal");
                break;
        }
    }

    // Este método es identico al primero salvo que permite utilizar las características del switch-case para agrupar el
    // mismo comportamiento para cada una de las vocales en una única sentencia de ejecución.
    private static void identificaVocalesReducido(char vocal) {
        switch (Character.toUpperCase(vocal)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vocal introducida: " + Character.toUpperCase(vocal));
                break;
            default:
                System.out.println("Error: no se ha introducido ninguna vocal");
                break;
        }
    }

    // Este método tiene la misma funcionalidad que los dos anteriores, sólo que modelado con una sentencia if-else.
    // Como respuesta a que opción es más adecuada en mi opinión depende del punto de vista:
    //      - Desde el punto de vista del programador quizá pueda ser más adecuada la opción del switch-case porque
    //      visiblemente es más limpia y más directa, por tanto es más legible a la hora de interpretar el código.
    //      - Desde el punto de vista de la ejecución, es más rápida y consume menos ciclos la opción del if-else ya que
    //      cuando se ejecutan varias sentencias concatenadas dentro del if bajo el operador || cuando encuentra la
    //      primera condición que evalua true sale de la comprobación y entra. En cambio cuando se ejecuta un switch-case
    //      como por ejemplo el de la función identificaVocalesReducido() se evaluan todos los casos se haya encontrado
    //      ya un caso válido o no.
    private static void identificaVocalesIf(char vocal) {
        if (    Character.toUpperCase(vocal) == 'A' ||
                Character.toUpperCase(vocal) == 'E' ||
                Character.toUpperCase(vocal) == 'I' ||
                Character.toUpperCase(vocal) == 'O' ||
                Character.toUpperCase(vocal) == 'U') {
            System.out.println("Vocal introducida: " + Character.toUpperCase(vocal));
        }
        else {
            System.out.println("Error: no se ha introducido ninguna vocal");
        }
    }

    private static void sumaMultiplosDe5(int min, int max) {
        int aux = 0;
        int suma = 0;

        if (min < 0 || max < 0) {
            System.out.println("Error: valor negativo introducido");
            return;
        } else if (min > max) {
            aux = max;
            max = min;
            min = aux;
        }

        for (aux = min; aux <= max; aux++) {
            if (aux % 5 == 0) {
                suma += aux;
            }
        }

        if (suma == 0) {
            System.out.println("No se ha encontrado ningún multiplo de 5 en el rango introducido.");
        }
        else {
            System.out.println("La suma de los múltipos de 5 en el rango entre " + min + " y " + max + " es: " + suma);
        }
    }
}