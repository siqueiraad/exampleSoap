
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="invokeIntegrationServiceFromSTSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "invokeIntegrationServiceFromSTSResult"
})
@XmlRootElement(name = "invokeIntegrationServiceFromSTSResponse")
public class InvokeIntegrationServiceFromSTSResponse {

    protected String invokeIntegrationServiceFromSTSResult;

    /**
     * Obt�m o valor da propriedade invokeIntegrationServiceFromSTSResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokeIntegrationServiceFromSTSResult() {
        return invokeIntegrationServiceFromSTSResult;
    }

    /**
     * Define o valor da propriedade invokeIntegrationServiceFromSTSResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokeIntegrationServiceFromSTSResult(String value) {
        this.invokeIntegrationServiceFromSTSResult = value;
    }

}
