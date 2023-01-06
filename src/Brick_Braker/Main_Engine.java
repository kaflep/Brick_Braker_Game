package Brick_Braker;
import Brick_Braker.Game_Design;

import javax.swing.JFrame;
import java.awt.*;

public class Main_Engine {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Game");
        Game_Design game_player = new Game_Design();
        frame.setBounds(10,10,700,600);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
        frame.add(game_player);


    }
}
