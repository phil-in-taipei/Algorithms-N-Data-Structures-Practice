
class Permutations:

    def get_list_of_permutations(self, string):
        permutations = []
        if string == "":
            permutations.append(string)
            return permutations
        for i in range(len(string)):
            current_char = string[i]
            rest_of_string = string[0:i] + string[i + 1:]
            sub_permutations = self.get_list_of_permutations(rest_of_string)
            for j in range(len(sub_permutations)):
                permutations.append(current_char + sub_permutations[j])
        return permutations
