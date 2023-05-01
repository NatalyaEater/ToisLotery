package org.example;
import org.example.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class LotteryLot {
    private List<Toy> listToys = new ArrayList<>();

    public List<Toy> add_toy(Toy name) {
        listToys.add(name);
        return listToys;
    }
    private List<Toy> delete_toy(Toy name) {
        listToys.remove(name);
        return listToys;
    }
    public void   getToys() {
        System.out.println(listToys);
    }

    private  void saveInFile() {
        try (FileWriter writer = new FileWriter("win.txt", true))
        {
            String text = listToys.get(0).getToy_name();
            writer.write(text + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
    public  void readFile() {
        try {
            FileReader fr = new FileReader("win.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
    }

    public  void lottteryToy() {
        Scanner scan = new Scanner(System.in);
        int chance=70;
        System.out.println("Задайте  шанс лотерии-укажите процент от  1 до 100");
        chance = scan.nextInt();
        if (chance >= 0 && chance <= 100) {
            Random rnd = new Random();
            int num = rnd.nextInt(100);
            if (num > chance) {
                System.out.println("defeat");
            } else if (num < chance) {
                System.out.println("Win");
                saveInFile();
                delete_toy(listToys.get(0));
            }
        } else {
            System.out.println("Попробуйте снова");
        }
    }
}