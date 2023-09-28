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
"""

def solution(park, routes):
    x, y, h, m = 0,  0, len(park[0]), len(park)
    for i in range(len(park)):
        park[i] = list(park[i])
    print(park)
        
    obstacles = []
    try:
        for each in park:
            obstacles.append(park.index('X'))      
    except ValueError:
        obstacles=[]
    
    print(obstacles)
    for each in routes:
        direction = each[0]
        unit = int(each[2])
        if direction=="E":
            if (unit+x)>h:
                continue
            else:
                x+=unit
        elif direction=="W":
            if (x-unit)<0:
                continue
            else:
                x-=unit
        elif direction=="S":
            if (y+unit)>m:
                continue
            else:
                y+=unit
        elif direction=="N":
            if (y-unit)<0:
                continue
            else:
                y-=unit
    return [x,y]