class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // Binary search on the answer: search space is "ship capacity per day".
        // Lower bound: capacity must be at least the heaviest single package
        // (else that package can never be shipped in one day).
        // Upper bound: worst case, ship everything in a single day.
        int low = max(weights);
        int high = sum(weights);

        // Feasibility check is monotonic: as capacity increases, days required
        // decreases (or stays same). So we can binary search for the minimum
        // capacity that keeps daysReq within the allowed limit.
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysReq = fun(weights, mid);

            if (daysReq <= days) {
                // This capacity works. But maybe a smaller capacity also works —
                // try to minimize further, so shrink search space downward.
                high = mid - 1;
            } else {
                // This capacity is too small (needs more days than allowed).
                // Need a bigger capacity, so move up.
                low = mid + 1;
            }
        }

        // Loop invariant: 'low' converges to the smallest capacity where
        // daysReq <= days. That's exactly the answer.
        return low;
    }

    // Greedy simulation: given a fixed daily capacity, count how many days
    // it takes to ship everything (load packages until adding one more
    // would exceed cap, then start a new day).
    static int fun(int weights[], int cap) {
        int day = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > cap) {
                day = day + 1;   // can't fit today, start a new day
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }

    // Lower bound for binary search: heaviest single package.
    static int max(int weights[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            if (maxi < weights[i]) maxi = weights[i];
        }
        return maxi;
    }

    // Upper bound for binary search: shipping everything in one day.
    static int sum(int weights[]) {
        int sumi = 0;
        for (int i = 0; i < weights.length; i++) {
            sumi += weights[i];
        }
        return sumi;
    }
}