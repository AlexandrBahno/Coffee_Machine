public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        //Secret[] text = Secret.values();
        for (Secret secret : Secret.values()) {
            if (secret.toString().startsWith("STAR")) {  // temp.contains("STAR")
                counter++;
            }
        }
        //for (int i = 0; i < text.length; i++) {

            //String temp = String.valueOf(text[i]);
            //System.out.println("x = " + temp.toString().startsWith("STAR"));
            //System.out.println(temp);

            //int x = temp.indexOf("STAR");
            //System.out.println(x);
            //if (text[i].toString().startsWith("STAR")) {  // temp.contains("STAR")
                //counter++;
            //}
        //}

        System.out.println(counter);
    }
}
// At least two constants start with STAR
/*
enum Secret {
    STAR, CRASH, START, // ...
}*/
