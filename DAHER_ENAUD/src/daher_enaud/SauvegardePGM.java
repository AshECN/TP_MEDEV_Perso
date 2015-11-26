/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daher_enaud;

import java.io.*;
import java.util.Scanner;

/**
 * Sauvegarde de PGM. Sauvegarde un PGM en fichier txt avec les données propres
 * à un PGM.
 *
 * @author Hicham DAHER et Victor ENAUD
 */
public class SauvegardePGM {

    public SauvegardePGM() {
    }

    /**
     * Fonction de sauvegarde pure. Permet de sauvegarder les données du PGM.
     * Ecrit un fichier de sauvegarde commençant par P2, puis # - les
     * commentaires -, largeur et hauteur, teinte maxi, et les données de
     * l'image.
     *
     * @param myPGM le PGM que nous devons sauvegarder
     * @param filename le nom du fichier de sauvegarde - de type String.
     */
    public static void Save(PGM myPGM, String filename) {
        Scanner sc = new Scanner(System.in); // Scanner pour lire les inputs demandés

        // Test pour éviter qu'on n'écrase un nom de fichier déjà existant
        Boolean nomExistant = false;
        int i = 1;
        while (nomExistant == false) {
            File f = new File(filename);
            if (f.exists() == true) {
                filename = filename + i + ".txt";
                i++;
            } else {
                nomExistant = true;
            }
        }

        BufferedWriter bufferedWriter = null;

        try {
            // Creation du BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter(filename));
            // On écrit les paramètres de sauvegarde
            bufferedWriter.write("P2");
            bufferedWriter.newLine();

            bufferedWriter.write(myPGM.getCommentaires());
            bufferedWriter.newLine();

            bufferedWriter.write(myPGM.getImage().length + " " + myPGM.getImage()[myPGM.getImage().length].length);
            bufferedWriter.newLine();

            bufferedWriter.write(myPGM.getTeinteMaxi());
            bufferedWriter.newLine();

            // Sauvegarde de l'image
            if (myPGM.getImage() != null) {

                for (int j = 0; j < myPGM.getImage()[myPGM.getImage().length].length; j++) {
                    for (int k = 0; k < myPGM.getImage().length; k++) {
                        bufferedWriter.write(myPGM.getImage()[k][j] + " ");
                    }
                    bufferedWriter.newLine();
                }
            }                   

        } // on attrape l'exception si on a pas pu creer le fichier
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } // on attrape l'exception si il y a un probleme lors de l'ecriture dans le fichier
        catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    // je force l'écriture dans le fichier
                    bufferedWriter.flush();
                    // puis je le ferme
                    bufferedWriter.close();
                }
            } // on attrape l'exception potentielle 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
