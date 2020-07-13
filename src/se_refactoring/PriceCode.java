package se_refactoring;

public enum PriceCode implements Price{
	REGULAR {
        @Override
        public double getCost(int days) {
            double amount = 2;
            if (days > 2)
                amount += (days - 2) * 1.5;
            return amount;
        }
    },
    NEW {
        @Override
        public double getCost(int days) {
            return days * 3.0;
        }

        @Override
        public int getPoints(int days) {
            return super.getPoints(days) + ((days > 1) ? 1 : 0);
        }
    },
    CHILDREN {
        @Override
        public double getCost(int days) {
            double amount = 1.5;
            if (days > 3)
                amount += (days - 3) * 1.5;
            return amount;
        }
    };

    @Override
    public int getPoints(int days) {
        return 1;
    }

}
