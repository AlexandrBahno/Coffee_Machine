class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;


    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        // do not forget to check the number of cats
        counter ++;
        if (Cat.getNumberOfCats() == 6 || Cat.getNumberOfCats() == 7) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }

   public static void main(String[] args) {
       //Cat cat1 = new Cat("cat1", 1);
/*       Cat cat2 = new Cat("cat2", 1);
       Cat cat3 = new Cat("cat3", 1);
       Cat cat4 = new Cat("cat4", 1);
       Cat cat5 = new Cat("cat5", 1);
       Cat cat6 = new Cat("cat6", 1);*/
/*       if (Cat.getNumberOfCats() == 6 || Cat.getNumberOfCats() == 7) {
           System.out.println("You have too many cats");
       }*/



    }
}