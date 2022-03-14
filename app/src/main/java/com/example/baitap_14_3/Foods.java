package com.example.baitap_14_3;

public class Foods {
    private String nameUp;
    private String nameUn;
    private int imageFoods;

    public Foods(String nameUp, String nameUn, int imageFoods) {
        this.nameUp = nameUp;
        this.nameUn = nameUn;
        this.imageFoods = imageFoods;
    }

    public String getNameUp() {
        return nameUp;
    }

    public void setNameUp(String nameUp) {
        this.nameUp = nameUp;
    }

    public String getNameUn() {
        return nameUn;
    }

    public void setNameUn(String nameUn) {
        this.nameUn = nameUn;
    }

    public int getImageFoods() {
        return imageFoods;
    }

    public void setImageFoods(int imageFoods) {
        this.imageFoods = imageFoods;
    }
}
