package com.main.salt.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.main.salt.ui.theme.SaltTheme


@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String ,
    onClick: ()-> Unit = {},
){
    ConstraintLayout(
        modifier = modifier
    ){
        val (
        buttonText,
        ) = createRefs()
        TextButton(
            modifier = Modifier
                .constrainAs(buttonText){
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                },
             colors = ButtonDefaults.buttonColors(
                 backgroundColor = MaterialTheme.colors.primary,
             ),

            onClick = onClick,
        ){
            Text(
                text = text,
                color = Color.White,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ErrorButtonPreview() {
    SaltTheme() {
        PrimaryButton(
            text = "Login"
        )
    }
}