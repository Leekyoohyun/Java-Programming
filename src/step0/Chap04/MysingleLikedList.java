package Chap04;

public class MysingleLikedList<E> {

    public Node<E> head;
    public int size;

    public MysingleLikedList(){
        head = null;
        size = 0;
    } // 위에서 해도 무관

    public void add(int index, E item){  // insert

    }
    public void remove(){   // delete

    }

    public int indexOf(){  //search
        return -1;
    }

    public static void main(String[] args) {
        MysingleLikedList<Integer> listExample = new MysingleLikedList<Integer>();
        listExample.add(0,5);
        listExample.add(1,4);
        listExample.add(2,3);
        listExample.add(3,2);
        listExample.add(4,1);
    }
}
