package pruebaTecnica;

public class Main {

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = new MarkList();
        obj2.num = 60;
        obj3.graceMarks(obj2);
        System.out.println(obj1.num);
    }


}

