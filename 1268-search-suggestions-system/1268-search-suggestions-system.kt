class Solution {
		fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
		val result = mutableListOf<List<String>>()
		var currentProducts = products.toMutableList().sorted()
		var searchTerm = ""
            
		for(i in 0..searchWord.lastIndex){
			val c = searchWord[i]
			searchTerm += c
			currentProducts = currentProducts.filter{ it.startsWith(searchTerm) }
			val firstThree = mutableListOf<String>()
			for(i in 0..2){
				if(i > currentProducts.lastIndex){
					break
				}
				firstThree.add(currentProducts[i])
			}
			result.add(firstThree.toList())
		}
		return result
	}
}

