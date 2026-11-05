package questao2;

public class Main {
    public static void main(String[] args) {
        int tempoMinutos = 130;
        String placa = "ABC-1234";

        System.out.println("Tempo: " + tempoMinutos + " minutos (" + placa + ")");

        Tiquete tiquete = new Tiquete(placa, tempoMinutos, new PerfilRotativoStrategy());
        System.out.printf("Valor Perfil Rotativo: R$ %.2f", tiquete.calcularValorPagar());
        System.out.println();

        tiquete.setPerfilCobranca(new PerfilMensalistaStrategy());
        System.out.printf("Valor Perfil Mensalista: R$ %.2f", tiquete.calcularValorPagar());
        System.out.println();

        tiquete.setPerfilCobranca(new PerfilConveniadoStrategy());
        System.out.printf("Valor Perfil Conveniado: R$ %.2f", tiquete.calcularValorPagar());
    }
}