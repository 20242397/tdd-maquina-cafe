import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(new Cafetera(100));
        maquina.setVasosPequeno(new Vaso(5, 3));   // 3 oz
        maquina.setVasosMediano(new Vaso(5, 5));   // 5 oz
        maquina.setVasosGrande(new Vaso(5, 7));    // 7 oz
        maquina.setAzucarero(new Azucarero(20));

        Scanner in = new Scanner(System.in);
        System.out.println("=== Maquina de Cafe ===");

        while (true) {
            System.out.print("Tamano (pequeno/mediano/grande, o 'salir'): ");
            String tipo = in.nextLine().trim().toLowerCase();
            if (tipo.equals("salir")) break;

            Vaso vaso = maquina.getTipoDeVaso(tipo);
            if (vaso == null) {
                System.out.println("Tamano no valido.");
                continue;
            }

            System.out.print("Cucharadas de azucar: ");
            int azucar = Integer.parseInt(in.nextLine().trim());

            String resultado = maquina.getVasoDeCafe(vaso, 1, azucar);
            System.out.println(resultado.equals(MaquinaDeCafe.FELICITACIONES)
                    ? "Recoja su vaso. " + resultado
                    : resultado);
        }
        in.close();
    }
}
