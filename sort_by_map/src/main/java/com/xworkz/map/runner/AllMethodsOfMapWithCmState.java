package com.xworkz.map.runner;

import com.xworkz.map.dto.ChiefMinisterDto;
import com.xworkz.map.dto.StateDto;

import java.util.HashMap;
import java.util.Map;

public class AllMethodsOfMapWithCmState {
    public static void main(String[] args) {
        StateDto stateDto=new StateDto();
        ChiefMinisterDto chiefMinisterDto=new ChiefMinisterDto();
        Map<StateDto,ChiefMinisterDto> state=new HashMap<>();
        state.put(new StateDto("Karnataka","Bengaluru"),new ChiefMinisterDto("DKS","INDIA"));
        state.put(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Vijay","TVK"));
        state.put(new StateDto("Kerala","Thiruvananthapuram"),new ChiefMinisterDto("Satish","INDIA"));
        state.put(new StateDto("Maharashtra","Mumbai"),new ChiefMinisterDto("Eknath Shinde","NDA"));
        state.put(new StateDto("Delhi","New Delhi"),new ChiefMinisterDto("Arvind Kejriwal","AAP"));
//        state.put(new StateDto("Delhi","New Delhi"),new ChiefMinisterDto(" Arvind Kejriwal","AAP"));
        System.out.println("---------------------entries of Map---------------------");
        state.forEach((key,value)->System.out.println(key+" "+value));
        System.out.println("---------------------KeySet()--------------------------");
        System.out.println(state.keySet());
        System.out.println("---------------------values()--------------------------");
        System.out.println(state.values());
        System.out.println("---------------------entrySet()--------------------------");
        System.out.println(state.entrySet());
        System.out.println("---------------------remove()--------------------------");
//        state.remove(new StateDto("Delhi","New Delhi"));

//        state.forEach((key,value)->System.out.println(key+" "+value));
//        System.out.println("size of the map: "+state.size());
        boolean check=state.remove(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Vijay","TVK"));

        System.out.println(check);
        //        System.out.println("---------------------size()--------------------------");
//        System.out.println("size of the map: "+state.size());
//        state.clear();
//        System.out.println("size after clear: "+state.size());
    }
}
