package diaryApp;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private int gistsCount;
    public Diary(String username, String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if(passwordIsCorrect) isLocked = false;
    }
    public void unlockDiary(){
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }
    public void addGist(String title, String body){
        gistsCount++;
    }
    public int countGists(){
        return gistsCount;
    }
}
