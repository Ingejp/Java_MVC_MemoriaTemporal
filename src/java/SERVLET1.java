import Clases.CalculadoraEspecial;
import Clases.MemoriaTemporal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CB090828
 */
@WebServlet(urlPatterns = {"/SERVLET1"})
public class SERVLET1 extends HttpServlet {
    private String control;
    private CalculadoraEspecial calculadora=new CalculadoraEspecial();
    private MemoriaTemporal registros= new MemoriaTemporal(10);

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //String nombre=request.getParameter("nombre");
            Double primero= Double.parseDouble(request.getParameter("primerNumero"));
            Double segundo=Double.parseDouble(request.getParameter("segundoNumero"));
            String control=request.getParameter("control");
            
            if(control.equals("1")){
               //registros.agregarElementoString(nombre);
               out.println(calculadora.sumarDecimales(primero, segundo));
            }else if(control.equals("2")){
                String[] vector=registros.obtenerVector();
                out.println("<table>");
                for (int i = 0; i < vector.length; i++){
                    if(!vector[i].isEmpty()){
                       out.println("<tr><td>"+ vector[i] + "</td></tr>" );
                    }
                }
                
                
                
                out.println("</table>");
            }
            else if(control.equals("3")){
               calculadora=new CalculadoraEspecial();
               registros= new MemoriaTemporal(10);
            }else{
               out.print(0);
            }
            
           // out.println(calculadora.getNombreDeClase());
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
