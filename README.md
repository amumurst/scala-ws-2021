# Scala Workshop Echo 2021
This is a workshop held for students in Bergen during Echo Karrieredager 2021.

The main goal is to give a taste of what scala as a language has to offer, while focusing on
some general technices often used in functional programming.


## Setup

The workshop is available in gitpod.io. This service allows users to get a complete dev environment in the cloud in the browser
 without dealing with installing anything on your own computer! (50h free).

1. You will need a public github user (www.github.com)
2. To get started visit: https://gitpod.io/#https://github.com/amumurst/scala-ws-2021
3. Press "continue with Github" and follow the process
4. You should now get a version of Visual Studio code running in your browser ready for use!
5. Press "Import build" when this popup enters the bottom right corner <img width="479" alt="Screenshot 2021-09-17 at 05 11 21" src="https://user-images.githubusercontent.com/4258408/133718206-c3ac21d7-2901-4e17-aec4-9d359c8ee102.png">
6. In the bottom left corner you can press the settings menu to change color scheme if you would rather have it dark
7. This popup should just be closed with the x in the corner when it shows <img width="468" alt="Screenshot 2021-09-17 at 05 12 17" src="https://user-images.githubusercontent.com/4258408/133718305-bca50ed2-f0d5-4c10-aba4-0a77e601bab6.png">


Should that not work you can run locally in Visual Studio Code as well. You will need the Metals extension and probably a valid installation of java (jdk).
(Intellij is also an option, contact for more info about how)

## Workshop
### Tasks
All task files follow the same format and are in the src/main/scala folder. 

In the top there is an object where you are supposed to fill in the unimplemented methods (Noted with ???) (Note: ??? could mean that multiple lines of code are to be written, not just one)

### Examples/Background
In all task files there is a object in the bottom which tries to explain syntax/theory/examples for how to solve the tasks. 

This will be read and explained live during the workshop.

### Testing
All tasks have tests that can be ran to validate output. 

Before they run the file will be compiled, so many errors will show up even before we get to running the actuall test. Compilation errors are typically shown with red lines. Hoover over these lines to get a hint about what is wrong. Do not hesitate to ask for help.

When file compiles we can run the tests. Do so by opening the corresponding TaskXSpec file and press "test" <img width="412" alt="Screenshot 2021-09-17 at 05 20 01" src="https://user-images.githubusercontent.com/4258408/133718890-8304147e-73b2-46b1-831f-ad152a106ffc.png">


If you are done super early, ask for other stuff (I have more), or try out some more tasks at https://www.scala-exercises.org/std_lib/asserts
