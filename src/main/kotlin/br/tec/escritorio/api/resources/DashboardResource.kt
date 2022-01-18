package br.tec.escritorio.api.resources

import br.tec.escritorio.api.models.Chart
import br.tec.escritorio.api.models.ChartPeriod
import br.tec.escritorio.api.models.ChartType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dashboard")
class DashboardResource {

    @GetMapping
    fun getCharts(): ArrayList<Chart> {

        println(ChartPeriod.WEEKLY.type)

        return arrayListOf(
                Chart(0, ChartType.bar, listOf(50, 20, 10, 22, 50, 10, 40), ChartPeriod.WEEKLY, "Sales", false),
                Chart(1, ChartType.line, listOf(50, 40, 300, 320, 500, 350, 200, 230, 500), ChartPeriod.MONTHLY, "Mobile apps", true),
                Chart(2, ChartType.line, listOf(50, 40, 300, 220, 500, 250, 400, 230, 500), ChartPeriod.MONTHLY, "Mobile apps", true)
        )
    }
}