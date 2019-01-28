import java.util.ArrayList;
import java.util.List;

public class DrawCanvasUtil {

    public static void main(String[] args) {
        new DrawCanvasUtil().draw();
    }

    public void draw () {
        Canvas canvas= new Canvas(9,5);
        Rectangle rectangle = new Rectangle(1,1,8,3);
        String[][] coordinates= canvas.getCoordinates();

        List<String[][]> coordinateList = new ArrayList<String[][]>();
        coordinateList.add(canvas.getCoordinates());
        coordinateList.add(rectangle.getCoordinates());


        String[][] mergedCoordinates = rectangle.getCoordinates();//mergeCordinateList(coordinateList);

        for (int y = 0; y < mergedCoordinates.length; y++) {


            System.out.println(String.join("", mergedCoordinates[y]));


        }
    }

    private String[][] mergeCordinateList(List<String[][]> coordinateList) {

        String[][] mergedCoordinates = new String[coordinateList.get(0).length][coordinateList.get(0)[0].length];
        for (String[][] coordinates: coordinateList){

            for (int y = 0; y < coordinates.length; y++) {
                for (int x = 0; x < coordinates[y].length; x++) {
                    if (mergedCoordinates[y][x] == null || !mergedCoordinates[y][x] .equals(" ")){
                        mergedCoordinates[y][x] = coordinates[y][x];

                    }


                }
            }
        }

        return mergedCoordinates;
    }


}
