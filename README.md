# BongoBD Android Code Test of Md. Mazbah Uddin Ahammed Chy 


## Question:1 ) Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.

**Answer:** Solution for the first question is given in the following link -

  **Solution Link:** [Anagram]( Anagram.java )      
  **Unit Test Link:** [Anagram Unit Test](AnagramUnitTest.java )
  
  

## Question:2 ) Explain the design pattern used in following:

        interface Vehicle {
            int set_num_of_wheels()
            int set_num_of_passengers()
            boolean has_gas()
         }
         
#### a) Explain how you can use the pattern to create car and plane class?
**Answer:**  By Factory design pattern, We can use the pattern to create car and plane class.
  
  **Solution Link:** [Factory design pattern](FactoryDesignPattern.java)
  
#### b) Use a different design pattern for this solution.
**Answer:** By using Builder design pattern, we can create Car & Plane class as an alternative solution. 

  **Solution Link:** 1) [Car Class](Car.java)         2) [Plane Class](Plane.java)
   
   
   
 
## Question-3 ) Write a video player application with ‘Play’, ‘Forward’, ‘Rewind’ functionalities. Please write pseudocode for this program and explain the design pattern you will use to develop these three functionalities.
 
**Answer:** Here, the android application for video ‘Play’, ‘Forward’, ‘Rewind’ functionalities. Java, MVVM Design pattern, XML etc is used to develop this application.
  
  **Application Link:** [Application(Problem-3)](https://github.com/Mazbah/Problem3/tree/master)
  
  **Package Link:** [Application(Problem-3)](https://github.com/Mazbah/Problem3/tree/master/app/src/main/java/com/example/demo/problem3)

  **Pseudocode:** Pseudocode for this program is given -
  
  **Play Pseudocode:**

    if VideoPlayer stage at end
       VideoPlayer seek to 0
    VideoPlayer-> PlayWhenRead

  **Forward Pseudocode:**

    NextForwardTime = VideoPlayer-> CurrentTime + ForwardTimeAmount
    if NextForwardTime above of VideoTotalTime
       VideoPlayer seek to VideoTotalTime
    else
       VideoPlayer seek to NextForwardTime

  **Rewind Pseudocode:**

    NextRewindTime = VideoPlayer-> CurrentTime - RewindTimeAmount
    if NextRewindTime below 0
       VideoPlayer seek to 0
    else
       VideoPlayer seek to NextRewindTime
