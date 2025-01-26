package com.rivabu.bankingapp.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rivabu.bankingapp.data.Finance
import com.rivabu.bankingapp.ui.theme.BlueStart
import com.rivabu.bankingapp.ui.theme.GreenStart
import com.rivabu.bankingapp.ui.theme.OrangeStart
import com.rivabu.bankingapp.ui.theme.PurpleStart


val financeList = listOf<Finance>(
    Finance(
        icon = Icons.AutoMirrored.Rounded.StarHalf, name = "My\n Business", background = OrangeStart
    ), Finance(
        icon = Icons.Rounded.Wallet, name = "My\n Wallet", background = BlueStart
    ), Finance(
        icon = Icons.AutoMirrored.Rounded.StarHalf, name = "Finance\n Analytics", background = PurpleStart
    ), Finance(
        icon = Icons.Rounded.MonetizationOn, name = "My\n Transactions", background = GreenStart
    )
)

@Preview
@Composable
fun FinanceSection() {
    Column {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )
        LazyRow {
            items(financeList.size) { index ->
                FinanceItem(index)
            }
        }
    }
}

@Composable
fun FinanceItem(
    index: Int
) {
    val finance = financeList[index]
    val lastPaddingEnd = if (index == financeList.size - 1) 16.dp else 0.dp
    Box(
        modifier = Modifier.padding(start = 16.dp, end = lastPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .padding(13.dp)
                .size(120.dp)
                .clickable {}, verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.background)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = finance.icon, contentDescription = finance.name, tint = Color.White
                )
            }
            Text(
                text = finance.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
