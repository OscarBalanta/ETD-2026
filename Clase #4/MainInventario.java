public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario(10);

        Producto[] prods = new Producto[] {
            new Producto(1, "Lapicero", 0.50, 10),
            new Producto(2, "Cuaderno", 2.00, 3),
            new Producto(3, "Borrador", 0.30, 2),
            new Producto(4, "Regla", 1.50, 0),
            new Producto(5, "Marcador", 1.20, 6),
            new Producto(6, "Pegamento", 0.80, 4),
            new Producto(7, "Tijeras", 3.50, 7),
            new Producto(8, "Carpeta", 2.50, 1),
            new Producto(9, "Calculadora", 15.00, 2),
            new Producto(10, "Mochila", 25.00, 5)
        };

        for (Producto p : prods) {
            inv.agregarProducto(p);
        }

        
        for (Producto p : inv.getProductos()) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Valor total del inventario: " + inv.generarInformeValorTotal());

        System.out.println();
        System.out.println("Productos agotados (stock < 5):");
        for (Producto p : inv.obtenerProductosAgotados()) {
            System.out.println(p);
        }

        System.out.println();
        
        inv.ordenarPorPrecioDescendente();
        for (Producto p : inv.getProductos()) {
            System.out.println(p);
        }
    }
}
