package br.ufpb.dcx.ayla.artesanato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SistemaFeiraArtesanatoRioTintoTest {

    @Test
    public void testaPesquisar(){

    }

    @Test
    public void testaCadastro(){
        SistemaFeiraArtesanatoRioTinto sistema = new SistemaFeiraArtesanatoRioTinto();
        try {
            Roupa r = new Roupa();
            sistema.cadastraItem(r);
            fail("Nao deve deixar cadastrar");
        } catch (CodigoInvalidoException  e) {
            //OK
        } catch (ItemJaExisteException  e){
            fail("não era pra lançar estas exceptions");
        }

            //
    }

}
