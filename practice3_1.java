import java.util.Scanner;
import java.lang.Math;

public class practice3_1 {
    public static void main(String[] args){
        int a = pedirNumero();
        int b = pedirNumero();

        int absolute = absolute(a);
        print(absolute, "absolute");

        int decrement = decrementExact(a);
        print(decrement, "decrement");

        int absoluteE = absoluteExact(a);
        print(absoluteE, "absoluteExact" );

        int incrementE = incrementExact(a);
        print(incrementE, "incrementExact");

        int max = max (a,b);
        print(max, "max");

        int min = min (a,b);
        print(min, "min");

        int multiplyE = multiplyExact(a, b);
        print(multiplyE, "multiplyExact");

        int subtracE = subtracExact(a, b);
        print(subtracE, "subtracExact");

        int floorM = floorMod(a, b);
        print(floorM, "floorMod");

        int floorD = floorDiv(a, b);
        print(floorD,"floorDiv");





    }
/* import java.util.Scanner;

public class practice3_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int b = sc.nextInt();

        print(Math.abs(a), "Valor absoluto de " + a);
        print(Math.decrementExact(a), "Decremento de " + a);
        print(Math.incrementExact(a), "Incremento de " + a);
        print(Math.max(a, b), "Máximo entre " + a + " y " + b);
        print(Math.min(a, b), "Mínimo entre " + a + " y " + b);
        print(Math.multiplyExact(a, b), "Producto de " + a + " y " + b);
        print(Math.subtractExact(a, b), "Resta de " + a + " y " + b);
        print(Math.floorMod(a, b), "Módulo de " + a + " sobre " + b);
        print(Math.floorDiv(a, b), "División entera de " + a + " sobre " + b);
        print((int) Math.sqrt(a), "Raíz cuadrada de " + a); // Nueva función
    }

    public static void print(int resultado, String descripcion){
        System.out.println(descripcion + ": " + resultado);
    }
}
/*
    /*1.La función devuelve el valor absoluto (absolute)*/
    public static int absolute(int num){
            return Math.abs(num);
    }

    /*2.La función da -1 del número indicado(decrementxact)*/
    public static int decrementExact(int num){
        return Math.decrementExact(num);
    }

    /*3.Devuelve el valor matemático absoluto de un valor int si es exactamente representable como un int(absExact)*/
    public static int absoluteExact(int num){
        return Math.absExact(num);
    }

    /*4.Devuelve el argumento incrementado en uno, generando una excepción si el resultado desborda un int. (incrementExact*/
    public static int incrementExact(int num){
        return Math.incrementExact(num);
    }

    /*5.Devuelve el mayor de dos valores int. (max)*/
    public static int max(int a, int b){
        return Math.max(a, b);
    }

    /*6.Devuelve el mínimo de dos valores int (min)*/
    public static int min (int a, int b){
        return Math.min(a, b);
    }

    /*7. Devuelve el producto de los argumentos, generando una excepción si el resultado desborda un int. (multiplyExact)*/
    public static int multiplyExact(int a, int b){
        return Math.multiplyExact(a, b);
    }

    /*8. Devuelve la diferencia de los argumentos, lanzando una excepción si el resultado desborda un int. (subtracExact) */
    public static int subtracExact (int a, int b){
        return Math.subtractExact(a, b);
    }

    /*9. Devuelve el módulo mínimo de los argumentos long e int.*/
    public static int floorMod( int a, int b){
        return Math.floorMod(a, b);
    }

    /*10. Devuelve el valor int más grande (más cercano al infinito positivo) que es menor o igual que el cociente algebraico. (floorDiv)*/
    public static int floorDiv (int a, int b){
        return Math.floorDiv(a, b);
    }
    public static int pedirNumero (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 número:");
        return sc.nextInt();
    }


    public static void print (int num, String type){
        System.out.println("Tipo de operación: " + type + " - El resultado es: " + num);

    }

}
