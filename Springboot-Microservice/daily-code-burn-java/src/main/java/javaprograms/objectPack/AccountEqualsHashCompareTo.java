package javaprograms.objectPack;

public final class AccountEqualsHashCompareTo implements Comparable<AccountEqualsHashCompareTo> {

    enum AccountType {CASH, MARGIN, RRSP};

    public AccountEqualsHashCompareTo(
            String aFirstName,
            String aLastName,
            int aAccountNumber,
            int aBalance,
            boolean aIsNewAccount,
            AccountType aAccountType
    ) {
        //..parameter validations elided
        fFirstName = aFirstName;
        fLastName = aLastName;
        fAccountNumber = aAccountNumber;
        fBalance = aBalance;
        fIsNewAccount = aIsNewAccount;
        fAccountType = aAccountType;
    }

    /**
     * @param aThat is a non-null Account.
     *
     * @throws NullPointerException if aThat is null.
     */
    @Override public int compareTo(AccountEqualsHashCompareTo aThat) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        //this optimization is usually worthwhile, and can
        //always be added
        if (this == aThat) return EQUAL;

        //primitive numbers follow this form
        if (this.fAccountNumber < aThat.fAccountNumber) return BEFORE;
        if (this.fAccountNumber > aThat.fAccountNumber) return AFTER;

        //booleans follow this form
        if (!this.fIsNewAccount && aThat.fIsNewAccount) return BEFORE;
        if (this.fIsNewAccount && !aThat.fIsNewAccount) return AFTER;

        //objects, including type-safe enums, follow this form
        //note that null objects will throw an exception here
        int comparison = this.fAccountType.compareTo(aThat.fAccountType);
        if (comparison != EQUAL) return comparison;

        comparison = this.fLastName.compareTo(aThat.fLastName);
        if (comparison != EQUAL) return comparison;

        comparison = this.fFirstName.compareTo(aThat.fFirstName);
        if (comparison != EQUAL) return comparison;

        if (this.fBalance < aThat.fBalance) return BEFORE;
        if (this.fBalance > aThat.fBalance) return AFTER;

        //all comparisons have yielded equality
        //verify that compareTo is consistent with equals (optional)
        assert this.equals(aThat) : "compareTo inconsistent with equals.";

        return EQUAL;
    }

    /**
     * Define equality of state.
     */
    @Override public boolean equals(Object aThat) {
        if (this == aThat) return true;
        if (!(aThat instanceof AccountEqualsHashCompareTo)) return false;

        AccountEqualsHashCompareTo that = (AccountEqualsHashCompareTo)aThat;
        return
                ( this.fAccountNumber == that.fAccountNumber ) &&
                        ( this.fAccountType == that.fAccountType ) &&
                        ( this.fBalance == that.fBalance ) &&
                        ( this.fIsNewAccount == that.fIsNewAccount ) &&
                        ( this.fFirstName.equals(that.fFirstName) ) &&
                        ( this.fLastName.equals(that.fLastName) )
                ;
    }

    /**
     * A class that overrides equals must also override hashCode.
     */
    @Override public int hashCode() {
        int result = 0;//HashCodeUtil.SEED;
        /*result = HashCodeUtil.hash( result, fAccountNumber );
        result = HashCodeUtil.hash( result, fAccountType );
        result = HashCodeUtil.hash( result, fBalance );
        result = HashCodeUtil.hash( result, fIsNewAccount );
        result = HashCodeUtil.hash( result, fFirstName );
        result = HashCodeUtil.hash( result, fLastName );*/
        return result;
    }

    //PRIVATE

    private String fFirstName; //non-null
    private String fLastName;  //non-null
    private int fAccountNumber;
    private int fBalance;
    private boolean fIsNewAccount;

    /**
     * Type of the account, expressed as a type-safe enumeration (non-null).
     */
    private AccountType fAccountType;

    /**
     * Exercise compareTo.
     */
    public static void main (String[] aArguments) {
        //Note the difference in behaviour in equals and compareTo, for nulls:
        String text = "blah";
        Integer number = new Integer(10);
        //x.equals(null) always returns false:
        System.out.println("false: " + text.equals(null));
        System.out.println("false: " + number.equals(null) );
        //x.compareTo(null) always throws NullPointerException:
        //System.out.println( text.compareTo(null) );
        //System.out.println( number.compareTo(null) );

        AccountEqualsHashCompareTo flaubert = new AccountEqualsHashCompareTo(
                "Gustave", "Flaubert", 1003, 0,true, AccountType.MARGIN
        );

        //all of these other versions of "flaubert" differ from the
        //original in only one field
        AccountEqualsHashCompareTo flaubert2 = new AccountEqualsHashCompareTo(
                "Guy", "Flaubert", 1003, 0, true, AccountType.MARGIN
        );
        AccountEqualsHashCompareTo flaubert3 = new AccountEqualsHashCompareTo(
                "Gustave", "de Maupassant", 1003, 0, true, AccountType.MARGIN
        );
        AccountEqualsHashCompareTo flaubert4 = new AccountEqualsHashCompareTo(
                "Gustave", "Flaubert", 2004, 0, true, AccountType.MARGIN
        );
        AccountEqualsHashCompareTo flaubert5 = new AccountEqualsHashCompareTo(
                "Gustave", "Flaubert", 1003, 1, true, AccountType.MARGIN
        );
        AccountEqualsHashCompareTo flaubert6 = new AccountEqualsHashCompareTo(
                "Gustave", "Flaubert", 1003, 0, false, AccountType.MARGIN
        );
        AccountEqualsHashCompareTo flaubert7 = new AccountEqualsHashCompareTo(
                "Gustave", "Flaubert", 1003, 0, true, AccountType.CASH
        );

        System.out.println( "0: " +  flaubert.compareTo(flaubert) );
        System.out.println( "first name +: " +  flaubert2.compareTo(flaubert) );
        //Note capital letters precede small letters
        System.out.println( "last name +: " +  flaubert3.compareTo(flaubert) );
        System.out.println( "acct number +: " +  flaubert4.compareTo(flaubert) );
        System.out.println( "balance +: " +  flaubert5.compareTo(flaubert) );
        System.out.println( "is new -: " +  flaubert6.compareTo(flaubert) );
        System.out.println( "account type -: " +  flaubert7.compareTo(flaubert) );
    }
}