/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daher_enaud;

/**
 *
 * @author Hicham DAHER et Victor ENAUD
 */
public class PGM {
    
    int[][] image;
    int teinteMaxi ;

    public PGM(int[][] image, int teinteMaxi) {
        this.image = image;
        this.teinteMaxi = teinteMaxi;
    }

    public int[][] getImage() {
        return image;
    }

    public int getTeinteMaxi() {
        return teinteMaxi;
    }

    public void setImage(int[][] image) {
        this.image = image;
    }

    public void setTeinteMaxi(int teinteMaxi) {
        this.teinteMaxi = teinteMaxi;
    }   
    
    
}
