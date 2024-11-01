package com.example.android_mini_compose_projects.driftLogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_mini_compose_projects.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login(){
     Column (
         Modifier
             .fillMaxSize()
             .padding(20.dp),
         verticalArrangement = Arrangement.Top,
         horizontalAlignment = Alignment.CenterHorizontally

     ){

        Image(
            painter = painterResource(id = R.drawable.whatsapp_image_2024_09_18_at_1_25_47_pm),
            contentDescription = null,
            Modifier.size(120.dp)
        )

         Spacer(
             modifier = Modifier
             .height(6.dp)
         )

        Text(
            text = "Netflix"
        )

         Spacer(
             Modifier
                 .height(6.dp)
         )

        Text(
            text = "Log in"
            )

         Spacer(Modifier
             .height(6.dp)
         )

         Text(
             "Email"
         )

         Spacer(
             Modifier
                 .height(6.dp)
         )

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
         var password by remember{
             mutableStateOf(TextFieldValue(""))
         }

        TextField(
            value = email,
            onValueChange = {
               email = it
            },
            )

         Spacer(Modifier
             .height(6.dp)
         )

         Text(
             "Password"
         )

         TextField(
             value = password,
             onValueChange = {
                 password = it
             },
             trailingIcon = {
                 Icon(
                     imageVector = Icons.Default.Password,
                     contentDescription = null
                 )
             }

         )


    }
}
