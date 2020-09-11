public class Aritmetica {
   //Atributos de la clase
    int a;
    int b;
    // Costructor Vacio
    Aritmetica(){

    }
    // Segundo constructor con argumentos
    Aritmetica (int a, int b){//variables locales
    this.a = a;//atributos de nuesttra clase
    this.b = b;
    }
// Este metodo sumar toma los atributos de la clase
 int sumar (){
        return a + b;
    }
    //Metodo restar
    int restar(){
        return a - b;
    }
    //Metodo multiplicar
    int multiplicar() {
        return a * b;
    }
    // Metodo Dividir
    int dividir(){
    return a/ b;
    }
}



