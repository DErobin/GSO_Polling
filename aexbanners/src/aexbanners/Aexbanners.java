/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanners;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Hovsep
 */
public class Aexbanners extends Application {
    
    private static AEXBanner banner;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
        BannerController  bc = new BannerController(banner);
        // TODO code application logic here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        banner=new AEXBanner();
        banner.start(primaryStage);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
