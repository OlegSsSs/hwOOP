package hwSeminar3;


import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add("Запись1");
        list1.add("Запись2");
        list1.add("Запись3");
        list1.add("Запись5");


        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            String node = iterator.next();
            System.out.println(node);
        }
    }

}



