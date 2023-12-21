

const arrayOfCarMileages = (cars) => cars.map((car) => car.mileage);

/*
function getCarWithHighestMileage(cars) {
    const carMileages = arrayOfCarMileages(cars);
    const highestMileage =  Math.max.apply(Math, carMileages);
    const indexOfCarWithHighestMileage = carMileages.indexOf(highestMileage);
    return cars[indexOfCarWithHighestMileage];
}

function getCarWithLowestMileage(cars) {
    const carMileages = arrayOfCarMileages(cars);
    const highestMileage =  Math.min.apply(Math, carMileages);
    const indexOfCarWithHighestMileage = carMileages.indexOf(highestMileage);
    return cars[indexOfCarWithHighestMileage];
};
*/

const getCarWithHighestMileage = (cars) => cars.reduce(
        (carWithHighestMileage, car) => (
            carWithHighestMileage.mileage > car.mileage ? carWithHighestMileage : car
        ), cars[0]
    );

const getCarWithLowestMileage = (cars) => cars.reduce(
        (carWithHighestMileage, car) => (
            carWithHighestMileage.mileage < car.mileage ? carWithHighestMileage : car
        ), cars[0]
    );


const getTotalMileage = (cars) => cars.reduce((total, car) => {
    return total + car.mileage;
}, 0);


function analyzeCarMileage(cars) {
    return {
           averageMileage: getTotalMileage(cars) / cars.length,
           highestMileageCar: getCarWithHighestMileage(cars),
           lowestMileageCar: getCarWithLowestMileage(cars),
           totalMileage: getTotalMileage(cars)
        }

}

module.exports = analyzeCarMileage;
