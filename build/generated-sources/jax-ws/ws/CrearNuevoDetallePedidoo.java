
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearNuevoDetallePedidoo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearNuevoDetallePedidoo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productor_rut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pedido_idpedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearNuevoDetallePedidoo", propOrder = {
    "cantidad",
    "idproducto",
    "productorRut",
    "pedidoIdpedido"
})
public class CrearNuevoDetallePedidoo {

    protected int cantidad;
    protected String idproducto;
    @XmlElement(name = "productor_rut")
    protected int productorRut;
    @XmlElement(name = "pedido_idpedido")
    protected String pedidoIdpedido;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdproducto() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdproducto(String value) {
        this.idproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad productorRut.
     * 
     */
    public int getProductorRut() {
        return productorRut;
    }

    /**
     * Define el valor de la propiedad productorRut.
     * 
     */
    public void setProductorRut(int value) {
        this.productorRut = value;
    }

    /**
     * Obtiene el valor de la propiedad pedidoIdpedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedidoIdpedido() {
        return pedidoIdpedido;
    }

    /**
     * Define el valor de la propiedad pedidoIdpedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedidoIdpedido(String value) {
        this.pedidoIdpedido = value;
    }

}
