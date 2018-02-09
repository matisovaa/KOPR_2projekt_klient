
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VratPrezencneListiny_QNAME = new QName("http://server/", "vratPrezencneListiny");
    private final static QName _NeexistujucaPrezencnaListinaException_QNAME = new QName("http://server/", "NeexistujucaPrezencnaListinaException");
    private final static QName _PridajUcastnika_QNAME = new QName("http://server/", "pridajUcastnika");
    private final static QName _PridajPrezencnuListinuResponse_QNAME = new QName("http://server/", "pridajPrezencnuListinuResponse");
    private final static QName _VratPrezencneListinyResponse_QNAME = new QName("http://server/", "vratPrezencneListinyResponse");
    private final static QName _PridajPrezencnuListinu_QNAME = new QName("http://server/", "pridajPrezencnuListinu");
    private final static QName _PridajPredmetResponse_QNAME = new QName("http://server/", "pridajPredmetResponse");
    private final static QName _VratUcastnikovResponse_QNAME = new QName("http://server/", "vratUcastnikovResponse");
    private final static QName _VratUcastnikov_QNAME = new QName("http://server/", "vratUcastnikov");
    private final static QName _PridajPredmet_QNAME = new QName("http://server/", "pridajPredmet");
    private final static QName _NeexistujuciUcastnikException_QNAME = new QName("http://server/", "NeexistujuciUcastnikException");
    private final static QName _PridajUcastnikaResponse_QNAME = new QName("http://server/", "pridajUcastnikaResponse");
    private final static QName _NepodariloSaVyrobitPrezencnuListinu_QNAME = new QName("http://server/", "NepodariloSaVyrobitPrezencnuListinu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PridajPredmetResponse }
     * 
     */
    public PridajPredmetResponse createPridajPredmetResponse() {
        return new PridajPredmetResponse();
    }

    /**
     * Create an instance of {@link VratUcastnikovResponse }
     * 
     */
    public VratUcastnikovResponse createVratUcastnikovResponse() {
        return new VratUcastnikovResponse();
    }

    /**
     * Create an instance of {@link VratPrezencneListinyResponse }
     * 
     */
    public VratPrezencneListinyResponse createVratPrezencneListinyResponse() {
        return new VratPrezencneListinyResponse();
    }

    /**
     * Create an instance of {@link PridajPrezencnuListinu }
     * 
     */
    public PridajPrezencnuListinu createPridajPrezencnuListinu() {
        return new PridajPrezencnuListinu();
    }

    /**
     * Create an instance of {@link PridajPrezencnuListinuResponse }
     * 
     */
    public PridajPrezencnuListinuResponse createPridajPrezencnuListinuResponse() {
        return new PridajPrezencnuListinuResponse();
    }

    /**
     * Create an instance of {@link SimpleExceptionBean }
     * 
     */
    public SimpleExceptionBean createSimpleExceptionBean() {
        return new SimpleExceptionBean();
    }

    /**
     * Create an instance of {@link PridajUcastnika }
     * 
     */
    public PridajUcastnika createPridajUcastnika() {
        return new PridajUcastnika();
    }

    /**
     * Create an instance of {@link VratPrezencneListiny }
     * 
     */
    public VratPrezencneListiny createVratPrezencneListiny() {
        return new VratPrezencneListiny();
    }

    /**
     * Create an instance of {@link PridajUcastnikaResponse }
     * 
     */
    public PridajUcastnikaResponse createPridajUcastnikaResponse() {
        return new PridajUcastnikaResponse();
    }

    /**
     * Create an instance of {@link PridajPredmet }
     * 
     */
    public PridajPredmet createPridajPredmet() {
        return new PridajPredmet();
    }

    /**
     * Create an instance of {@link VratUcastnikov }
     * 
     */
    public VratUcastnikov createVratUcastnikov() {
        return new VratUcastnikov();
    }

    /**
     * Create an instance of {@link PrezencnaListina }
     * 
     */
    public PrezencnaListina createPrezencnaListina() {
        return new PrezencnaListina();
    }

    /**
     * Create an instance of {@link Predmet }
     * 
     */
    public Predmet createPredmet() {
        return new Predmet();
    }

    /**
     * Create an instance of {@link Ucastnik }
     * 
     */
    public Ucastnik createUcastnik() {
        return new Ucastnik();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VratPrezencneListiny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "vratPrezencneListiny")
    public JAXBElement<VratPrezencneListiny> createVratPrezencneListiny(VratPrezencneListiny value) {
        return new JAXBElement<VratPrezencneListiny>(_VratPrezencneListiny_QNAME, VratPrezencneListiny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "NeexistujucaPrezencnaListinaException")
    public JAXBElement<SimpleExceptionBean> createNeexistujucaPrezencnaListinaException(SimpleExceptionBean value) {
        return new JAXBElement<SimpleExceptionBean>(_NeexistujucaPrezencnaListinaException_QNAME, SimpleExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajUcastnika }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajUcastnika")
    public JAXBElement<PridajUcastnika> createPridajUcastnika(PridajUcastnika value) {
        return new JAXBElement<PridajUcastnika>(_PridajUcastnika_QNAME, PridajUcastnika.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPrezencnuListinuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajPrezencnuListinuResponse")
    public JAXBElement<PridajPrezencnuListinuResponse> createPridajPrezencnuListinuResponse(PridajPrezencnuListinuResponse value) {
        return new JAXBElement<PridajPrezencnuListinuResponse>(_PridajPrezencnuListinuResponse_QNAME, PridajPrezencnuListinuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VratPrezencneListinyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "vratPrezencneListinyResponse")
    public JAXBElement<VratPrezencneListinyResponse> createVratPrezencneListinyResponse(VratPrezencneListinyResponse value) {
        return new JAXBElement<VratPrezencneListinyResponse>(_VratPrezencneListinyResponse_QNAME, VratPrezencneListinyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPrezencnuListinu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajPrezencnuListinu")
    public JAXBElement<PridajPrezencnuListinu> createPridajPrezencnuListinu(PridajPrezencnuListinu value) {
        return new JAXBElement<PridajPrezencnuListinu>(_PridajPrezencnuListinu_QNAME, PridajPrezencnuListinu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPredmetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajPredmetResponse")
    public JAXBElement<PridajPredmetResponse> createPridajPredmetResponse(PridajPredmetResponse value) {
        return new JAXBElement<PridajPredmetResponse>(_PridajPredmetResponse_QNAME, PridajPredmetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VratUcastnikovResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "vratUcastnikovResponse")
    public JAXBElement<VratUcastnikovResponse> createVratUcastnikovResponse(VratUcastnikovResponse value) {
        return new JAXBElement<VratUcastnikovResponse>(_VratUcastnikovResponse_QNAME, VratUcastnikovResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VratUcastnikov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "vratUcastnikov")
    public JAXBElement<VratUcastnikov> createVratUcastnikov(VratUcastnikov value) {
        return new JAXBElement<VratUcastnikov>(_VratUcastnikov_QNAME, VratUcastnikov.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPredmet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajPredmet")
    public JAXBElement<PridajPredmet> createPridajPredmet(PridajPredmet value) {
        return new JAXBElement<PridajPredmet>(_PridajPredmet_QNAME, PridajPredmet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "NeexistujuciUcastnikException")
    public JAXBElement<SimpleExceptionBean> createNeexistujuciUcastnikException(SimpleExceptionBean value) {
        return new JAXBElement<SimpleExceptionBean>(_NeexistujuciUcastnikException_QNAME, SimpleExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajUcastnikaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "pridajUcastnikaResponse")
    public JAXBElement<PridajUcastnikaResponse> createPridajUcastnikaResponse(PridajUcastnikaResponse value) {
        return new JAXBElement<PridajUcastnikaResponse>(_PridajUcastnikaResponse_QNAME, PridajUcastnikaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "NepodariloSaVyrobitPrezencnuListinu")
    public JAXBElement<SimpleExceptionBean> createNepodariloSaVyrobitPrezencnuListinu(SimpleExceptionBean value) {
        return new JAXBElement<SimpleExceptionBean>(_NepodariloSaVyrobitPrezencnuListinu_QNAME, SimpleExceptionBean.class, null, value);
    }

}
