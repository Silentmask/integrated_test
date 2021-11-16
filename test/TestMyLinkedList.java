import util.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args){
        TestMyLinkedList myTest = new TestMyLinkedList();
        myTest.testAdd();
    }

    public void testAdd(){

        MyLinkedList list = new MyLinkedList();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        list.add(i1);
        list.add(i2);
        if(2== list.size()&&list.contains(i1)&&list.contains(i2)){
            System.out.println("OK!");
        }else {
            System.out.println("Error int Add()!");
        }
    }

}
