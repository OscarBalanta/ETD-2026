public class Suministros {
    
    
    private int[] energiaContenedores = {60, 70, 90, 100, 140, 50, 130, 110, 150, 80, 115, 120};

    
    private int[] energiaMultiplesDe10;

    public Suministros() {
        this.energiaMultiplesDe10 = filtrarMultiplosDe10(energiaContenedores);
    }

    private int[] filtrarMultiplosDe10(int[] valores) {
        int contador = 0;
        for (int v : valores) {
            if (v % 10 == 0) {
                contador++;
            }
        }

        int[] result = new int[contador];
        int idx = 0;
        for (int v : valores) {
            if (v % 10 == 0) {
                result[idx++] = v;
            }
        }

        return result;
    }

    public int[] getEnergiaMultiplesDe10() {
        return energiaMultiplesDe10;
    }

    public int[] getEnergiaContenedores() {
        return energiaContenedores;
    }
}
