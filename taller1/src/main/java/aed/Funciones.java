package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return res;
    }

    boolean esPar(int n) {
        return n%2 == 0;
    }

    boolean esBisiesto(int n) {
        return ((n%4 == 0) && (n%100 != 0)) || (n%400 == 0);
    }

    int factorialIterativo(int n) {
        int res = 1;
        for (int i = n; i>0; i--){
            res *= i; 
        };
        return res;
    }

    int factorialRecursivo(int n) {
        if(n == 0 || n == 1) {
            return 1;
        };
        return n*factorialRecursivo(n-1);
    }

    boolean esPrimo(int n) {
        int res = 0;
        for (int i = 1; i <= n ; i++){
            if (n%i == 0){
                res += 1;
            };
        };
        return res == 2;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int x : numeros) {
            res += x;
        };
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscado){
                res = i;
            };
        };
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;

        for (int numero : numeros) {
            if (esPrimo(numero)){
                res = true;
            };
        };
        
        return res;
    }

    boolean todosPares(int[] numeros) {
        int res = 0;

        for (int i = 0 ; i < numeros.length && esPar(numeros[i]) ; i++){
            res = i;
        };
        return res == numeros.length - 1;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        for (int i = 0; i < s1.length() && res; i++){
            if (i>=s2.length() || s1.charAt(i) != s2.charAt(i) ){
                res = false;
            };
        };
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        boolean res = true;
        for (int i = 0; i < s1.length() && res; i++){
            if (i>=s2.length() || s1.charAt(s1.length() - i - 1) != s2.charAt(s2.length() - i - 1) ){
                res = false;
            };
        };
        return res;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && (a != b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;

        for (int i = 0; i < xs.length; i++) {
            if (xs.length != ys.length || xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length-1; i++) {
            if (xs[i] > xs [i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) res = xs[i];
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x : xs) {
            if (0 >= x) {
                res = false;
            }
        }
        return res;
    }

}
