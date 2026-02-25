public class Inventario {

    private Producto[] productos;

    public Inventario(int capacidad) {
        if (capacidad < 0) {
            capacidad = 0;
        }
        this.productos = new Producto[capacidad];
    }

    public boolean agregarProducto(Producto p) {
        if (p == null) return false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = p;
                return true;
            }
        }
        return false;
    }

    public Producto buscarPorId(int id) {
        for (Producto prod : productos) {
            if (prod != null && prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    public boolean actualizarStock(int id, int nuevaCantidad) {
        Producto prod = buscarPorId(id);
        if (prod != null) {
            prod.setCantiddadStock(nuevaCantidad);
            return true;
        }
        return false;
    }

    public double generarInformeValorTotal() {
        double total = 0.0;
        for (Producto prod : productos) {
            if (prod != null) {
                total += prod.getPrecio() * prod.getCantiddadStock();
            }
        }
        return total;
    }

    public void ordenarPorPrecioDescendente() {
        int n = productos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                Producto a = productos[j];
                Producto b = productos[j + 1];
                if (a == null && b == null) continue;
                if (a == null) { // mover null hacia el final
                    productos[j] = b;
                    productos[j + 1] = a;
                    continue;
                }
                if (b == null) continue;
                if (a.getPrecio() < b.getPrecio()) {
                    productos[j] = b;
                    productos[j + 1] = a;
                }
            }
        }
    }

    public Producto[] obtenerProductosAgotados() {
        int contador = 0;
        for (Producto prod : productos) {
            if (prod != null && prod.getCantiddadStock() < 5) {
                contador++;
            }
        }
        Producto[] resultado = new Producto[contador];
        int idx = 0;
        for (Producto prod : productos) {
            if (prod != null && prod.getCantiddadStock() < 5) {
                resultado[idx++] = prod;
            }
        }
        return resultado;
    }

    public Producto[] getProductos() {
        return productos;
    }

}
