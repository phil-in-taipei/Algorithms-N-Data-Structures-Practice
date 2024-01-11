package AnalyzeCarMileages

data class CarAnalysisData(
    val averageMileage: Long,
    val lowestMileageCar: CarData,
    val highestMileageCar: CarData,
    val totalMileage: Long
)

