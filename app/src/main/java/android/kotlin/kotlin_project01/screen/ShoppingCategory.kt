package android.kotlin.kotlin_project01.screen

class ShoppingCategory {

     fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")

        for (categories in categories) {
            println(categories)
        }

        println("-> 장바구니로 이동하시려면 #을 입력하세요")

        var selectedCategory = readLine()

        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }

        if (selectedCategory == "#") {
            //todo 장바구니 이동

        } else {

            if(categories.contains(selectedCategory)){
                //todo 카테고리 상품 목록 보여주기
            }
            else{
               showErrorMessage(selectedCategory)
            }
            //todo 카테고리 목록에 없는 값을 입력하는 경우

        }
    }

    private fun showErrorMessage(selectedCategory:String?){
        println("[$selectedCategory] : 존재하지 않은 카테고리 입니다 . 다시입력하세요")
        showCategories()
    }
}