package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *  org.dimigo.collection
 *     |_ MelonGenreChart
 * 1. 개요 :
 * 2. 작성일 : 2017-06-05
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class MelonGenreChart {
    public static void main(String[] args) {
        Map<String, List<Music>> map = new HashMap<>();
        List<Music> balladList = new ArrayList<>();
        List<Music> danceList = new ArrayList<>();
        balladList.add(new Music("팔레트", "아이유"));
        danceList.add(new Music("I LUV IT", "PSY"));
        danceList.add(new Music("맞지?", "언니쓰"));

        map.put("발라드", balladList);
        map.put("댄스", danceList);

        System.out.println("-- << 멜론 장르별 차트 >> --");
        printMap(map);

        System.out.println("-- << 댄스 2위 곡 변경 >> --");
        danceList.set(1, new Music("SIGNAL", "트와이스"));
        map.put("댄스", danceList);
        printMap(map);

        System.out.println("-- << 댄스 1위 곡 삭제 >> --");
        danceList.remove(1);
        map.put("댄스", danceList);
        printMap(map);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        map.clear();
        printMap(map);
    }

    public static void printMap(Map<String, List<Music>> map) {
        for (String key: map.keySet()) {
//            int i = 1;
            System.out.println("[" + key + "]");
            int i = 1;
            for (Music a: map.get(key)) {
                System.out.println(i++ + ". " + a.toString());
            }
        }
        System.out.println();
    }
}
