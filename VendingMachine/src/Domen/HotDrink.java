package Domen;

public class HotDrink extends Product {
    private float drinkVolume;
    private int drinkTemp;
    
    public HotDrink(String name, int price, float drinkVolume, int drinkTemp) {
        super(name, price);
        this.drinkVolume = drinkVolume;
        this.drinkTemp = drinkTemp;
    }

    public float getDrinkVolume() {
        return drinkVolume;
    }

    public void setDrinkVolume(float drinkVolume) {
        this.drinkVolume = drinkVolume;
    }

    public int getDrinkTemp() {
        return drinkTemp;
    }

    public void setDrinkTemp(int drinkTemp) {
        this.drinkTemp = drinkTemp;
    }
@Override
public String toString(){
    return super.toString() + "; volume = " + this.drinkVolume + "; temperature = " + this.drinkTemp;
}
    
}
