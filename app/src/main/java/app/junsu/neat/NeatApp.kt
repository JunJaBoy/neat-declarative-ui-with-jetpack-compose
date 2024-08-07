package app.junsu.neat

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import app.junsu.neat.ui.declarative.DeclarativeUiSampleActivity
import app.junsu.neat.ui.music.MusicUiSampleActivity

@Composable
fun NeatApp(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    Scaffold(
        modifier = modifier,
    ) { innerPaddings ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(
                    space = 8.dp,
                    alignment = Alignment.CenterVertically,
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        context.startActivity(
                            Intent(
                                context,
                                DeclarativeUiSampleActivity::class.java,
                            ),
                        )
                    },
                ) {
                    Text(text = stringResource(R.string.app_button_declarativeUiSample))
                }
                Button(
                    onClick = {
                        context.startActivity(
                            Intent(
                                context,
                                MusicUiSampleActivity::class.java,
                            ),
                        )
                    },
                ) {
                    Text(text = stringResource(R.string.app_button_musicUiSample))
                }
            }
        }
    }
}
