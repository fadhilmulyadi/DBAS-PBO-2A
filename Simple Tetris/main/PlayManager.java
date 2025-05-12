package main;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import mino.Mino;
import mino.Block;
import mino.Mino_L1;

public class PlayManager { // u/ play areanya, manage tetromino, dan handling gameplay (hapusLines, skor, dll.)

    //main play areanya
    final int WIDHT = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    // Mino
    Mino currentMino;
    final  int MINO_START_X;
    final  int MINO_START_Y;

    public PlayManager() {

        // Main frame play areanya
        // Di tengah layar/window
        left_x = (GamePanel.WIDHTH/2) - (WIDHT/2); // 1280/2 - 360/2 = 460
        right_x = left_x + WIDHT;
        top_y = 50;
        bottom_y = top_y + HEIGHT;

        MINO_START_X = left_x + (WIDHT/2) - Block.SIZE;
        MINO_START_Y = top_y + Block.SIZE;

        // Set starting
        currentMino = new Mino_L1();
        currentMino.setXY(MINO_START_X, MINO_START_Y);
        
    }
    public void update() {

        currentMino.update();
    }
    public void draw(Graphics2D g2) {
        
        //Frame play areanya (Main Frame)
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-4, top_y-4, WIDHT+8, HEIGHT+8); // -&+ tebal frame 

        // next tetromino/block frame (Frame Kicik Di Sebelahnya)
        int x = right_x + 100;
        int y = bottom_y - 200;
        g2.drawRect(x, y, 200, 200); 
        g2.setFont(new Font("Arial", Font.PLAIN, 30));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("NEXT", x+60, y+60);

        // draw the current mino
        if (currentMino != null) {
            currentMino.draw(g2);
        }
    }
}
