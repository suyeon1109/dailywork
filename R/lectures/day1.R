install.packages("rafalib")
library(rafalib)

install.packages("swirl")
library(swirl)

# R.Version()

x <- c(2.23, 3.45, 1.87, 2.11, 7.33, 18.34, 19.23)
sum <- 0
for (var in x) {
  sum <- sum + var
}
sum/length(x)


sum <- 0
for (i in 1:25) {
  sum <- sum + (i * i)
}
sum

class(cars)
sum <- 0
dist <- cars[, 2]
for (var in dist) {
  sum <- sum + var
}
sum / length(dist)

which(dist == 85)

# install.packages("downloader")
# library(downloader)
# url <- "https://raw.githubusercontent.com/genomicsclass/dagdata/master/inst/extdata/femaleMiceWeights.csv"
# filename <- "femaleMiceWeights.csv"
# download(url, destfile = filename)
