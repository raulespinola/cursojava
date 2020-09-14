package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor ("Sony",14);
        Teclado teclado1 = new Teclado ("Inalambrico", "Logitech");
        Raton raton1 = new Raton ("Inalambrico", "Logitech");
        Computadora computadora1 = new Computadora ("HP",monitor1,teclado1,raton1);

        Monitor monitor2 = new Monitor ("LG",15);
        Teclado teclado2 = new Teclado ("Inalambrico", "Microsoft");
        Raton raton2 = new Raton ("Ergonomico", "Logitech");
        Computadora computadora2 = new Computadora ("Acer",monitor2,teclado2,raton2);

        Monitor monitor3 = new Monitor ("SONY",19);
        Teclado teclado3 = new Teclado ("Inalambrico", "Logitech");
        Raton raton3 = new Raton ("Inalambrico", "Acer");
        Computadora computadora3 = new Computadora ("HP",monitor3,teclado3,raton3);

        Monitor monitor4 = new Monitor ("PHILIPS",18);
        Teclado teclado4 = new Teclado ("Inalambrico", "Microsoft");
        Raton raton4 = new Raton ("Inalambrico", "Logitech");
        Computadora computadora4 = new Computadora ("HP",monitor4,teclado4,raton4);

        Monitor monitor5 = new Monitor ("SONY",14);
        Teclado teclado5 = new Teclado ("Inalambrico", "Microsoft");
        Raton raton5 = new Raton ("Ergonomico", "Logitech");
        Computadora computadora5 = new Computadora ("HP",monitor4,teclado4,raton4);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();

        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        orden1.calcularTotalXOrden();

        orden2.agregarComputadora(computadora3);
        orden2.mostrarOrden();
        orden2.calcularTotalXOrden();

        orden3.agregarComputadora(computadora4);
        orden3.agregarComputadora(computadora5);
        orden3.mostrarOrden();
        orden3.calcularTotalXOrden();

        }
    }

