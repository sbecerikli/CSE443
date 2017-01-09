package Part1.PhoneModel;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public enum PhoneModelEnum {
    MAXIMUMEFFORT("max"),
    IFLASDELUXE("delux"),
    IIAMANIFLAS("aman");


    private String model;

    PhoneModelEnum(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }
}
