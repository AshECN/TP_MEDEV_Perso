/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daher_enaud;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Classe permettant de charger une partie à partir d'un fichier de sauvegarde
 *
 * @author Hicham DAHER et Victor ENAUD
 */
public class ChargementPGM {

    private String source;
    private int[] image;

    /**
     * Permet de charger le PGM.
     * Elle va faire appel à une méthode chargement qui va parcourir le PGM.
     * On vérifiera ainsi la compatibilité du fichier et on récupérera
     * les propriétés utiles à l'image (taille et niveaux de gris).
     * 
     * @param source la source de PGM
     */
    public ChargementPGM(String source) {
        this.source = source;
        this.image = chargement();
    }
    
    private int[] chargement() {
        int largeur = 0;
        int hauteur = 0;
        int[] image = new int[0]; // initialisation de base pour l'image

        return image;
    }
}
