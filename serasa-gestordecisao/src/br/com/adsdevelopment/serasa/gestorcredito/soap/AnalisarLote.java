
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte?do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sxml"
})
@XmlRootElement(name = "AnalisarLote")
public class AnalisarLote {

    @XmlElement(name = "sXML")
    protected String sxml;

    /**
     * Obt?m o valor da propriedade sxml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSXML() {
        return sxml;
    }

    /**
     * Define o valor da propriedade sxml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSXML(String value) {
        this.sxml = value;
    }

}
