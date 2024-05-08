public class NN{
    public NN(){
        DataPoints[] trainData = new DataPoints[5];
        trainData[0] = new DataPoints(2,6,false);
        trainData[1] = new DataPoints(1,4,false);
        trainData[2] = new DataPoints(4,1,false);
        trainData[3] = new DataPoints(8,8,true);
        trainData[4] = new DataPoints(5,9,true);
        DataPoints[] testData = new DataPoints[5];
        testData[0] = new DataPoints(2, 2, false);
        testData[1] = new DataPoints(6, 1, false);
        testData[2] = new DataPoints(1, 3, false);
        testData[3] = new DataPoints(2, 10, true);
        testData[4] = new DataPoints(8, 5, true);

       
        

    }
public double cost(){
double cost = 0.0;



return cost;


}




public static void main(String[] args) {
    new NN();
}
}