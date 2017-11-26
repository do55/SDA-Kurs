package pl.sdam;

import pl.sdamodel.Account;
import pl.sdamodel.Client;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Account> client1AccountList = new ArrayList<>();
        client1AccountList.add(new Account("9399772288", 200.12));
        client1AccountList.add(new Account("5522121212", 637.55));
        client1AccountList.add(new Account("1167890234", 251.02));

        Client client1 = new Client("Eric", "Freeman", "67012356744", "5th Avenue", 22, "Los Angeles", client1AccountList);


        List<Account> client2AccountList = new ArrayList<>();
        client2AccountList.add(new Account("7355429999", 111.67));
        client2AccountList.add(new Account("1111114563", 126789.00));
        client2AccountList.add(new Account("9222983222", 7456.99));

        Client client2 = new Client("Kathy", "Sierra", "7712039485", "3rd Avenue", 2, "New York", client2AccountList);


        List<Account> client3AccountList = new ArrayList<>();
        client3AccountList.add(new Account("3652344411", 8875.41));
        client3AccountList.add(new Account("2341122339", 9451.51));

        Client client3 = new Client("Bert", "Bates", "652244021", "18th Avenue", 10, "Boston", client3AccountList);


        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        //znalezienie klienta po Peselu
        Optional clientByPesel = clients.stream()
                .filter(c -> c.getPesel().equals("652244021"))
                .findFirst();
        System.out.println(clientByPesel);

        //klienci, którzy urodzili się w danym roku
        clients.stream()
                .filter(c -> (c.getPesel().charAt(0) == '6') && (c.getPesel().charAt(1) == '5'))
                .forEach(System.out::println);

        //wyświetl klientów, którzy mieszkają na danej ulicy i pod nr domu
        clients.stream()
                .filter(c -> (c.getStreet() == "5th Avenue") && (c.getStreetNumber() == 22))
                .forEach(System.out::println);

        //klienci posortowani po nazwie miasta od A do Z
        System.out.println("=======");
        clients.stream()
                .sorted(Comparator.comparing(Client::getCity))
                .forEach(System.out::println);

        //wyświetl wszystkie konta klienta (flatMap)
        System.out.println("*****");
        List<Account> accounts = clients.stream()
                .map(c -> c.getAccountList())
                .flatMap(c -> c.stream())
                .collect(Collectors.toList());

        System.out.println(accounts);

        // klienci - stan konta większy niż 1000 - wyświetla samo konto
        System.out.println("<<<<<<");
        clients.stream()
                .map(c -> c.getAccountList())
                .flatMap(b -> b.stream())
                .filter(b -> b.getBalance() > 1000)
                .forEach(System.out::println);
        System.out.println("Klient - stan konta większy niż 1000");

        // klienci - stan konta większy niż 1000 - wyświetla klientów
        System.out.println("<<<<<<");
        clients.stream()
                    .filter(c -> c.getAccountList().stream().anyMatch(b -> b.getBalance() > 1000))
                    .forEach(System.out::println);

        //wyświetl klienta, który jest posiadaczem konta - samo konto
        System.out.println(";;;;;;;");
        clients.stream()
                .map(c -> c.getAccountList())
                .flatMap(b -> b.stream())
                .filter(b -> b.getAccountNumber().equals("1111114563"))
                .forEach(System.out::println);
        //wyświetl klienta, który jest posiadaczem konta - wyświetla klienta
        clients.stream()
                .filter(c -> c.getAccountList().stream().anyMatch(b -> b.getAccountNumber().equals("1111114563")))
                 .forEach(System.out::println);

        //Wyświetl konta klienta o danym numerze pesel, których stan jest między zadanym przedziałem.

        clients.stream()
                .filter(c -> c.getPesel().equals("7712039485"))
                .map(c -> c.getAccountList())
                .flatMap(b -> b.stream())
                .filter(b -> b.getBalance() > 5000 && b.getBalance() < 10000)
                .forEach(System.out::println);


    }
}


