Card Information Finder

Summary
A simple Android app called Card Info Finder, which is written in Kotlin, lets users enter a card number manually or by utilizing OCR to scan a debit card. The application displays information about the card, including its type, bank, and country, after retrieving details about it from the Binlist API.

Features
Use the soft input keyboard to manually enter the card number.
Information about the bank, country, card type, and brand is displayed.


Architecture
The application follows the Model-View-ViewModel (MVVM) architecture pattern to separate concerns and improve maintainability. The codebase is organized into layers such as data, domain, and presentation to ensure a clean and scalable architecture. ViewModel acts as a bridge between the UI (View) and the underlying data sources, handling user interactions and updating the UI accordinglyError Handling
Errors are gracefully handled by the program, particularly when working with external APIs. It has systems in place to deal with network issues and API failures, guaranteeing a seamless user experience even in challenging circumstances.

Integration of External APIs
The application retrieves card information via the Binlist API. It has error-handling tools to deal with API malfunctions or outages, guaranteeing users' continuous service.

UI/UX stands for user interface and user experience.
Users may input card details and see card information with ease because to the user-friendly and intuitive design of the user interface. To improve usability, careful consideration is given to design components including typeface, colors, and layout.

Conclusion
The Card Info Finder application leverages the MVVM architecture pattern to create a robust and maintainable codebase. With its intuitive user interface, seamless integration with external APIs, and comprehensive error handling mechanisms, the application provides users with a reliable and efficient tool for retrieving card information on the Android platform.
