import java.util.Scanner;
public class Opgave3 {

    //globale variable / erklæringer
    Scanner myScanner = new Scanner(System.in);


    //metoder
    double applyDiscount(double price, double discountPercent){
        return price - (price * discountPercent / 100);
    }


    double applyTax(double price){
        return price * 1.25;
    }

    double calculateFinalPrice(double price, double discountPercent){
        double afterDiscount = applyDiscount(price, discountPercent);
        double afterTax = applyTax(afterDiscount);
        return afterTax;
    }



    void main(){




        System.out.println("Enter base price:");
        double price = myScanner.nextDouble();

        System.out.println("Enter discount percentage:");
        double discountPercent = myScanner.nextDouble();

        double finalPrice = calculateFinalPrice(price, discountPercent);




        System.out.println("Base price: " + price);
        System.out.println("Discount applied: " + discountPercent + "%");
        System.out.println("Taxes applied: 25%");
        System.out.println("Total price after discount and tax: " + finalPrice);

    }

}
