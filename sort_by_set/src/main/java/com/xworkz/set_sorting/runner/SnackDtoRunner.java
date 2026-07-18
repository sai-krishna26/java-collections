package com.xworkz.set_sorting.runner;

import com.xworkz.set_sorting.dto.SnackDto;

import java.util.*;
import java.util.stream.Collectors;

public class SnackDtoRunner
{
    public static void main(String[] args)
    {
        Set<SnackDto> snackSet = new HashSet<>();
        snackSet.add(new SnackDto("Masala puri","masala",10.5,40));
        snackSet.add(new SnackDto("Pani puri","salt",8.9,40));
        snackSet.add(new SnackDto("Samosa","mixed",12.98,20));
        snackSet.add(new SnackDto("bhel","spicy",15.98,45));
        snackSet.add(new SnackDto("roll","spicy",16.98,50));
        snackSet.add(new SnackDto("roll","spicy",16.98,50));

        snackSet.forEach(System.out::println);
        System.out.println("size of the hashset:"+snackSet.size());

        System.out.println("------------------CONTAINS----------------------");
        System.out.println("contains: "+snackSet.contains(new SnackDto("Pani puri","salt",8.9,40)));
//        System.out.println("--------------CLEAR--------------------------");
//        snackSet.clear();
//        System.out.println("elements of the hashSet after clear operation:");
//        snackSet.forEach(snackDto -> System.out.println(snackDto));//snackSet.forEach(System.out::println);
//        System.out.println("size after clear():"+snackSet.size());

        System.out.println("---------------IS EMPTY-------------------------");
        System.out.println("isEmpty: "+snackSet.isEmpty());
        System.out.println("------------------TO ARRAY----------------------");

        SnackDto[] snackArray=snackSet.stream()
                .toArray(SnackDto[]::new);
        Arrays.stream(snackArray).forEach(System.out::println);
        System.out.println("size of the array:"+snackArray.length);

        System.out.println("-----------------ITERATOR-----------------------");

        Iterator<SnackDto> iterator=snackSet.iterator();
        while(iterator.hasNext())
        {
            SnackDto snack=iterator.next();
            System.out.println(snack);
        }

//        System.out.println("-----------------REMOVE IF-----------------------");
//        System.out.println("size before removeIf:"+snackSet.size());
//        snackSet.removeIf(snack->snack.getPrice()>30);
//        System.out.println("size after removeIf:"+snackSet.size());
//        snackSet.forEach(System.out::println);

        System.out.println("------------------HASHSET WITH INITIAL CAPACITY------------------");
        Set<SnackDto> setWithCapacity = new HashSet<>(10);
        setWithCapacity.add(new SnackDto("Samosa","mixed",12.98,20));
        setWithCapacity.add(new SnackDto("Pani puri","salt",8.9,40));
        System.out.println("HashSet with initial capacity 10: "+setWithCapacity.size()+" elements");

        System.out.println("------------------HASHSET WITH LOAD FACTOR------------------");
        Set<SnackDto> setWithLoadFactor = new HashSet<>(16,0.75f);
        setWithLoadFactor.add(new SnackDto("Bhel","spicy",15.98,45));
        System.out.println("HashSet with load factor 0.75: "+setWithLoadFactor.size()+" elements");

        System.out.println("------------------ADD ALL FROM ANOTHER HASHSET------------------");
        Set<SnackDto> set1 = new HashSet<>();
        set1.add(new SnackDto("Masala puri","masala",10.5,40));
        set1.add(new SnackDto("Pani puri","salt",8.9,40));

        Set<SnackDto> set2 = new HashSet<>();
        set2.add(new SnackDto("Samosa","mixed",12.98,20));
        set2.add(new SnackDto("Bhel","spicy",15.98,45));

        set1.addAll(set2);
        System.out.println("After addAll: "+set1.size()+" elements");
        set1.forEach(System.out::println);

        System.out.println("------------------RETAIN ALL (INTERSECTION)------------------");
        Set<SnackDto> setA = new HashSet<>();
        setA.add(new SnackDto("Samosa","mixed",12.98,20));
        setA.add(new SnackDto("Pani puri","salt",8.9,40));
        setA.add(new SnackDto("Bhel","spicy",15.98,45));

        Set<SnackDto> setB = new HashSet<>();
        setB.add(new SnackDto("Samosa","mixed",12.98,20));
        setB.add(new SnackDto("roll","spicy",16.98,50));

        System.out.println("Set A before retainAll: "+setA.size());
        setA.retainAll(setB);
        System.out.println("Set A after retainAll: "+setA.size()+" elements");
        setA.forEach(System.out::println);

        System.out.println("------------------REMOVE ALL (DIFFERENCE)------------------");
        Set<SnackDto> setC = new HashSet<>();
        setC.add(new SnackDto("Samosa","mixed",12.98,20));
        setC.add(new SnackDto("Pani puri","salt",8.9,40));
        setC.add(new SnackDto("Bhel","spicy",15.98,45));

        Set<SnackDto> setD = new HashSet<>();
        setD.add(new SnackDto("Samosa","mixed",12.98,20));
        setD.add(new SnackDto("roll","spicy",16.98,50));

        System.out.println("Set C before removeAll: "+setC.size());
        setC.removeAll(setD);
        System.out.println("Set C after removeAll: "+setC.size()+" elements");
        setC.forEach(System.out::println);

        System.out.println("------------------CONTAINS ALL------------------");
        Set<SnackDto> mainSet = new HashSet<>();
        SnackDto s1 = new SnackDto("Samosa","mixed",12.98,20);
        SnackDto s2 = new SnackDto("Pani puri","salt",8.9,40);
        SnackDto s3 = new SnackDto("Bhel","spicy",15.98,45);
        mainSet.add(s1);
        mainSet.add(s2);
        mainSet.add(s3);

        List<SnackDto> checkList = new ArrayList<>();
        checkList.add(s1);
        checkList.add(s2);

        boolean containsAll = mainSet.containsAll(checkList);
        System.out.println("MainSet contains all elements from checkList: "+containsAll);

        System.out.println("------------------HASHSET FROM LIST------------------");
        List<SnackDto> snackList = new ArrayList<>();
        snackList.add(new SnackDto("Samosa","mixed",12.98,20));
        snackList.add(new SnackDto("Pani puri","salt",8.9,40));
        snackList.add(new SnackDto("Bhel","spicy",15.98,45));
        snackList.add(new SnackDto("Samosa","mixed",12.98,20));

        Set<SnackDto> setFromList = new HashSet<>(snackList);
        System.out.println("List size: "+snackList.size());
        System.out.println("HashSet from List size: "+setFromList.size());
        setFromList.forEach(System.out::println);

        System.out.println("------------------HASHSET FROM ARRAY------------------");
        SnackDto[] snackArray2 = {
            new SnackDto("Samosa","mixed",12.98,20),
            new SnackDto("Pani puri","salt",8.9,40),
            new SnackDto("Bhel","spicy",15.98,45),
            new SnackDto("Samosa","mixed",12.98,20)
        };

        Set<SnackDto> setFromArray = new HashSet<>(Arrays.asList(snackArray2));
        System.out.println("Array length: "+snackArray2.length);
        System.out.println("HashSet from array size: "+setFromArray.size());
        setFromArray.forEach(System.out::println);

        System.out.println("------------------FIND SNACK WITH HIGHEST PRICE------------------");
        Set<SnackDto> priceSet = new HashSet<>();
        priceSet.add(new SnackDto("Samosa","mixed",12.98,20));
        priceSet.add(new SnackDto("roll","spicy",16.98,50));
        priceSet.add(new SnackDto("Bhel","spicy",15.98,45));
        priceSet.add(new SnackDto("Pani puri","salt",8.9,40));

        Optional<SnackDto> highestPrice = priceSet.stream()
            .max(Comparator.comparingDouble(SnackDto::getPrice));
        highestPrice.ifPresent(snack -> System.out.println("Highest price snack: "+snack+" - Price: "+snack.getPrice()));

        System.out.println("------------------COUNT SNACKS WITH SPECIFIC FLAVOR------------------");
        Set<SnackDto> flavorSet = new HashSet<>();
        flavorSet.add(new SnackDto("Samosa","mixed",12.98,20));
        flavorSet.add(new SnackDto("roll","spicy",16.98,50));
        flavorSet.add(new SnackDto("Bhel","spicy",15.98,45));
        flavorSet.add(new SnackDto("Pani puri","salt",8.9,40));
        flavorSet.add(new SnackDto("Masala puri","masala",10.5,40));

        long spicyCount = flavorSet.stream()
            .filter(snack -> snack.getFlavor().equals("spicy"))
            .count();
        System.out.println("Count of spicy snacks: "+spicyCount);

        System.out.println("------------------CALCULATE TOTAL WEIGHT------------------");
        double totalWeight = flavorSet.stream()
            .mapToDouble(SnackDto::getWeight)
            .sum();
        System.out.println("Total weight of all snacks: "+totalWeight);

        System.out.println("------------------FILTER SNACKS WITH PRICE BELOW THRESHOLD------------------");
        List<SnackDto> cheapSnacks = flavorSet.stream()
            .filter(snack -> snack.getPrice() < 45)
            .collect(Collectors.toList());
        System.out.println("Snacks with price < 45:");
        cheapSnacks.forEach(System.out::println);

        System.out.println("------------------GROUP SNACKS BY FLAVOR------------------");
        Map<String,List<SnackDto>> snacksByFlavor = flavorSet.stream()
            .collect(Collectors.groupingBy(SnackDto::getFlavor));
        snacksByFlavor.forEach((flavor,snacks) -> {
            System.out.println("Flavor: "+flavor+" - Count: "+snacks.size());
            snacks.forEach(System.out::println);
        });

        System.out.println("------------------CLONE HASHSET------------------");
        Set<SnackDto> originalSet = new HashSet<>();
        originalSet.add(new SnackDto("Samosa","mixed",12.98,20));
        originalSet.add(new SnackDto("Pani puri","salt",8.9,40));

        @SuppressWarnings("unchecked")
        Set<SnackDto> clonedSet = (Set<SnackDto>) ((HashSet<SnackDto>) originalSet).clone();
        System.out.println("Original set size: "+originalSet.size());
        System.out.println("Cloned set size: "+clonedSet.size());
        clonedSet.forEach(System.out::println);

        System.out.println("------------------ADD DUPLICATE SNACK------------------");
        Set<SnackDto> duplicateSet = new HashSet<>();
        SnackDto snack1 = new SnackDto("Samosa","mixed",12.98,20);
        SnackDto snack2 = new SnackDto("Samosa","mixed",12.98,20);

        duplicateSet.add(snack1);
        System.out.println("Size after first add: "+duplicateSet.size());
        duplicateSet.add(snack2);
        System.out.println("Size after duplicate add: "+duplicateSet.size());

        System.out.println("------------------REMOVE SNACK BY CREATING NEW OBJECT------------------");
        Set<SnackDto> removeSet = new HashSet<>();
        removeSet.add(new SnackDto("Samosa","mixed",12.98,20));
        removeSet.add(new SnackDto("Pani puri","salt",8.9,40));
        System.out.println("Size before remove: "+removeSet.size());

        boolean removed = removeSet.remove(new SnackDto("Samosa","mixed",12.98,20));
        System.out.println("Remove successful: "+removed);
        System.out.println("Size after remove: "+removeSet.size());

        System.out.println("------------------CHECK IF SET IS EMPTY------------------");
        Set<SnackDto> emptySet = new HashSet<>();
        System.out.println("Empty set isEmpty: "+emptySet.isEmpty());
        emptySet.add(new SnackDto("Samosa","mixed",12.98,20));
        System.out.println("After add, isEmpty: "+emptySet.isEmpty());

        System.out.println("------------------CLEAR ALL ELEMENTS------------------");
        Set<SnackDto> clearSet = new HashSet<>();
        clearSet.add(new SnackDto("Samosa","mixed",12.98,20));
        clearSet.add(new SnackDto("Pani puri","salt",8.9,40));
        System.out.println("Size before clear: "+clearSet.size());
        clearSet.clear();
        System.out.println("Size after clear: "+clearSet.size());

        System.out.println("------------------CONVERT HASHSET TO ARRAYLIST------------------");
        Set<SnackDto> convertSet = new HashSet<>();
        convertSet.add(new SnackDto("Samosa","mixed",12.98,20));
        convertSet.add(new SnackDto("Pani puri","salt",8.9,40));

        List<SnackDto> arrayList = new ArrayList<>(convertSet);
        System.out.println("ArrayList size: "+arrayList.size());
        arrayList.forEach(System.out::println);

        System.out.println("------------------CONVERT HASHSET TO ARRAY------------------");
        SnackDto[] arrayFromSet = convertSet.toArray(new SnackDto[0]);
        System.out.println("Array length: "+arrayFromSet.length);
        for(SnackDto snack : arrayFromSet) {
            System.out.println(snack);
        }

        System.out.println("------------------FIND SNACK WITH LOWEST PRICE------------------");
        Optional<SnackDto> lowestPrice = priceSet.stream()
            .min(Comparator.comparingDouble(SnackDto::getPrice));
        lowestPrice.ifPresent(snack -> System.out.println("Lowest price snack: "+snack+" - Price: "+snack.getPrice()));

        System.out.println("------------------GET AVERAGE PRICE------------------");
        double avgPrice = priceSet.stream()
            .mapToDouble(SnackDto::getPrice)
            .average()
            .orElse(0.0);
        System.out.println("Average price: "+avgPrice);

        System.out.println("------------------FIND SNACKS WITH WEIGHT IN RANGE------------------");
        List<SnackDto> weightRange = flavorSet.stream()
            .filter(snack -> snack.getWeight() >= 10 && snack.getWeight() <= 15)
            .collect(Collectors.toList());
        System.out.println("Snacks with weight between 10 and 15:");
        weightRange.forEach(System.out::println);

        System.out.println("------------------CHECK IF ANY SNACK MATCHES CONDITION------------------");
        boolean hasExpensive = priceSet.stream()
            .anyMatch(snack -> snack.getPrice() > 45);
        System.out.println("Has snack with price > 45: "+hasExpensive);

        boolean allExpensive = priceSet.stream()
            .allMatch(snack -> snack.getPrice() > 30);
        System.out.println("All snacks have price > 30: "+allExpensive);

        System.out.println("------------------GET DISTINCT SNACK NAMES------------------");
        Set<String> distinctNames = flavorSet.stream()
            .map(SnackDto::getName)
            .collect(Collectors.toSet());
        System.out.println("Distinct snack names:");
        distinctNames.forEach(System.out::println);

        System.out.println("------------------TREESET WITH NATURAL ORDERING BY PRICE------------------");
        TreeSet<SnackDto> treeByPrice = new TreeSet<>(Comparator.comparingDouble(SnackDto::getPrice));
        treeByPrice.add(new SnackDto("Samosa","mixed",12.98,20));
        treeByPrice.add(new SnackDto("roll","spicy",16.98,50));
        treeByPrice.add(new SnackDto("Bhel","spicy",15.98,45));
        treeByPrice.add(new SnackDto("Pani puri","salt",8.9,40));
        treeByPrice.add(new SnackDto("Masala puri","masala",10.5,40));
        System.out.println("TreeSet sorted by price:");
        treeByPrice.forEach(System.out::println);

        System.out.println("------------------TREESET WITH COMPARATOR BY NAME------------------");
        TreeSet<SnackDto> treeByName = new TreeSet<>(Comparator.comparing(SnackDto::getName));
        treeByName.add(new SnackDto("Samosa","mixed",12.98,20));
        treeByName.add(new SnackDto("roll","spicy",16.98,50));
        treeByName.add(new SnackDto("Bhel","spicy",15.98,45));
        treeByName.add(new SnackDto("Pani puri","salt",8.9,40));
        treeByName.add(new SnackDto("Masala puri","masala",10.5,40));
        System.out.println("TreeSet sorted by name:");
        treeByName.forEach(System.out::println);

        System.out.println("------------------TREESET WITH COMPARATOR BY FLAVOR------------------");
        TreeSet<SnackDto> treeByFlavor = new TreeSet<>(Comparator.comparing(SnackDto::getFlavor));
        treeByFlavor.add(new SnackDto("Samosa","mixed",12.98,20));
        treeByFlavor.add(new SnackDto("roll","spicy",16.98,50));
        treeByFlavor.add(new SnackDto("Bhel","spicy",15.98,45));
        treeByFlavor.add(new SnackDto("Pani puri","salt",8.9,40));
        treeByFlavor.add(new SnackDto("Masala puri","masala",10.5,40));
        System.out.println("TreeSet sorted by flavor:");
        treeByFlavor.forEach(System.out::println);

        System.out.println("------------------TREESET WITH COMPARATOR BY WEIGHT------------------");
        TreeSet<SnackDto> treeByWeight = new TreeSet<>(Comparator.comparingDouble(SnackDto::getWeight));
        treeByWeight.add(new SnackDto("Samosa","mixed",12.98,20));
        treeByWeight.add(new SnackDto("roll","spicy",16.98,50));
        treeByWeight.add(new SnackDto("Bhel","spicy",15.98,45));
        treeByWeight.add(new SnackDto("Pani puri","salt",8.9,40));
        treeByWeight.add(new SnackDto("Masala puri","masala",10.5,40));
        System.out.println("TreeSet sorted by weight:");
        treeByWeight.forEach(System.out::println);

        System.out.println("------------------ADD DUPLICATE SNACK TO TREESET------------------");
        TreeSet<SnackDto> treeForDuplicate = new TreeSet<>(Comparator.comparing(SnackDto::getName)
            .thenComparing(SnackDto::getFlavor)
            .thenComparingDouble(SnackDto::getWeight)
            .thenComparingDouble(SnackDto::getPrice));
        treeForDuplicate.add(new SnackDto("Samosa","mixed",12.98,20));
        System.out.println("Size after first add: "+treeForDuplicate.size());
        treeForDuplicate.add(new SnackDto("Samosa","mixed",12.98,20));
        System.out.println("Size after duplicate add: "+treeForDuplicate.size());

        System.out.println("------------------GET FIRST ELEMENT (LOWEST PRICE)------------------");
        if(!treeByPrice.isEmpty()) {
            SnackDto first = treeByPrice.first();
            System.out.println("First element (lowest price): "+first+" - Price: "+first.getPrice());
        }

        System.out.println("------------------GET LAST ELEMENT (HIGHEST PRICE)------------------");
        if(!treeByPrice.isEmpty()) {
            SnackDto last = treeByPrice.last();
            System.out.println("Last element (highest price): "+last+" - Price: "+last.getPrice());
        }

        System.out.println("------------------GET HEADSET (PRICE < 45)------------------");
        SnackDto reference = new SnackDto("Reference","ref",0,45);
        TreeSet<SnackDto> headSetTree = new TreeSet<>(Comparator.comparingDouble(SnackDto::getPrice));
        headSetTree.addAll(treeByPrice);

        SortedSet<SnackDto> lessThan45 = headSetTree.headSet(reference);
        System.out.println("Snacks with price < 45:");
        lessThan45.forEach(System.out::println);

        System.out.println("------------------GET TAILSET (PRICE >= 40)------------------");
        SnackDto reference2 = new SnackDto("Reference","ref",0,40);
        SortedSet<SnackDto> greaterOrEqual40 = headSetTree.tailSet(reference2);
        System.out.println("Snacks with price >= 40:");
        greaterOrEqual40.forEach(System.out::println);

        System.out.println("------------------GET SUBSET (PRICE BETWEEN 30 AND 50)------------------");
        SnackDto from = new SnackDto("From","ref",0,30);
        SnackDto to = new SnackDto("To","ref",0,50);
        SortedSet<SnackDto> subSet = headSetTree.subSet(from,to);
        System.out.println("Snacks with price between 30 and 50:");
        subSet.forEach(System.out::println);

        System.out.println("------------------USE FLOOR (GREATEST WITH PRICE ≤ 42)------------------");
        SnackDto floorRef = new SnackDto("FloorRef","ref",0,42);
        SnackDto floor = headSetTree.floor(floorRef);
        if(floor != null) {
            System.out.println("Floor (greatest with price ≤ 42): "+floor+" - Price: "+floor.getPrice());
        }

        System.out.println("------------------USE CEILING (LEAST WITH PRICE ≥ 42)------------------");
        SnackDto ceiling = headSetTree.ceiling(floorRef);
        if(ceiling != null)
        {
            System.out.println("Ceiling (least with price ≥ 42): "+ceiling+" - Price: "+ceiling.getPrice());
        }

        System.out.println("------------------CONVERT BETWEEN HASHSET AND TREESET------------------");
        HashSet<SnackDto> hashSet = new HashSet<>();
        hashSet.add(new SnackDto("Samosa","mixed",12.98,20));
        hashSet.add(new SnackDto("roll","spicy",16.98,50));
        hashSet.add(new SnackDto("Bhel","spicy",15.98,45));

        TreeSet<SnackDto> fromHashSet = new TreeSet<>(Comparator.comparing(SnackDto::getName));
        fromHashSet.addAll(hashSet);
        System.out.println("TreeSet from HashSet:");
        fromHashSet.forEach(System.out::println);

        HashSet<SnackDto> fromTreeSet = new HashSet<>(fromHashSet);
        System.out.println("HashSet from TreeSet:");
        fromTreeSet.forEach(System.out::println);



    }
}
