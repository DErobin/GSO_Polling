/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanners;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MockEffectenbeurs implements IEffectenbeurs {

    ArrayList<Fonds> koersen;
    Timer timer;
    
    
    public MockEffectenbeurs() {
        koersen = new ArrayList<Fonds>();
        koersen.add(new Fonds("Unilever", 100));
        koersen.add(new Fonds("Apple", 60));
        koersen.add(new Fonds("Samsung", 80));
        koersen.add(new Fonds("Asus", 65));
        timer = new Timer();
        
    }

    @Override
    public List<IFonds> getKoersen() {
        //todo: problemen
        return new ArrayList<IFonds>(koersen);
    }
    
        class MockTask extends TimerTask {

        @Override
        public void run() {
            for (Fonds f : koersen) {
                if (Math.floor(Math.random() * 101) == 0) {
                    f.setKoers(f.getKoers() + Math.floor(Math.random() * 56));
                }
            }
        }
    }
    
    
}