package produto.ferramenta.smart_fone;

import produto.ferramenta.aparelho_telefonico.AparelhoTelefonico;
import produto.ferramenta.navegador.Navegador;
import produto.ferramenta.reprodutor_musical.ReprodutorMusical;

public class SmartFone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("LIGANDO COM SMARTFONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO COM SMARTFONE");
    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ COM SMARTFONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA COM SMARTFONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA COM SMARTFONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA COM SMARTFONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO COM SMARTFONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO COM SMARTFONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA COM SMARTFONE");
    }
}
