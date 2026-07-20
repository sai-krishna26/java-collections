package com.xworkz.map.runner;

import com.xworkz.map.dto.RoomDto;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class RoomRunner {
    public static void main(String[] args) {
        RoomDto roomDto=new RoomDto();
        Map<Integer,RoomDto> room=new HashMap<>();
        room.put(1,new RoomDto("L100",3));
        room.put(2,new RoomDto("R100",4));
        room.put(3,new RoomDto("L102",5));
        room.put(4,new RoomDto("R102",5));
        room.put(5,new RoomDto("L103",5));
        room.forEach((key,values)->System.out.println(key+" "+values));
        System.out.println(room.keySet());
        System.out.println(room.values());
        System.out.println("room size before updates: "+room.size());
        room.remove(4);
        System.out.println("room size after updates: "+room.size());

    }
}
