public class CapLetterSwitch {

    public static String SwitchCaps(String word) {
        String[] array = word.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i].toLowerCase())
                array[i] = array[i].toUpperCase();

            else if (array[i] == array[i].toUpperCase()) {
                array[i] = array[i].toLowerCase();
            }
        }

        return String.join("", array);

    }

    public static void main(String[] args) {
        System.out.println(SwitchCaps("StRiNg"));
    }


}
