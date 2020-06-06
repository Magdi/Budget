package com.mmagdi.budget.data

import com.mmagdi.budget.TestDataFactory
import io.mockk.MockK
import io.mockk.impl.annotations.SpyK
import io.mockk.spyk
import io.mockk.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class TransactionRepoTest {

    private val transactionLocalDataSource = spyk(TransactionLocalDataSource())
    private lateinit var repo : TransactionRepo

    @Before
    fun setUp() {
        repo = TransactionRepo(transactionLocalDataSource)
    }

    @Test
    fun add() {
        val expense = TestDataFactory.expense
        repo.add(expense)
        verify { transactionLocalDataSource.add(expense) }
    }

    @Test
    fun getAll() {
        repo.getAll()
        verify { transactionLocalDataSource.getAll() }
    }
}