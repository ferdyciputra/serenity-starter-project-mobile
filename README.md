# Mobile App Automation Starter Project 📱
Welcome to the Mobile App Automation Starter Project! 🚀 This project is designed to help you kickstart your journey into automating mobile applications using Appium and Serenity BDD.

## Prerequisites

Before you begin, ensure you have the following prerequisites:

- **Java Development Kit (JDK):** Make sure you have Java installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Android SDK:** Install Android Studio or download Android SDK separately. You can download Android Studio from [here](https://developer.android.com/studio).
- **Appium:** Install Appium, which is an open-source tool for automating mobile applications. You can install it using npm:
  ```bash
  npm install -g appium
- **UiAutomator2 driver:** You can install UiAutomator2 driver from [here](https://appium.io/docs/en/2.0/quickstart/uiauto2-driver/).

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/ferdyciputra/serenity-starter-project-mobile.git

2. Install Dependencies:
   ```bash
   cd serenity-starter-project-mobile
   mvn clean install

## Configuration
Make sure to configure the following properties in `serenity.properties`:

- `appium.platformName`: The platform of the mobile device (e.g., `android` or `iOS`).
- `appium.deviceName`: The name of the mobile device or emulator.
- `appium.app`: The path to the mobile application file (APK or IPA).
- `appium.appPackage`: The package name of the mobile application.
- `appium.appActivity`: The main activity of the mobile application.

## Running Tests
1. To run the tests, execute the following command:
   ```bash
   mvn clean verify

### See All Report Tests
You can see a report test in the `target/site/serenity` directory with name file `index.html`

## Added New Scenario BDD

In order to add some Scenario BDD, we can create new file feature in directory `src/test/resources/features`

## Writing the step definitions (Breaking Down Scenario BDD Into Steps)

In order to translate the steps from Scenario BDD into executable actions, we write Java classes called Step Definitions in directory `src/test/java/steps`

## Writing the Page Object Class

Page Objects are a way of isolating the implementation details of a web page inside a class, exposing only business-focused methods related to that page.
We can create new Page Object file in directory `src/test/java/pages`

## Contributing
Contributions are welcome! Whether you're fixing bugs, improving documentation, or adding new features, your input is valuable. Follow these steps to contribute:

1. Fork the repository.

2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name

3. Commit your changes:
   ```bash
   git commit -m "Add your feature or fix"

4. Push to the branch:
   ```bash
   git push origin feature/your-feature-name

5. Open a pull request.