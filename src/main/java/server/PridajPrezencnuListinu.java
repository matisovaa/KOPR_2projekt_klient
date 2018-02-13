
package server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pridajPrezencnuListinu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pridajPrezencnuListinu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPredmetu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="datumACas" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idUcastnikov" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pridajPrezencnuListinu", propOrder = {
    "idPredmetu",
    "datumACas",
    "idUcastnikov"
})
public class PridajPrezencnuListinu {

    protected Long idPredmetu;
    @XmlSchemaType(name = "dateTime")
    protected Date datumACas;
    @XmlElement(type = Long.class)
    protected List<Long> idUcastnikov;

    /**
     * Gets the value of the idPredmetu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPredmetu() {
        return idPredmetu;
    }

    /**
     * Sets the value of the idPredmetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPredmetu(Long value) {
        this.idPredmetu = value;
    }

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
     * Gets the value of the idUcastnikov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idUcastnikov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdUcastnikov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIdUcastnikov() {
        if (idUcastnikov == null) {
            idUcastnikov = new ArrayList<Long>();
        }
        return this.idUcastnikov;
    }

}
