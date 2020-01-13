import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class PuzzleJava{
    public ArrayList<Integer> SumAndGreaterThan10(){
        int[] firstArray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> productArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i : firstArray){
            sum += i;
            if(i > 10){
                productArray.add(i);
            }
        }
        System.out.println("The sum of all the elements of this array is " + sum);
        return productArray;
    }
    public ArrayList<String> ManipulateString(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        ArrayList<String> namesGreaterThan5 = new ArrayList<String>();
        Collections.shuffle(names);
        for (String i : names){
            System.out.println(i);
            if(i.length() > 5){
                namesGreaterThan5.add(i);
            }
        }
        return namesGreaterThan5;
    }
    public void alphabetManipulation(){
        String[] myCharacters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Collections.shuffle(Arrays.asList(myCharacters));
        System.out.println(myCharacters[25]);
        String searchCharacter = myCharacters[0];
        String[] myVowels = {"A","E","I","O","U"};
        List<String> myVowelsList = Arrays.asList(myVowels);
        if(myVowelsList.contains(searchCharacter)){
            System.out.println("First Character is a vowel = "+ searchCharacter);
        }else{
            System.out.println("First Character is not a vowel = " + searchCharacter);
        }   
    }
    public int[] GenerateRandoms(){
        int[] randomArray = new int[10];
        Random random = new Random();
        for(int i=0; i<10; i++){
            random.nextInt(45);
            randomArray[i] = random.nextInt(45) + 55;
            System.out.println(randomArray[i]);
        }
        return randomArray;
    }
    public List<Integer> SortedGenerateRandoms(){
        Integer[] sGR = Arrays.stream(GenerateRandoms()).boxed().toArray(Integer[]::new);
        List<Integer> mySGRList = Arrays.asList(sGR);
        Collections.sort(mySGRList);
        return mySGRList;
    }
    
    
    public String createRandomString(){
        String[] myCharacters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String myWord = "";
        Random r = new Random();
        for(int i = 0; i<=4; i++){
            myWord += myCharacters[r.nextInt(26)];
        }
        System.out.println(myWord);
        return myWord;
    }
    public String[] createArrayOfStrings(){
        String[] myStringArray;
        myStringArray = new String[10];
        for(int i=0; i<10; i++){
            myStringArray[i]=createRandomString();
        }
        return myStringArray;
    }
}

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class CodeExample {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        
        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
    }
}
*/