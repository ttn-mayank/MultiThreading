package question5;

public class Account {

        private String accountNumber;
        private Integer amount;
        private Object lock;

        public Account(String accountNumber, Integer amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
            this.lock = new Object();
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Object getLock() {
            return lock;
        }

}
