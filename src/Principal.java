import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        int opcionDelUsuario = 0;
        ApiConversorDivisas consulta = new ApiConversorDivisas();
        ArrayList<Conversion> listaDeConversiones = new ArrayList<>();
        System.out.println("\n>>>>>>>>>>Bienvenidos al conversor de moneda<<<<<<<<<<\n");
        while (opcionDelUsuario != 3) {
            Menu menu = new Menu();
            menu.mostrarMenuPrincipal();
            opcionDelUsuario = menu.leerOpcionPrincipal();

            switch (opcionDelUsuario) {
                case 1:
                    menu.mostrarMenuMonedas("inicial");
                    String monedaBase = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("final");
                    String monedaFinal = menu.leerOpcionMoneda();
                    Double cantidadCambiar = menu.leerCantidadACambiar();
                    Conversor conversor = consulta.buscarMoneda(monedaBase);
                    Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());
                    Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);
                    Conversion nuevaConversion = new Conversion(monedaBase, monedaFinal, cantidadCambiar, cantidadObtenida);
                    listaDeConversiones.add(nuevaConversion);
                    break;
                case 2:
                    menu.imprimirConversiones(listaDeConversiones);
                    break;
                case 3:
                    System.out.println("Has finalizado tu consulta, fue un gusto poder ayudarte.");
                    break;
                default:
                    System.out.println("Opción inválida. Digita una de las 3 opciones que te aparece en el menu.");
            }

        }
    }
}
