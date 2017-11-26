package strategy;

import com.sdaMRymarczyk.Money;
import com.sdaMRymarczyk.Order;

public interface RebateStrategy {

     Money calculateRebate(Order order);
}
