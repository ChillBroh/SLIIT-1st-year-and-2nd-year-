
#1.This is a comment

#2.To get the working directory
getwd()
setwd("C:\\Users\\ishar\\Videos\\SLIIT\\2.PS\\3.Labs\\Lab 1")
#3.Change the working directory
#setwd(--include directory here--)

#4.get print statement from 100 to 150
print(100:150)

#5.get help
?solve

#6.Documentation about data frame
help("data.frame")

#7.Scaler Operators
2+8
900-76
50*6
50/4
4^2
4**2
600%%2

#8.Logical operators

#Local variables declared with =
x = 5
y = -4
y=5
print(y)
#y=5 and y<-5 both are same

isTRUE(x==y)
isTRUE(x>y)
isTRUE(x<=y)
isTRUE(x != y)
isTRUE(!x<y)
isTRUE(!x)
isTRUE(x || 0)
isTRUE(x && 0)


#Global Variable
a<<-5 

#9.packages 
#Install packages

install.packages("ggplot2")

#10.Vector - use to store data
w<-c(1,2,3,4)
w

class(w)

e<-c("a","b","c")
e
e[1]
e[2]
class(e)

d<-c("Ishara","Madusanka")
class(d)
d[1] 
#11.Factor - use to categorize data
gender<-c(0,1,0,1,0,1,2)
gender
class(gender)

Gender<-factor(gender,c(0,1,2),c("Female","Male","Dinidu"))
Gender

class(Gender)

#12.List
p<-c(1,2,3)
q<-"Green"
r<-21
p
q
r

class(p)
class(q)
class(r)

Data <-list(p,q,r)
Data
class(Data)

#13.Matrix
matrix1<-matrix(c(1,2,3,4),nrow = 2,ncol = 2 ,byrow=TRUE )
#byrow will divide data in vector according to nrow and ncol
matrix1
class(matrix1)

matrix2<-matrix(c(1,2,3,4),nrow = 2,ncol = 2,byrow = FALSE)
#if byrow is false it will automatically divide data according to nrow and ncol
matrix2

#14.Data Frame
height<-c(67,89,43,90)
weight<-c(56,34,49,67)
#Data in height and weight must have same length
data_set<-data.frame(height,weight)
data_set
class(data_set)













