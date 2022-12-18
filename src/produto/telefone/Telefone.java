package produto.telefone;

import produto.ferramenta.smart_fone.SmartFone;

public class Telefone {
    public static void main(String[] args) {
        SmartFone iFone = new SmartFone();

        iFone.ligar();
        iFone.atender();
        iFone.inciarCorreioVoz();

        iFone.adicionarNovaAba();
        iFone.atualizarPagina();
        iFone.exibirPagina();

        iFone.selecionarMusica();
        iFone.tocar();
        iFone.pausar();

    }
}
