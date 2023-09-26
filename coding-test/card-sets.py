"""
Connie received two stacks of cards with English words on them as a gift.
Connie uses the words written on the cards according to the following rules:
I would like to know if it is possible to create an array of words in the desired order.

Play one card from the deck of your choice in order.
Once a card has been used, it cannot be used again.
You cannot move on to the next card without using it.
The order of words in an existing deck of cards cannot be changed.
For example, in the first deck of cards, in that order: ["i", "drink", "water"],
When the second deck of cards has ["want", "to"] written in that order.
If you are trying to create an array of words in the order ["i", "want", "to", "drink", "water"]
Use "i" on the first deck of cards, then "want" and "to" on the second deck of cards, and
You can create an arrangement of words in any order you want by using "drink" and "water" in the first deck of cards.

When arrays of strings cards1 and cards2 and the desired word array goal are given as parameters,
If you create a goal with the words written in cards1 and cards2, select “Yes”.
If you cannot create it, please complete the solution function that returns "No".
"""

def solution1(cards1, cards2, goal):
    for each in goal:
        if len(cards1)!=0:
            if each==cards1[0]:
                cards1.pop(0)
            else:
                if len(cards2)!=0:
                    if each==cards2[0]:
                        cards2.pop(0)
                else:
                    return "No"
        elif len(cards2)!=0:
            if each==cards2[0]:
                cards2.pop(0) 
            else:
                return "No"
    return "Yes"

print(solution1(["i", "drink", "water"], ["want", "to"], ["i", "want", "to", "drink", "water"]))


"""
Given two strings s and skip, and a natural number index, we want to create a string according 
to the following rules. The rules for passwords are as follows:

Changes each alphabet in string s to the alphabet following the index.
If the alphabet after the index exceeds z, it returns to a.
Skips everything except the alphabet in skip.
For example, when s = "aukks", skip = "wbqd", index = 5, the alphabet 5 places behind a is f, 
but in [b, c, d, e, f], 'b' and 'd' is included in skip, so it is not counted. Therefore, 
except for 'b' and 'd', the alphabet that is 5 places behind 'a' becomes 'h' in the order [c, e, f, g, h]. 
If you change the remaining "ukks" according to the rule above, it becomes "appy" and the result is "happy".

When two strings s and skip, and a natural number index are given as parameters, 
complete the solution function so that it returns the result of converting s according to the above rules.
"""

def solution2(s, skip, index):
    # run time error
    alphabet_list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    for i in range(len(skip)):
        alphabet_list.remove(skip[i])
    answer = ''

    for i in range(len(s)):
        idx = alphabet_list.index(s[i])+index
        if idx > len(alphabet_list)-1:
            idx = idx-len(alphabet_list)
        answer+=alphabet_list[idx]
    return answer

print(solution2("aukks", "wbqd", 5))