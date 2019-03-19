/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jhonatan
 */
public interface ICalculadoraIMC extends Remote{
    public double calcular(double altura, double peso) throws RemoteException;
    public String getFaixa(double imc) throws RemoteException;    
}
