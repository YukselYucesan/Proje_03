package task04;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner readInt= new Scanner(System.in);

        String[] products={"Bread","Flour","Milk","Watermelon", "Pomegranate"};
        double[] prices={2.25, 8.99, 5.99, 4.25, 4.99 };
        int[] stocks={80,40,50,70,60};

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + i + " = " + products[i] + ", Price = " +prices[i] + ", Stock = " + stocks[i]);
        }

        int yesOrNo=0;
        double generalTotal=0;
        do {

            int product = 0;
            do {
                System.out.print("Product (0,1,2,3,4) = ");
                product = readInt.nextInt();
                switch (product) {
                    case 0: System.out.println("Current stock status = " + stocks[0]); break;
                    case 1: System.out.println("Current stock status = " + stocks[1]); break;
                    case 2: System.out.println("Current stock status = " + stocks[2]); break;
                    case 3: System.out.println("Current stock status = " + stocks[3]); break;
                    case 4: System.out.println("Current stock status = " + stocks[4]); break;
                    default: System.out.println("Mistake product");
                }
            } while (product != 0 && product != 1 && product != 2 && product != 3 && product != 4);

            boolean isThereInStock =false;
            int amount=0;
            for (int i = 0; i < products.length; i++) {
                if (i == product && stocks[i] > 0) {
                    System.out.print("How many do you want? = ");
                    amount = readInt.nextInt();
                    if (stocks[i]>=amount) {
                        isThereInStock =true;
                        double totalPrice = amount * prices[i];
                        generalTotal = generalTotal + totalPrice;
                        System.out.println("Amount = " + amount + ", Total Price = " + totalPrice);
                        stocks[i] = stocks[i] - amount;
                    }
                }
            }
            if (!isThereInStock){
                System.out.println("İs there in stock? = " + isThereInStock);
                int missingProductQuantity= stocks[product]-amount;
                System.out.println("Missing Product Quantity = " + (-missingProductQuantity));
            }

            System.out.print("Do you want to contiue (0/1) = ");
            yesOrNo=readInt.nextInt();
        }while (yesOrNo==1);

        System.out.println("General Total = " + generalTotal);

    }
}
