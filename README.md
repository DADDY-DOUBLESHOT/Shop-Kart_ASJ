# Android-Study-Jams

SHOP-KART

<b> Problem Statement: </b>

One of the thing that technology has made us is that it has made us forgetful. Let us take for example phone numbers previously we used to remember the phone numbers of important people but as technology advanced we had phonebooks in our mobile pre-installed. similarly  when we go out for shopping we tend to miss out on few things .So as we know E-commerce websites have a shopping cart ,similarly we need a light weight shopping app where we can add items which we want to buy

<b> Proposed Solution : </b>

As discussed earlier technology has made us forgetful, our app shop-kart uses technology to this problem. Our app is similar to the light weight phone number directory in our mobile. It allows users to put in the item name that user wants to buy and then quantity of items required. As soon as the user enters the item and quantity it displays a record  with item name, Item quantity ,time stamp with date added .In this way this light weight app can be used to cater the problem of shopping

<img width="559" alt="sampleimages" src="https://user-images.githubusercontent.com/18289261/142846646-a6858641-ad88-43aa-b8bb-b690fd7126f1.png">
    	  	
<b> Functionality & Concepts used : </b>

- Shop-kart is a light weight user friendly application with interactive graphical user interface. Following android concepts are used to achieve different functionality 
- Navigation Component: A single-activity architecture, using the Navigation Component to manage fragment operations. It is used to handle all navigations and also passing data between destinations from different items added in cart. The navigation graph in the App links the home fragment, item list fragment, create list fragment item detail, fragment item list. 
- View Model: Pattern Model-View-View Model (MVVM) which facilitates a separation of development of the graphical user interface. The App stores a list of all the shopping items, the view model is here used to display and store the shopping list. Every time, the user creates a new shopping item, the view model retains the current state of the list (i.e. - all the items). 
- Live Data: Live Data is used to handle data in a lifecycle-aware fashion, prevent memory leaks, ensure whether the UI matches the data state, share resources and maintain a proper configuration.  
- Room database: Room database is a persistence library which provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite. All the data about item name and Item quantity is accessed using the Room database. This means that, when the App is reopened after closing the data inside the App (i.e.- the shopping list items) are visible and accessible
- Timber: a logger with a small, extensible API which provides utility on top of Android's normal Log class. 
- Kotlin coroutines: It is used for managing background threads and reducing needs for call backs

<b> Application Link & Future Scope : </b>

You can find our app at: https://github.com/DADDY-DOUBLESHOT/Shop-Kart_ASJ.git

The app is currently in beta development stage, we are also planning to add cloud storage so that the same user can access it over other devices. Once the app will be completed, we are planning to launch it on play store where users can access the app and give reviews and feedback also, we will make improvements accordingly  