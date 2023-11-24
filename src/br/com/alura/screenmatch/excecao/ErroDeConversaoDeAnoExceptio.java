package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExceptio extends RuntimeException {

    private String mensagem;
    public ErroDeConversaoDeAnoExceptio(String mensagem) {
    this.mensagem = mensagem;
    }


    public String getMensagem() {
        return this.mensagem;
    }
}
