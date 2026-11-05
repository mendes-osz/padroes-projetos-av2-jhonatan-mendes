package questao2;

public class Tiquete {
    public String placa;
    public int tempoPermanenciaMinutos;
    public PerfilCobrancaStrategy perfilCobranca;

    public Tiquete(String placa, int tempoPermanenciaMinutos, PerfilCobrancaStrategy perfilCobranca) {
        this.placa = placa;
        this.tempoPermanenciaMinutos = tempoPermanenciaMinutos;
        this.perfilCobranca = perfilCobranca;
    }

    public void setPerfilCobranca(PerfilCobrancaStrategy novoPerfil) {
        this.perfilCobranca = novoPerfil;
    }

    public double calcularValorPagar() {
        return perfilCobranca.calcularValor(tempoPermanenciaMinutos);
    }
}