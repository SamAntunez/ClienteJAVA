
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarNuevoProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarNuevoProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calibre_idcalibre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="producto_idproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productor_rut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarNuevoProducto", propOrder = {
    "precio",
    "stock",
    "calibreIdcalibre",
    "productoIdproducto",
    "productorRut",
    "img"
})
public class AgregarNuevoProducto {

    protected int precio;
    protected int stock;
    @XmlElement(name = "calibre_idcalibre")
    protected String calibreIdcalibre;
    @XmlElement(name = "producto_idproducto")
    protected String productoIdproducto;
    @XmlElement(name = "productor_rut")
    protected int productorRut;
    protected String img;

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtiene el valor de la propiedad calibreIdcalibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibreIdcalibre() {
        return calibreIdcalibre;
    }

    /**
     * Define el valor de la propiedad calibreIdcalibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibreIdcalibre(String value) {
        this.calibreIdcalibre = value;
    }

    /**
     * Obtiene el valor de la propiedad productoIdproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductoIdproducto() {
        return productoIdproducto;
    }

    /**
     * Define el valor de la propiedad productoIdproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductoIdproducto(String value) {
        this.productoIdproducto = value;
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
     * Obtiene el valor de la propiedad img.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg() {
        return img;
    }

    /**
     * Define el valor de la propiedad img.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg(String value) {
        this.img = value;
    }

}
