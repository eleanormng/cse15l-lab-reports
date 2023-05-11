# Lab Report 2 - Servers and Bugs
## Part 1: Creating String Server!
- Hello! For this lab report, I started by writing code for StringServer.
- I referenced the code for NumberServer.java as well as the StringServer.java code from our first Skill Demo.
- I used those files as a base, and referenced JDK documentation to figure out how to read query arguments.
- It was very helpful!

- Here's my code!
![StringServer](stringserver.)png

- After getting the server up and running, I added a few lines to the running string message by using `/add-message`

*Example 1:*
![Query](query.png)
![Message](updatedserver.png)
- This calls the HandleRequest method in my code
- The URL of "https://localhost:4000/add-message?s=I'm adding a new line to my String Server by doing this" is passed in as an argument.
- Then, it reads the substrings that follow the path after `/add-message` and after the query is started by `s=` and adds these substrings to `String` message

*Example 2:*
![Goodbye Message](goodbyemessage.png)
- The same thing happens when I enter "Goodbye" too!
- The URL is taken in by the HandleRequest method, then whatever follows `s=` is put into `String` message and returned on the Server. Very cool.

## Part 2: What I Learned!
- Something that I learned in week 2 & 3 was reading URL paths and inputting query arguments
- I thought messing around with the servers was pretty cool, even if it was a simple concept
- Professor Politz came into lab one of those days and explained to me how NumberServer.java worked
- I felt kind of bad asking him such a simple question... but he was so helpful!! Thank you Joe :D
