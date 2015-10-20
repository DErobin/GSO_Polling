/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanners;

/**
 *
 * @author Hovsep
 */
import java.util.ArrayList;
import java.util.List;

public class Effectenbeurs implements IEffectenbeurs {

    ArrayList<IFonds> koersen;

    @Override
    public List<IFonds> getKoersen() {
        return koersen;
    }
}
