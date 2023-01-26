package com.main.salt.ui.main.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.main.salt.data.model.User
import com.main.salt.ui.component.UserProfile

@Composable
fun HomePage(
    modifier: Modifier = Modifier,
    user: User? = null,
) {
    if (user == null) return

    val name = user.first_name
    val email = user.email
    val avatar = user.avatar

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Home",
            style = TextStyle(
                fontSize = 40.sp,
            ),
        )

        Spacer(modifier = Modifier.height(20.dp))

        UserProfile(
        )
    }

}