
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
 *         &lt;element name="GestorCreditoStatusWorkFlowResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "gestorCreditoStatusWorkFlowResult"
})
@XmlRootElement(name = "GestorCreditoStatusWorkFlowResponse")
public class GestorCreditoStatusWorkFlowResponse {

    @XmlElement(name = "GestorCreditoStatusWorkFlowResult")
    protected String gestorCreditoStatusWorkFlowResult;

    /**
     * Obtém o valor da propriedade gestorCreditoStatusWorkFlowResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGestorCreditoStatusWorkFlowResult() {
        return gestorCreditoStatusWorkFlowResult;
    }

    /**
     * Define o valor da propriedade gestorCreditoStatusWorkFlowResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGestorCreditoStatusWorkFlowResult(String value) {
        this.gestorCreditoStatusWorkFlowResult = value;
    }

}
