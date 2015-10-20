/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanners;

import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robin
 */
public class BannerController {

    private AEXBanner banner;
    private IEffectenbeurs effectenbeurs;
    private Timer pollingTimer;

    public BannerController(AEXBanner banner) {

        this.banner = banner;
        this.effectenbeurs = new MockEffectenbeurs();
        //Start polling timer: update banner every two seconds
        pollingTimer = new Timer();
        pollingTimer.scheduleAtFixedRate(new fondsTask(), 100, 200);
    }

    class fondsTask extends TimerTask {

        @Override
        public void run() 
        {
            
            banner.setKoersen(getKoers());
            //banner.setKoersen(sb.toString());
        }
    }
    
    private String getKoers()
    {
        StringBuilder sb = new StringBuilder("");

        for (IFonds f : effectenbeurs.getKoersen()) 
        {
            sb.append(f.getNaam()).append(": ").append(f.getKoers()).append(" ");
        }
        return sb.toString();
    }

    // Stop banner controller
    public void stop() {
        pollingTimer.cancel();
        // Stop simulation timer of effectenbeurs
        // TODO
        Thread.currentThread().interrupt();
    }
}
