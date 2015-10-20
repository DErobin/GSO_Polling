/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Hovsep
 */
import shared.IEffectenbeurs;
import shared.IFonds;
import java.util.ArrayList;

public class Effectenbeurs implements IEffectenbeurs {

    ArrayList<IFonds> koersen;

    @Override
    public ArrayList<IFonds> getKoersen() {
        return koersen;
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("NIET NODIG"); //To change body of generated methods, choose Tools | Templates.
    }
}
