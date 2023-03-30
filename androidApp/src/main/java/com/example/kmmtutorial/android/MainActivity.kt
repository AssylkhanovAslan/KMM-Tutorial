package com.example.kmmtutorial.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmmtutorial.data.repositories.PostsRepository
import com.example.kmmtutorial.android.theme.AppTheme
import com.example.kmmtutorial.domain.models.Post
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppTheme.colors.ui02
                ) {
                    val scope = rememberCoroutineScope()
                    val posts = remember { mutableStateListOf<Post>() }

                    LaunchedEffect(true) {
                        scope.launch {
                            try {
                                val postsList = PostsRepository().getPosts()
                                posts.clear()
                                posts.addAll(postsList)
                            } catch (e: Exception) {
                                e.localizedMessage ?: "error"
                            }
                        }
                    }

                    LazyColumn(
                        contentPadding = PaddingValues(
                            vertical = 32.dp,
                            horizontal = 16.dp
                        ),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        itemsIndexed(items = posts, key = { _, item -> item.id }) { _, post ->
                            PostView(post = post, onPostClick = {

                            })
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PostView(
    post: Post,
    onPostClick: (Long) -> Unit
) {
    PostView(postId = post.id, title = post.title, body = post.body, onPostClick = onPostClick)
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PostView(
    postId: Long,
    title: String,
    body: String,
    onPostClick: (Long) -> Unit,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = AppTheme.colors.ui01,
        shape = RoundedCornerShape(8.dp),
        onClick = { onPostClick(postId) }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                style = AppTheme.typography.h2,
                color = AppTheme.colors.text01
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(
                text = body,
                style = AppTheme.typography.body1,
                color = AppTheme.colors.text02
            )
        }
    }
}
