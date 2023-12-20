function generateHashtag(inputString) {
    const trimmedString = inputString.trim();
    if(trimmedString.length > 0 && trimmedString.length < 141) {
        return `#${
            trimmedString.split(" ").map((word) => {
                return word.charAt(0).toUpperCase() + word.substring(1)
        }).join("")}`
    }
    return false;
}

module.exports = generateHashtag;
