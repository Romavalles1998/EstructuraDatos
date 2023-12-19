package src;

import java.util.ArrayList;
public class ConvertirArray {
        public static void main(String args[]) {

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Manzana");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Pera");

            String[] str = new String[fruits.size()];
            for(int i=0; i < fruits.size(); i++) {
                str[i] = fruits.get(i);
            }

            for(String s : str) {
                System.out.println(s);
            }
        }
    }
