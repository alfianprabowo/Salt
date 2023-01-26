package com.main.salt.ui.main.view


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.main.salt.data.model.User
import com.main.salt.ui.component.UserProfile
import com.main.salt.ui.theme.SaltTheme
import com.main.salt.utils.HOME

@Composable
fun HomePage(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    user: User? = null,
    onUpClick: () -> Unit = {},
    ) {
    if (user == null) return

    val name = user.first_name ?: ""
    val email = user.email ?: ""
    val avatar = user.avatar ?: ""

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        HOME,
                    )
                },
                Modifier.statusBarsPadding(),
                navigationIcon = {
                    IconButton(onClick = { onUpClick() }) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
            )
        },
    ) {
            padding ->
        Column(
            modifier = Modifier
                .padding(padding),
        ){
            Spacer(modifier = Modifier.height(20.dp))

        UserProfile(
            name = name,
            email = email,
            avatar = avatar,
        )

        Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    SaltTheme {
//        HomePage(
//            user = User(
//                email = "alfian.prab@gmail.com",
//                first_name = "Alfian",
//                avatar = "https://reqres.in/img/faces/10-image.jpg"
//            )
//        )
    }
}