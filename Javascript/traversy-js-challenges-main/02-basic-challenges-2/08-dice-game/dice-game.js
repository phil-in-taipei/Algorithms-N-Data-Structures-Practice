function diceGameSimulation(numberOfSimulations) {
    gameResults = []
    for (let i = 0; i < numberOfSimulations; i++) {
        const dice1 = Math.floor(Math.random() * 6) + 1;
        const dice2 = Math.floor(Math.random() * 6) + 1;
        const sum = dice1 + dice2;
        const gameResult = {
            "dice1": dice1,
            "dice2": dice2,
            "sum": sum,
            "result": sum === 7 || sum === 11 ? 'win' :
            sum === 2 || sum === 3 || sum === 12 ? 'lose' :
            'roll again'
        }
        gameResults.push(gameResult)
    }
    return gameResults;
}

module.exports = diceGameSimulation;
