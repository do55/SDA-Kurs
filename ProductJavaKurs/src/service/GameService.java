package service;

import model.Product;

public class GameService extends ProductService {

    public static final Double GAME_MARGIN = 20D;

    @Override
    public Double calculateProductPriceWithMargin(Product product) {
        return product.getPrice() + GAME_MARGIN;
    }

}
