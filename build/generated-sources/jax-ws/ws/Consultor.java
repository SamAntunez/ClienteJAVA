
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contrasenausuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultor", propOrder = {
    "contrasenausuario",
    "idusuario",
    "nombreusuario"
})
public class Consultor {

    protected String contrasenausuario;
    protected String idusuario;
    protected String nombreusuario;

    /**
     * Obtiene el valor de la propiedad contrasenausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenausuario() {
        return contrasenausuario;
    }

    /**
     * Define el valor de la propiedad contrasenausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenausuario(String value) {
        this.contrasenausuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdusuario() {
        return idusuario;
    }

    /**
     * Define el valor de la propiedad idusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdusuario(String value) {
        this.idusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * Define el valor de la propiedad nombreusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuario(String value) {
        this.nombreusuario = value;
    }

}
