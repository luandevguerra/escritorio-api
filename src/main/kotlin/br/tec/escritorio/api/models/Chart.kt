package br.tec.escritorio.api.models

data class Chart(
        val id: Long,
        val chartType: ChartType?,
        val data: List<Long>?,
        var period: ChartPeriod?,
        val dataLabel: String,
        val hasPoints: Boolean
)
