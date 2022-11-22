
import java.util.ArrayList;

public class MoveModelClass {
    private ArrayList<CardBoard> cardBoardArrayList;

    public MoveModelClass(ArrayList<CardBoard> cardBoardArrayList) {
        this.cardBoardArrayList = cardBoardArrayList;
    }

    public ArrayList<CardBoard> getCardBoardArrayList() {
        return cardBoardArrayList;
    }

    public void setCardBoardArrayList(ArrayList<CardBoard> cardBoardArrayList) {
        this.cardBoardArrayList = cardBoardArrayList;
    }

    public static class CardBoard {
        private int id = 0;
        private ArrayList<ObjectList>objectListArrayList;

        public CardBoard(int id, ArrayList<ObjectList> objectListArrayList) {
            this.id = id;
            this.objectListArrayList = objectListArrayList;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public ArrayList<ObjectList> getObjectListArrayList() {
            return objectListArrayList;
        }

        public void setObjectListArrayList(ArrayList<ObjectList> objectListArrayList) {
            this.objectListArrayList = objectListArrayList;
        }
    }
    static class ObjectList{
        private String nameOfObject;

        public ObjectList(String nameOfObject) {
            this.nameOfObject = nameOfObject;
        }

        public String getNameOfObject() {
            return nameOfObject;
        }

        public void setNameOfObject(String nameOfObject) {
            this.nameOfObject = nameOfObject;
        }
    }
}


