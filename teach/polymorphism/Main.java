package polymorphism;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Frog2 frog = new Frog2();
        Goat2 goat = new Goat2();

        Animal2 animal = new Animal2();
        PlanetEarth planetEarth = new PlanetEarth();
        planetEarth.whatCanAnimalDo(elephant);
        planetEarth.whatCanAnimalDo(frog);
        planetEarth.whatCanAnimalDo(goat);
    }
}