/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author jhonatan
 */
public interface ICalculadoraIMC extends java.rmi.Remote{
    public double altura(double altura) throws java.rmi.RemoteException;
    public double peso(double peso) throws java.rmi.RemoteException;
}
