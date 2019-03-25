package com.test.apigteway.healthcheck

data class HeathStatus(val status: String){
    companion object {
        final const val UP = "UP";
        final const val DOWN = "DOWN";
    }
}