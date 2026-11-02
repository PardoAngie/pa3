package pe.edu.isil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Crear inventario
        Inventario inventario = new Inventario();

        // Cargar productos iniciales
        inventario.cargarDatosIniciales();

        // Crear menu
        Menu menu = new Menu(inventario);

        // Ejecutar sistema
        menu.ejecutar();
    }
}
