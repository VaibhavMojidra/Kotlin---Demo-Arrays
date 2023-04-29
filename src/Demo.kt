fun main(args: Array<String>) {
	val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange", "Apple")

	println(fruits[0])
	println(fruits[3])

	println(fruits.get(0))
	println(fruits.get(3))

	// Set the value at 3rd index
	fruits.set(3, "Guava")
	println(fruits.get(3))
	println("Size of fruits array " + fruits.size)

	for (item in fruits) {
		println(item)
	}
	//Check if an Element Exists

	if ("Mango" in fruits) {
		println("Mango exists in fruits")
	} else {
		println("Mango does not exist in fruits")
	}


	//Kotlin allows to store duplicate values in an array, but same time you can get a set of distinct values stored in the array using distinct() member function.
	val distinct = fruits.distinct()
	for (item in distinct) {
		println(item)
	}

	val result = fruits.drop(2) // drops first two elements.
	for (item in result) {
		println(item)
	}
	
	println( "Array is empty : " + fruits.isEmpty())
}