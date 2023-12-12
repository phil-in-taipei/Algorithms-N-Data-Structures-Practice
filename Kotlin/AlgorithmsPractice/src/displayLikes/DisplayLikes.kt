package displayLikes

class DisplayLikes(val users: Array<String>) {

    fun getLikesMessage(): String {
        val numberOfLikes: Int = users.size
        var likesMessage: String = "like this"
        if (numberOfLikes != 0) {
            if (numberOfLikes == 1) {
                likesMessage = users[0] + " likes " + likesMessage.split(" ")[1]
            } else if (numberOfLikes == 2) {
                likesMessage = users[0] + " and " + users[1] + " " + likesMessage
            } else if (numberOfLikes == 3) {
                likesMessage = users[0] + ", " + users[1] + " and " + users[2] + " " + likesMessage
            } else {
                likesMessage = users[0] + ", " + users[1] + " and " + (numberOfLikes - 2) + " others " + likesMessage
            }

        } else {
            likesMessage = "Nobody likes " + likesMessage.split(" ")[1]
        }
        return likesMessage
    }
}