
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
 *         &lt;element name="sDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VrCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bSerasa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bAtualizar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sOnLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sDoc",
    "vrCompra",
    "sScore",
    "bSerasa",
    "bAtualizar",
    "sOnLine"
})
@XmlRootElement(name = "AnalisarCreditoLog")
public class AnalisarCreditoLog {

    @XmlElement(name = "sCNPJ")
    protected String scnpj;
    protected String sUsrGC;
    protected String sPassGC;
    protected String sUsrSer;
    protected String sPassSer;
    protected String sDoc;
    @XmlElement(name = "VrCompra")
    protected double vrCompra;
    protected String sScore;
    protected boolean bSerasa;
    protected boolean bAtualizar;
    protected String sOnLine;

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
     * Obtém o valor da propriedade sDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDoc() {
        return sDoc;
    }

    /**
     * Define o valor da propriedade sDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDoc(String value) {
        this.sDoc = value;
    }

    /**
     * Obtém o valor da propriedade vrCompra.
     * 
     */
    public double getVrCompra() {
        return vrCompra;
    }

    /**
     * Define o valor da propriedade vrCompra.
     * 
     */
    public void setVrCompra(double value) {
        this.vrCompra = value;
    }

    /**
     * Obtém o valor da propriedade sScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSScore() {
        return sScore;
    }

    /**
     * Define o valor da propriedade sScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSScore(String value) {
        this.sScore = value;
    }

    /**
     * Obtém o valor da propriedade bSerasa.
     * 
     */
    public boolean isBSerasa() {
        return bSerasa;
    }

    /**
     * Define o valor da propriedade bSerasa.
     * 
     */
    public void setBSerasa(boolean value) {
        this.bSerasa = value;
    }

    /**
     * Obtém o valor da propriedade bAtualizar.
     * 
     */
    public boolean isBAtualizar() {
        return bAtualizar;
    }

    /**
     * Define o valor da propriedade bAtualizar.
     * 
     */
    public void setBAtualizar(boolean value) {
        this.bAtualizar = value;
    }

    /**
     * Obtém o valor da propriedade sOnLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOnLine() {
        return sOnLine;
    }

    /**
     * Define o valor da propriedade sOnLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOnLine(String value) {
        this.sOnLine = value;
    }

}
