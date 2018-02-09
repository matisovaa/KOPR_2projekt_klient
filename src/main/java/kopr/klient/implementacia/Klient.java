
package kopr.klient.implementacia;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.*;

public class Klient {
    
    //private EvidenciaServiceService factory = new EvidenciaServiceService();
    //private EvidenciaService service = factory.getEvidenciaServicePort();
    
    public static void main(String[] args) {
        EvidenciaServiceService factory = new EvidenciaServiceService();
        EvidenciaService service = factory.getEvidenciaServicePort();
        /*
        Long id = service.pridajPredmet("Analyza");
        System.out.println(">>>>>>>>>>>>>>"+id);
        
        service.pridajUcastnika("Jozo", "Dobry");
        
        
        LocalDateTime datumACas = LocalDateTime.of(2016, 9, 24, 8, 30, 35);
        try {
            service.pridajPrezencnuListinu(3L, Date.from(datumACas.atZone(ZoneId.systemDefault()).toInstant()), Arrays.asList(1L,2L,3L));
        } catch (NepodariloSaVyrobitPrezencnuListinuException ex) {
            Logger.getLogger(Klient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<PrezencnaListina> prezencneListiny = null;
        try {
            prezencneListiny = service.vratPrezencneListiny(2L);
        } catch (NeexistujuciUcastnikException ex) {
            Logger.getLogger(Klient.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        for (PrezencnaListina prezencnaListina : prezencneListiny) {
            System.out.println(prezencnaListina.getId()+"|||"+prezencnaListina.getDatumACas());
        }
        */
        /*
        List<Ucastnik> ucastnici = null;
        try {
            ucastnici = service.vratUcastnikov(1L);
        } catch (NeexistujucaPrezencnaListinaException ex) {
            Logger.getLogger(Klient.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(">>>>>>>>>>>>>>>>");
        for (Ucastnik ucastnik : ucastnici) {
            System.out.println(ucastnik.getId()+"|||"+ucastnik.getPriezvisko());
        }
        
        
*/
    }
}
