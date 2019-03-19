/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jhonatan
 */
public interface ICallback_Client extends Remote{
    public String mensagem(String nome, String mensagem) throws RemoteException;
    
}
