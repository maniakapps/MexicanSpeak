package com.maniakapps.mexicanspeak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.bukkit.Bukkit.getLogger;

class FraseHandler {
    private int index;
    private ArrayList<Frase> frases = new ArrayList<>();

    FraseHandler() {
       /* try{
            File file = new File(fileName);
            Scanner fileData = new Scanner(file);
            while(fileData.hasNextLine()){
                frases.add(new Frase(fileData.nextLine()));
            }
        }catch (IOException ex){
            getLogger().info("Phrases not found or an error occurred");

        }*/
        frases.add(new Frase("Mande!"));
        frases.add(new Frase("Padre!"));
        frases.add(new Frase("¿Qué onda wey!"));
        frases.add(new Frase("Vente paca!"));
    }

    ArrayList<Frase> getFrases() {
        return frases;
    }

    void display() {
        for (Frase fs :
                frases) {
            System.out.println(fs.getFrase());
        }
    }


}
