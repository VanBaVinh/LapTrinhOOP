public class StandardFeePolicy
        implements LateFeePolicy {

    @Override
    public double applyPolicy(
            double baseFee) {

        return baseFee;
    }

    @Override
    public String getPolicyName() {

        return "Phi tieu chuan";
    }
}