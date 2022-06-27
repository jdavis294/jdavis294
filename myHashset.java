import java.util.Arrays;
public class myHashset{
    static Boolean[] elements;
    public myHashset(){
        elements=new Boolean[100];  //initializes the size of the array
        Arrays.fill(elements,false); //fills the array contents with false
    }

    public void add(int value){
        elements[value]=true;   //changes the value to be added at the index to true
    }

    public void remove(int value){
        if (elements[value]==true) {    //checks to see if values is there then changes to false removing the value
            elements[value] = false;
        }else{
            System.out.println("Hey Value does not exist at all!");   //if the value was already false or removed return statement
        }
        }


    public int contains(int value) {

        if (elements[value]==false) {   //if the value isn't there return value
            return 0;
        } else {
            return value; //else return the value
        }
    }

    //driver code
    //Time complexity: O(n)
    public static void main(String[]args) {
        myHashset HS = new myHashset(); //creates object of the class

        HS.add(1);  //adds value
        HS.add(2);
        HS.add(3);
        HS.add(4);
        HS.add(5);

        int i=1;
            while(i<=5){    //prints out what values are contained within Hashset
                System.out.println(HS.contains(i));
                i++;
            }

        HS.remove(5);   //removes 5 from Hashset
        if (HS.contains(5)==0){     //checks after removal
            System.out.println("Hey Nothing here!");
        }
        HS.remove(5); //Removal check
        if (HS.contains(12)==0){        //checks if value not in Hashset is there
            System.out.println("Hey Nothing here!");
        }
        HS.remove(12);  //checks if you can remove value not in Hashset 

    }
}

