package service;


import model.Product;

public class BookService extends ProductService {

    public static final Double BOOK_MARGIN = 10D;
    //Zmieniliśmy na public i static, żeby w MAIN skorzystać z BookService.BOOK_MARGIN

    @Override
    public Double calculateProductPriceWithMargin(Product product) {
        return product.getPrice() + BOOK_MARGIN;
    }


}


//tu mogłoby być Book book pod warunkiem,
//że zamiast product.getPrice() byłaby cała metoda calculate z ProductService