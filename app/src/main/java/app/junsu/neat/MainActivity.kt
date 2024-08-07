package app.junsu.neat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import app.junsu.neat.ui.theme.NeatDeclarativeUIWithJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeatDeclarativeUIWithJetpackComposeTheme {
                NeatApp()
            }
        }
    }
}
