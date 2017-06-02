package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  org.dimigo.collection
 *     |_ MelonChart
 * 1. 개요 :
 * 2. 작성일 : 2017-06-02
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class MelonChart {
    public static void main(String[] args) {
        List<Music> list = new ArrayList<>();

        list.add(new Music("I LUV IT", "PSY"));
        list.add(new Music("맞지?", "언니쓰"));

        System.out.println("-- << 멜론 챠트 >> --");
        printLIst(list);

        System.out.println("-- << 2위 곡 추가 >> --");
        list.add(1, new Music("SIGNAL", "트와이스"));
        printLIst(list);

        System.out.println("-- << 3위 곡 변경 >> --");
        list.set(2, new Music("팔레트", "아이유"));
        printLIst(list);

        System.out.println("-- << 2위 곡 삭제 >> --");
        list.remove(1);
        printLIst(list);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        list.clear();
        printLIst(list);
    }

    public static void printLIst(List<Music> list) {
        int i = 1;
        for (Music a: list) {
            System.out.println(i++ + ". " + a.toString());
        }
        System.out.println();
    }

}
