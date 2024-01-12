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

    private fun getCarWithMinimumMileage(): CarData {
        return this.cars.minBy { it.mileage }
    }

    private fun getCarWithMaximumMileage(): CarData {
        return this.cars.maxBy { it.mileage }
    }

    private fun getTotalMileage(): Long {
        return this.listOfMileages().sum()
    }

    private fun getAverageMileage(): Long {
        return this.getTotalMileage() / listOfMileages().size
    }

    // first find the index of max item in another list array of just the mileages
    // then return the car at that index from the original list array of cars
    private fun getCarWithMaxMileage(): CarData {
            val indexOfCarWithMaxMileage = this.listOfMileages().indexOf(this.getMaxMileage())
            return cars[indexOfCarWithMaxMileage]
    }

    // first find the index of min item in another list array of just the mileages
    // then return the car at that index from the original list array of cars
    private fun getCarWithMinMileage(): CarData {
        val indexOfCarWithMinMileage = this.listOfMileages().indexOf(this.getMinMileage())
        return cars[indexOfCarWithMinMileage]
    }

    public fun getCarAnalysisData(): CarAnalysisData {
        return CarAnalysisData(
                averageMileage = this.getAverageMileage(),
                lowestMileageCar = this.getCarWithMinimumMileage(),//this.getCarWithMinMileage(),
                highestMileageCar = this.getCarWithMaximumMileage(),//this.getCarWithMaxMileage(),
                totalMileage = this.getTotalMileage()
            )
    }
}