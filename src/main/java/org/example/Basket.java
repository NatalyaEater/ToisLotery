package org.example;
import org.example.LotteryLot;
import org.example.Toy;

public class Basket {
    public  void baskerral() {

        Toy bear = new Toy(1, "Bear");
        Toy doll = new Toy(2, "Вoll");
        Toy elephant = new Toy(3, "Elephant");
        Toy duck = new Toy(4, "Duck");
        Toy lego = new Toy(5, "Lego");
        LotteryLot lotteryLot = new LotteryLot();
        lotteryLot.add_toy(bear);
        lotteryLot.add_toy(bear);
        lotteryLot.add_toy(bear);
        lotteryLot.add_toy(bear);
        lotteryLot.add_toy(doll);
        lotteryLot.add_toy(doll);
        lotteryLot.add_toy(doll);
        lotteryLot.add_toy(elephant);
        lotteryLot.add_toy(elephant);
        lotteryLot.add_toy(elephant);
        lotteryLot.add_toy(elephant);
        lotteryLot.add_toy(elephant);
        lotteryLot.add_toy(duck);
        lotteryLot.add_toy(duck);
        lotteryLot.add_toy(lego);
        lotteryLot.getToys();
        lotteryLot.lottteryToy();
        lotteryLot.readFile();
        lotteryLot.lottteryToy();
        lotteryLot.readFile();
    }
}