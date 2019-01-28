public class Canvas extends DrawableObject {

    public Canvas(int x, int y) {
        super(new int[]{0, 0}, new int[]{x, y});

    }


    @Override
    public String[][] getCoordinates() {
        String[][] canvas = new String[getEndPoint()[1]][getEndPoint()[0]];


        for (int y = getStartPoint()[1]; y < getEndPoint()[1]; y++) {
            for (int x = getStartPoint()[0]; x < getEndPoint()[0]; x++) {
                if (y == getStartPoint()[1] || y == getEndPoint()[1]-1) {
                    canvas[y][x] = "-";

                } else if (x == getStartPoint()[0] || x == getEndPoint()[0]-1) {
                    canvas[y][x] = "|";
                }
                else {
                    canvas[y][x]=" ";
                }


            }


        }
        return canvas;

    }


}
