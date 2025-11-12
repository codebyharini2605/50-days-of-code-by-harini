package Day12;

public class Main {
    public static void main(String[] args) {
        String name="Thangamuhh";
        name=name.toLowerCase();
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
                count++;
            }
            
        }
        System.out.println("THE TOTAL NUMBER OF VOWELS IN THIS NAME IS " + count);

    }
    
}
