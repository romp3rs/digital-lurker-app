package io.digitallurker.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.digitallurker.ui.components.home.CategoryHeadline
import io.digitallurker.ui.components.home.SearchBar
import io.digitallurker.ui.theme.ColorPalette
import io.digitallurker.ui.theme.Measurements

@Composable
fun HomeScreen(navCtrl: NavController) {
    Surface(
        color = ColorPalette.background,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = Measurements.screenPadding)
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            SearchBar {}
            CategoryHeadline("Near you") {}
            CategoryHeadline("Near you") {}
        }
    }
}