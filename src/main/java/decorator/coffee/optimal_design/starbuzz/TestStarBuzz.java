package decorator.coffee.optimal_design.starbuzz;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestStarBuzz {
    private Logger logger = LoggerFactory.getLogger(TestStarBuzz.class);
    @Test
    public void purchaseByNDiscount(){
        //darkRoast加调料milk、mocha、soy
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription()
                + "darkRoast咖啡和调料总共：$" + darkRoast.cost());
        //houseBlend加调料milk、mocha、soy
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription()
                + "darkRoast咖啡和调料总共：$" + houseBlend.cost());
    }
}
