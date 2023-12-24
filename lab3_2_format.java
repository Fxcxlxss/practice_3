package lab3;

public class lab3_2_format {
    public static class Converter {
        public double er;

        public Converter(double er) {
            this.er = er;
        }

        public double convert(double amount) {
            return amount * er;
        }

        @Override
        public String toString() {
            return "Converter{" +
                    "er=" + er +
                    '}';
        }
    }

    public static void main(String[] args) {
        Converter usd_to_euro = new Converter(0.85);

        System.out.println(usd_to_euro.convert(200));
    }
}
