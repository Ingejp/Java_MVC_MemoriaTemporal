
package Clases;

public class Usuario_Vectores {

private String[][] usuario;//se debe almacenar nombre[] apellido[] en cada columna
private int indiceCodigo;
private String resultado="";
private String filas;

public Usuario_Vectores(){//constructor
    this.usuario = new String [10][3];
    this.indiceCodigo=0;
}

public boolean insertarUsuario(String codigo, String nombre, String apellido){
    this.usuario[this.indiceCodigo][0]= codigo;
    this.usuario[this.indiceCodigo][1]= nombre;
    this.usuario[this.indiceCodigo][2]=apellido;
    this.incrementarIndice();
    return true;
}
private void incrementarIndice() {
    this.indiceCodigo=this.indiceCodigo+1;
}

public String[][] obtenerUsuarios(){    
    return this.usuario;
}

public void recorrerVector(){
   for(int i=0; i<usuario.length; i++){
       if(!(this.usuario[i][0]==null)){//se valida si es diferente que null
           resultado += this.usuario[i][0] + this.usuario[i][1]+ this.usuario[i][2]+'\n';
       }
       
    }
}
public String buscarUsuarioPorCodigo( String codigo){
    String fila=null;
    for(int i=0; i<=usuario.length; i++){         
        if(this.usuario[i][0].equals(codigo)){
             return fila= "<tr><td>" + this.usuario[i][0] + "</td>" + "<td>" + this.usuario[i][1] + "</td>"+ "<td>" + this.usuario[i][2]+"</td></tr>";
         }

      }
    return fila;
}

public boolean eliminarUsuarioPorCodigo(String codigo){
    for(int i=0; i<=usuario.length; i++){         
        if(this.usuario[i][0].equals(codigo)){
            this.usuario[i][0]="";
            this.usuario[i][1]="";
            this.usuario[i][2]="";
            return true;
         }

      }
    return false;
}


public String cargarUsuarioPorCodigo( String codigo){
    String fila=null;
    for(int i=0; i<=usuario.length; i++){         
        if(this.usuario[i][0].equals(codigo)){
             return fila= "<div class=\"elementoForm\"><input type=\"text\" name=\"nombre\" placeholder=\"Nombre\" id=\"nombre\" value=\"" + this.usuario[i][1] + "\"></div>" +
                     "<div class=\"elementoForm\"><input type=\"text\" name=\"apellido\" placeholder=\"apellido\" id=\"apellido\" value=\"" + this.usuario[i][2] + "\"></div>";
         }

      }
    return fila;
}

public boolean actualizarUsuarioPorCodigo(String codigo, String nombre, String apellido){
    for(int i=0; i<=usuario.length; i++){         
        if(this.usuario[i][0].equals(codigo)){
            this.usuario[i][1]=nombre;
            this.usuario[i][2]=apellido;
            return true;
         }

      }
    return false;
}  
    
}
