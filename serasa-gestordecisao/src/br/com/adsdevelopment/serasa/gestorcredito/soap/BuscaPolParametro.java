
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
 *         &lt;element name="UsuarioGestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenhaGestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsuarioSerasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenhaSerasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usuarioGestor",
    "senhaGestor",
    "usuarioSerasa",
    "senhaSerasa"
})
@XmlRootElement(name = "BuscaPolParametro")
public class BuscaPolParametro {

    @XmlElement(name = "UsuarioGestor")
    protected String usuarioGestor;
    @XmlElement(name = "SenhaGestor")
    protected String senhaGestor;
    @XmlElement(name = "UsuarioSerasa")
    protected String usuarioSerasa;
    @XmlElement(name = "SenhaSerasa")
    protected String senhaSerasa;

    /**
     * Obtém o valor da propriedade usuarioGestor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioGestor() {
        return usuarioGestor;
    }

    /**
     * Define o valor da propriedade usuarioGestor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioGestor(String value) {
        this.usuarioGestor = value;
    }

    /**
     * Obtém o valor da propriedade senhaGestor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaGestor() {
        return senhaGestor;
    }

    /**
     * Define o valor da propriedade senhaGestor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaGestor(String value) {
        this.senhaGestor = value;
    }

    /**
     * Obtém o valor da propriedade usuarioSerasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioSerasa() {
        return usuarioSerasa;
    }

    /**
     * Define o valor da propriedade usuarioSerasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioSerasa(String value) {
        this.usuarioSerasa = value;
    }

    /**
     * Obtém o valor da propriedade senhaSerasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaSerasa() {
        return senhaSerasa;
    }

    /**
     * Define o valor da propriedade senhaSerasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaSerasa(String value) {
        this.senhaSerasa = value;
    }

}
