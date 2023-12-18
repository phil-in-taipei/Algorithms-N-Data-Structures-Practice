"use strict";
function validateEmail(emailString) {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(emailString);
}
module.exports = validateEmail;
