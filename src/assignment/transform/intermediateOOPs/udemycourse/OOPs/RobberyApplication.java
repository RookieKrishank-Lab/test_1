package assignment.transform.intermediateOOPs.udemycourse.OOPs;

import java.util.Random;


abstract class Person{
    String name;
    String nickName;
    int yearOfBorn;
    String expertIn;
    Item[] items;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printBioData(){
        System.out.println("Name: "+name+" also known as "+nickName+", born in "+yearOfBorn+" expert in "+ expertIn);
        System.out.println("Items it have");
        for(Item item : items){
            System.out.print(item.getItemName()+",");
        }
        System.out.println("...");
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}

class Item{
    String itemName;
    double value;

    public String getItemName() {
        return itemName;
    }

    public double getValue() {
        return value;
    }

    public Item(String itemName, double value) {
        this.itemName = itemName;
        this.value = value;
    }
}

class Criminal extends Person{

    public static final int SUCCESS_PERCENTAGE = 7;
    public Criminal(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Criminal person: " );
        super.printBioData();
    }
}

class Detective extends Person{

    public static final int SUCCESS_PERCENTAGE = 76;

    public Detective(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective: ");
        super.printBioData();
    }
}

class Building{
    String name;
    Item[] items;

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }
}

class City{

    private Building building[] = new Building[4];                                    //  {"Bank","Mansion","Post Office", "Supermarket"};

    City(){
        Item[] bankItem = new Item[2];
        bankItem[0] = new Item("Pen", 10);
        bankItem[1] = new Item("Stapler", 56);
        building[0] = new Building("Bank", bankItem);

        Item[] mansionItem = new Item[2];
        mansionItem[0] = new Item("Shoe", 25);
        mansionItem[1] = new Item("Broken Glass", 0.2);
        building[1] = new Building("Mansion", mansionItem);

        Item[] postOfficeItem = new Item[2];
        postOfficeItem[0] = new Item("Pen", 10);
        postOfficeItem[1] = new Item("Stapler", 56);
        building[2] = new Building("Post Office", postOfficeItem);

        Item[] superMarket = new Item[2];
        superMarket[0] = new Item("Bread", 2.5);
        superMarket[1] = new Item("Tea", 6.5);
        building[3] = new Building("Super Market", superMarket);
    }

    public Building[] getBuilding() {
        return building;
    }
}

class Gang{
    private Criminal[] criminals = new Criminal[2];
    private Random random = new Random();
    private  double sumRobbedValue;

    public Gang() {
        Item[] robItems = new Item[2];
        robItems[0] = new Item("Knife", 10);
        robItems[1] = new Item("Hammer", 23);
        Criminal Rob = new Criminal("Rob","Old one", 1982, "how to break in", robItems);
        criminals[0] = Rob;

        Item[] bobItems = new Item[2];
        bobItems[0] = new Item("Baseball bat", 20);
        bobItems[1] = new Item("Gun", 67);
        Criminal Bob = new Criminal("Bob","NewBee", 1997, "in none as he just started robbing", bobItems);
        criminals[1] = Bob;
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void getGangInfo(){
        for (Criminal criminal : criminals){
            criminal.printBioData();
        }
    }

    public boolean isSuccessfulRobbery(){
        int randomNumber = random.nextInt(101);
        int successChance = criminals.length * Criminal.SUCCESS_PERCENTAGE;
        if (randomNumber>successChance){
            return false;
        }
        return true;
    }

    public void letsRob(Building[] buildings){
        int randomBuildingIndex = random.nextInt(buildings.length+1);
        if(isSuccessfulRobbery()){
            System.out.println("The gang managed to rob the following items from the"+  buildings[randomBuildingIndex].getName()  +":" );
            for (Item item : buildings[randomBuildingIndex].getItems()){
                sumRobbedValue = item.getValue();
                System.out.println(item.getItemName());
            }
        }
        else {
            System.out.println("the gang tried to rob " + buildings[randomBuildingIndex].getName()+" but failed to rob");
        }
    }
}

class Police{
    private Detective adamPalmer;

    public Police() {
        Item[] adamItems = new Item[2];
       adamItems[0] = new Item("rvolver", 100);
       adamItems[1] = new Item("cuff", 60);
       adamPalmer = new Detective("Adam Palmer", "Adam",1990,"findinf criminals",adamItems);
    }
    public boolean areCriminalsCaught(){
        Random random = new Random();
        if(random.nextInt(101) >= Detective.SUCCESS_PERCENTAGE){
            return false;
        }
        return true;
    }

    public boolean catchCriminals(Gang gang){
        if(areCriminalsCaught()){
            System.out.println(adamPalmer.getName() + " manage to catch the gang");
            if (gang.getSumRobbedValue()>0){
                System.out.println("The stolen items are recovered ");
                System.out.println("The overall value of good is: " + gang.getSumRobbedValue());
            }
            else {
                System.out.println("the gang could not steal anything");
            }
            return true;
        }
        else {
            System.out.println(adamPalmer.getName()+ " could not catch the criminals");
            System.out.println("Criminals manage to steal: "+ gang.getSumRobbedValue());
            return false;
        }
    }
}
public class RobberyApplication {
    public static void main(String[] args) {
        City city = new City();
        Gang gang = new Gang();
        Police police = new Police();
        gang.getGangInfo();
        gang.letsRob(city.getBuilding());
        police.catchCriminals(gang);
    }
}