CREATE TABLE IF NOT EXISTS public.usertable
(
    userid integer NOT NULL,
    first_name text COLLATE pg_catalog."default" NOT NULL,
    last_name text COLLATE pg_catalog."default",
    address text COLLATE pg_catalog."default",
    mobile text[] COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default" NOT NULL,
    username text COLLATE pg_catalog."default" NOT NULL,
    password text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usertable_pkey PRIMARY KEY (userid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usertable
    OWNER to postgres;
    
    
CREATE TABLE IF NOT EXISTS public.referral
(
    referralid integer NOT NULL,
    ref_first_name character(50) COLLATE pg_catalog."default" NOT NULL,
    ref_last_name character(50) COLLATE pg_catalog."default",
    mobile text[] COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default",
    userid integer NOT NULL,
    date_of_referral date,
    status boolean DEFAULT false,
    referral_points integer,
    CONSTRAINT referral_pkey PRIMARY KEY (referralid),
    CONSTRAINT ref_fk FOREIGN KEY (userid)
        REFERENCES public.usertable (userid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.referral
    OWNER to postgres;
    
CREATE TABLE IF NOT EXISTS public.customer
(
    customerid integer NOT NULL,
    first_name character(50) COLLATE pg_catalog."default",
    last_name character(50) COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default" NOT NULL,
    mobile text[] COLLATE pg_catalog."default",
    CONSTRAINT customer_pkey PRIMARY KEY (customerid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.customer
    OWNER to postgres;
    
CREATE TABLE IF NOT EXISTS public.buyingdetails
(
    customerid integer NOT NULL,
    userid integer NOT NULL,
    purchase_date date,
    product_name text COLLATE pg_catalog."default",
    CONSTRAINT buy_fk FOREIGN KEY (customerid)
        REFERENCES public.customer (customerid) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.buyingdetails
    OWNER to postgres;
    
    
CREATE OR REPLACE VIEW public.userview
 AS
 SELECT usertable.first_name,
    usertable.last_name,
    usertable.mobile,
    usertable.email
   FROM usertable;

ALTER TABLE public.userview
    OWNER TO postgres;
    
    
select count(referral.userid) from referral inner join usertable on referral.userid = usertable.userid ;

select count(referral.userid) from referral inner join usertable on referral.userid = usertable.userid group by usertable.userid;

select sum(referral_points) from referral group by userid;

select customer.first_name,customer.mobile from customer inner join buyingdetails on customer.customerid = buyingdetails.customerid where buyingdetails.purchase_date = '2022-09-21';

select first_name,email,mobile,last_name from customer inner join buyingdetails on customer.customerid = buyingdetails.customerid where product_name = 'iphone';

alter table buyingdetails 
drop constraint buy_fk,
add constraint buy_fk
foreign key (customerid)
references customer (customerid)
on delete cascade;

delete from customer where customerid = (select customerid from buyingdetails where product_name = 'iphone');

select * from userview;
