
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalisarCrivoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "analisarCrivoResult"
})
@XmlRootElement(name = "AnalisarCrivoResponse")
public class AnalisarCrivoResponse {

    @XmlElement(name = "AnalisarCrivoResult")
    protected String analisarCrivoResult;

    /**
     * Obt�m o valor da propriedade analisarCrivoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalisarCrivoResult() {
        return analisarCrivoResult;
    }

    /**
     * Define o valor da propriedade analisarCrivoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalisarCrivoResult(String value) {
        this.analisarCrivoResult = value;
    }

}
