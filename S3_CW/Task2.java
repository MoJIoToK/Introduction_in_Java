package S3_CW;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
    
        FillPlanetsList();

    }


    public static void FillPlanetsList(){
        String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran"};
        List<String> planetList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            planetList.add(AllPlanets[(int)(Math.random()*AllPlanets.length)]);
            
        }
        // for (String string : planetList) {
        //     System.out.println(string + " ");
        // }
        System.out.println();
        planetList.sort(null);
        for (String string : planetList) {
            System.out.print(string + " ");
        }

        System.out.println();

        int count = 1;
        for (int i = 1; i < planetList.size(); i++) {
            //System.out.println(planetList.get(i));
            
            if(planetList.get(i) != planetList.get(i-1)){
                System.out.println(planetList.get(i-1) + " " + count);
                count = 1;
            } 
            else count++;

            
        }


    }
    
}
