package com.example.loyaltyrewardapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {

            }
        }
    }
}

@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Tilte()
            InputField()
        }
    }

}

@Composable
fun Tilte() {

    Column(
        modifier = Modifier
            .width(226.dp)
            .height(66.dp)
            .offset(x = 28.dp, y = 85.dp)
    ) {

        Text(
            text = "Đăng nhập",
            style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp),
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = "Hệ thống tích điểm tiện ích",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp,
                color = Color.Black.copy(alpha = 0.5f)
            )
        )
    }

}

@Composable
fun InputField() {
    Column {
        Text(text = "Số điện thoại")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginScreen()
}

