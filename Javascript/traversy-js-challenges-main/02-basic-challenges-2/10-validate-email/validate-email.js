function validateEmail(emailString) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(emailString);
}

module.exports = validateEmail;
