# exact name of the column containing the weights
file1 <- read.csv("/Users/mac/Documents/GitHub/dailywork/R/files/femaleMiceWeight.csv")
# str(file1)

# # entry in the 12th row and second column
# file1[12,2]

# # how many mice
# # length function returns the number of elements in a vector
# length(file1$Diet)

# file1$Bodyweight[11]

# retval <- subset(file1, Diet == "hf")
# print(retval)

# mean(file1(13:24))

?sample
set.seed(1)
i <- sample(13:24, 1)
file1$Bodyweight[i]
