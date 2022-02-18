
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AnalisarCreditoRelatorioRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AnalisarCreditoRelatorioRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultadoAnalise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemRelatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Relatorio" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalisarCreditoRelatorioRetorno", propOrder = {
    "resultadoAnalise",
    "temRelatorio",
    "relatorio"
})
public class AnalisarCreditoRelatorioRetorno {

    @XmlElement(name = "ResultadoAnalise")
    protected String resultadoAnalise;
    @XmlElement(name = "TemRelatorio")
    protected boolean temRelatorio;
    @XmlElement(name = "Relatorio")
    protected byte[] relatorio;

    /**
     * Obtém o valor da propriedade resultadoAnalise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoAnalise() {
        return resultadoAnalise;
    }

    /**
     * Define o valor da propriedade resultadoAnalise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoAnalise(String value) {
        this.resultadoAnalise = value;
    }

    /**
     * Obtém o valor da propriedade temRelatorio.
     * 
     */
    public boolean isTemRelatorio() {
        return temRelatorio;
    }

    /**
     * Define o valor da propriedade temRelatorio.
     * 
     */
    public void setTemRelatorio(boolean value) {
        this.temRelatorio = value;
    }

    /**
     * Obtém o valor da propriedade relatorio.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRelatorio() {
        return relatorio;
    }

    /**
     * Define o valor da propriedade relatorio.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRelatorio(byte[] value) {
        this.relatorio = value;
    }

}
