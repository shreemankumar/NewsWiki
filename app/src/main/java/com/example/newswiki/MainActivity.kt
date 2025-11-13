package com.example.newswiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.example.newswiki.ui.news_screen.NewsScreen
import com.example.newswiki.ui.news_screen.NewsScreenViewModel
import com.example.newswiki.ui.theme.NEWSWikiTheme
import com.example.newswiki.util.NavGraphSetup
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NEWSWikiTheme {
                val navController = rememberNavController()
                NavGraphSetup(navController = navController)
//                val viewModel: NewsScreenViewModel = hiltViewModel()
//                NewsScreen(
//                    state = viewModel.state,
//                    onEvent = viewModel::onEvent
//                )
            }
        }
    }
}

