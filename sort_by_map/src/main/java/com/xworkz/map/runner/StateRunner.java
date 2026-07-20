package com.xworkz.map.runner;

import com.xworkz.map.dto.StateDto;

import java.util.HashMap;
import java.util.Map;

public class StateRunner {
    public static void main(String[] args) {
        StateDto stateDto=new StateDto();
        Map<Integer,StateDto>state=new HashMap<>();
        state.put(1,new StateDto("Karnataka","dks"));
        state.put(2,new StateDto("Tamil Nadu","vijay"));
        state.put(3,new StateDto("Kerala","sathish"));
        state.put(4,new StateDto("Maharashtra","narendra"));
        state.put(5,new StateDto("Delhi","arvind"));
        state.forEach((key,value)->System.out.println(key+" "+value));
        System.out.println(state.keySet());
        System.out.println(state.values());
        System.out.println("size of the map: "+state.size());
        state.clear();
        System.out.println("size after clear: "+state.size());
    }
}
