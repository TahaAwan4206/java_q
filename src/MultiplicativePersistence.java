public class MultiplicativePersistence {

    public static int MultP(int num){

        String[] number = String.valueOf(num).split("");
        int numberOfTimes = 0;
        int value = 1;
        while(number.length>1){
            numberOfTimes++;
            for(String element : number){
                value *= Integer.valueOf(element);

            }
            number = String.valueOf(value).split("");
            value = 1;
        }


        return numberOfTimes;

    }

    public static void main(String[] args) {
        System.out.println(MultP(39));
    }


}
