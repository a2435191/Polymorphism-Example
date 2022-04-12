public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // we can create a Dog and it will have type Dog
        dog1.say(); // woof!

        Cat cat1 = new Cat(); // create Cat of type Cat
        cat1.say(); // meow!
        
        Pet cat2 = new Cat(); // create Cat of type Pet
        cat2.say(); // meow!
        
        Pet myPet = new Pet(); // create Pet of type Pet
        myPet.say(); // I'm a pet!
        

        Pet[] pets = new Pet[] {dog1, cat1, new Dog(), new Cat(), new Cat(), new Pet()};
        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets[i]; // the compiler doesn't know if each object was constructed as a Dog() or a Cat() or a Pet(), ...
            pet.say(); // but the say() method works anyway (i.e. your code compiles)!
        }
        /*
          woof!
          meow!
          woof!
          meow!
          meow!
          I'm a pet!
        */
    }
}
