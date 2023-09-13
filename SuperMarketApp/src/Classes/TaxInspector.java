package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class TaxInspector implements iActorBehaviour, iReturnOrder  {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Tax audit";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isTakeOrder() {

       return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
       isTakeOrder = take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    protected boolean isReturn;

    private String actorStatus;
    public String getActorStatus() {
        return actorStatus;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public boolean isReturn() {
        return isReturn;
    }

    @Override
    public void setReturn(boolean ordered) {
        isReturn = ordered;
    }

    @Override
    public void returnOrder() {
        System.out.println("Клиент " + this.name + " закончил проверку и вернул товар");
    }


}
