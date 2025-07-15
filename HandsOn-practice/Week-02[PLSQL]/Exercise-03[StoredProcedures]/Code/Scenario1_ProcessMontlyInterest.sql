CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc_rec IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        UPDATE Accounts
        SET Balance = acc_rec.Balance + (acc_rec.Balance * 0.01)
        WHERE AccountID = acc_rec.AccountID;
    END LOOP;

    COMMIT;
END;
/
