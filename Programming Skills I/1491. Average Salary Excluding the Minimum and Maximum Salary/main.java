class Solution {
    public double average(int[] salary) {
        int minIndex = 0;
        int maxIndex = 0;
        int minSalary = salary[0];
        int maxSalary = salary[0];
        for (int i = 1; i < salary.length; i++){
            if (salary[i] < minSalary){
                minSalary = salary[i];
                minIndex = i;
            }
            else if (salary[i] > maxSalary){
                maxSalary = salary[i];
                maxIndex = i;
            }
        }
        double average = 0;
        for (int i = 0; i < salary.length; i++){
            if (i != minIndex && i != maxIndex){
                average += salary[i];
            }
        }
        return average / (salary.length - 2);
    }
}