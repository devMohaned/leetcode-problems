class Solution {
    public double[] convertTemperature(double celsius) {
        double fran = toFran(celsius);    
        double kalv = toKalv(celsius);    
        return new double[]{kalv,fran};
    }
    
    private double toFran(double num)
    {
        return (num * 9/5) + 32;
    }
        private double toKalv(double num)
    {
        return num + 273.15;
    }

}