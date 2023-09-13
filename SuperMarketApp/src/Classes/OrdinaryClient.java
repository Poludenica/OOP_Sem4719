package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;        
    }

    @Override
    public void setName(String name) {
       super.name = name;        
    }

 

    @Override
    public boolean isReturn() {
        return super.isReturn;
    }

    @Override
    public void setReturn(boolean ordered) {
        super.isReturn = ordered;
    }

    @Override
    public void returnOrder() {
        System.out.println(super.name + " вернул товар");
    }
}