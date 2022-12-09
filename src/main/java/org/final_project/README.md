Team 7 - Card Pack Opener
Project Owner - Junior Weil
Scrum Master - Brandon Cho
Developer - Joseph Helm
Developer - Brian Scotto
    This project allows the user to create their own player card for either soccer basketball or football. They can 
design their own card and give the card their own name, position, and overall rating.  The program also allows the 
user to save their custom-made card to the arraylist of actual player cards of real life professional athletes.  
From there the user can open a pack that randomly generates a card from the list of the selected sport and reveals it 
to the user.  This program also includes a settings page which allows the user to toggle the music and adjust the
volume. 
    The project includes background images of different athletes.  When selecting a pack above the button to select 
the sport of the pack includes gifs of top players celebrating for each sport.  The program saves the user the time 
and money of having to go to the store and actually purchase a card pack, instead they can generate them online and 
create their own custom cards.
    Our package folder contains our classes for our cards and JavaFX.  The card class is the parent class which 
contains the enumeration for the sport of the card.  From this parent class are the child classes.  The custom card 
inherits from the card class which takes in the name of the user, the user's position, and the user's overall rating.
The soccer card, football card, and basketball card all inherit from this class as well. They all contain arraylists 
of all the imported cards and methods that read in the data files.  Then we have the pack class which interacts with 
the soccer, football, and basketball card classes. In this class is also lists of the URL's for the images of the 
players.  This class generates a random player from the list with the image that is then given to the FX to display 
for the pack openings.  Each sport has their own pack and custom cards can be displayed too.
Third Party Library: JavaFX


VIDEO LINK:
https://mediaspace.bucknell.edu/media/csci205+final+project/1_1zunyswi
