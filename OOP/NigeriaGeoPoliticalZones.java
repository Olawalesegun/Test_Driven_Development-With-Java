import java.util.Arrays;

public enum NigeriaGeoPoliticalZones {
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    NORTH_CENTRAL("Benue", "Kogi", "Kwara", "Niger","NAssarawa", "Plateau");

    private String[] states;
    //private String stateEntered;

    NigeriaGeoPoliticalZones(String... states){
        this.states = states;
    }

    public String[] getState(){
        return states;
    }
    public void checkState(){
        NigeriaGeoPoliticalZones[] collectedZones = NigeriaGeoPoliticalZones.values();
        /*for(NigeriaGeoPoliticalZones checkForRegions; collectedZones){
            for(String states: checkForRegions.getState()){
                System.out.println("The ");
            }
        }*/
    }


    /*public void enterState(String nameOfState){
        stateEntered = nameOfState;
    }
    public String returnStateEntered(){
        return stateEntered;
    }
    *//*public void regionsCollation(String stateEntered){
        if(stateEntered)
    }*//*
    public void checkStateRegionForSouthSouth(){
        var SouthValue = NigeriaGeoPoliticalZones.SOUTH_SOUTH.values();
        int count = 0;
        for(var checkInsideSouth: SouthValue){
            if(returnStateEntered().equals(SouthValue[count])){
                System.out.println( returnStateEntered() + " belongs to the South South region");;
            }
           count++;
        }
    }

    public  void checkStateRegionForSouthWest(){
        var SouthWestValue = NigeriaGeoPoliticalZones.SOUTH_WEST.values();
        int count = 0;
        for(var checkInsideSouthWest: SouthWestValue){
            if(returnStateEntered().equals(SouthWestValue[count])){
                System.out.println(returnStateEntered() + "Belongs to the South West region");
            }
            count++;
        }
    }
    public void checkFor*/

}
