package info.android.firebase;

/**
 * Created by MYPC on 3/29/2017.
 */

public class Shopper {

        public String name;
        public String shopname;
        public String address;
        public String phone;
        // Default constructor required for calls to
        // DataSnapshot.getValue(Shopper.class)
        public Shopper() {
        }

        public Shopper(String name, String shopname) {
            this.name = name;
            this.shopname = shopname;
        }
    }

}
