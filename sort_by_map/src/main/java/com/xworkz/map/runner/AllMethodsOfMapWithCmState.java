package com.xworkz.map.runner;

import com.sun.istack.internal.NotNull;
import com.xworkz.map.dto.ChiefMinisterDto;
import com.xworkz.map.dto.StateDto;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMethodsOfMapWithCmState {
    public static void main(String[] args) {
        StateDto stateDto=new StateDto();
        ChiefMinisterDto chiefMinisterDto=new ChiefMinisterDto();
        Map<StateDto,ChiefMinisterDto> state=new HashMap<>();

        System.out.println("---------------------put()---------------------");
        state.put(new StateDto("Karnataka","Bengaluru"),new ChiefMinisterDto("DKS","INDIA"));
        state.put(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Vijay","TVK"));
        state.put(new StateDto("Kerala","Thiruvananthapuram"),new ChiefMinisterDto("Satish","INDIA"));
        state.put(new StateDto("Maharashtra","Mumbai"),new ChiefMinisterDto("Eknath Shinde","NDA"));
        state.put(new StateDto("Delhi","New Delhi"),new ChiefMinisterDto("Arvind Kejriwal","AAP"));
        state.put(new StateDto("Delhi","New Delhi"),new ChiefMinisterDto("Arvind Kejriwal","AAP"));

        System.out.println("---------------------entries of Map---------------------");
        state.forEach((key,value)->System.out.println(key+" "+value));

        System.out.println("---------------------KeySet()--------------------------");
        System.out.println(state.keySet());

        System.out.println("---------------------values()--------------------------");
        System.out.println(state.values());

        System.out.println("---------------------entrySet()--------------------------");
        System.out.println(state.entrySet());

//        System.out.println("---------------------remove(k),remove(k,v)--------------------------");
//        System.out.println("size before remove: "+state.size());
//        state.remove(new StateDto("Delhi","New Delhi"));
//        boolean check=state.remove(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Vijay","TVK"));
//        System.out.println(check);
        System.out.println("size after remove: "+state.size());//size()

        System.out.println("---------------------containsKey()--------------------------");
        System.out.println("contains key: "+state.containsKey(new StateDto("Delhi","New Delhi")));

        System.out.println("---------------------containsValue()--------------------------");
        boolean valueCheck=state.containsValue(new ChiefMinisterDto("DKS","INDIA"));
        if(valueCheck==true)
        {
            System.out.println("value is present!!");
        }
        else
            System.err.println("value is not present");

        System.out.println("---------------------get()--------------------------");
        System.out.println(state.get(new StateDto("Karnataka","Bengaluru")));

        System.out.println("---------------------equals()--------------------------");
        Map<StateDto,ChiefMinisterDto> state2=new TreeMap<>();
        state2.put(new StateDto("Karnataka","Bengaluru"),new ChiefMinisterDto("DKS","INDIA"));
        state2.put(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Vijay","TVK"));
        state2.put(new StateDto("Kerala","Thiruvananthapuram"),new ChiefMinisterDto("Satish","INDIA"));
        state2.put(new StateDto("Maharashtra","Mumbai"),new ChiefMinisterDto("Eknath Shinde","NDA"));
        state2.put(new StateDto("Delhi","New Delhi"),new ChiefMinisterDto("Arvind Kejriwal","AAP"));

        System.out.println("is state equal to state2: "+state.equals(state2));

        System.out.println("---------------------getOrDefault()--------------------------");
        ChiefMinisterDto cmd=state.getOrDefault(new StateDto("Maharashtra","Mumbai"),null);
        System.out.println("cmd: "+cmd);

        ChiefMinisterDto cmd2=state.getOrDefault(new StateDto("Jarkhand","Ranchi"),null);
        System.out.println("cmd2: "+cmd2);// if we pass non-existing key that will return the value as a default value else, it will return the original value

        System.out.println("---------------------isEmpty()--------------------------");
        boolean emptyCheck=state.isEmpty();
        System.out.println("is state empty: "+emptyCheck);

        System.out.println("---------------------hashCode()--------------------------");
        int hc=state.hashCode();
        System.out.println("hashcode of state: "+hc);

        System.out.println("---------------------merge()--------------------------");
        state.merge(new StateDto("andhra","amaravathi"),new ChiefMinisterDto("CBN","TDP"),((ov,nv)->nv));

        state.merge(new StateDto("Tamil Nadu","Chennai"),new ChiefMinisterDto("Joseph Vijay","INDIA"),((ov,nv)->nv));
        state.forEach((k,v)-> System.out.println(k+" "+v));//if key is present then update's value else add new key-value pair

        System.out.println("---------------------putAll()--------------------------");
        Map<StateDto,ChiefMinisterDto> newState=new HashMap<>();
        newState.put(new StateDto("Karnataka","Bengaluru"),new ChiefMinisterDto("Kumaraswami","NDA"));
        newState.put(new StateDto("Punjab","Chandigahr"),new ChiefMinisterDto("lal singh","congress"));

        state.putAll(newState);
        state.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("-----------------------replace()-----------------------");
        state.replace(new StateDto("Karnataka","Bengaluru"),new ChiefMinisterDto("HD Kumaraswami","JDS"));
        state.replace(new StateDto("Maharashtra","Mumbai"),new ChiefMinisterDto("Eknath Shinde","NDA"),new ChiefMinisterDto("Salman khan","BB Party"));
        state.forEach((k,v)-> System.out.println(k+" "+v));

         System.out.println("-----------------------clear()-----------------------");
        state.clear();
        System.out.println("size after clear: "+state.size());
    }
}
