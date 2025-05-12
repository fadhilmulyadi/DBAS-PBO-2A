package main;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

public class PlayManager { // u/ play areanya, manage tetromino, dan handling gameplay (hapusLines, skor, dll.)

    //main play areanya
    final int WIDHT = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    public PlayManager() {

        // Main frame play areanya
        // Di tengah layar/window
        left_x = (GamePanel.WIDHTH/2) - (WIDHT/2); // 1280/2 - 360/2 = 460
        right_x = left_x + WIDHT;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
    }
    public void update() {

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
    }
}
