public class PuzzleJavaTesting{
    public static void main(String[] args){
        PuzzleJava pJ = new PuzzleJava();
        for(int i : pJ.SumAndGreaterThan10()){
            System.out.println(i);
        }
        for(String s :pJ.ManipulateString()){
            System.out.println(s);
        }
        pJ.alphabetManipulation();
        pJ.GenerateRandoms();
        pJ.SortedGenerateRandoms();
        pJ.createRandomString();
        pJ.createArrayOfStrings();
    }
}