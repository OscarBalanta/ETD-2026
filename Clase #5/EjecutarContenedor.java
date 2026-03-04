public class EjecutarContenedor {
    
    public static void main(String[] args) {
        
        
        Buque Buque1 = new Buque(" MSC", " B001", " Italia ");
        Buque Buque2 = new Buque(" Queen Mary", " B002", " Estados Unidos ");
        
        
        System.out.println("INFORMACIÓN DE BUQUES:");
        System.out.println(Buque1);
        System.out.println("Nombre: " + Buque1.getNombre());
        System.out.println("Código: " + Buque1.getCodigo());
        System.out.println("Origen: " + Buque1.getOrigen());
        
        System.out.println();
        System.out.println(Buque2);
        System.out.println("Nombre: " + Buque2.getNombre());
        System.out.println("Código: " + Buque2.getCodigo());
        System.out.println("Origen: " + Buque2.getOrigen());
        
       
        Contenedor contenedor1 = new Contenedor(" C001" ,  250.5 , " Shanghai ");
        Contenedor contenedor2 = new Contenedor(" C002" ,  180.3 , " EE:UU ");
        Contenedor contenedor3 = new Contenedor(" C003" , 320.8 , " Singapur ");
        
        
        System.out.println();
        System.out.println("INFORMACIÓN DE CONTENEDORES:");
        System.out.println(contenedor1);
        System.out.println("Código: " + contenedor1.getCodigo());
        System.out.println("Peso: " + contenedor1.getPeso() + " Toneladas");
        System.out.println("Origen: " + contenedor1.getOrigen());
        
        System.out.println();
        System.out.println(contenedor2);
        System.out.println("Código: " + contenedor2.getCodigo());
        System.out.println("Peso: " + contenedor2.getPeso() + " Toneladas");
        System.out.println("Origen: " + contenedor2.getOrigen());
        
        System.out.println();
        System.out.println(contenedor3);
        System.out.println("Código: " + contenedor3.getCodigo());
        System.out.println("Peso: " + contenedor3.getPeso() + " Toneladas");
        System.out.println("Origen: " + contenedor3.getOrigen());
    }
    
}
