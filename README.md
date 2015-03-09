# vn-gui

2/12/15-
vnGUI - tried to add a JPanel that allowed for overlaps, could not confirm if it does allow or not
mob - created, no real code added to it
skills - create and instantiated all variables that could be thought of that are needed, added accessors (create a variable for animations at a later date)

2/23/15
added code to skills and mob including accessors, private member variables, and mutators.
skills needs to have the buff itterations moved to a future character/mob class
feels strange to hold the buff itterations inside of the skills class
added itterations of an attribute data type, removed old String usage of attributes
attributes are now included with factors against weaknesses and strengths and have a small circle in which they interact

2/26/15
Created Armor and Character class
armor class refers to the armor that the character is wearing and damageReduction will reduce the amount of damage that the character takes by 1 for every point of damageReduction that the armor has.
Added a defense buff, will increase the amount of damageReduction that the character has
Character class refers to characters in the game including: main characters, side characters
TO DO :
GUI still needs to be worked on to be made into working condition, code needs to be cleaned up so that everything is in it's proper area, mob class needs to be changed so that "epic"/"legendary" class mobs can be spawned with stronger damage and damageReduction than when encountered before.


3/9/15
Working on Slick2D tutorials.
Decided to implement Slick2D as the interface for the GUI.
Decide whether to use a JPG text format or the built in slick drawString format for next work date
