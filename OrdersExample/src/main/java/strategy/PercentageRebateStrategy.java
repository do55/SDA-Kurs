package strategy;

import com.sdaMRymarczyk.Money;
import com.sdaMRymarczyk.Order;

public class PercentageRebateStrategy implements RebateStrategy {


    @Override
    public Money calculateRebate(Order order) {
       Money money = order.getCurrentCost();
       return money.multiplyBy(0.1f);
    }
}
