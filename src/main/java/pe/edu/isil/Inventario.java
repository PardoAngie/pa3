package pe.edu.isil;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Cargar productos iniciales
    public void cargarDatosIniciales() {
        productos.add(new Producto("P001", "Laptop", 2500.00, 10));
        productos.add(new Producto("P002", "Mouse", 45.00, 30));
        productos.add(new Producto("P003", "Teclado", 120.00, 15));
        productos.add(new Producto("P004", "Monitor", 850.00, 8));
        productos.add(new Producto("P005", "Audifonos", 150.00, 20));
    }

    // Agregar producto
    public boolean agregarProducto(Producto producto) {

        if (buscarPorCodigo(producto.getCodigo()) != null) {
            return false;
        }

        productos.add(producto);
        return true;
    }

    // Listar productos
    public void listarProductos() {

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println("\n===== LISTA DE PRODUCTOS =====");

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Buscar producto por codigo
    public Producto buscarPorCodigo(String codigo) {

        for (Producto producto : productos) {

            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }

        return null;
    }

    // Recuperar producto por posicion
    public Producto obtenerProducto(int indice) {

        if (indice >= 0 && indice < productos.size()) {
            return productos.get(indice);
        }

        return null;
    }

    // Eliminar producto por codigo
    public boolean eliminarProducto(String codigo) {

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getCodigo().equalsIgnoreCase(codigo)) {

                productos.remove(i);
                return true;
            }
        }

        return false;
    }

    // Obtener la coleccion principal
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}

