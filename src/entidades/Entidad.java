/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jherom Chacon
 */
public abstract class Entidad {
    protected int id;
    
    protected String nombre;
    
    protected Date fecha;
    
    protected boolean estado;
    
    public void setId(int id){this.id = id;}
    
    public void setNombre(String nombre){
        this.nombre = nombre;}
    
    public void setFechaCreacion(String fecha)
    throws Exception{
        final String FORMATO="dd/MM/yyyy";
        try {
            java.util.Date fechaUtil=new SimpleDateFormat(FORMATO).parse(fecha);
            this.fecha=new Date(fechaUtil.getTime());
            
        }catch(Exception ex){
            throw ex;
        }
       
    
}
    
    public void setFechaCreacion(java.util.Date fecha){
        this.fecha = new Date(fecha.getTime());
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public int getId(){return this.id;}
    
    public String getNombre(){return this.nombre;}
    
    public Date getFechaCreacion(){return this.fecha;}
    
    public boolean getEstado(){return this.estado;}
}
