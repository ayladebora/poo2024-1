package br.ufpb.dcx.ayla.artesanato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SistemaFeiraArtesanatoRioTintoTest {

    @Test
    public void testaCadastro(){
        SistemaFeiraArtesanatoRioTinto sistema = new SistemaFeiraArtesanatoRioTinto();
        try {
            Roupa r = new Roupa();
            sistema.cadastraItem(r);
            ItemDeArtesanato item = sistema.pesquisaItemPeloCodigo(r.getCodigo());
            assertEquals(item, r);
        } catch (CodigoInvalidoException e) {
            fail();
        } catch (ItemJaExisteException e) {
            fail();
        } catch (ItemInexistenteException e) {
            fail();
        }

    }

}
