import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletFactoria")
public class Servlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        //Recuperamos los valores
        int num = Integer.parseInt(req.getParameter("numero"));
        int resul = 1;
        int calc=2 ;


        //Imprimimos los valores
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Factorial</h1>");

        if (num == 0 || num == 1){
        calc =1;
        }
        //Creamos un  for para que vaya multiplicando
        //despues guardamos el resultado en la variable
        //res
        for(int i = 1; i <= num; i++){

            resul = num * i;
        }
        calc=resul;
        out.println("El factorial de " + num + " es " + calc);
        out.println("</body>");
        out.println("</html>");

    }






}

