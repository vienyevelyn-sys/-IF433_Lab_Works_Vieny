package oop_108031_vienyEvelyn.week07

enum class AppState{
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val data: String) : ApiResponse()
    object Loading : ApiResponse()
}