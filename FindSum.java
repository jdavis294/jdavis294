import java.util.HashSet;
import java.util.Hashtable;

public class FindSum {
    public static void main(String[]args){

        int []arr= {1,5,4,6,7,9};
        HashSet<Integer> res = findsums(arr);
        System.out.println(res.toString());//should return [6,5,7,9]

    }
    public static HashSet<Integer>findsums(int[]elements){
        HashSet<Integer> sums=new HashSet<Integer>();
        HashSet<Integer> HashTable=new HashSet<Integer>();

        int sum;

        for(int i=0;i<= elements.length-1;i++){
            for(int j=1;j<=elements.length-1;j++){
                 sum= elements[i]+elements[j];
                 HashTable.add(sum);
                 if(HashTable.contains(elements[i])){
                     sums.add(elements[i]);
                 }
        }}



        return sums;
    }
}
