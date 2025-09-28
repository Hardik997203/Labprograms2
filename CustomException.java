package banksys;

class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}