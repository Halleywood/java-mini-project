# Play Rock-Paper-Scissors with this interactive Java program! 
### FEATURES 
* You have the option of customizing your name 
* You have the choice to play another friend or the computer if you’re feeling up to the challenge!
* A clear outcome is determined after each player chooses which hand to play 
* You can keep track of your wins as long as you decide to keep playing
* You have to option to reset the game entirely to play with a different opponent and reset your score 

### Development Process:
1. I wanted to create as many classes as possible to really practice my OOP skills. 
  *  I made the Player class, that had User and Computer subclasses. 
  *  I created a Play class where the actual game was played, that inherited from Game. 
  *  I used the parent classes to hold the member variables and getters/setters and then let the sublclasses hold the functionality for easier code readability. 
2. Abstract and Interfaces  
  * I had a difficult time understanding where to use the abstract class, ultimately I made the Game class abstract because the Play subclass could handle the instances, and the Game class could hold the different methods such as TwoPlayers or OnePlayer v OneComputer. You would not need to implement the Computer method it there were Two Players in the Play class at the time. So because I had the option to not implement all of the methods in the subclass but wanted the access to them if I needed it, I made Game abstract. 
  * I found Interfaces a bit confusing, but in the end I think I see why they are nice. They are like contracts the develpors have to uphold. They were great for both brainstorming and for writing code comments about the methods without getting in the way of the code in the actual implementation of the methods! 
  
![image](https://user-images.githubusercontent.com/87944545/232182345-41b01e0a-cb5a-4139-b146-d2c765a25f75.png)
 * this is a model of all of my classes and their attributes 
 
 ![image](https://user-images.githubusercontent.com/87944545/232182307-5fca4311-0954-4e12-abb9-4aeeda5316df.png)
 * This model demonstrates using the superclass to hold getters/setters and the subclass to hold logic/functionality. 
 
### Challenges and Overcoming Them 
* I created a "Piece" class, that held the choice type of Rock, Paper, or Scissors. Once a User or Computer object selected a choice it instantiated the Piece inside the Player class. So I had access to the Piece through the players. It was difficult to try and incorporate a Class within a Class and unneccessarily used Optionals, but it made good practice and eventually I was able to access the type of the piece through the players! 
* I used a hashmap in each Piece that held a score. Each piece had a different set of scores because if it is Paper, Scissors hold a higher point value and Rocks hold none. But if it is a Scissor, then Paper would hold no point value and Rocks would have the highest. So based on the players choice I could compare points. I wanted to do this instead of a dozen if/else checks. I think it makes for cleaner code and it works pretty nice! 

### Curious about how it works? 
 * Fork this repository, download the files in your favorite Java IDE and run the Main class where the main method is! Have Fun! 🪨📃✂️
