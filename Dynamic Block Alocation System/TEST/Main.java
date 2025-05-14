package TEST;

import mino.Block;

public class Main {
    public static void main(String[] args) {
        Mino_L1 mino = new Mino_L1();
        
        // Set the initial position to (0,0)
        mino.setXY(0, 0);
        
        System.out.println("Initial Shape:");
        mino.getDirection1();
        printShape(mino);

        System.out.println("\nShape after Direction 2:");
        mino.getDirection2();
        printShape(mino);

        System.out.println("\nShape after Direction 3:");
        mino.getDirection3();
        printShape(mino);

        System.out.println("\nShape after Direction 4:");
        mino.getDirection4();
        printShape(mino);
    }

    private static void printShape(Mino_L1 mino) {
        // Determine min x and min y to normalize coordinates
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int[] xs = new int[4];
        int[] ys = new int[4];

        for (int i = 0; i < 4; i++) {
            xs[i] = mino.tempB[i].x;
            ys[i] = mino.tempB[i].y;
            if (xs[i] < minX) minX = xs[i];
            if (ys[i] < minY) minY = ys[i];
        }

        // Normalize coordinates to zero-based grid
        for (int i = 0; i < 4; i++) {
            xs[i] = (xs[i] - minX) / Block.SIZE;
            ys[i] = (ys[i] - minY) / Block.SIZE;
        }

        // Determine grid size dynamically
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < 4; i++) {
            if (xs[i] > maxX) maxX = xs[i];
            if (ys[i] > maxY) maxY = ys[i];
        }

        char[][] grid = new char[maxY + 1][maxX + 1];

        // Fill grid with spaces
        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                grid[y][x] = ' ';
            }
        }

        // Place blocks as 'O'
        for (int i = 0; i < 4; i++) {
            grid[ys[i]][xs[i]] = 'O';
        }

        // Print the grid (rows top to bottom)
        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                System.out.print(grid[y][x]);
                if (x < maxX) System.out.print(' ');
            }
            System.out.println();
        }
    }
}

