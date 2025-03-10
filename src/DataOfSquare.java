import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {


    //ArrayList that'll contain the colors
    ArrayList<Color> C =new ArrayList<Color>();
    int color; //2: snake , 1: food, 0:empty
    SquarePanel square;
    public DataOfSquare(int col){

        C.add(Color.WHITE);//0
        C.add(Color.RED);    //1
        C.add(Color.BLACK);   //2
        color=col;
        square = new SquarePanel(C.get(color));
    }
    public void lightMeUp(int c){
        square.ChangeColor(C.get(c));
    }
}