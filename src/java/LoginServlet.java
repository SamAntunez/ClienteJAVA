

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirige a la página Login.java cuando se hace una solicitud GET
        request.getRequestDispatcher("/com/rrhh/feria_virtual/interfaz_grafica/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Puedes manejar las solicitudes POST aquí si es necesario
        // Por ejemplo, procesar los datos del formulario de inicio de sesión
        // y redirigir a otra página según el resultado de la autenticación
    }
}
