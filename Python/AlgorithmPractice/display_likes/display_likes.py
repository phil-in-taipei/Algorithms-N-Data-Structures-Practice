
class DisplayLikes:
    def __init__(self, users):
        self.users = users

    def get_message(self):
        likes_message = "like this"
        if len(self.users) != 0:
            if len(self.users) == 1:
                likes_message = self.users[0] + " likes " + likes_message.split(" ")[1]
            elif len(self.users) == 2:
                likes_message = self.users[0] + " and " + self.users[1] + " " + likes_message
            elif len(self.users) == 3:
                likes_message = (
                        self.users[0] + ", "
                        + self.users[1] + " and "
                        + self.users[2] + " "
                        + likes_message
                )
            else:
                likes_message = f"{self.users[0]}, {self.users[1]} and {len(self.users) - 2} other users {likes_message}"
        else:
            likes_message = "Nobody likes " + likes_message.split(" ")[1]
        return likes_message
