package reflection;

import java.util.List;

public class Vertebrate extends Animals{
    private Mammals mammals;
    private Aves aves;
    private Reptiles reptiles;
    private Amphibians amphibians;
    private Pisces pisces;
    /*private List<Mammals> mammals;
    private List<Aves> aves;
    private List<Reptiles> reptile;
    private List<Amphibians> amphibians;
    private List<Pisces> pisces;*/

    public Vertebrate(){
        System.out.println("I am trying to create a Vertebrate");
    }
}
