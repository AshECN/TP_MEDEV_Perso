/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev_1;

/**
 *
 * @author victo
 */
public class Point {
    private int abscisse;
    private int ordonne;

    /**
     * 
     * @param x
     * @param y 
     */
    public Point(int x, int y) {
        this.abscisse = x;
        this.ordonne = y;
    }
    
    /**
     * 
     * @return 
     */
    public int getX() {
        return abscisse;
    }

    /**
     * 
     * @param x 
     */
    public void setX(int x) {
        this.abscisse = x;
    }

    /**
     * 
     * @return 
     */
    public int getY() {
        return ordonne;
    }

    /**
     * 
     * @param y 
     */
    public void setY(int y) {
        this.ordonne = y;
    }
}
