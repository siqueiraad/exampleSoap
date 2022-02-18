
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
 *         &lt;element name="AnalisarCreditoChequeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "analisarCreditoChequeResult"
})
@XmlRootElement(name = "AnalisarCreditoChequeResponse")
public class AnalisarCreditoChequeResponse {

    @XmlElement(name = "AnalisarCreditoChequeResult")
    protected String analisarCreditoChequeResult;

    /**
     * Obtém o valor da propriedade analisarCreditoChequeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalisarCreditoChequeResult() {
        return analisarCreditoChequeResult;
    }

    /**
     * Define o valor da propriedade analisarCreditoChequeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalisarCreditoChequeResult(String value) {
        this.analisarCreditoChequeResult = value;
    }

}
