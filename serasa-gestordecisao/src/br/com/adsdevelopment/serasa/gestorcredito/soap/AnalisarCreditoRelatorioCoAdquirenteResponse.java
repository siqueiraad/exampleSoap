
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
 *         &lt;element name="AnalisarCreditoRelatorioCoAdquirenteResult" type="{https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao}AnalisarCreditoRelatorioRetorno" minOccurs="0"/>
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
    "analisarCreditoRelatorioCoAdquirenteResult"
})
@XmlRootElement(name = "AnalisarCreditoRelatorioCoAdquirenteResponse")
public class AnalisarCreditoRelatorioCoAdquirenteResponse {

    @XmlElement(name = "AnalisarCreditoRelatorioCoAdquirenteResult")
    protected AnalisarCreditoRelatorioRetorno analisarCreditoRelatorioCoAdquirenteResult;

    /**
     * Obtém o valor da propriedade analisarCreditoRelatorioCoAdquirenteResult.
     * 
     * @return
     *     possible object is
     *     {@link AnalisarCreditoRelatorioRetorno }
     *     
     */
    public AnalisarCreditoRelatorioRetorno getAnalisarCreditoRelatorioCoAdquirenteResult() {
        return analisarCreditoRelatorioCoAdquirenteResult;
    }

    /**
     * Define o valor da propriedade analisarCreditoRelatorioCoAdquirenteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalisarCreditoRelatorioRetorno }
     *     
     */
    public void setAnalisarCreditoRelatorioCoAdquirenteResult(AnalisarCreditoRelatorioRetorno value) {
        this.analisarCreditoRelatorioCoAdquirenteResult = value;
    }

}
