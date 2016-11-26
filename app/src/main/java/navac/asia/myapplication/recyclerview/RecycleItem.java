package navac.asia.myapplication.recyclerview;

/**
 * Created by DITOP on 11/15/2016.
 */

public class RecycleItem {

    String name ;
    String email ;
    int imageSource;

    public RecycleItem(String name, String email, int imageSource) {
        this.name = name;
        this.email = email;
        this.imageSource = imageSource;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }
}
