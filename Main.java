public class Main {

    public static void main(String[] args){

        ArrayFila<Integer> aq = new ArrayFila<>();

        System.out.println(aq.isEmpty());
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        System.out.println(aq.dequeue());
        System.out.println(aq.first());
        System.out.println(aq.size());
        System.out.println(aq.isEmpty());

        ListFila lq = new ListFila();

        System.out.println(lq.isEmpty());
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        System.out.println(lq.dequeue());
        System.out.println(lq.first());
        System.out.println(lq.size());
        System.out.println(lq.isEmpty());

    }

}