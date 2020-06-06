package com.mmagdi.budget.data

class TransactionLocalDataSource {

    private val map = HashMap<String, Transaction>()

    fun add(transaction: Transaction) {
        map[transaction.id] = transaction
    }

    fun get(id: String) = map[id]

    fun getAll(): List<Transaction> = map.values.toList()
}