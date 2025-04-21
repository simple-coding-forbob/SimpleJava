package chap11.final03;

public class CustomerApplication {
    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();             // 구매하기

        Sell seller = customer;
        seller.sell();           // 판매하기
    }
}
