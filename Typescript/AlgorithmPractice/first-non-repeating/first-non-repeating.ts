function findFirstNonRepeatingCharacter(inputString: string): string | null {
    // Step 1: convert the string to an array of characters
    const stringAsArray = inputString.split("");

    // Step 2: iterate through the array of characters
    for (let i = 0; i < stringAsArray.length; i++) {

        // Step 3: using a filter create a subarray consisting only of chars 
        //         which are the same as the char at that index
        // Step 4: Find if the length that subarray is equal to one. 
        //         If so, return the char at that index, and stop the loop
        if (stringAsArray.filter(char => char === stringAsArray[i]).length === 1) {
            return stringAsArray[i];
        }
    }
    // Having iterated through the array, each subarray did not have a length greater than one
    return null;
}

module.exports = findFirstNonRepeatingCharacter;