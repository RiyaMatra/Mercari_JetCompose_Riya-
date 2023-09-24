import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Final {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            // Create a Composable function that displays your login screen
            LoginScreen()
        }
    }

    //Used to test login screen by entering un, pw & clicking on login button
    @Test
    fun testLoginSuccess() {
        composeTestRule.onNodeWithTag("username_field")
            .performTextInput("your_username")

        composeTestRule.onNodeWithTag("password_field")
            .performTextInput("your_password")

        // Find and click the login button
        composeTestRule.onNodeWithTag("login_button")
            .performClick()
    }
}
