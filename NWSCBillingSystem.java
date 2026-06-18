
package vu.nwscbillingsystem;
import java.util.*;
public class NWSCBillingSystem {

    public static void main(String[] args) {
        //Part a)
        
        Scanner input = new Scanner(System.in);
         System.out.print("Enter water consumption (m3) for customer " + (customers.size() + 1) + ": ");
                double consumption = input.nextDouble();
                
                if (consumption < 0) {
                    System.out.println("Invalid input: Consumption cannot be negative.");
                  
                }
                // Create customer object and add to list
                Customer c = new Customer(consumption);
                customers.add(c);
// Part b)
 private void determineBandAndBill() {
        double rate;
        double fixedCharge;

        if (consumption <= 5) {
            band = "LIFELINE";
            rate = 1000;
            fixedCharge = 2000;
        } else if (consumption <= 20) {
            band = "DOMESTIC LOW";
            rate = 2500;
            fixedCharge = 4000;
        } else if (consumption <= 50) {
            band = "DOMESTIC HIGH";
            rate = 3800;
            fixedCharge = 7500;
        } else if (consumption <= 100) {
            band = "COMMERCIAL";
            rate = 4500;
            fixedCharge = 15000;
        } else if (consumption <= 300) {
            band = "INDUSTRIAL";
            rate = 5200;
            fixedCharge = 40000;
        } else {
            band = "INSTITUTIONAL";
            rate = 6000;
            fixedCharge = 90000;
        }

        
        this.totalBill = (consumption * rate) + fixedCharge;
    }
      System.out.println("Processed: " + c);
      
       // Process 6 customers
        for (int i = 1; i <= 6; i++) {
            double consumption = -1;

            // Exception handling and re-prompting
            while (true) {
                try {
                    System.out.print("\nEnter water consumption (m3) for Customer " + i + ": ");
                    consumption = input.nextDouble();

                    if (consumption < 0) {
                        System.out.println("Consumption cannot be negative. Please try again.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    input.next(); // Clear invalid input
                }
            }

       // Update counters based on band
            switch (customer.getBand()) {
                case "LIFELINE":
                    lifeline++;
                    break;
                case "DOMESTIC LOW":
                    domesticLow++;
                    break;
                case "DOMESTIC HIGH":
                    domesticHigh++;
                    break;
                case "COMMERCIAL":
                    commercial++;
                    break;
                case "INDUSTRIAL":
                    industrial++;
                    break;
                case "INSTITUTIONAL":
                    institutional++;
                    break;
            }

            totalRevenue += customer.getTotalBill();
        }

        // Calculate average bill
        double averageBill = totalRevenue / customers.size();
 
    }
}

