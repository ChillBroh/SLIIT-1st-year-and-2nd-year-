getwd()
setwd("C:\\Users\\ishar\\Videos\\SLIIT\\2.PS\\3.Labs\\Lab 3")
getwd()

#1
#import data
dataLab3 <- read.csv("Data 3.csv", header = TRUE)
dataLab3

#put into editor mode
fix(dataLab3)

#rename columns
names(dataLab3) <- c("Age","Gender","Accommodation")
fix(dataLab3)

#factor data
dataLab3$Gender <- factor(dataLab3$Gender,c(1,2),c("Male","Female"))
fix(dataLab3)

dataLab3$Accommodation <- factor(dataLab3$Accommodation,c(1,2,3),c("Stays at Home", 
"Boarded Students ", "Lodging"))
fix(dataLab3)

#Add modification to the imported data set
attach(dataLab3)
dataLab3

#2
#Frequency table
gender.freq <- table(Gender)
acc.freq <- table(Accommodation)
acc <- table(Accommodation)
age.frq <- table(Age)

acc
acc.freq
gender.freq

#piechart
pie(acc,main= "Pie chart for Accommodation")
pie(gender.freq, main="Pie chart for Gender")
pie(age.frq,main = "Pie Chart For Age")

#barplot
barplot(acc, main = "Bar Plot for Accommodation", ylab = "Frequency")
barplot(gender.freq, main = "Bar Plot for Gender", ylab = "Frequency")
barplot(age.frq, main = "Bar Plot for Age", ylab = "Frequency")
abline(h=10)
#abline(h=0) can start x axis from 0

#boxPlot
boxplot(age.frq, main = "BoxPlot for Age",xlab ="Age", outline = TRUE,horizontal = TRUE)
boxplot(acc,main="Boxplot for Accommodation",xlab="Accommodation",outline = TRUE,horizontal = TRUE)
boxplot(gender.freq, main = "Boxplot for Gender", xlab = "Gender", horizontal = TRUE, outline = TRUE)


#Q3
gender_Acc.freq <- table(Gender,Accommodation)
gender_Acc.freq

pie(gender_Acc.freq, main = "Pie chart for gender and accommodation")
#stack barcharts
barplot(gender_Acc.freq,main = "Bar plot for gender and accommodation", ylab = "frequency" , xlab= "types", legend = row.names(gender_Acc.freq))

#clustered barcharts
barplot(gender_Acc.freq,beside = TRUE, main = "Clustered Barchart for gender and accommodation",
        ylab="frequency", xlab = "types", legend=row.names(gender_Acc.freq))
