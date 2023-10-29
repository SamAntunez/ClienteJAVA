package Test;


import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import com.rrhh.feria_virtual.interfaz_grafica.Login;

public class TestWS {


    public static void main(String[] args) {
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        WebServiceFV cliente = servicio.getWebServiceFVPort();

        
        Login princ = new Login();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

    }

}