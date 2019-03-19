/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import server.CalculadoraIMC;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import server.ICalculadoraIMC;
import server.CalculadoraIMC;

/**
 *
 * @author jhonatan
 */
public class IMC_Client {
    public static void main(String[] args) throws RemoteException {
       try{
            Registry reg = LocateRegistry.getRegistry();
            
            System.out.println("Cliente em Execução...");
            
            
            Scanner scanner = new Scanner(System.in);
            
            
            ICalculadoraIMC calcular = (ICalculadoraIMC) reg.lookup("calcular");
            
            //System.out.println(calcular.calcular(1.83, 82));
            System.out.println("Digite o Peso: ");
            double peso = scanner.nextDouble();
            
            System.out.println("Digite a Altura: ");
            double altura = scanner.nextDouble();
            
            System.out.println(calcular.calcular(peso, altura));
           
            double imc = calcular.calcular(peso, altura);
            
            System.out.println(calcular.getFaixa(imc));
           
            
            
        } catch (Exception ex) {
            System.out.println("Erro no Servidor!");
            ex.printStackTrace();
        }
    }
}
