
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vratPrezencneListiny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vratPrezencneListiny">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUcastnika" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vratPrezencneListiny", propOrder = {
    "idUcastnika"
})
public class VratPrezencneListiny {

    protected Long idUcastnika;

    /**
     * Gets the value of the idUcastnika property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUcastnika() {
        return idUcastnika;
    }

    /**
     * Sets the value of the idUcastnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUcastnika(Long value) {
        this.idUcastnika = value;
    }

}
