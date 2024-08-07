package app.junsu.neat.ui.music

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MusicUiSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicUiSampleContent()
        }
    }
}
