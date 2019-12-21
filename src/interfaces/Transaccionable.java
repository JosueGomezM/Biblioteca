/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Entidad;
import enumeradores.EstadosTransaccionales;
import excepciones.BibliotecaException;
import java.util.List;

/**
 *
 * @author Jherom
 */
public interface Transaccionable {
    public EstadosTransaccionales salvar() throws BibliotecaException;
    public EstadosTransaccionales eliminar() throws BibliotecaException;
    public EstadosTransaccionales encontrarUna() throws BibliotecaException;
    public Entidad encontrarTodas() throws BibliotecaException;
    public List<Entidad> encontrarAlgunas() throws BibliotecaException;
}
