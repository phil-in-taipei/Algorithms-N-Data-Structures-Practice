package numberofLikes;

public class NumberOfLikes {

    private String[] users;

    public NumberOfLikes(String[] users) {
        this.users = users;
    }

    public String getNumberOfLikes() {
        String messageString = "like this";

        int numberOfLikes = users.length;

        if (numberOfLikes > 0) {
            if (numberOfLikes == 1) {
                messageString = this.users[0] + " likes " + messageString.split(" ")[1];
            } else if (numberOfLikes == 2) {
                messageString = this.users[0] + " and " + this.users[1] +  " " + messageString;
            } else if (numberOfLikes == 3) {
                messageString = this.users[0] + ", " + this.users[1] + " and " + this.users[2]
                         + " " + messageString;
            } else {
                messageString = this.users[0] + ", " + this.users[1]
                        +   " and " + (numberOfLikes - 2) + " users " + messageString;
            }

        } else {
            messageString = "Nobody likes " + messageString.split(" ")[1];
        }

        return messageString;
    }
}
