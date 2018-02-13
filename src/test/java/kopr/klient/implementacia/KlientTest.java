
package kopr.klient.implementacia;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class KlientTest extends BeforeAfterPreTesty{
    
    private final EvidenciaServiceService factory = new EvidenciaServiceService();
    private final EvidenciaService evidenciaService = factory.getEvidenciaServicePort();    

    /**
     * Test of pridajPredmet method, of class EvidenciaService.
     */
    @Test
    public void testPridajPredmet() {
        System.out.println("pridajPredmet");
        
        String nazovPredmetu = "Databázy";         
        Long idPredmet = evidenciaService.pridajPredmet(nazovPredmetu);        
                
        assertEquals(new Long(4), idPredmet); 
    }

    /**
     * Test of pridajUcastnika method, of class EvidenciaService.
     */
    @Test
    public void testPridajUcastnika() {
        System.out.println("pridajUcastnika");
        
        String meno = "Jozef";
        String priezvisko = "Dobrý";
        
        Long idUcastnika = evidenciaService.pridajUcastnika(meno, priezvisko);
                       
        assertEquals(new Long(4), idUcastnika);
    }

    /**
     * Test of pridajPrezencnuListinu method, of class EvidenciaService.     
     */
    @Test
    public void testPridajPrezencnuListinu() {
        System.out.println("pridajPrezencnuListinu");
        
        Long idPredmetu = 3L;
        LocalDateTime ldt = LocalDateTime.of(2017, 11, 25, 4, 18, 35);
        Date datumACas = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        List<Long> idUcastnikov = Arrays.asList(2L,1L);
        
        Long idPrezencnejListiny = null;
        try {
            idPrezencnejListiny = evidenciaService.pridajPrezencnuListinu(idPredmetu, datumACas, idUcastnikov);
        } catch (NepodariloSaVyrobitPrezencnuListinuException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Test pridania prezencnej listiny vyhodil vynimku!");
        }          
        
        assertEquals(new Long(4L), idPrezencnejListiny);          
    }
    
    /**
     * Test of pridajPrezencnuListinu method, of class EvidenciaService.     
     */
    @Test
    public void testPridajPrezencnuListinuNeexistujuciPredmet() {
        System.out.println("pridajPrezencnuListinu");
        
        Long idPredmetu = 42L;
        LocalDateTime ldt = LocalDateTime.of(2017, 11, 25, 4, 18, 35);
        Date datumACas = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        List<Long> idUcastnikov = Arrays.asList(2L,1L);
        
        Long idPrezencnejListiny = null;
        try {
            idPrezencnejListiny = evidenciaService.pridajPrezencnuListinu(idPredmetu, datumACas, idUcastnikov);
            fail("Test pridania prezencnej listiny nevyhodil vynimku!");
        } catch (NepodariloSaVyrobitPrezencnuListinuException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals("Predmet so zadanym id neexistuje!", ex.getMessage());
        }       
    }
    
    /**
     * Test of pridajPrezencnuListinu method, of class EvidenciaService.     
     */
    @Test
    public void testPridajPrezencnuListinuNeexistujuciUcastnici() {
        System.out.println("pridajPrezencnuListinu");
        
        Long idPredmetu = 3L;
        LocalDateTime ldt = LocalDateTime.of(2017, 11, 25, 4, 18, 35);
        Date datumACas = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        List<Long> idUcastnikov = Arrays.asList(2L,11L);
        
        Long idPrezencnejListiny = null;
        try {
            idPrezencnejListiny = evidenciaService.pridajPrezencnuListinu(idPredmetu, datumACas, idUcastnikov);
            fail("Test pridania prezencnej listiny nevyhodil vynimku!");
        } catch (NepodariloSaVyrobitPrezencnuListinuException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals("Ucastnici s tymito id neexistuju: 11, ", ex.getMessage());
        }        
    }

    /**
     * Test of vratUcastnikov method, of class EvidenciaService.
     */
    @Test
    public void testVratUcastnikov() {
        System.out.println("vratUcastnikov");
        
        Long idPrezencnejListiny = 3L;        
        
        List<Ucastnik> ucastnici = null;
        try {
            ucastnici = evidenciaService.vratUcastnikov(idPrezencnejListiny);
        } catch (NeexistujucaPrezencnaListinaException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Test vrat ucastnikov vyhodil vynimku!");
        }
        
        assertEquals(2, ucastnici.size());        
    }
    
    /**
     * Test of vratUcastnikov method, of class EvidenciaService.
     */
    @Test
    public void testVratUcastnikovNeexistujucaPrezencnaListina() {
        System.out.println("vratUcastnikov");
        
        Long idPrezencnejListiny = 36L;        
        
        List<Ucastnik> ucastnici = null;
        try {
            ucastnici = evidenciaService.vratUcastnikov(idPrezencnejListiny);
            fail("Test vratenia ucastnikov nevyhodil vynimku!");
        } catch (NeexistujucaPrezencnaListinaException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals("Prezencna listina so zadanym id neexistuje!", ex.getMessage());
        }
        
        assertEquals(null, ucastnici);       
    }

    /**
     * Test of vratPrezencneListiny method, of class EvidenciaService.
     */
    @Test
    public void testVratPrezencneListiny() {
        System.out.println("vratPrezencneListiny");
        
        Long idUcastnika = 2L;
        
        List<PrezencnaListina> listiny = null;
        try {
            listiny = evidenciaService.vratPrezencneListiny(idUcastnika);
        } catch (NeexistujuciUcastnikException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Test vrat ucastnikov vyhodil vynimku!");
        }
        
        assertEquals(2, listiny.size());        
    }
    
    /**
     * Test of vratPrezencneListiny method, of class EvidenciaService.
     */
    @Test
    public void testVratPrezencneListinyNeexistujuciUcastnik() {
        System.out.println("vratPrezencneListiny");
        
        Long idUcastnika = 42L;
        
        List<PrezencnaListina> listiny = null;
        try {
            listiny = evidenciaService.vratPrezencneListiny(idUcastnika);
            fail("Test vrat ucastnikov nevyhodil vynimku!");
        } catch (NeexistujuciUcastnikException ex) {
            Logger.getLogger(KlientTest.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals("Ucastnik so zadanym id neexistuje!", ex.getMessage());
        }
        
        assertEquals(null, listiny);        
    }
    
}
