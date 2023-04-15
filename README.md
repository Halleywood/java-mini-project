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
  
