#Question 1
getwd()
setwd("C:\\Users\\ishar\\Videos\\SLIIT\\2.PS\\3.Labs\\Lab 4\\Lab 04-20230305")
getwd()

dataset <- read.table("DATA 4.txt",header = TRUE, sep="")
dataset
fix(dataset)

#Rename columns
names(dataset)<-c("Team","Attendance","Salary","Years")
dataset

#access variables or columns directlt without 
#calling whole dataset
attach(dataset)

#Question 2
#(a)
#boxplot
boxplot(Attendance,main = "Boxplot for Attendance",
        outline = TRUE, xlab = "Attendance", horizontal = TRUE)
boxplot(Salary, main = "Boxplot for Salary", 
        outline = TRUE, xlab = "Salary", horizontal = TRUE)
boxplot(Years, main = "Boxplot for Salary", 
        outline = TRUE, xlab = "Years", horizontal = TRUE)

#Histogram 
hist(Attendance,main = "Histogram for Attendance", ylab = "frequency")
abline(h=0)

hist(Salary,main = "Histogram for Salary", ylab = "frequency")
abline(h=0)

hist(Years,main = "Histogram for Years", ylab = "frequency")
abline(h=0)


#Stem leaf
stem(Attendance)
stem(Salary)
stem(Years)

#(b)
mean(Attendance)
mean(Salary)
mean(Years)

median(Attendance)
median(Salary)
median(Years)

sd(Attendance)
sd(Salary)
sd(Years)

#(c)
#summary
summary(Attendance)
summary(Salary)
summary(Years)

#Quantile values
quantile(Attendance)
#Q1
quantile(Attendance)[2]
quantile(Attendance)[4]

#(d)
IQR(Attendance)

#Question 3

get.modes<- function(y){
  counts<-table(y)
  names(counts)[counts == max(counts)]
}

get.modes(Years)
get.modes(Attendance)
get.modes(Salary)
fix(dataset)

#Question 4
table(Years)
table(Attendance)
table(Salary)

get.outliers<- function(x){
  Q1<-quantile(x)[2]
  Q3<-quantile(x)[4]
  range <- IQR(x)
  ub <- Q3+(1.5*range)
  lb <- Q1-(1.5*range)
  print(paste("Upper Bound",ub))
  print(paste("Lower Bound", lb))
  print(paste("outliers",paste(sort(x[x<lb | x>ub]),collapse = ",")))

}

get.outliers(Attendance)
get.outliers(Years)
get.outliers(Salary)

