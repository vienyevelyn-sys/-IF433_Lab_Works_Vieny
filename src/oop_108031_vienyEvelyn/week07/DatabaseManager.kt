package oop_108031_vienyEvelyn.week07

    object DatabaseManager {
        var connectionStatus : String = "Disconnected.."

        fun connect(){
            connectionStatus = "Connected to server"
            println("Database is ready")
        }
    }