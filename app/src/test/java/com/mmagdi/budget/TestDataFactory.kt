package com.mmagdi.budget

import com.mmagdi.budget.data.Expense
import com.mmagdi.budget.data.Income

object TestDataFactory {
    val expense = Expense("Coffee", 1.7)
    fun getExpense(name: String = "Coffee", value: Double = 1.7): Expense {
        return Expense(name, value)
    }

    fun getIncome(name: String = "salary", value: Double = 100.0): Income {
        return Income(name, value)
    }
}