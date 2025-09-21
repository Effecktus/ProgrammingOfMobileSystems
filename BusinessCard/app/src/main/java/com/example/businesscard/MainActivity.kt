package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff1f1f1f))
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ProfileSection()
        Spacer(modifier = Modifier.weight(1f))
        ContactSection()
    }
}

@Composable
fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .background(Color(0xff1f1f1f))
        )
        Text(
            text = stringResource(R.string.name),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 16.sp,
            color = Color.White,
        )
    }
}

@Composable
fun ContactSection() {
    Column(
        modifier = Modifier.padding(bottom = 32.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = stringResource(R.string.phone),
                tint = Color(0xffffffff),
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.phone),
                color = Color(0xffffffff)
            )
        }
        Row {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = stringResource(R.string.tg),
                tint = Color(0xff0039a6),
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.tg),
                color = Color(0xff0039a6)
            )
        }
        Row {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = stringResource(R.string.email),
                tint = Color(0xffd52b1e),
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.email),
                color = Color(0xffd52b1e)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}