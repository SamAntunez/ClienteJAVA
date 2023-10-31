package Test;


import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import com.rrhh.feria_virtual.interfaz_grafica.Logint;
import ws.Login;

public class TestWS {


    public static void main(String[] args) {
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        WebServiceFV cliente = servicio.getWebServiceFVPort();
        
        System.out.println(cliente.agregarProductor(12222222, "1", "alan", "a", "a", "01-01-1991", "das", "asdas@sdas.cl", "asd", "1") ? "Si" : "no");
        
        Login l = cliente.listarlogin2("admin", "admin123");
        System.out.println(l.getTipousuario());
        /*Logint princ = new Logint();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);*/

    }

}