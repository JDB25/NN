public class DataPoints {
    int x;
    int y;
    boolean fail;
    public DataPoints(int x, int y, boolean fail){
    this.x = x;
    this.y = y;
    this.fail = fail;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean getFail(){
        return fail;
    }
}
