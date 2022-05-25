<%-- 
    Document   : Persona
    Created on : 23/05/2022, 08:09:36 PM
    Author     : nitro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="">
            <table>
                    <h1>Formulario para registrar persona</h1>
            <tr>
                <td>Documento</td>
                <td><input type="text" name="txtdocumento"></td>
            </tr>
            
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="txtname"></td>
                
            </tr>
            <tr>
                <td>Apellido</td>
                <td><input type="text" name="txtapellido"></td>
                    
            </tr>
            
             <tr>
                <td>Fecha nacimiento</td>
                <td><input type="date" name="txtfecha"></td>
                    
            </tr>
            
            <tr>
                <td><input type="submit" name="accion" value="enviar"></td>
            </tr>
            
            
                
            </table>
            
        </form>
      
        
    </body>
</html>
