# upwork-scheduler

I heard about [Upwork](http://upwork.com) this morning so I thought I'd check it out.  

This coding task was at the very top of the page this morning under "Java Jobs" so I played around with it over morning coffee.
I don't have an Upwork account and I made no effort to get paid -- this was just for fun and practice.

## Java task scheduler ##

Job listing link:  https://www.upwork.com/job/Java-task-scheduler_~01496693f2fae0cb0c/

**Job description**
```
Design a scheduler that receives a task and places it in the correct priority 
among all the existing scheduled tasks. 

A task’s position in the list is determined first by the urgency parameter 
(an integer from 0 - 5 where 0 is the most urgent). 

When two tasks have the same urgency, we look at it’s category. 
Categories are: RED (highest priority), BLUE and GREEN. 

When we have two tasks have the same urgency and category, we then look at 
time submitted, putting the one with the earlier timestamp first. 

E.g., Given the following tasks:

Task 1
Urgency 0
Category RED
Time 12:00

Task 2
Urgency 0
Category RED
Time 12:01

They would be sorted Task 1, Task 2

Given the additional tasks:

Task 3
Urgency 3
Category RED
Time 12:05

Task 4
Urgency 1
Category GREEN
Time 12:06

The order would be: Task1, Task2, Task 4, Task 3.





The Task class and a main method that runs Tasks through your code will be provided.
```

**Results of sample run**
```
task: Task [taskId=3, urgency=0, category=RED, time=Mon Dec 29 12:52:31 MST 1969]
task: Task [taskId=11, urgency=0, category=RED, time=Sat Jan 24 13:50:24 MST 1970]
task: Task [taskId=12, urgency=1, category=RED, time=Wed Dec 24 20:03:16 MST 1969]
task: Task [taskId=4, urgency=1, category=RED, time=Sun Dec 28 19:47:38 MST 1969]
task: Task [taskId=1, urgency=1, category=BLUE, time=Sun Dec 28 07:41:01 MST 1969]
task: Task [taskId=9, urgency=1, category=BLUE, time=Thu Jan 08 22:52:10 MST 1970]
task: Task [taskId=6, urgency=1, category=GREEN, time=Mon Jan 19 20:24:32 MST 1970]
task: Task [taskId=14, urgency=1, category=GREEN, time=Thu Jan 22 10:37:54 MST 1970]
task: Task [taskId=16, urgency=2, category=RED, time=Thu Jan 08 06:32:30 MST 1970]
task: Task [taskId=15, urgency=2, category=BLUE, time=Mon Jan 05 22:54:14 MST 1970]
task: Task [taskId=19, urgency=3, category=RED, time=Sat Dec 20 02:18:58 MST 1969]
task: Task [taskId=7, urgency=3, category=RED, time=Fri Jan 09 08:33:42 MST 1970]
task: Task [taskId=5, urgency=3, category=BLUE, time=Fri Dec 12 17:58:12 MST 1969]
task: Task [taskId=13, urgency=3, category=BLUE, time=Sat Dec 27 19:36:24 MST 1969]
task: Task [taskId=6, urgency=3, category=BLUE, time=Fri Jan 16 18:57:12 MST 1970]
task: Task [taskId=20, urgency=3, category=GREEN, time=Wed Dec 17 14:08:19 MST 1969]
task: Task [taskId=17, urgency=3, category=GREEN, time=Fri Dec 26 08:30:03 MST 1969]
task: Task [taskId=8, urgency=3, category=GREEN, time=Sat Jan 10 04:14:28 MST 1970]
task: Task [taskId=18, urgency=4, category=BLUE, time=Fri Dec 26 01:26:29 MST 1969]
task: Task [taskId=2, urgency=5, category=GREEN, time=Sat Jan 03 10:38:09 MST 1970]
task: Task [taskId=10, urgency=5, category=GREEN, time=Sun Jan 11 19:16:45 MST 1970]
```



Sample tasks were created with ascending taskId order (1-20) in Tester.java
