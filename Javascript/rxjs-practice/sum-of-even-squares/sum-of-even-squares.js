import { from } from 'rxjs';
import { reduce, filter } from 'rxjs/operators';

function sumOfEvenSquares(arrayOfIntegers) {

    let result;
    
    const sumOfEvenNumbers$ = from(arrayOfIntegers)
        .pipe(
            filter(num => num % 2 === 0),
            reduce((total, num) => total + num * num, 0)  
        )

    sumOfEvenNumbers$.subscribe((calculationResult) => {
            result =  calculationResult
        }).unsubscribe();
        
    return result;
}

export default sumOfEvenSquares;
    