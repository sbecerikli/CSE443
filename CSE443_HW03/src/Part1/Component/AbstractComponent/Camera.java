package Part1.Component.AbstractComponent;

/**
 * Created by Seyfullah Becerikli on 15/12/2016.
 */
public abstract class Camera {
    private String CameraType;

    public String getCameraType() {
        return CameraType;
    }

    public void setCameraType(String cameraType) {
        CameraType = cameraType;
    }
}
