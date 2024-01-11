package AnalyzeCarMileages

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class AnalyzeCarMileagesTest {

    lateinit var analysisObject1: AnalyzeCarMileages;
    @BeforeEach
    fun setUp() {
        val carsData = ArrayList<CarData>()
        carsData.add(CarData(make="Toyota", model="Carola", mileage = 25000, year=2020))
        carsData.add(CarData(make="Honda", model="Civic", mileage = 30000, year=2019))
        carsData.add(CarData(make="Ford", model="Mustang", mileage = 15000, year=2021))
        analysisObject1 = AnalyzeCarMileages(carsData);

    }


    @Test
    fun getCarAnalysisData() {
        assertEquals(analysisObject1.getCarAnalysisData().lowestMileageCar.make, "Ford")
        assertEquals(analysisObject1.getCarAnalysisData().lowestMileageCar.mileage, 15000)
        assertEquals(analysisObject1.getCarAnalysisData().highestMileageCar.make, "Honda")
        assertEquals(analysisObject1.getCarAnalysisData().highestMileageCar.mileage, 30000)
        assertEquals(analysisObject1.getCarAnalysisData().averageMileage, 23333)
        assertEquals(analysisObject1.getCarAnalysisData().totalMileage, 70000)
    }
}