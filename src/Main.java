public class Main {
    public static void main(String[] args) {

        int TicketPrice = 7084; //Цена билета.
        int Bonus = 20; //Количество рублей, за которые начисляется одна миля
        int BonusMiles = TicketPrice / Bonus; //Количество бонусных милей.
        System.out.println(BonusMiles); //Вывод количества бонусных милей.

    }
}