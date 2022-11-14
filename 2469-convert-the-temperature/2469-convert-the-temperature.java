class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{toKalv(celsius),toFran(celsius)};
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