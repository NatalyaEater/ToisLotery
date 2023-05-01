package org.example;
import org.example.View;
import org.example.LotteryLot;

import java.util.Scanner;


public class Controller {
    public void init(){
        LotteryLot lotteryLot=new LotteryLot() ;
        View cv = new View();
        Basket bs=new Basket();
        int answer = 1;
        while (answer != 5){
            answer = cv.mainMenu();
            switch (answer){
                case 1:
                    bs.baskerral();
                    lotteryLot.lottteryToy();
                    lotteryLot.readFile();
                    lotteryLot.lottteryToy();
                    lotteryLot.readFile();
                    break;
                case 2:
                    lotteryLot.readFile();
                    break;

            }
        }
    }

}