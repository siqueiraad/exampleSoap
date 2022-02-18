
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
 *         &lt;element name="sCNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sUsrGC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPassGC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sUsrSer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPassSer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControleWF" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "scnpj",
    "sUsrGC",
    "sPassGC",
    "sUsrSer",
    "sPassSer",
    "controleWF"
})
@XmlRootElement(name = "GestorCreditoStatusWorkFlow")
public class GestorCreditoStatusWorkFlow {

    @XmlElement(name = "sCNPJ")
    protected String scnpj;
    protected String sUsrGC;
    protected String sPassGC;
    protected String sUsrSer;
    protected String sPassSer;
    @XmlElement(name = "ControleWF")
    protected long controleWF;

    /**
     * Obtém o valor da propriedade scnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCNPJ() {
        return scnpj;
    }

    /**
     * Define o valor da propriedade scnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCNPJ(String value) {
        this.scnpj = value;
    }

    /**
     * Obtém o valor da propriedade sUsrGC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUsrGC() {
        return sUsrGC;
    }

    /**
     * Define o valor da propriedade sUsrGC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUsrGC(String value) {
        this.sUsrGC = value;
    }

    /**
     * Obtém o valor da propriedade sPassGC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPassGC() {
        return sPassGC;
    }

    /**
     * Define o valor da propriedade sPassGC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPassGC(String value) {
        this.sPassGC = value;
    }

    /**
     * Obtém o valor da propriedade sUsrSer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUsrSer() {
        return sUsrSer;
    }

    /**
     * Define o valor da propriedade sUsrSer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUsrSer(String value) {
        this.sUsrSer = value;
    }

    /**
     * Obtém o valor da propriedade sPassSer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPassSer() {
        return sPassSer;
    }

    /**
     * Define o valor da propriedade sPassSer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPassSer(String value) {
        this.sPassSer = value;
    }

    /**
     * Obtém o valor da propriedade controleWF.
     * 
     */
    public long getControleWF() {
        return controleWF;
    }

    /**
     * Define o valor da propriedade controleWF.
     * 
     */
    public void setControleWF(long value) {
        this.controleWF = value;
    }

}
