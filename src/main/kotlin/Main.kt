package org.gary

fun process(item: Any) {
    if (item is Named && item is Addressable) {
        println("Refreshing data for ${item.name} at ${item.url}")
    }
}

fun <T> processGeneric(item: T) where T : Named, T : Addressable {
    println("Refreshing data for ${item.name} at ${item.url}")
}

fun main() {
    process(exampleUser)
    process(exampleProduct)
    processGeneric(exampleUser)
    processGeneric(exampleProduct)
}