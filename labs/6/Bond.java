package lab6;

	public class Bond {
		double coupon;
		double payments;
		double interest;
		double valueMaturity;
			  
		Bond() {
			coupon = 0;
			payments = 0;
			interest = 0;
			valueMaturity = 0;
		}
			 
		Bond(double coupon, int payments, double interest, double valueMaturity) {
			this.coupon = coupon;
			this.payments = payments;
			this.interest = interest;
			this.valueMaturity = valueMaturity;
		}
			  
			   
		double getPrice() {
			double price;
			price = ( coupon * ( 1 - ( 1 / Math.pow(1+interest, payments) ) ) ) + ( valueMaturity * ( 1 / Math.pow(1+interest, payments) ) );
			      
			return price;
		}  
			}


		


