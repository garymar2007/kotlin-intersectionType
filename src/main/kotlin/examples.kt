package org.gary

import kotlinx.datetime.LocalDate

val exampleUser = User(
    name = "Gary Ma",
    url = Url("https://example.com/user"),
    lastAccess = LocalDate(2024, 10, 1)
)

val exampleProduct = Product(
    name = "Coffee Mug",
    url = Url("https://example.com/product"),
    price = 100_99
)
