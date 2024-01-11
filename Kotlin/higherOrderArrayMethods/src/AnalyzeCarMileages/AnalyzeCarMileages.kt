package AnalyzeCarMileages

import java.math.BigDecimal

class AnalyzeCarMileages(
    private val cars: ArrayList<CarData>,
)  {

    private fun listOfMileages(): List<Long> {
        return this.cars.map { it.mileage }
    }

    private fun getMaxMileage(): Long {
        return this.listOfMileages().max()
    }

    private fun getMinMileage(): Long {
        return this.listOfMileages().min();
    }

    private fun getTotalMileage(): Long {
        return this.listOfMileages().sum()
    }

    private fun getAverageMileage(): Long {
        return this.getTotalMileage() / listOfMileages().size
    }

    private fun getCarWithMaxMileage(): CarData {
            val indexOfCarWithMaxMileage = this.listOfMileages().indexOf(this.getMaxMileage())
            return cars[indexOfCarWithMaxMileage]
    }

    private fun getCarWithMinMileage(): CarData {
        val indexOfCarWithMinMileage = this.listOfMileages().indexOf(this.getMinMileage())
        return cars[indexOfCarWithMinMileage]
    }

    public fun getCarAnalysisData(): CarAnalysisData {
        return CarAnalysisData(
                averageMileage = this.getAverageMileage(),
                lowestMileageCar = this.getCarWithMinMileage(),
                highestMileageCar = this.getCarWithMaxMileage(),
                totalMileage = this.getTotalMileage()
            )
    }
}