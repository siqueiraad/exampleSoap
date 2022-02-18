
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
 *         &lt;element name="BuscaPolParametroResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "buscaPolParametroResult"
})
@XmlRootElement(name = "BuscaPolParametroResponse")
public class BuscaPolParametroResponse {

    @XmlElement(name = "BuscaPolParametroResult")
    protected String buscaPolParametroResult;

    /**
     * Obtém o valor da propriedade buscaPolParametroResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscaPolParametroResult() {
        return buscaPolParametroResult;
    }

    /**
     * Define o valor da propriedade buscaPolParametroResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscaPolParametroResult(String value) {
        this.buscaPolParametroResult = value;
    }

}
