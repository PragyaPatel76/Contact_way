#download a dataset which is bbc_text_cls.csv (BBC Article Data set) from kaggle

#get the path of the RStudio
getwd()   # "C:/Users/Pragya patel/Downloads"

#used whenever change the path of Rstudio first check the dataset path with RStudio path if it different then use it
setwd("C:/Users/Pragya patel/Downloads")

#used unzip() to unzip and extract our dataset where give the path in exdir where we want to extract our dataset
unzip("C:\\Users\\Pragya patel\\Downloads\\archive (1).zip",exdir="C:\\Users\\Pragya patel\\Downloads\\archive (1)") 

#store the all files into them from dataset and print all the file name with there respective path using full.names()
files<-list.files("C:\\Users\\Pragya patel\\Downloads\\archive (1)",full.names = TRUE)
print(files)

#load the data into dataset_var using read.csv()
dataset_var<-read.csv("C:\\Users\\Pragya patel\\Downloads\\archive (1)/bbc_text_cls.csv")

#unzip the dataset using unzip() function
unzip("C:\\Users\\Pragya patel\\Downloads\\archive.zip")

#load the data give the path of the dataset
data<-read.csv("C:\\Users\\Pragya patel\\Downloads\\archive\\MBA.csv")

#show the data in different page
View(data)

#analyze the starting 6 head/tail rows of dataset
head(data)
tail(data)

#give the dimensions of the dataset
dim(data)

#give the total number of rows/columns in dataset
nrow(data)
ncol(data)

#give the summary of dataset like min,max,Q1,Q3,median,length,class,mode and mean for each column also give the concise summary 
summary(data)

#give the structure of the dataset which help to understand the format of dataset
str(data)

#glimpse() provide a overview of dataset  and dplyr packege provide the authority to use glimpse()
library(dplyr)
glimpse(data)

#show the column names of dataset
names(data)

#access by index only column/row name
data[,4]          
data[4,]

#access the particular elements of dataset
data[1,4]         

#access the random columns using column/row index
data[,c(2,7,5)]   
data[c(2,7,5),]

#access the random columns using column name as well as select()
data[c("gender","gpa","gmat")]
select(data,gender,gpa)

#access the rows/columns from 3 to 7 it's slice 
data[3:7,]        
data[,3:7]

#access particular column using name with $ sign
data$gender       

#slice the particular row or random rows from datatset
slice(data,4)
slice(data,c(4,8,6))

#access the row based on condition
filter(data,gpa>3.20)

#access the subset of data with condition as well as subset()
data[data$gpa>3.40,c(2,8,6)]
subset(data,gpa>3.40,c("gender","race"))

#removing columns/rows
data[,-c(2,8)]
data[-c(1,2,3),]

#adding new columns
data$new_col<-2*data$application_id

#functions applied on columns of dataset
#round() give the round value of given dataset
round(data$gpa)

#give the maximum value of given dataset
max(data$gpa)

#give the minimum value of given dataset
min(data$gpa)

#give the sum value of given dataset
sum(data$gpa)

#give the square value of given dataset
sqrt(data$gpa)

#give the exponential value of given dataset
exp(data$gpa)

#show the distribution of data into dataset using histogram plot
hist(data$gmat,main = "Histogram of gmat")

boxplot(data$gpa,main="Boxplot of work experience")

boxplot_data<-boxplot(gpa~gmat,
                      data = data,
                      main = "boxplot of mtcars",
                      xlab = "milles per gallon",
                      ylab = "number of cylinders",
                      col="lightgreen",
                      border="blue",
                      pch=35,outlines=FALSE)
boxplot_data


#show the q1 quartile values from MBA dataset
q1_gpa <- quantile(data$gpa, 0.25)
print(q1_gpa)

#show the q3 quartile values from MBA dataset
q3_gpa <- quantile(data$gpa, 0.75)
print(q3_gpa)

#show the interquartile range which are q3-q1
iqr_gpa <- q3_gpa - q1_gpa
print(iqr_gpa)

#show the min value of wiskers
lower_bound_gpa <- q1_gpa - 1.5 * iqr_gpa
print(lower_bound_gpa)

#show the max value of wiskers
upper_bound_gpa <- q3_gpa + 1.5 * iqr_gpa
print(upper_bound_gpa)

#show the outliers value which are less then from lower_bound and greater then upper_bound
outliers_gpa <- data$gpa[data$gpa < lower_bound_gpa | data$gpa > upper_bound_gpa]
print("Outliers in gpa :")
print(outliers_gpa)


