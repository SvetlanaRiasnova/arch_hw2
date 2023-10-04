import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        
       

        ItemFabric generator1 = new GoldGenerator();
        generator1.openReward();
        ItemFabric generator2 = new SilverGenerator();
        generator2.openReward();
        ItemFabric generator3 = new BronzeGenerator();
        generator3.openReward();
        ItemFabric generator4 = new PlatinumGenerator();
        generator4.openReward();
        

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

            fabricList.add(generator1);
            fabricList.add(generator2);
            fabricList.add(generator3);
            fabricList.add(generator4);

            for(int i =0; i<20; i++)
            {
                int index = (int) (Math.random() * fabricList.size());
                ItemFabric fabric = fabricList.get(index);
                fabric.openReward();
            }
    }
}
/*
* abstract class ItemFabric
*   openReward
*   createItem
* interface iGameItem
*   open
*gold
*gem
*
* */