package com.mmagdi.budget.data

class TransactionRepo(private val localSource: TransactionLocalDataSource) {

    fun add(transaction: Transaction) {
        localSource.add(transaction)
    }

    fun getAll() : List<Transaction> {
        return localSource.getAll()
    }
}