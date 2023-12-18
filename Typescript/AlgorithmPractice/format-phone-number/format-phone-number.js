"use strict";
function formatPhoneNumber(arrayOfNums) {
    return `(${arrayOfNums.splice(0, 3).join("")}) ${arrayOfNums.splice(0, 3).join("")}-${arrayOfNums.splice(-4).join("")}`;
}
module.exports = formatPhoneNumber;
