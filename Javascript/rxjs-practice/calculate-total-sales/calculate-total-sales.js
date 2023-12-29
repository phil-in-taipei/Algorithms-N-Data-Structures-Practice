import { from } from 'rxjs';
import { reduce } from 'rxjs/operators';

function calculateTotalSalesWithTax(products, taxRate) {

    let totalSalesWithTax;

    const totalSalesWithTax$ = from (products).pipe(
            reduce((total, product) => 
                total + product.price * product.quantity, 0
            )
        )
    
    totalSalesWithTax$.subscribe((totalSales) => {
        totalSalesWithTax =  totalSales + (totalSales * taxRate) / 100;
    }).unsubscribe();

    return parseFloat(totalSalesWithTax.toFixed(2));
}

export default calculateTotalSalesWithTax;