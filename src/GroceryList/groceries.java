package GroceryList;

public class groceries {


        public String item;
        public String category;

        public groceries(String item, String category){
            this.item = item;
            this.category = category;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getItem() {
            return item;
        }

        public String getCategory() {
            return category;
        }


    }


