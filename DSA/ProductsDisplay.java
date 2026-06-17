import java.util.ArrayList;

class ProductsDisplay {
    public static void main(String[] args) {

        String items[] = {"Mobile", "Laptop", "Clothes", "Diary"};
        int price[] = {50000, 80000, 2500, 150};
        double disc[] = {2, 5, 3, 5};
        int qty[] = {10, 5, 2, 1};

        ArrayList<Double> disPrice = new ArrayList<>();
        ArrayList<Double> sumPrice = new ArrayList<>();


        for (int i = 0; i < items.length; i++) {

            double disprice = price[i] - (price[i] * disc[i] / 100);
            disPrice.add(disprice);

            double sumprice = disprice*qty[i];
            sumPrice.add(sumprice);



            System.out.println(
                    "Item: "+items[i]+
                            " Price: "+price[i]+
                            " Discount: "+disc[i]+
                            " Discounted Price: "+disPrice.get(i)+
                            " Quantity: "+qty[i]+
                            " Sum Price: "+sumPrice.get(i)
            );
        }
    }
}