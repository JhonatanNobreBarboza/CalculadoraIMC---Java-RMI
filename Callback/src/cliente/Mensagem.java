/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jhonatan
 */
public class Mensagem extends UnicastRemoteObject implements ICallback_Client {

    public Mensagem() throws RemoteException{
        super();
    }
    
    @Override
    public String mensagem(String nome, String mensagem) throws RemoteException {
        String returMenssagem = "Mensagem de callback recebida: " + mensagem;
        System.out.println(returMenssagem);
        return returMenssagem;
    }
    
}
