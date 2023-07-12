package com.example.networkconnection

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun observe(): Flow<NetworkStatus>

    enum class NetworkStatus() {
        Available, UnAvailable, Lost, Losing
    }


}