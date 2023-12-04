//function countOccurrences(str, char) {
    /*
    let numberOfOccurences = 0;
    for (var i = 0; i < str.length; i++) {
        if (str.charAt(i) === char) {
            numberOfOccurences++;
        }
      }
    return numberOfOccurences;
    */
   //return str.split(char).length - 1
//}

const countOccurrences = (str, char) =>  str.split(char).length - 1;

module.exports = countOccurrences;
