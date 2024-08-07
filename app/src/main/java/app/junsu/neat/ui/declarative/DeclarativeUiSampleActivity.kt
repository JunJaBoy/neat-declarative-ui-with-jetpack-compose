package app.junsu.neat.ui.declarative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class DeclarativeUiSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeclarativeUiSampleContent()
        }
    }
}