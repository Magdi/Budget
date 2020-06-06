package com.mmagdi.budget.data

import java.util.*

sealed class Transaction(val id: String = UUID.randomUUID().toString())

data class Expense(val name: String, val value: Double) : Transaction()
data class Income(val name: String, val value: Double) : Transaction()