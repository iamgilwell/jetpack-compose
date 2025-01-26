package com.rivabu.bankingapp.ui.sections

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rivabu.bankingapp.data.Currency

val currenciesList = listOf<Currency>(
    Currency(
        name = "USD",
        buy = 23.35f,
        sell = 23.35f,
        icon = Icons.Rounded.AttachMoney,
    ),
    Currency(
        name = "EURO",
        buy = 13.35f,
        sell = 13.35f,
        icon = Icons.Rounded.Euro,
    ),
    Currency(
        name = "YEN",
        buy = 14.35f,
        sell = 14.35f,
        icon = Icons.Rounded.CurrencyYen,
    ),
    Currency(
        name = "USD",
        buy = 63.35f,
        sell = 73.35f,
        icon = Icons.Rounded.AttachMoney,
    ),
    Currency(
        name = "EURO",
        buy = 16.35f,
        sell = 16.35f,
        icon = Icons.Rounded.Euro,
    ),
    Currency(
        name = "YEN",
        buy = 45.35f,
        sell = 45.35f,
        icon = Icons.Rounded.CurrencyYen,
    ),
)

@Preview
@Composable
fun CurrenciesSection() {
    var isVisible by remember {
        mutableStateOf(false)
    }
    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)
    }
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .animateContentSize()
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.secondary)
                .clickable {
                    isVisible = !isVisible
                    iconState = if (isVisible) {
                        Icons.Rounded.KeyboardArrowUp
                    } else {
                        Icons.Rounded.KeyboardArrowDown
                    }
                }) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    imageVector = iconState,
                    contentDescription = "Currencies",
                    tint = MaterialTheme.colorScheme.onSecondary,
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = "Currencies",
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.secondary)
        )
        if (isVisible) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 25.dp,
                            topEnd = 25.dp
                        )
                    ).background(MaterialTheme.colorScheme.inverseOnSurface)
            ) {

                val boxWithConstraintScope = this
                val width = boxWithConstraintScope.maxWidth/3
                Column(
                    modifier = Modifier.fillMaxWidth()
                ){

                }
            }
        }
    }
}
