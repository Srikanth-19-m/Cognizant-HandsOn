DECLARE
    age NUMBER;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
	--TRUNC-to remove decimals
        age := TRUNC(MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12);
        IF age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/