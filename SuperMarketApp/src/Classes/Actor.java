package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;


    /**
     * Параметр, который показывает показывает, оформил ли клиент заказ возврат
     */
    protected boolean isReturn;

    /**
     * Параметр, который сообщает о цели клиента ("purchase", "return",
     * "inscection")
     */
    

    public Actor(String name) {
        this.name = name;

    }

    /**
     *  @param name принимает имя клиента
     * 
     */
    abstract public void setName(String name);
    abstract public String getName();

         /*        
        * Вернуть ранее полученный товар.
        * При этом снимается признак выдачи товара и устанавливается признак возврата.
        */

       @Override
       public void returnOrder() {
           this.isReturn = true;
           this.isTakeOrder = false;
       }
   
       /**
        * @apiNote Получить признак, что клиент ранее вернул товар
        * @return true, если клиент вернул товар
        */
       @Override
       public boolean isReturn() {
           return this.isReturn;
       }
}
