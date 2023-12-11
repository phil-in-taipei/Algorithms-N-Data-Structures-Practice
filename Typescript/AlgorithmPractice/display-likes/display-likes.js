"use strict";
function displayLikes(arrayOfNames) {
    let numberOfLikes = arrayOfNames.length;
    let messageString = "like this";
    if (numberOfLikes > 0) {
        if (numberOfLikes === 1) {
            messageString = `${arrayOfNames[0]} likes ${messageString.split(" ")[1]}`;
        }
        else if (numberOfLikes === 2) {
            messageString = `${arrayOfNames[0]} and ${arrayOfNames[1]} ${messageString}`;
        }
        else if (numberOfLikes === 3) {
            messageString = `${arrayOfNames[0]}, ${arrayOfNames[1]} and ${arrayOfNames[2]} ${messageString}`;
        }
        else {
            messageString =
                `${arrayOfNames[0]}, ${arrayOfNames[1]} and ${numberOfLikes - 2} others ${messageString}`;
        }
    }
    else {
        messageString = `no one likes ${messageString.split(" ")[1]}`;
    }
    return messageString;
}
module.exports = displayLikes;
