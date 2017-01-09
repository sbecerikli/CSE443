package Part2;

import java.util.Random;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class KocaeliTraffiicDriver {
    public static void main(String[] args){

        boolean IsTrafficHeavy = false;

        KocaeliTraffic k = new KocaeliTraffic();
        int count = 0;
        int i = 0;
        boolean f;
        Random randomno = new Random();
        while (i < 1000){
            k.Display();
            if(count % 300 == 0){
                f = randomno.nextBoolean();
                k.SetHiTechStatus(f);
                //System.out.println(f);
            }
            ++count;
            ++i;
        }
    }
}
