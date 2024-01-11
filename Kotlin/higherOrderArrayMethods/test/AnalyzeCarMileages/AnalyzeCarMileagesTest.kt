package AnalyzeCarMileages

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class AnalyzeCarMileagesTest {

    private lateinit var analysisObject1: AnalyzeCarMileages;
    
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
        val analysisData1 = analysisObject1.getCarAnalysisData()
        assertEquals(analysisData1.lowestMileageCar.make, "Ford")
        assertEquals(analysisData1.lowestMileageCar.mileage, 15000)
        assertEquals(analysisData1.highestMileageCar.make, "Honda")
        assertEquals(analysisData1.highestMileageCar.mileage, 30000)
        assertEquals(analysisData1.averageMileage, 23333)
        assertEquals(analysisData1.totalMileage, 70000)
    }
}