package ListEssence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * CompareArryaAndLinked.java
 */
public class CompareArrayAndLinked {

    public static void measureProcessTime(List list) {

        // ランダムアクセス
        Random random = new Random();
        long before = System.currentTimeMillis();
        list.get(random.nextInt(1000000));
        long after = System.currentTimeMillis();
        long time = after - before;

        System.out.println("Complete Random Access");
        System.out.println("Time:" + time + " ms");

        // 検索
        before = System.currentTimeMillis();
        list.indexOf(new Integer(6875764));
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("Complete Find");
        System.out.println("Time:" + time + " ms");

        // 追加
        before = System.currentTimeMillis();
        list.add(new Integer(1000000));
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("Complete Adding");
        System.out.println("Time:" + time + " ms");

        // 挿入
        before = System.currentTimeMillis();
        list.add(1, new Integer(1111111));
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("Complete Insert");
        System.out.println("Time:" + time + " ms");

        // 削除
        before = System.currentTimeMillis();
        list.remove(1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("Complete Delete");
        System.out.println("Time:" + time + " ms");

    }

    public static void main(String args[]) {

        System.out.println("----Array List ------");
        List arrayList = new ArrayList();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        CompareArrayAndLinked.measureProcessTime(arrayList);

        System.out.println("---- Linked List ------");
        List linkedList = new LinkedList();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        CompareArrayAndLinked.measureProcessTime(linkedList);

    }
}
