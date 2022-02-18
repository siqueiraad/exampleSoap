
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
 *         &lt;element name="RetornoLoteResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "retornoLoteResult"
})
@XmlRootElement(name = "RetornoLoteResponse")
public class RetornoLoteResponse {

    @XmlElement(name = "RetornoLoteResult")
    protected String retornoLoteResult;

    /**
     * Obtém o valor da propriedade retornoLoteResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoLoteResult() {
        return retornoLoteResult;
    }

    /**
     * Define o valor da propriedade retornoLoteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoLoteResult(String value) {
        this.retornoLoteResult = value;
    }

}
