package Classes;
/**
 * Класс для создания экземпляра акционного покупателя (наследник абстрактного
 * класса Actor)
 */

public class PromotionClient extends Actor {

    /**
     * Название акции
     */
    private String promotionName;
    /**
     * Максимальное колличество участников акции
     */
    private static int maxPromotionClient; // TODO реализовать отказ при привышении лимита

    /**
     * Счетчик количества созданных экземпляров
     */
    private static int participantCount;

    static {
        participantCount = 0;
        maxPromotionClient = 3;
    }

    /**
     * Конструктор класса PromotionalClietnt
     * 
     * @param name        наследует имя у класса Actor
     */
    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        participantCount++;
    }

    /**
     * Возвращает параметр класса Actor, который показывает получил ли клиент заказ
     * (булево)
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Устанавливает параметр класса Actor, который показывает получил ли клиент
     * заказ 
     */
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    /**
     * Возвращает параметр класса Actor, который показывает сделал ли клиент заказ
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает параметр класса Actor, который показывает сделал ли клиент
     * заказ
     */
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Возвращает экземпляр класса PromotionalClietnt
     */
    public Actor getActor() {
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

    public String getPromotionName() {
        return this.promotionName;
    }

    public static int getMaxPromotionalClient() {
        return maxPromotionClient;
    }

    public static int getParticipantCount() {
        return participantCount;
    }

    public static void setParticipantCount(int participantCount) {
        PromotionClient.participantCount += participantCount;
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
        System.out.println( super.name + " вернул товар");
    }

}

