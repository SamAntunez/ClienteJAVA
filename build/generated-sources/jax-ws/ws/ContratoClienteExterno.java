
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratoClienteExterno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratoClienteExterno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente_id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechainiciocontrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaterminocontrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idcontrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratoClienteExterno", propOrder = {
    "clienteIdCliente",
    "fechainiciocontrato",
    "fechaterminocontrato",
    "idcontrato"
})
public class ContratoClienteExterno {

    @XmlElement(name = "cliente_id_cliente")
    protected String clienteIdCliente;
    protected String fechainiciocontrato;
    protected String fechaterminocontrato;
    protected String idcontrato;

    /**
     * Obtiene el valor de la propiedad clienteIdCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteIdCliente() {
        return clienteIdCliente;
    }

    /**
     * Define el valor de la propiedad clienteIdCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteIdCliente(String value) {
        this.clienteIdCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainiciocontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainiciocontrato() {
        return fechainiciocontrato;
    }

    /**
     * Define el valor de la propiedad fechainiciocontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainiciocontrato(String value) {
        this.fechainiciocontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaterminocontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaterminocontrato() {
        return fechaterminocontrato;
    }

    /**
     * Define el valor de la propiedad fechaterminocontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaterminocontrato(String value) {
        this.fechaterminocontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idcontrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcontrato() {
        return idcontrato;
    }

    /**
     * Define el valor de la propiedad idcontrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcontrato(String value) {
        this.idcontrato = value;
    }

}
