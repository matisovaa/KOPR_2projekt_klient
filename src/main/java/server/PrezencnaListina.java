
package server;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prezencnaListina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prezencnaListina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datumACas" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="predmet" type="{http://server/}predmet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prezencnaListina", propOrder = {
    "datumACas",
    "id",
    "predmet"
})
public class PrezencnaListina {

    @XmlSchemaType(name = "dateTime")
    protected Date datumACas;
    protected Long id;
    protected Predmet predmet;

    /**
     * Gets the value of the datumACas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDatumACas() {
        return datumACas;
    }

    /**
     * Sets the value of the datumACas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumACas(Date value) {
        this.datumACas = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the predmet property.
     * 
     * @return
     *     possible object is
     *     {@link Predmet }
     *     
     */
    public Predmet getPredmet() {
        return predmet;
    }

    /**
     * Sets the value of the predmet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predmet }
     *     
     */
    public void setPredmet(Predmet value) {
        this.predmet = value;
    }

}
