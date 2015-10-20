/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

/**
 *
 * @author Hovsep
 */
import java.util.List;

public interface IEffectenbeurs {

	List<IFonds> getKoersen();
        void stop();

}