package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[][] board = new String[6][6];
        Random random = new Random();
        int l = random.nextInt(5);
        int v = random.nextInt(5);
     while (l == 0 || v == 0) {
           l = random.nextInt(5);
           v = random.nextInt(5);
        }
  System.out.println("All set. Get ready to rumble!");
        for (int c = 0; c < 1; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter line");
            int a = in.nextInt();
            System.out.println("Enter column");
            int b = in.nextInt();

            if (a == l && v == b) {
                c = 1;
                System.out.println("Congratulations You have won!");
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (a == l && b == v )  {
                        board[a][b] = "x";
                    } else if (i == 0) {
                        board[i][j] = Integer.toString(j);
                    } else if (j == 0) {
                        board[i][j] = Integer.toString(i);
                    } else if (i == a && j == b || board[i][j] == "*") {
                        board[i][j] = "*";
                    } else {
                        board[i][j] = "-";
                    }

                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print("" + board[i][j] + "|");
                }
                System.out.println();
            }
        }
    }
}
