package logic.room;

/**
 * Cine 's helping class. It implements a screen using some enums for
 * the basics of each screen. (Sound System, Screen Size, 3D or 2D)
 * @see logic.room.Cine
 * @author gramanas
 */
public class Screen {
    public enum SoundSystem {DOLBY_DIGITAL, DOLBY_DIGITAL_SURROUND,
        DOLBY_DIGITAL_LIVE, DOLBY_DIGITAL_PLUS, DOLBY_TURE_HD}
    public enum ScreenDimensions {D2, D3}
    public enum ScreenSize {NORMAL, IMAX_DIGITAL, IMAX_SCREEN}


    private ScreenDimensions dimensions;
    private ScreenSize size;
    private SoundSystem soundSystem;

    /**
     * Creates a Screen object with the given characteristics.
     * @param soundSystem Soundsytem.
     * @param dimensions (2D, 3D).
     * @param size Screen Size.
     */
    public Screen(String soundSystem, String dimensions, String size){
        this.soundSystem = SoundSystem.valueOf(soundSystem);
        this.dimensions = ScreenDimensions.valueOf(dimensions);
        this.size = ScreenSize.valueOf(size);
    }

    /**
     * Constructs an empty Screen object.
     */
    public Screen(){}

    /**
     * @param soundSystem Sound System to be set.
     */
    public void setSoundSystem(String soundSystem){
        this.soundSystem = SoundSystem.valueOf(soundSystem);
    }

    /**
     * @param screenSize Screen size to be set.
     */
    public void setScreenSize(String screenSize){
        this.size = ScreenSize.valueOf(screenSize);
    }

    /**
     * @param dimensions Screen Dimension to be set.
     */
    public void setScreenDimension(String dimensions){
        this.dimensions = ScreenDimensions.valueOf(dimensions);
    }

    /**
     * @return The price to be used in the Cine object's field.
     */
    public int getPrice(){
        int price;
        if (dimensions.ordinal() == 0){
            price = 4;
            if(size.ordinal() == 0)
                price += 1;
            else if (size.ordinal() == 1)
                price += 2;
            else if (size.ordinal() == 2)
                price += 3;
        }
        else{
            price = 6;
            if(size.ordinal() == 0)
                price += 1;
            else if (size.ordinal() == 1)
                price += 2;
            else if (size.ordinal() == 2)
                price += 3;
        }
        return price;
    }

    /**
     * @return The object in a proper way to print it.
     */
    @Override
    public String toString(){
        //TODO code
        return null;
    }
}
