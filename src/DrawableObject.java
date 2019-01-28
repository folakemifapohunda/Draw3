public abstract class DrawableObject {

int[] startPoint = new int [2];
int[] endPoint = new int [2];

    public DrawableObject(int[] startPoint, int[] endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int[] getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int[] startPoint) {
        this.startPoint = startPoint;
    }

    public int[] getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int[] endPoint) {
        this.endPoint = endPoint;
    }

    public abstract String[][] getCoordinates();

}
