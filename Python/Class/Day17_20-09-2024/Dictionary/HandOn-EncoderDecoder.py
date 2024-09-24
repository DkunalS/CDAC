# import string
#
# # rot13_dict = {}
# # alphabet = string.ascii_uppercase
# #
# # for char in alphabet:
# #     index = (alphabet.index(char) + 13) % 26
# #     rot13_dict[char] = alphabet[index]
# #
# # print(rot13_dict)
keys = {
    'a': 'n', 'b': 'o', 'c': 'p', 'd': 'q', 'e': 'r',
    'f': 's', 'g': 't', 'h': 'u', 'i': 'v', 'j': 'w',
    'k': 'x', 'l': 'y', 'm': 'z', 'n': 'a', 'o': 'b',
    'p': 'c', 'q': 'd', 'r': 'e', 's': 'f', 't': 'g',
    'u': 'h', 'v': 'i', 'w': 'j', 'x': 'k', 'y': 'l',
    'z': 'm', 'A': 'N', 'B': 'O', 'C': 'P', 'D': 'Q',
    'E': 'R', 'F': 'S', 'G': 'T', 'H': 'U', 'I': 'V',
    'J': 'W', 'K': 'X', 'L': 'Y', 'M': 'Z', 'N': 'A',
    'O': 'B', 'P': 'C', 'Q': 'D', 'R': 'E', 'S': 'F',
    'T': 'G', 'U': 'H', 'V': 'I', 'W': 'J', 'X': 'K',
    'Y': 'L', 'Z': 'M'
}

text = 'pnrfne pvcure? V zhpu cersre Pnrfne fnynq!'
message = ""
# for word in text:
#     # print(word)
#     for key, value in keys.items():
#         if value == word:
#             print(key)
#             message = message + key

for word in text:
        if word in keys:
            print(keys[word],end="")
        else:
            print(word,end="")

print(message)

