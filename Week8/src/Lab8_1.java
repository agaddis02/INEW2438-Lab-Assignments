public class Lab8_1 {

    public static void go() {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock.getName() + " Symbol: " + stock.getSymbol());
        System.out.println("previous price: " + stock.getPreviousClosingPrice());
        System.out.println("current price: " + stock.getCurrentPrice());
        System.out.println("Percent changed: " + stock.getChangePercent());

    }
    public static void main(String[] args) {
    	go();
    }
}
