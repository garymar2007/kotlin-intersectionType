package org.gary

import io.ktor.http.*
import kotlinx.datetime.LocalDate

interface Named {
    val name: String
}

interface Addressable {
    val url: Url
}

interface NamedAndAddressable : Named, Addressable

class User(override val name: String,
           override val url: Url,
           val lastAccess: LocalDate
) : NamedAndAddressable

class Product(override val name: String,
              override val url: Url,
              val price: Int
): NamedAndAddressable