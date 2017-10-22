# Calendar Project

[Systematic Program Design - Software Abstraction](https://courses.edx.org/courses/course-v1:UBCx+SoftConst1x+3T2017/course/) course exercise

## Exercise

For this module’s long format problem, you will be designing a data abstraction for a Calendar. This might be similar to the data structure for a Calendar app on your phone.

There are some key behaviours that we want our calendar to do. Of course, we want to add entries to the calendar. This includes events, which have a date, time, and a label; meetings, which have a date, time, and a label; and reminders, which also have a date, time and a label.

All of these entries should have an option to repeat at a given interval
You should be able to set a Reminder for an Event or a Meeting
Meetings should have methods to compile a list of attendees and email out meeting invitations
Reminders should have functionality to add additional notes

You will need to design several classes for this problem. As you probably noticed, there is some shared behaviour among entries. What’s the best way to represent these similarities, while still leaving room for unique behaviour among Reminder, Event and Meeting?

// TODO 1: Think about the best way to represent the similarities between different types of entries. When you’ve decided on a type hierarchy, draw a UML class diagram that illustrates this relationship. 

Note that since we are only partway through the module, you might learn something later on that would be useful in your type hierarchy. Don't worry -- you'll have a couple chances to revisit it.

// TODO 2:  Design a Date class that takes a month, day and year in the constructor. You should have getters for the date in a short format (DD-MM-YY or MM/DD/YYYY, for example) and in a longer String format (e.g. January 1, 2017). Optional: If you like, you can also get creative with algorithms to determine the day of the week, or add *st, *nd, *rd, *th (ordinal indicators) to the end of numbers.

// TODO 3: Design a Time class that takes hours and minutes in the constructor. You can either return this information with the time in 12 hours and an indicator for AM or PM, or return the time in 24 hours. You can also do both! These two classes are flexible, because we’re only using their basic functionality for Calendar.


