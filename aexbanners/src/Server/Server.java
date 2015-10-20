/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.registry.Registry;
import static javafx.application.Application.launch;
import shared.*;
//
/**
 *
 * @author Robin
 */
public class Server 
{
    private static final int port = 1099;
    private static final String bindName = "AEX";
    private Registry registry;
    private IEffectenbeurs beurs;
    
    public Server()
    {
        System.out.println("Start RMI Server..");
        
    }
    
    public static void main(String[] args) 
    {
        
    }
}
