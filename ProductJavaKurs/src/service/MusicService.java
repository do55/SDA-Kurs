package service;

import model.Product;

public class MusicService extends ProductService {

    public static final Double MUSIC_MARGIN = 15D;

    @Override
    public Double calculateProductPriceWithMargin(Product product) {
        return product.getPrice() + MUSIC_MARGIN;
    }

}
