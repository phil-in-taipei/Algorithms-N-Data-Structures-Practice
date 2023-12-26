function fibonacci(index) {
    if (index < 2) {
        return index;
    }

    return fibonacci(index - 1) + fibonacci(index - 2)

}

module.exports = fibonacci;
