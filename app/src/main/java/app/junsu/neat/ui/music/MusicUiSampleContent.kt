package app.junsu.neat.ui.music

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.junsu.neat.R

val Background = Color(0xFF121212)
val OnBackground = Color(0xFFFFFFFF)

val Title = TextStyle(
    fontSize = 24.sp,
    fontWeight = FontWeight.Bold,
    color = OnBackground,
)
val SectionTitle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Bold,
    color = OnBackground,
)
val Body = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold,
    color = OnBackground,
)
val Caption = TextStyle(
    fontSize = 14.sp,
    fontWeight = FontWeight.Bold,
    color = OnBackground,
)

@Composable
fun MusicUiSampleContent(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        containerColor = Background,
        contentColor = OnBackground,
        topBar = { MusicTopAppBar() },
    ) { innerPaddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings)
                .verticalScroll(rememberScrollState()),
        ) {
            Section(
                title = {
                    Text(text = "Explore your genres")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Spacer(modifier = Modifier.width(16.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(240.dp)
                            .background(
                                color = Color.Blue,
                                shape = RoundedCornerShape(10.dp),
                            ),
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(240.dp)
                            .background(
                                color = Color.Blue,
                                shape = RoundedCornerShape(10.dp),
                            ),
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(240.dp)
                            .background(
                                color = Color.Blue,
                                shape = RoundedCornerShape(10.dp),
                            ),
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MusicTopAppBar(
    modifier: Modifier = Modifier,
) {
    val (searchQuery, onSearchQueryChange) = remember { mutableStateOf("") }

    Column(
        modifier = modifier,
    ) {
        TopAppBar(
            title = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.kumdori),
                        contentDescription = null,
                    )
                    Text(
                        text = "Search",
                        style = Title,
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = { /*TODO*/ },
                ) {
                    Icon(
                        imageVector = Icons.Default.MailOutline,
                        contentDescription = "mail",
                        tint = OnBackground,
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                titleContentColor = OnBackground,
                actionIconContentColor = OnBackground,
                navigationIconContentColor = OnBackground,
                containerColor = Background,
            ),
        )
        SearchBar(
            query = searchQuery,
            onQueryChange = onSearchQueryChange,
            onSearch = { /* TODO */ },
            active = false,
            onActiveChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            leadingIcon = {
                IconButton(
                    onClick = { /*TODO*/ },
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Background,
                    )
                }
            },
            placeholder = {
                Text(
                    text = "What do you want to listen to?",
                    style = Body.copy(
                        color = Background.copy(alpha = 0.8f),
                    ),
                )
            },
            shape = RoundedCornerShape(5.dp),
            colors = SearchBarDefaults.colors(
                containerColor = OnBackground,
                inputFieldColors = TextFieldDefaults.colors(
                    focusedTextColor = Background,
                ),
            ),
            content = { /* explicit blank */ },
        )
    }
}

@Composable
private fun Section(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Box(
            modifier = Modifier.padding(all = 16.dp),
        ) {
            CompositionLocalProvider(
                value = LocalContentColor provides OnBackground,
            ) {
                ProvideTextStyle(
                    value = SectionTitle,
                    content = title,
                )
            }
        }
        content()
    }
}
