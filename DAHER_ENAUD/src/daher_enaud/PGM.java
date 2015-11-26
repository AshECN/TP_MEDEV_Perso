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
    String commentaires;

    public PGM(int[][] image, int teinteMaxi,String commentaires) {
        this.image = image;
        this.teinteMaxi = teinteMaxi;
        this.commentaires = commentaires;
    }

    public int[][] getImage() {
        return image;
    }

    public int getTeinteMaxi() {
        return teinteMaxi;
    }

    public String getCommentaires() {
        return commentaires;
    }
    
    public void setImage(int[][] image) {
        this.image = image;
    }

    public void setTeinteMaxi(int teinteMaxi) {
        this.teinteMaxi = teinteMaxi;
    }   

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
    
    public void setImageCoordonnees(int largeur, int hauteur, int value){
        this.image[hauteur][largeur]=value;
    }
    
}
