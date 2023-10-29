
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDefinitivoClienteEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDefinitivoClienteEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rutaeliminar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDefinitivoClienteEmpresa", propOrder = {
    "rutaeliminar"
})
public class EliminarDefinitivoClienteEmpresa {

    protected String rutaeliminar;

    /**
     * Obtiene el valor de la propiedad rutaeliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaeliminar() {
        return rutaeliminar;
    }

    /**
     * Define el valor de la propiedad rutaeliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaeliminar(String value) {
        this.rutaeliminar = value;
    }

}
