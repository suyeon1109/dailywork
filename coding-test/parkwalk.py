"""
A robot dog is trying to take a walk in a park shaped like a rectangular grid, 
with 'O' indicating the passing path and 'X' indicating obstacles. 
The walk is carried out according to the commands pre-entered into the robot dog, 
and the commands are given in the following format.

["Direction distance", "Direction distance" … ]
For example, “E 5” means the robot dog has moved 5 spaces east from its current 
location. Before carrying out a command, the robot dog checks two things:
If either of the two above applies, the robot dog ignores the command and 
performs the next command. If the horizontal length of the park is W and the 
vertical length is H, the coordinates of the upper left corner of the park are 
(0, 0) and the coordinates of the lower right corner are (H - 1, W - 1).

When park, a string array representing the park, and routes, a string array 
containing commands to be performed by the robot dog, are given as parameters, 
the location where the robot dog is placed after executing all commands is 
stored in an array in the order of [vertical coordinates, horizontal coordinates]. 
Please complete the solution function to return.


main point = dealing with the obstacles.
!! comparing the location of user and obstacle 
TRY AGAIN A FEW WEEKS LATER
"""

def solution(park, routes):
    h, m = len(park[0])-1, len(park)-1
    origin = [[i,j] for i in range(len(park)) for j in range(len(park[i])) if park[i][j]=="S"]
    x, y = origin[0][0], origin[0][1]
    print("x:",x,"y:",y)
    
    for i in range(len(park)):
        park[i] = list(park[i])
    print("park:", park)
        
    obstacles=[[i,j] for i in range(len(park)) for j in range(len(park[i])) if park[i][j]=="X"]
    print("obs:", obstacles)
    
    for each in routes:
        direction = each[0]
        unit = int(each[2])
        print(direction, unit)
        if direction=="E":
            if (unit+x)>h:
                continue
            for each in obstacles:
                if (each[1]<=unit+x) and (each[1]>=x) and each[0]==y:
                    continue
            else:
                x+=unit
        elif direction=="W":
            if (x-unit)<0:
                continue
            for each in obstacles:
                if (each[1]>=x-unit) and (each[1]<=x) and each[0]==y:
                    continue
            else:
                x-=unit
        elif direction=="S":
            if (y+unit)>m:
                continue
            for each in obstacles:
                if (each[0]<=unit+y) and (each[0]>=y) and each[1]==x:
                    continue
            else:
                y+=unit
        elif direction=="N":
            if (y-unit)<0:
                continue
            for each in obstacles:
                if (each[0]>=y-unit) and (each[0]<=y) and each[1]==x:
                    continue
            else:
                y-=unit
    return [y,x]


print("reult1", solution(["SOO","OOO","OOO"], ["E 2","S 2","W 1"]))         #[2,1]
print("reult2", solution(["SOO","OXX","OOO"], ["E 2","S 2","W 1"]))         #[0,1]
print("reult3", solution(["OSO","OOO","OXO","OOO"], ["E 2","S 3","W 1"]))   #[0,0]