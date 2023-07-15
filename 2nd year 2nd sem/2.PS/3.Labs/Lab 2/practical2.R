getwd()
setwd("C:\\Users\\ishar\\Videos\\SLIIT\\2.PS\\3.Labs\\Lab 2")
getwd()

#1.control statements
#if-else condition
x<-4

if(x > 0){
  print("positive number")
}else{
  print("Negative number")
} 

#Nested if
x<- -2

if(x > 0){
  print("Positive Number")
}else if(x < 0){
  print("Negetive number")
}else{
  print("Zero")
}

#While Loop
i<- 1
while(i < 6){
  print(i)
  i = i + 1
}
#For Loop
1:10

for(i in 1:5){
  print(i)
}

#2.Import and Export data sets
#using any other 
dataset <- read.table("DATA 2.csv,header = TRUE, sep=","")
dataset
dataset1 <- read.csv("DATA 2.csv")
dataset1
getwd()
#show data as a table
fix("dataset1")



#Write data in to a file
index<-c(1,2,3)
name <- c("Kamal","Nimal","Sunil")
marks <- c(85,62,94)

dataset = data.frame(name,marks)
dataset

#Convert to csv or txt
write.csv(dataset,"dataframe1.csv")
write.table(dataset,"datatext.txt")
#read.table("datatext.txt,header = TRUE,sep=","")

#3.Functtions
function_01 <- function(a,b){
  y <- a + b
  print(y)
}

function_01(10,8)


#Questions
#01
fun_q1 <- function(a,b,c){
  x1 = (-b + sqrt(b^2 - (4*a*c)))/2*a
  x2 = (-b - sqrt(b^2 - (4*a*c)))/2*a
}

fun_q1(3,2,1)

#02
fun_q2<- function(k){
  vect <- c(1:k);
  for(i in vect){
    if(i%%3 == 0){
      print("Divisible")
    }
    else{
      print("Not divisible")
    }
  }
}


fun_q2(50)

#03
check<- c(1,5,6,7,2);
max <- check[1]
Index <- 1
#this one should be length(check). cannot use i in check
for(i in  1:length(check)){
  if(max< check[i]){
    max = check[i]
    Index = i;
  }
}
Index
 #Q7
check[which.max(check)]
 
#Q8
Moneyowned <- function(P,R,n){
  for(i in 1:n){
    A = P *((1+(R/100))^i)
    print(A)
  }
}

Moneyowned(5000,11.5,15)




