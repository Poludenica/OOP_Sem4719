import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;
import Classes.PromotionClient;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new PromotionClient("Nic", "cola free");
        iActorBehaviour client5 = new PromotionClient("Train", "summer's sold");
        iActorBehaviour client6 = new PromotionClient("Lis", "for friends");
        iActorBehaviour client7 = new PromotionClient("Fouth", "all-for-all");
       

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);


        magnit.update();
        
    }
}
