
// my simple approach: (sort both strings into alphabetical order and check if they are the same)
/*
function validAnagrams(string1, string2) {
    return string1.split("").sort().join("") === string2.split("").sort().join("");
}
*/

// approach comparing objects with frequency counts

function getFrequencyCount(string) {
    const frequencyCount = string.split("").reduce((acc, char) => {
        acc[char] = (acc[char] || 0) + 1;
        return acc;
    }, {})
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
    // note: last two lines modified from the solution in video to get the test to pass
    // originally there is an edge case where the 2nd object could contain all of the same
    // characters and counts as the first, but also have other additional characters
    // This now checks that the inverse is also true comparing obj2 to obj1
}

module.exports = validAnagrams;
