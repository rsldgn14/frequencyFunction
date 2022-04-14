
public class Main {


    public static void main(String[] args) {
        String[] input = new String[]{"apple", "pie", "apple", "red", "red", "red"};
        System.out.println('"'+freq(input)+'"');


    }
    public static String freq(String[] arr){
        String element="";
        int count =0;
        for (int j =0;j< arr.length;j++){
            String tempElement = arr[j];
            int tempCount = 0;
            for (int i =0;i< arr.length;i++){
                if (arr[i].equals(tempElement)) {
                    tempCount++;
                }
            }
            if (tempCount>count){
                element = tempElement;
                count = tempCount;
            }
        }
        return element;
    }

}
