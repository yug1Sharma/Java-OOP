class Practical_16
{
    double calculateEMI(int principal, int time, float rate)
    {
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) /
                     (Math.pow(1 + r, n) - 1);

        return emi;
    }

    double calculateEMI(double principal, int time, double rate)
    {
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) /
                     (Math.pow(1 + r, n) - 1);

        return emi;
    }

    double calculateEMI(int principal, int time)
    {
        double rate = 10;
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) /
                     (Math.pow(1 + r, n) - 1);

        return emi;
    }

    public static void main(String[] args)
    {
        Practical_16 lc = new Practical_16();

        double homeEMI = lc.calculateEMI(500000, 20, 7.5f);
        double vehicleEMI = lc.calculateEMI(300000.0, 5, 9.0);
        double personalEMI = lc.calculateEMI(100000, 3);

        System.out.println("Home Loan EMI: " + homeEMI);
        System.out.println("Vehicle Loan EMI: " + vehicleEMI);
        System.out.println("Personal Loan EMI: " + personalEMI);
    }
}
