import java.util.Collections;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        boolean[][] canvas = null;
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter command: ");
            input = sc.nextLine().trim();
            if (input.matches("[cC]\\s\\d+\\s\\d+")) {
                x = Integer.parseInt(input.split(" ")[1]);
                y = Integer.parseInt(input.split(" ")[2]);
                canvas = new boolean[x][y];
                for (int a = 0; a < x; a++) {
                    for (int b = 0; b < y; b++) {
                        canvas[a][b] = false;
                    }
                }
                drawCanvas(canvas, x, y);
            } else if (input.matches("[lL]\\s\\d+\\s\\d+\\s\\d+\\s\\d+")) {
                if (canvas != null) {
                    if (input.split(" ")[1].equalsIgnoreCase(input.split(" ")[3])) {
                        int x_draw = Integer.parseInt(input.split(" ")[1]) - 1;
                        int start = Integer.parseInt(input.split(" ")[2]) - 1;
                        int end = Integer.parseInt(input.split(" ")[4]) - 1;
                        if (start > end) {
                            int temp = start;
                            start = end;
                            end = temp;
                        }
                        for (; start <= end; start++) {
                            if (x_draw >= 0 && x_draw < x && start >= 0 && start < y) {
                                canvas[x_draw][start] = true;
                            }
                        }
                    } else if (input.split(" ")[2].equalsIgnoreCase(input.split(" ")[4])) {
                        int y_draw = Integer.parseInt(input.split(" ")[2]) - 1;
                        int start = Integer.parseInt(input.split(" ")[1]) - 1;
                        int end = Integer.parseInt(input.split(" ")[3]) - 1;
                        if (start > end) {
                            int temp = start;
                            start = end;
                            end = temp;
                        }
                        for (; start <= end; start++) {
                            if (y_draw >= 0 && y_draw < y && start >= 0 && start < x) {
                                canvas[start][y_draw] = true;
                            }
                        }
                    }
                    drawCanvas(canvas, x, y);
                } else {
                    System.out.println("\nCanvas not initialized yet.\n");
                }
            } else if (input.matches("[rR]\\s\\d+\\s\\d+\\s\\d+\\s\\d+")) {
                int x1 = Integer.parseInt(input.split(" ")[1]) - 1;
                int y1 = Integer.parseInt(input.split(" ")[2]) - 1;
                int x2 = Integer.parseInt(input.split(" ")[3]) - 1;
                int y2 = Integer.parseInt(input.split(" ")[4]) - 1;
                if (canvas != null) {
                    for (int a = x1; a <= x2; a++) {
                        if (a >= 0 && a < x && y1 >= 0 && y1 < y) {
                            canvas[a][y1] = true;
                        }
                        if (a >= 0 && a < x && y2 >= 0 && y2 < y) {
                            canvas[a][y2] = true;
                        }
                    }
                    for (int a = y1; a <= y2; a++) {
                        if (a >= 0 && a < y && x1 >= 0 && x1 < x) {
                            canvas[x1][a] = true;
                        }
                        if (a >= 0 && a < y && x2 >= 0 && x2 < x) {
                            canvas[x2][a] = true;
                        }
                    }
                    drawCanvas(canvas, x, y);
                } else {
                    System.out.println("\nCanvas not initialized yet.\n");
                }
            } else if (input.equalsIgnoreCase("q")) {
                System.out.println("\nGoodBye!\n");
                System.exit(0);
            } else {
                System.out.println("\nNot a Valid Command!!! Try Again.\n");
            }
        }
    }

    public static void drawCanvas(boolean[][] canvas, int width, int height) {
        String border = String.join("", Collections.nCopies(width + 2, "-"));
        System.out.println(border);

        for (int y = 0; y < height; y++) {
            for (int x = -1; x < width + 1; x++) {
                if (x >= 0 && x < width) {
                    if (canvas[x][y]) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("|");
                    if (x == width) {
                        System.out.println("");
                    }
                }
            }
        }
        System.out.println(border);
    }
}

