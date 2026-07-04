package com.xworkz.methods.custom_methods.runner;
import com.xworkz.methods.custom_methods.implementation.*;

import java.util.Queue;

public class Runner
{
    public static void main(String[] args)
    {
        WallClock wallClock = (mode) ->
        {
            return 10.34;
        };
        System.out.println(wallClock.time("morning"));

        System.out.println("-------------------------------");

        PostOffice postOffice = (accNo) ->
        {
            if (accNo == 223344556789L) {
                return true;
            }
            return false;
        };
        System.out.println(postOffice.gruhaLakshmi(2233445567L));

        System.out.println("-------------------------------");

        GruhaJyoti gruhaJyoti = (id) ->
        {
            if (id == 123123123) {
                return 678.45;
            }
            return 0.0;
        };
        System.out.println(gruhaJyoti.currentBill(123123123));

        System.out.println("-------------------------------");

        Gst gst=(entries)->
        {
            for(int entry:entries)
            {
                if(entry>10000)
                {
                    System.out.println(entry+": GST will apply");
                    entry+=250;
                    System.out.println(entry+"(updated)");
                }
                else
                {
                    System.out.println(entry);
                }
            }
            return 0;
        };
        int[] entries={12300,3455,231,45067};
        gst.getAmount(entries);

        System.out.println("-------------------------------");


        Ricemill ricemill=(type)->
        {
            System.out.println(type+" in Kg");
            return 250;
        };
        System.out.println(ricemill.getQuantity("fluffy rice"));
        System.out.println("-------------------------------");

        HighWay highWay=(nhNumber,name)->
        {
            System.out.println(nhNumber+", "+name);
            return 90.0;
        };
        System.out.println(highWay.speed(153,"national highway"));
        System.out.println("-------------------------------");

        Roof roof=(bricksCount)->
        {
            System.out.println(bricksCount+" in bricks");
            return 10.0;
        };
        System.out.println(roof.getTime(123));
        System.out.println("-------------------------------");

        CottonMill cottonMill=(type)->{
            System.out.println(type+" in Kg");
            return 250;
        };
        System.out.println(cottonMill.getQuantity("Fluffy Rice"));
        System.out.println("-------------------------------");

        Bakery bakery=(item,quantity)->{
            System.out.println(item+" : "+quantity);
            return quantity*45.5;
        };
        System.out.println(bakery.getPrice("Cake",3));
        System.out.println("-------------------------------");

        Hospital hospital=(department,roomNo)->{
            System.out.println(department+" "+roomNo);
            return "Dr. Kumar";
        };
        System.out.println(hospital.getDoctor("Cardiology",201));
        System.out.println("-------------------------------");

        School school=(rollNo)->{
            return rollNo==101;
        };
        System.out.println(school.isPresent(101));
        System.out.println("-------------------------------");

        College college=(collegeName)->{
            return "Dr. Ramesh";
        };
        System.out.println(college.getPrincipal("XYZ College"));
        System.out.println("-------------------------------");

        Library library=(category,author)->{
            System.out.println(category+" "+author);
            return 250;
        };
        System.out.println(library.getBooks("Java","James Gosling"));
        System.out.println("-------------------------------");

        Bank bank=(accountNumber)->{
            if(accountNumber==123456789L)
                return 25000.75;
            return 0;
        };
        System.out.println(bank.getBalance(123456789L));
        System.out.println("-------------------------------");

        ATM atm=(amount,pin)->{
            return pin==1234 && amount<=5000;
        };
        System.out.println(atm.withdraw(2500,1234));
        System.out.println("-------------------------------");

        Hotel hotel=(roomType,days)->{
            return roomType+" Booked for "+days+" days";
        };
        System.out.println(hotel.bookRoom("Deluxe",2));
        System.out.println("-------------------------------");

        Restaurant restaurant=(food,quantity,gstt)->{
            return quantity*120+gstt;
        };
        System.out.println(restaurant.calculateBill("Biryani",2,18));
        System.out.println("-------------------------------");

        FruitShop fruitShop=(fruit,kg)->{
            return kg*90;
        };
        System.out.println(fruitShop.getCost("Apple",2.5));
        System.out.println("-------------------------------");

        VegetableMarket vegetableMarket=(vegetables)->{
            double[] rates=new double[vegetables.length];
            for(int i=0;i<vegetables.length;i++){
                System.out.println(vegetables[i]);
                rates[i]=40+i*15;
            }
            return rates;
        };
        System.out.println(java.util.Arrays.toString(
                vegetableMarket.getRates(new String[]{"Tomato","Onion","Potato"})));
        System.out.println("-------------------------------");

        Dairy dairy=(type,litres)->{
            return litres*55;
        };
        System.out.println(dairy.getMilkPrice("Cow Milk",3));
        System.out.println("-------------------------------");

        MobileStore mobileStore=(modelId)->{
            if(modelId==101)
                return "Samsung Galaxy S24";
            return "Model Not Found";
        };
        System.out.println(mobileStore.getModel(101));
        System.out.println("-------------------------------");

        ElectronicsShop electronicsShop=(item,yearsUsed)->{
            return yearsUsed<=2;
        };
        System.out.println(electronicsShop.exchangeProduct("Laptop",1));
        System.out.println("-------------------------------");

        CarShowroom carShowroom=(brand,budget)->{
            System.out.println(brand+" "+budget);
            return "Hyundai Creta";
        };
        System.out.println(carShowroom.getCar("Hyundai",1800000));
        System.out.println("-------------------------------");

        BikeShowroom bikeShowroom=(model)->{
            if(model.equals("Apache RTR 160"))
                return 45.5;
            return 40.0;
        };
        System.out.println(bikeShowroom.getMileage("Apache RTR 160"));
        System.out.println("-------------------------------");

        FurnitureShop furnitureShop=(category)->{
            return new String[]{"Chair","Table","Sofa","Cot"};
        };
        System.out.println(java.util.Arrays.toString(furnitureShop.getItems("Wooden")));
        System.out.println("-------------------------------");

        TailorShop tailorShop=(clothType,design)->{
            System.out.println(clothType+" "+design);
            return 5;
        };
        System.out.println(tailorShop.getDeliveryDays("Silk","Embroidery"));
        System.out.println("-------------------------------");

        Cinema cinema=(movie,seats)->{
            return seats*180;
        };
        System.out.println(cinema.getTicketPrice("Kantara",4));
        System.out.println("-------------------------------");

        Zoo zoo=(section)->{
            return new String[]{"Lion","Tiger","Leopard"};
        };
        System.out.println(java.util.Arrays.toString(zoo.getAnimals("Wild Animals")));
        System.out.println("-------------------------------");

        Park park=(day,hour)->{
            return hour>=6 && hour<=8;
        };
        System.out.println(park.isOpen("Sunday",7));
        System.out.println("-------------------------------");

        Temple temple=(pooja)->{
            return "6:30 AM";
        };
        System.out.println(temple.getPoojaTime("Abhisheka"));
        System.out.println("-------------------------------");

        Museum museum=(age)->{
            if(age<10)
                return 20;
            return 50;
        };
        System.out.println(museum.getEntryFee(18));
        System.out.println("-------------------------------");

        Airport airport=(flightNumber)->{
            return "On Time";
        };
        System.out.println(airport.getFlightStatus("AI202"));
        System.out.println("-------------------------------");

        RailwayStation railwayStation=(trainName)->{
            if(trainName.equals("Shatabdi"))
                return 3;
            return 1;
        };
        System.out.println(railwayStation.getPlatform("Shatabdi"));
        System.out.println("-------------------------------");

        BusStand busStand=(destination,time)->{
            return "Bus Available";
        };
        System.out.println(busStand.getBusDetails("Mysore",10));
        System.out.println("-------------------------------");

        Courier courier=(address,weight)->{
            return weight<20;
        };
        System.out.println(courier.deliverParcel("Bangalore",12.5));
        System.out.println("-------------------------------");

        PostOffice postOfficee=(acc)->{
            if(acc==543234567L)
                return true;
            return false;
        };
        System.out.println(postOffice.gruhaLakshmi(543234567L));
        System.out.println("-------------------------------");

        WaterSupply waterSupply=(area,houses)->{
            return houses*500;
        };
        System.out.println(waterSupply.supplyWater("RR Nagar",25));
        System.out.println("-------------------------------");

        ElectricityBoard electricityBoard=(units)->{
            if(units<=100)
                return units*4.5;
            return units*6.75;
        };
        System.out.println(electricityBoard.calculateBill(150));
        System.out.println("-------------------------------");

        GasAgency gasAgency=(consumerId)->{
            return consumerId==9876543210L;
        };
        System.out.println(gasAgency.bookCylinder(9876543210L));
        System.out.println("-------------------------------");

        Gym gym=(plan)->{
            if(plan.equals("Premium"))
                return 2500.0f;
            return 1200.0f;
        };
        System.out.println(gym.getFee("Premium"));
        System.out.println("-------------------------------");

        SwimmingPool swimmingPool=(name,age)->{
            System.out.println(name);
            return age>=18;
        };
        System.out.println(swimmingPool.registerMember("Ravi",22));
        System.out.println("-------------------------------");

        CricketTeam cricketTeam=(teamName)->{
            if(teamName.equals("India"))
                return "Rohit Sharma";
            return "Unknown";
        };
        System.out.println(cricketTeam.getCaptain("India"));
        System.out.println("-------------------------------");

        FootballClub footballClub=(playerName)->{
            if(playerName.equals("Messi"))
                return 850;
            return 0;
        };
        System.out.println(footballClub.getGoals("Messi"));
        System.out.println("-------------------------------");

        SoftwareCompany softwareCompany=(project,developers)->{
            return project+" uses Java";
        };
        System.out.println(softwareCompany.getTechnology("Banking",20));
        System.out.println("-------------------------------");

        ITCompany itCompany=(department)->{
            if(department.equals("Development"))
                return 250;
            return 100;
        };
        System.out.println(itCompany.getEmployees("Development"));
        System.out.println("-------------------------------");

        ConstructionCompany constructionCompany=(floors,area)->{
            return floors*area*1800;
        };
        System.out.println(constructionCompany.estimateCost(3,1200));
        System.out.println("-------------------------------");

        WeddingHall weddingHall=(date)->{
            return !date.equals("15-08-2026");
        };
        System.out.println(weddingHall.isAvailable("20-08-2026"));
        System.out.println("-------------------------------");

        EventManagement eventManagement=(eventName,guests)->{
            return guests*750.0;
        };
        System.out.println(eventManagement.estimateBudget("Wedding",300));
        System.out.println("-------------------------------");

        BookStore bookStore=(bookId)->{
            if(bookId==101)
                return "Effective Java";
            return "Book Not Found";
        };
        System.out.println(bookStore.getBookName(101));
        System.out.println("-------------------------------");

        MedicalStore medicalStore=(medicineName)->{
            return medicineName.equalsIgnoreCase("Paracetamol");
        };
        System.out.println(medicalStore.isMedicineAvailable("Paracetamol"));
        System.out.println("-------------------------------");

        CoffeeShop coffeeShop=(type,size)->{
            if(size.equals("Large"))
                return 180.0;
            return 120.0;
        };
        System.out.println(coffeeShop.getCoffeePrice("Cappuccino","Large"));
        System.out.println("-------------------------------");

        WeatherStation weatherStation=(city)->{
            if(city.equals("Bangalore"))
                return 27.5;
            return 30.0;
        };
        System.out.println(weatherStation.getTemperature("Bangalore"));
        System.out.println("-------------------------------");
    }
}


