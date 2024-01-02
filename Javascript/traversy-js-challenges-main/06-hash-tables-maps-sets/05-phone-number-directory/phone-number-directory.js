function phoneNumberDirectory(phoneNumbersArray) {
    const phoneNumbersMap = new Map();
    for (let i = 0; i < phoneNumbersArray.length; i++) {
        const formatted = phoneNumbersArray[i].split(":");
        phoneNumbersMap.set(formatted[0], formatted[1]);
    }
    return phoneNumbersMap;
}

module.exports = phoneNumberDirectory;
