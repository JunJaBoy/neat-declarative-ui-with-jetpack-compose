package app.junsu.neat.ui.declarative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.junsu.neat.ui.theme.NeatDeclarativeUIWithJetpackComposeTheme

class DeclarativeUiSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeatDeclarativeUIWithJetpackComposeTheme {
            DeclarativeUiSampleContent()
                }
        }
    }
}