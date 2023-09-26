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

def solution(cards1, cards2, goal):
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

print(solution(["i", "drink", "water"], ["want", "to"], ["i", "want", "to", "drink", "water"]))