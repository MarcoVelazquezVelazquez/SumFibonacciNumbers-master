package com.epam.rd.autotasks;

class LoopStatements {

    //TODO: Delete line below and write your own solution
    public static void main(String[] args) {

        System.out.println(LoopStatements.sumOfFibonacciNumbers(8));

        System.out.println(LoopStatements.sumOfFibonacciNumbers(11));

    }

    public static int sumOfFibonacciNumbers(int serie){
      /*  serie = 8;*/

        int num1 = 0, num2 = 1, suma = 1;

        // Muestro el valor inicial
        /*System.out.println(num1);*/
        int sumaTotal = 0;

        for (int i = 1; i < serie; i++) {
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
            sumaTotal += num1;//la suma acumulada de cada valor iterado.
            /*System.out.println(sumaTotal);*/
        }
        return sumaTotal;

    }

}