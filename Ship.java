//Ariez Othus
//Midterm
//citation: http://java.about.com/od/workingwithobjects/a/accessormutator.htm

public class Ship {

//Constructor method
public Ship(String year, String name, String toString){
year = this.year;
name = this.name;
toString = "This is a boat!";
}

//Private fields
private String year;
private String name;

//Accessor for name 
public String getName() { 
return name; 
} 

//Accessor for middleNames 
public String getYear() { 
return year; 
} 

public String setName(String name)
{
this.name = name;
return name;
}
 
//Mutator for username
public String setYear(String year)
{
this.year = year;
return year;
}
} 