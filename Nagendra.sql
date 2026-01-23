--1) Create the table instances given to you with primary key and foreign key constraints
-- Accounts table
create table accounts (
  acc_no varchar2(5) primary key,
  acc_type varchar2(3),
  cust_name varchar2(10),
  branch varchar2(20),
  balance number(10)
);

-- Loans table (no foreign key due to duplicate cust_name)
create table loans (
  l_no varchar2(5) primary key,
  l_type varchar2(3),
  cust_name varchar2(10),
  branch varchar2(20),
  amount number(10)
);

-- Insert data into accounts
insert into accounts values('A-101','SB','John','Bhimavaram',50000);
insert into accounts values('A-102','CA','David','Vijayawada',23450);
insert into accounts values('A-103','SB','John','Bhimavaram',34000);
insert into accounts values('A-104','SB','Sailesh','Vizag',70000);
insert into accounts values('A-105','CA','Pranav','Bhimavaram',90000);
insert into accounts values('A-106','SB','Mary','Vizag',17000);
insert into accounts values('A-107','CA','David','Vijayawada',56000);
insert into accounts values('A-108','RD','Shabir','Bhimavaram',28000);

-- Insert data into loans
insert into loans values('L-101','PL','David','Bhimavaram',500000);
insert into loans values('L-102','JL','Sailesh','Vijayawada',90000);
insert into loans values('L-103','ML','David','Bhimavaram',1500000);
insert into loans values('L-104','JL','Sailesh','Vizag',70000);
insert into loans values('L-105','CL','Pranav','Bhimavaram',90000);
insert into loans values('L-106','ML','Shabir','Vizag',170000);
insert into loans values('L-107','CL','Mary','Vijayawada',56000);
insert into loans values('L-108','PL','Shabir','Vijayawada',400000);

--2) Create a table of your choice with Primary Key and Not Null constraints. Verify working of the constraints
create table employee (
  emp_id number primary key,
  emp_name varchar2(20) not null,
  salary number(8)
);

-- Test constraints
insert into employee values (1,'Ravi',25000); 
insert into employee values (2,null,20000); --cannot insert NULL
insert into employee values (1,'Kiran',30000); --unique constraint (EX12.SYS_C0035944) violated

--3) For accounts belong to John, find account numbers and their types
select acc_no, acc_type from accounts where cust_name='John';

--4) For each branch, display sum of balances of SB accounts and Current Accounts separately.
select branch, acc_type , sum(balance) from accounts where acc_type in ('SB','CA') group by branch, acc_type;

--5) Find the customer who had two accounts at the same branch.
select cust_name, branch from accounts group by cust_name ,branch having count(*) >1;

--6) Find the maximum account balance among SB accounts.
select max(balance) from accounts where acc_type='SB';

--7) Find the names of customers who have both an account and a loan.	
select distinct a.cust_name from accounts a join loans l on a.cust_name = l.cust_name;

--8) Find the customers who had two types of accounts.
select cust_name from accounts group by cust_name having count(distinct acc_type) > 1;

--9) Find the loan type for which the total loan amount is the minimum over all types
select l_type from loans group by l_type having sum(amount) = (select min(sum(amount)) from loans group by l_type);

--10) Find the branches in which there are more accounts than loans.
select branch from accounts group by branch having count(*) > ( select count(*) from loans l where l.branch = accounts.branch);

--11) A single withdrawal can’t exceed Rs. 15000/- for SB accounts. Create a trigger
create or replace trigger sb_withdraw_limit
before update of balance on accounts
for each row
when (old.acc_type = 'SB')
begin
  if (:old.balance - :new.balance) > 15000 then
    raise_application_error(-20001,
      'Withdrawal exceeds Rs.15000 limit for SB accounts');
  end if;
end;
/

--12) Create a stored procedure to accept the deposit amount and account number and perform the deposit.
create or replace procedure deposit_amt(
    p_acc_no in accounts.acc_no%type,
    p_amount in number
) as
begin
  update accounts
  set balance = balance + p_amount
  where acc_no = p_acc_no;
end;
/

-- Example execution
exec deposit_amt('A-101', 5000);

