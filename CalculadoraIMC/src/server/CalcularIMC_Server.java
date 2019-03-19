/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jhonatan
 */
public class CalcularIMC_Server {

    public static void main(String[] args) throws RemoteException, MalformedURLException {         
         try{
            Registry reg = LocateRegistry.getRegistry();
              
            ICalculadoraIMC calcular = new CalculadoraIMC();
         
            reg.rebind("calcular", calcular);
            
            System.out.println("Servidor em Execução...");
            
        } catch (RemoteException ex) {
            System.out.println("Erro no Servidor!");
            ex.printStackTrace();
        }
    }
}
  