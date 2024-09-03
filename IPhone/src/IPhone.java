public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public IPhone(String modelo, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void fazerLigacao() {
        System.out.println("Ligando...");
    }

    public void desligarChamada() {
        System.out.println("Desligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void enviarCorreioVoz() {
        System.out.println("Enviando correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo a página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    public void tocar() {
        System.out.println("Tocando a música...");
    }

    public void pausar() {
        System.out.println("Pausando a música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando a música...");
    }
}
