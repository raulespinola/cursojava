package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes de tipos primitivos
        /*
        int - integer
        long- Long
        float - Float
        double -Double
        boolean - Boolean
        byte = Byte
        char - Character
        short - Short
         */
        //Autoboxing cuando envolvemos al tipo primitivo en un tipo object
        Integer entero = 10;
        System.out.println("Entero = "+ entero);
        System.out.println("Entero = "+ entero.toString());
        System.out.println("Entero = "+ entero.doubleValue());

        //unboxing cuando extraemos el valor de la variable de tipo object en una variable de tipo primitvo
        int entero2 = entero;
        System.out.println("Entero2 = "+ entero2);

    }
}
