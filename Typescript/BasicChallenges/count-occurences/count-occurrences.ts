function countOccurences(str: string, char: string): number {
    
    let numberOfOccurences: number = 0;
    for (var i = 0; i < str.length; i++) {
        if (str.charAt(i) === char) {
            numberOfOccurences++;
        }
      }
    return numberOfOccurences;
  
}



module.exports = countOccurences;