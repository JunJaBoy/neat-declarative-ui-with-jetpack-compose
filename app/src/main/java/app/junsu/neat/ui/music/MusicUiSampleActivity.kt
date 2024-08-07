package app.junsu.neat.ui.music

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.junsu.neat.ui.theme.NeatDeclarativeUIWithJetpackComposeTheme

class MusicUiSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeatDeclarativeUIWithJetpackComposeTheme {
                MusicUiSampleContent()
            }
        }
    }
}
