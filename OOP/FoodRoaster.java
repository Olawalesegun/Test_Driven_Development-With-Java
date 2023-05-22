public enum FoodRoaster {
    MONDAY( 2, "Rice", "EGG"),
    TUESDAY( 34, "Beans", "Ewa"),
    WEDNESDAY(4, "CHoco", "Sardine"),
    THURSDAY( 8, "Bread", "Beans"),
    FRIDAY(9, "Stony JOllof", "Beef");
    private String[] food;
    private int size;
    FoodRoaster(int size, String... food){
        System.out.println("I am currently creating " + getFood() + " food");
        this.food = food;
        this.size = size;
    }
    public String[] getFood(){
        return food;
    }
}
