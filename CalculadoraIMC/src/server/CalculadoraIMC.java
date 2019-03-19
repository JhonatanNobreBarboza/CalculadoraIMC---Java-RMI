/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jhonatan
 */
public class CalculadoraIMC extends UnicastRemoteObject implements ICalculadoraIMC {

    private static final long serialVersionUID = -5708972502194597862L;

    public CalculadoraIMC() throws RemoteException {
        super();

    }

    @Override
    public double calcular(double peso, double altura) throws RemoteException {
        return  peso / (altura * altura);
    }

    @Override
    public String getFaixa(double imc) throws RemoteException {
        System.out.println(imc);
        String faixa = ""; 
        if (imc < 17) {
                faixa = (" você está muito abaixo do peso");
            } else if (imc < 18.49) {
                faixa =("você está abaixo do peso");
            } else if (imc < 25) {
                faixa =(" você está com o peso normal");
            } else if (imc < 30) {
                faixa =("você está Acima do peso");
            } else if (imc < 35) {
                faixa =("você está com Obesidade I");
            } else if (imc < 40) {
                faixa =("você está com Obesidade II (Severa)");
            } else {
                faixa =("você está com Obesidade III (Mórbida)");
            }
        return faixa;
    }
}
