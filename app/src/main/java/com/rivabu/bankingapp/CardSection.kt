package com.rivabu.bankingapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.rivabu.bankingapp.data.Card
import androidx.compose.ui.graphics.Brush
import com.rivabu.bankingapp.ui.theme.PurpleEnd
import com.rivabu.bankingapp.ui.theme.PurpleStart
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rivabu.bankingapp.ui.theme.BlueEnd
import com.rivabu.bankingapp.ui.theme.BlueStart
import com.rivabu.bankingapp.ui.theme.GreenEnd
import com.rivabu.bankingapp.ui.theme.GreenStart
import com.rivabu.bankingapp.ui.theme.OrangeEnd
import com.rivabu.bankingapp.ui.theme.OrangeStart


val cards: List<Card> = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "3663 7865 3786 3945",
        cardName = "Business",
        balance = 5000000.00,
        color = getGradient(PurpleStart, PurpleEnd),
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "1234 1234 1234 1234",
        cardName = "Savings",
        balance = 10000000.00,
        color = getGradient(BlueStart, BlueEnd),
    ),
    Card(
        cardType = "VISA",
        cardNumber = "4321 4321 4321 4321",
        cardName = "School",
        balance = 122000000000.00,
        color = getGradient(OrangeStart, OrangeEnd),
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "5656 5657 6789 5656",
        cardName = "Trips",
        balance = 9000000000.00,
        color = getGradient(GreenStart, GreenEnd),
    )
)

fun getGradient(startColor: Color, endColor: Color): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}


@Preview
@Composable
fun CardSection() {
    LazyRow() {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}

@Composable
fun CardItem(index: Int) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(
        modifier = Modifier.padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(259.dp)
                .height(160.dp).clickable{}
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

        }
    }
}
