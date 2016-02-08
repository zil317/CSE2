//Zihan Liu
//2/8/2016
//CSE2 HW2
// The purpose of this program is to compute the cost of the items you bought in the store
 
 
public class Arithmetic{
    
// add main method that is requried for every java program 
 public static void main(String[] args) {
  
int numPants = 3; //Number of pairs of pants
double pantsPrice = 34.98; //Cost per pair of pants


int numShirts = 2; //Number of sweatshirts
double shirtPrice = 24.99;//Cost per shirt

int numBelts = 1; //Number of belts
double beltCost = 33.99; //cost per belt

double paSalesTax = 0.06;//the tax rate

 double totalCostOfPants;   //total cost of pants
 double totalCostOfShirts; //total cost of shirts
 double totalCostOfBelts; //total cost of belts
 double SaleTaxChargedOnPants; //sales tax charged on pants
 double SalesTaxChargedOnShirts; //sales tax charged on shirts
 double SalesTaxChargedOnBelts; //sales tax charged on belts
 double TotalCostOfPurchase, TotalSalesTax, TotalPaid; 
 //define the total cost of purchase without tax, total sales tax, and the total cost of purchase including sales tax
 
TotalCostOfPurchase=numPants*pantsPrice+numShirts*shirtPrice+numBelts*beltCost; //total cost of purchase without tax
TotalSalesTax=TotalCostOfPurchase*paSalesTax; //total sales tax 
TotalPaid=TotalCostOfPurchase+TotalSalesTax; //total cost of purchase including sales tax

double TotalCostOfPurchase100=(int) (TotalCostOfPurchase*100);
TotalCostOfPurchase=TotalCostOfPurchase100/100; 
//eliminate extra digits appearing to the right of the decimal point in the total cost purchase without tax result

double TotalSalesTax100=(int) (TotalSalesTax*100);
TotalSalesTax=TotalSalesTax100/100;
//eliminate extra digits appearing to the right of the decimal point in the total sales tax result 

double TotalPaid100= (int) (TotalPaid*100);
TotalPaid=TotalPaid100/100;
//eliminate extra digits appearing to the right of the decimal point in the total paid result 

System.out.println("The total cost of purchase before tax is "+TotalCostOfPurchase+" dollar");
//print out the result of the total cost before tax
System.out.println("The total sales tax is "+TotalSalesTax+" dollar");
//print out the result of the total sales tax
System.out.println("The total cost of purchase including sales tax is "+TotalPaid+" dollar");
//print out the total paid including sales tax

}

}
