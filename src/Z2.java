public class Z2 {
    public static void main(String[] args) {
        String tekst = "Mama ima momu.";
        System.out.println(prebrojiSlovo(tekst,'M'));
        System.out.println(prebrojiSlovo(tekst,'s'));

    }
    public static int prebrojiSlovo (String tekst, char slovo) {
        tekst = tekst.toUpperCase();
        int count=0;
        char [] array = tekst.toCharArray();
        for (int i =0;i< array.length;i++) {
            if (array[i] == slovo) {
                count ++;
            }
        }
        return count;
    }
}