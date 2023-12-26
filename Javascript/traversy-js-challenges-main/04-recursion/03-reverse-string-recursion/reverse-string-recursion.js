function reverseString(string) {
    if(string ==='') {
        return '';
    }
    return reverseString(string.substring(1)) + string.charAt(0);

}

module.exports = reverseString;
