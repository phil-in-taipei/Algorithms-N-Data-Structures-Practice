"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function rollDice() {
    return Math.floor(Math.random() * 6) + 1;
}
function diceGameSimulation(numberOfSimulations) {
    let gameResults = [];
    for (let i = 0; i < numberOfSimulations; i++) {
        const dice1 = rollDice();
        const dice2 = rollDice();
        const sum = dice1 + dice2;
        let result;
        switch (sum) {
            case 7:
                result = "win";
                break;
            case 11:
                result = "win";
                break;
            case 2:
                result = "lose";
                break;
            case 3:
                result = "lose";
                break;
            case 12:
                result = "lose";
                break;
            default:
                result = "roll again";
                break;
        }
        gameResults.push({ dice1, dice2, sum, result });
    }
    return gameResults;
}
module.exports = diceGameSimulation;
