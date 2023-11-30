package com.example.assam

import java.time.LocalDateTime

class Extensions

fun LocalDateTime.format(): String = this.format(englishDateFormatter)