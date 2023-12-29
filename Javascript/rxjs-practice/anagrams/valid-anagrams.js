import { from } from 'rxjs';
import { reduce } from 'rxjs/operators';

function getFrequencyCount(string) {
    
    let frequencyCount;

    const frequencyCount$ = from(string.split(""))
        .pipe(reduce((acc, char) => {
            acc[char] = (acc[char] || 0) + 1;
            return acc;
            }, 
        {}));

    frequencyCount$.subscribe((wordCountObj) => {
        frequencyCount = wordCountObj;
    }).unsubscribe();
    
    return frequencyCount;
}

function validAnagrams(string1, string2) {
    const frequencyCountObj1 = getFrequencyCount(string1);
    const frequencyCountObj2 = getFrequencyCount(string2);
    return Object.keys(frequencyCountObj1).every((char) =>
        frequencyCountObj1[char] === frequencyCountObj2[char]
    ) && Object.keys(frequencyCountObj2).every((char) =>
        frequencyCountObj2[char] === frequencyCountObj1[char]
    )
}

export default validAnagrams;
