package com.mmagdi.budget.data

import com.mmagdi.budget.TestDataFactory
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import kotlin.math.exp

class TransactionLocalDataSourceTest {

    private lateinit var dataSource: TransactionLocalDataSource

    @Before
    fun setUp() {
        dataSource = TransactionLocalDataSource()
    }

    @Test
    fun `add Should add the value`() {
        dataSource.add(TestDataFactory.expense)
        assertTrue(dataSource.getAll().isNotEmpty())
    }

    @Test
    fun `add the transaction twice should update`() {
        val expense = TestDataFactory.expense
        dataSource.add(expense)
        dataSource.add(expense)

        assertEquals(1, dataSource.getAll().size)
    }

    @Test
    fun `get returns the correct value`() {
        val expense = TestDataFactory.expense
        dataSource.add(expense)
        dataSource.add(TestDataFactory.getIncome())

        assertEquals(expense, dataSource.get(expense.id))
    }



    @Test
    fun `getAll returns all values`() {
        val expense1 = TestDataFactory.getExpense("coffee")
        val expense2 = TestDataFactory.getExpense("water")
        dataSource.add(expense1)
        dataSource.add(expense2)

        assertEquals(2, dataSource.getAll().size)
    }
}