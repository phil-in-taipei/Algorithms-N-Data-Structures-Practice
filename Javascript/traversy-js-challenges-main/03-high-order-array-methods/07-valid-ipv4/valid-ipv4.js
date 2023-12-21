const beginsWithZero = (subAddress) => subAddress.charAt(0) == 0;

const isBetweenZeroAndTwoFiftyFive = (subAddress) => subAddress > 0 && subAddress <= 255;

const isValidIPv4 = (address) => {
    const addressAsArray = address.split(".");
    if (addressAsArray.length === 4) {
        return addressAsArray.every((subAddress) => 
            !beginsWithZero(subAddress) && isBetweenZeroAndTwoFiftyFive(subAddress)
        );
    }
    return false;
    
};

module.exports = isValidIPv4;
