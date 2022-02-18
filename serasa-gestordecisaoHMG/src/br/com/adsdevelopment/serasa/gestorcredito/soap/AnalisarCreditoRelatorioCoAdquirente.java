
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
 *         &lt;element name="VrCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bSerasa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bAtualizar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sOnLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteCPF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteScore1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteCPF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteScore2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteCPF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteScore3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteCPF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteScore4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteCPF5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoAdquirenteScore5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sOnLine",
    "coAdquirenteCPF1",
    "coAdquirenteScore1",
    "coAdquirenteCPF2",
    "coAdquirenteScore2",
    "coAdquirenteCPF3",
    "coAdquirenteScore3",
    "coAdquirenteCPF4",
    "coAdquirenteScore4",
    "coAdquirenteCPF5",
    "coAdquirenteScore5"
})
@XmlRootElement(name = "AnalisarCreditoRelatorioCoAdquirente")
public class AnalisarCreditoRelatorioCoAdquirente {

    @XmlElement(name = "sCNPJ")
    protected String scnpj;
    protected String sUsrGC;
    protected String sPassGC;
    protected String sUsrSer;
    protected String sPassSer;
    protected String sDoc;
    @XmlElement(name = "VrCompra")
    protected String vrCompra;
    protected String sScore;
    protected boolean bSerasa;
    protected boolean bAtualizar;
    protected String sOnLine;
    @XmlElement(name = "CoAdquirenteCPF1")
    protected String coAdquirenteCPF1;
    @XmlElement(name = "CoAdquirenteScore1")
    protected String coAdquirenteScore1;
    @XmlElement(name = "CoAdquirenteCPF2")
    protected String coAdquirenteCPF2;
    @XmlElement(name = "CoAdquirenteScore2")
    protected String coAdquirenteScore2;
    @XmlElement(name = "CoAdquirenteCPF3")
    protected String coAdquirenteCPF3;
    @XmlElement(name = "CoAdquirenteScore3")
    protected String coAdquirenteScore3;
    @XmlElement(name = "CoAdquirenteCPF4")
    protected String coAdquirenteCPF4;
    @XmlElement(name = "CoAdquirenteScore4")
    protected String coAdquirenteScore4;
    @XmlElement(name = "CoAdquirenteCPF5")
    protected String coAdquirenteCPF5;
    @XmlElement(name = "CoAdquirenteScore5")
    protected String coAdquirenteScore5;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrCompra() {
        return vrCompra;
    }

    /**
     * Define o valor da propriedade vrCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrCompra(String value) {
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

    /**
     * Obtém o valor da propriedade coAdquirenteCPF1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteCPF1() {
        return coAdquirenteCPF1;
    }

    /**
     * Define o valor da propriedade coAdquirenteCPF1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteCPF1(String value) {
        this.coAdquirenteCPF1 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteScore1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteScore1() {
        return coAdquirenteScore1;
    }

    /**
     * Define o valor da propriedade coAdquirenteScore1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteScore1(String value) {
        this.coAdquirenteScore1 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteCPF2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteCPF2() {
        return coAdquirenteCPF2;
    }

    /**
     * Define o valor da propriedade coAdquirenteCPF2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteCPF2(String value) {
        this.coAdquirenteCPF2 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteScore2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteScore2() {
        return coAdquirenteScore2;
    }

    /**
     * Define o valor da propriedade coAdquirenteScore2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteScore2(String value) {
        this.coAdquirenteScore2 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteCPF3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteCPF3() {
        return coAdquirenteCPF3;
    }

    /**
     * Define o valor da propriedade coAdquirenteCPF3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteCPF3(String value) {
        this.coAdquirenteCPF3 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteScore3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteScore3() {
        return coAdquirenteScore3;
    }

    /**
     * Define o valor da propriedade coAdquirenteScore3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteScore3(String value) {
        this.coAdquirenteScore3 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteCPF4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteCPF4() {
        return coAdquirenteCPF4;
    }

    /**
     * Define o valor da propriedade coAdquirenteCPF4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteCPF4(String value) {
        this.coAdquirenteCPF4 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteScore4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteScore4() {
        return coAdquirenteScore4;
    }

    /**
     * Define o valor da propriedade coAdquirenteScore4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteScore4(String value) {
        this.coAdquirenteScore4 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteCPF5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteCPF5() {
        return coAdquirenteCPF5;
    }

    /**
     * Define o valor da propriedade coAdquirenteCPF5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteCPF5(String value) {
        this.coAdquirenteCPF5 = value;
    }

    /**
     * Obtém o valor da propriedade coAdquirenteScore5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAdquirenteScore5() {
        return coAdquirenteScore5;
    }

    /**
     * Define o valor da propriedade coAdquirenteScore5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAdquirenteScore5(String value) {
        this.coAdquirenteScore5 = value;
    }

}
