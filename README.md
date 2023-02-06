# Social Login using Spring OAuth2 with Google 

**Learn how to create a social login with SPRING OAUTH + GOOGLE.**

## Prerequisites

- Google Oauth2, 
  - We will need to set up Google OAuth2 and obtain OAuth credentials (ID + Secret) as described in the following link.   https://developers.google.com/identity/openid-connect/openid-connect#appsetup
  - Be aware that when creating Google Credentials you will need to set this value _http://localhost:8080/login/oauth2/code/google_ in the _Authorized redirect URIs_ section.
  
     ![GoogleOAuth01.png](img%2FGoogleOAuth01.png)
  - You also need to set _http://localhost:8080_ value in the _Authorized JavaScript origins_ section.
     ![GoogleOAuth02.png](img%2FGoogleOAuth02.png)

- Java 17.

## Run Locally

**Set environment variables**

The following environment variables must be created, and their values must be taken from the Google OAuth credentials. **Do not share these credential values with anyone.** 

* `GOOGLE_CLIENT_ID = {Client ID}`
* `GOOGLE_CLIENT_SECRET = {Client secret}`


![GoogleOAuth03.png](img%2FGoogleOAuth03.png)

**Execute following commands to build and run the project.**

```bash
# Build project & install dependencies
./gradlew build

# Run project 
./gradlew bootRun
```


## Testing

Open a web browser and access the URL http://localhost:8080/personalInfo. Once this is completed you will be requested to log in with a Google account.

**Step 1**

  ![Test01.png](img%2FTest01.png)

**Step 2**

   ![Test02.png](img%2FTest02.png)

**Step 3**

   ![Test03.png](img%2FTest03.png)

Finally, by completing the login, information related to the logged user will be displayed. This information is provided by Google and can be used for multiple purposes in your application. 

   ![Test04.png](img%2FTest04.png)
