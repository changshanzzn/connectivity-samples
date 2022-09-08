package com.google.location.nearby.apps.hellouwb.ui.control

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.google.location.nearby.apps.hellouwb.ui.home.HomeScreen
import com.google.location.nearby.apps.hellouwb.ui.home.HomeViewModel

@Composable
fun ControlRoute(controlViewModel : ControlViewModel) {
  //ControlScreen()
  val uiState by controlViewModel.uiState.collectAsState()
  ControlScreen(uiState = uiState)

}
