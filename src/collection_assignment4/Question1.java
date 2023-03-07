package collection_assignment4;

import java.util.ArrayList;
import java.util.Iterator;

    public class Question1 {
        public static void main(String[] args) {
            ArrayList<Float> arrayList = new ArrayList<Float>();
            arrayList.add(1.4f);
            arrayList.add(1.2f);
            arrayList.add(6.9f);
            arrayList.add(3.5f);
            arrayList.add(7.6f);
            arrayList.add(7.5f);
            Iterator<Float> iterator = arrayList.iterator();
            float sum=0;
            while(iterator.hasNext()){
                sum+=iterator.next();
            }
            System.out.println("Sum of elements in a list is: "+sum);
        }
    }

