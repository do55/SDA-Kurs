package main;

import model.Book;
import model.Game;
import model.Music;
import repository.BookRepository;
import repository.GameRepository;
import repository.GameRepositoryImpl;
import repository.MusicRepository;
import repository.MusicRepositoryImpl;
import repository.BookRepositoryImpl;
import repository.Logable;
import service.BookService;
import service.GameService;
import service.MusicService;

        public class Main {

            private static Book[] books = new Book[10];
            private static Music[] cds = new Music[10];
            private static Game[] games = new Game[10];

            public static void main(String[] args) {
                initializeApp();

                BookRepository bookRepository = new BookRepositoryImpl(books);
                Book foundBook = bookRepository.findBookById(4);
                System.out.println(foundBook);
                //piszemy kod pod interface, nie pod implementacje

                Book newBook = new Book(4, "Title 4", 25D, 10D);
                bookRepository.save(newBook);
                foundBook = bookRepository.findBookById(4);
                System.out.println(foundBook);

                /////////

                GameRepository gameRepository = new GameRepositoryImpl(games);
                Game foundGame = gameRepository.findGameById(4);
                System.out.println(foundGame);

                Game newGame = new Game(4,"Game title 4", 470D, 20D);
                gameRepository.save(newGame);
                foundGame = gameRepository.findGameById(4);
                System.out.println(foundGame);
                //////////

                MusicRepository musicRepository = new MusicRepositoryImpl(cds);
                Music foundMusic = musicRepository.findMusicById(4);
                System.out.println(foundMusic);

                Music newMusic = new Music(4, "Music title 4", 450D, 15D);
                musicRepository.save(newMusic);
                foundMusic = musicRepository.findMusicById(4);
                System.out.println(foundMusic);
            }

/*		Book book = new Book("Pan Kleks", 150D, BookService.BOOK_MARGIN);
		BookService bookService = new BookService ();
		Double productPriceWithMargin = bookService.calculateProductPriceWithMargin(book);
		System.out.println("Book price: " + productPriceWithMargin);
	}
		BookRepository bookRepository = new BookRepositoryImpl();
		BookRepositoryImpl b = (BookRepositoryImpl) bookRepository; //rzutowanie, castowanie

		Logable bookRepository1 = new BookRepositoryImpl();


		Logable bookRepository = new BookRepositoryImpl();
		BookRepositoryImpl b = (BookRepositoryImpl) bookRepository;
*/


            private static void initializeApp() {
                initializeBooks();
                initializeMusic();
                initializeGame();
            }

            private static void initializeBooks() {
                Book book1 = new Book(1, "Title 1", 100D, 10D);
                Book book2 = new Book(2, "Title 2", 200D, 10D);
                Book book3 = new Book(3, "Title 3", 300D, 10D);

                books[0] = book1;
                books[1] = book2;
                books[2] = book3;
            }

            private static void initializeMusic() {
                Music music1 = new Music(1,"Music title 1", 150D, 15D);
                Music music2 = new Music(2,"Music title 2", 250D, 15D);
                Music music3 = new Music(3,"Music title 3", 350D, 15D);

                cds[0] = music1;
                cds[1] = music2;
                cds[2] = music3;
            }

            private static void initializeGame() {
                Game game1 = new Game(1, "Game title 1", 170D, 20D);
                Game game2 = new Game(2, "Game title 2", 270D, 20D);
                Game game3 = new Game(3, "Game title 3", 370D, 20D);

                games[0] = game1;
                games[1] = game2;
                games[2] = game3;
            }
        }




