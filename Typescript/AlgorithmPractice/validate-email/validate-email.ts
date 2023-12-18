function validateEmail(emailString: string): boolean {
    const regex: RegExp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(emailString);
}

module.exports = validateEmail;