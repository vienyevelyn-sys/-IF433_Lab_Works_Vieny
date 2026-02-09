package oop_108031_vienyEvelyn.week02

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1){
    fun calculateFine(): Int{
        var denda: Int = 0
        if (loanDuration > 3){
            denda = (loanDuration - 3) * 2000
        }else if (loanDuration <= 3){
            denda = 0
        }
        return denda
    }
}