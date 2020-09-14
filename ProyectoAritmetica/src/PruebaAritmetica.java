public class PruebaAritmetica {
    public static void main (String[] args) {
      //variables locales
        int operandoA = 6;
        int operandoB = 2;

        // creamos un objeto de la clase aritmetica
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        // Imprimimos los valores de los operandos
        System.out.println("Operando A = " + operandoA );
        System.out.println("Operando B = " + operandoB);
        // Imprimimos Resultado Suma
        System.out.println("Resultado Suma: " + objeto1.sumar());
        //Imprimimos el resultado de la resta
        System.out.println("Resultado de la resta : " + objeto1.restar());
        //Imprimimos el resultado de la multiplicacion
        System.out.println("Resultado de la multiplicacion: " +  objeto1.multiplicar());
        // Imprimimos el resultado de la division
        System.out.println("Resultado de la division: " + objeto1.dividir());
    }
}