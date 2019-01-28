public class Rectangle extends DrawableObject {

    public Rectangle(int x1, int y1, int x2, int y2) {
        super(new int[]{x1, y1}, new int[]{x2, y2});

    }

    @Override
    public String[][] getCoordinates() {
        String[][] canvas = new String[getEndPoint()[1]][getEndPoint()[0]];
        //Rectangle rectangle = new Rectangle(1,1,8,3);


        for (int y = 0; y < getEndPoint()[1]; y++) {
            for (int x = 0; x < getEndPoint()[0]; x++) {
                if (y == getStartPoint()[1] || y == getEndPoint()[1]-1) {
                    if (x>getStartPoint()[0] || x<getEndPoint()[0]) {
                        canvas[y][x] = "x";
                    }

                } else if (x == getStartPoint()[0] || x == getEndPoint()[0]-1) {
                    canvas[y][x] = "x";
                }
                else {
                    canvas[y][x]=" ";
                }


            }


        }
        return canvas;

    }



}

