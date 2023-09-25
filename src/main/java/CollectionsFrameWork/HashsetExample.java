package CollectionsFrameWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class HashsetExample {
    public static void main(String[] args) {
       int [] nums = {2,5,3,2,4,3,4};
       int result = HashsetExample.firstunique(nums);
        System.out.println(result);
    }

    public static int firstunique(int [] nums){

        HashMap<Integer, Integer> countMap = new HashMap<>();


        HashSet<Integer> nonRepeatSet = new HashSet<>();

        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);

            if (countMap.get(num)==1){
                nonRepeatSet.add(num);
            }else {
                nonRepeatSet.remove(num);
            }
        }
        for (int num : nums){
            if (nonRepeatSet.contains(num)){
                return num;
            }
        }
        return -1;

    }



    }
