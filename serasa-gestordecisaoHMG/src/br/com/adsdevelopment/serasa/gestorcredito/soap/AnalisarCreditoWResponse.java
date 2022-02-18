
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalisarCreditoWResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "analisarCreditoWResult"
})
@XmlRootElement(name = "AnalisarCreditoWResponse")
public class AnalisarCreditoWResponse {

    @XmlElement(name = "AnalisarCreditoWResult")
    protected String analisarCreditoWResult;

    /**
     * Obtém o valor da propriedade analisarCreditoWResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalisarCreditoWResult() {
        return analisarCreditoWResult;
    }

    /**
     * Define o valor da propriedade analisarCreditoWResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalisarCreditoWResult(String value) {
        this.analisarCreditoWResult = value;
    }

}
