package org.example.randomkey

import javax.crypto.KeyGenerator


fun main() {
    val keyGen = KeyGenerator.getInstance("AES")
    keyGen.init(128)
    val secretKey = keyGen.generateKey()
    println(secretKey.encoded.joinToString("") { "%02x".format(it) })
}