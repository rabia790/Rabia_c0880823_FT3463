import java.util.ArrayList;
import java.util.Scanner;

public class Move {
    ArrayList<MoveModelClass> moveModelClasses;
    ArrayList<MoveModelClass.CardBoard> cardBoardArrayList;
    ArrayList<MoveModelClass.ObjectList> objectListArrayList;
    ArrayList<MoveModelClass.ObjectList> objectListArrayList2;
    ArrayList<MoveModelClass.ObjectList> objectListArrayList3;
    String enteredString = "";






    public void initValues() {
        moveModelClasses = new ArrayList<>();
        objectListArrayList = new ArrayList<>();
        objectListArrayList2 = new ArrayList<>();
        objectListArrayList3 = new ArrayList<>();
        cardBoardArrayList = new ArrayList<>();
        moveModelClasses.clear();
        objectListArrayList.clear();
        objectListArrayList2.clear();
        objectListArrayList3.clear();
        cardBoardArrayList.clear();
        objectListArrayList.add(new MoveModelClass.ObjectList("scissors"));
        objectListArrayList.add(new MoveModelClass.ObjectList("book"));
        objectListArrayList2.add(new MoveModelClass.ObjectList("compass"));
        objectListArrayList2.add(new MoveModelClass.ObjectList("pencils"));
        objectListArrayList2.add(new MoveModelClass.ObjectList("scissors"));
        objectListArrayList2.add(new MoveModelClass.ObjectList("scissors"));
        objectListArrayList3.add(new MoveModelClass.ObjectList("scarf"));
        objectListArrayList3.add(new MoveModelClass.ObjectList("pens"));
        objectListArrayList3.add(new MoveModelClass.ObjectList("rubber"));

        cardBoardArrayList.add(new MoveModelClass.CardBoard(1, objectListArrayList));
        cardBoardArrayList.add(new MoveModelClass.CardBoard(2, objectListArrayList2));
        cardBoardArrayList.add(new MoveModelClass.CardBoard(3, objectListArrayList3));

        moveModelClasses.add(new MoveModelClass(cardBoardArrayList));
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Please Enter Object Name");
        enteredString = myObj.nextLine();
        findBoxId();
    }
}