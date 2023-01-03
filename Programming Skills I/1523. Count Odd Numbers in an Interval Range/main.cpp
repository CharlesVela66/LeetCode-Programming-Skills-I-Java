class Solution {
public:
    int countOdds(int low, int high) {
        if ((low % 2 == 0 && high % 2 == 0 && high - low == 2)){
            return 1;
        }
        if (low % 2 == 1 || high % 2 == 1){
            return 1 + ((high-low) / 2);
        }
        else {
            return (high - low) / 2;
        }
    }
};