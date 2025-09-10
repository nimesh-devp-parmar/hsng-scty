--	Start of HSNG_SCTY_ROOT

CREATE TABLE IF NOT EXISTS HSNG_SCTY_ROOT
(
    Hsng_Scty_Iden		VARCHAR(36)			PRIMARY KEY,
    Hsng_Scty_Name		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Regn_Nmbr	VARCHAR(255)	UNIQUE NOT NULL,
    Hsng_Scty_Regn_Date	BIGINT			NOT NULL,
    Hsng_Scty_Addr_Strt	VARCHAR(255)	NOT NULL,
    Hsng_Scty_Addr_Area	VARCHAR(255)	NOT NULL,
    Hsng_Scty_Addr_City	VARCHAR(255)	NOT NULL,
    Hsng_Scty_Addr_Stte	VARCHAR(255)	NOT NULL,
    Hsng_Scty_Addr_Ctry	VARCHAR(255)	NOT NULL,
    Hsng_Scty_Addr_Pinc	VARCHAR(10)		NOT NULL
);

INSERT	INTO	HSNG_SCTY_ROOT	(
	Hsng_Scty_Iden, Hsng_Scty_Name, Hsng_Scty_Regn_Nmbr, Hsng_Scty_Regn_Date, Hsng_Scty_Addr_Strt, Hsng_Scty_Addr_Area, Hsng_Scty_Addr_City, Hsng_Scty_Addr_Stte, Hsng_Scty_Addr_Ctry, Hsng_Scty_Addr_Pinc
)
SELECT	'01991734-792d-744f-8d55-8e85ec7bb4fd',
		'Shivalik Heights Co-Operative Service Housing Society',
		'REG/SRT/SA(HAA) 02468/2016',
		'1472706000000',
		'Udhna-Magdalla Road',
		'Vesu',
		'Surat',
		'Gujarat',
		'India',
		'395007'
WHERE NOT EXISTS (SELECT 1
                  FROM HSNG_SCTY_ROOT
                  WHERE Hsng_Scty_Iden = '01991734-792d-744f-8d55-8e85ec7bb4fd');

INSERT	INTO	HSNG_SCTY_ROOT	(
	Hsng_Scty_Iden, Hsng_Scty_Name, Hsng_Scty_Regn_Nmbr, Hsng_Scty_Regn_Date, Hsng_Scty_Addr_Strt, Hsng_Scty_Addr_Area, Hsng_Scty_Addr_City, Hsng_Scty_Addr_Stte, Hsng_Scty_Addr_Ctry, Hsng_Scty_Addr_Pinc
)
SELECT	'0199174f-6a2c-7521-8b08-fdee1f2b0054',
		'Ashirwad Villa Co-Operative Service Society',
		'REG/SRT/SA(HAA) 13579/2018',
		'1535778000000',
		'VIP Road',
		'Vesu',
		'Surat',
		'Gujarat',
		'India',
		'395007'
WHERE NOT EXISTS (SELECT 1
                  FROM HSNG_SCTY_ROOT
                  WHERE Hsng_Scty_Iden = '0199174f-6a2c-7521-8b08-fdee1f2b0054');

                  
--	Start of HSNG_SCTY_OFFC_BRRS

CREATE TABLE IF NOT EXISTS HSNG_SCTY_OFFC_BRRS
(
    Hsng_Scty_Offc_Brrs_Regn_Nmbr		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Titl			VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Seqn_Nmbr		INT 			NOT NULL,
    Hsng_Scty_Offc_Brrs_Name_Frst		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Name_Midl		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Name_Last		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Date_Strt		BIGINT			NOT NULL,
    Hsng_Scty_Offc_Brrs_Date_Fnsh		BIGINT,
    Hsng_Scty_Offc_Brrs_Cntc_Nmbr		BIGINT			NOT NULL,
    Hsng_Scty_Offc_Brrs_Cntc_Mail		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Offc_Brrs_Cntc_Wtsp		BIGINT			NOT NULL,
    PRIMARY KEY (Hsng_Scty_Offc_Brrs_Regn_Nmbr, Hsng_Scty_Offc_Brrs_Titl, Hsng_Scty_Offc_Brrs_Seqn_Nmbr),
	FOREIGN KEY (Hsng_Scty_Offc_Brrs_Regn_Nmbr) REFERENCES HSNG_SCTY_ROOT(Hsng_Scty_Regn_Nmbr)
 );

INSERT INTO HSNG_SCTY_OFFC_BRRS (
	Hsng_Scty_Offc_Brrs_Regn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Titl, 
	Hsng_Scty_Offc_Brrs_Seqn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Name_Frst, 
	Hsng_Scty_Offc_Brrs_Name_Midl, 
	Hsng_Scty_Offc_Brrs_Name_Last, 
	Hsng_Scty_Offc_Brrs_Date_Strt, 
	Hsng_Scty_Offc_Brrs_Date_Fnsh, 
	Hsng_Scty_Offc_Brrs_Cntc_Nmbr, 
	Hsng_Scty_Offc_Brrs_Cntc_Mail, 
	Hsng_Scty_Offc_Brrs_Cntc_Wtsp 
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		'President', 
		0, 
		'Prakash',
		'X', 
		'Patel', 
		1477976400000, 
		NULL, 
		1234567890, 
		'prakash_patel@surat.com', 
		1234567890 
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_OFFC_BRRS 
				WHERE 	Hsng_Scty_Offc_Brrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND 
						Hsng_Scty_Offc_Brrs_Titl		=	'President'						AND 
						Hsng_Scty_Offc_Brrs_Seqn_Nmbr 	=	0
);

INSERT INTO HSNG_SCTY_OFFC_BRRS (
	Hsng_Scty_Offc_Brrs_Regn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Titl, 
	Hsng_Scty_Offc_Brrs_Seqn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Name_Frst, 
	Hsng_Scty_Offc_Brrs_Name_Midl, 
	Hsng_Scty_Offc_Brrs_Name_Last, 
	Hsng_Scty_Offc_Brrs_Date_Strt, 
	Hsng_Scty_Offc_Brrs_Date_Fnsh, 
	Hsng_Scty_Offc_Brrs_Cntc_Nmbr, 
	Hsng_Scty_Offc_Brrs_Cntc_Mail, 
	Hsng_Scty_Offc_Brrs_Cntc_Wtsp 
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		'Secretary', 
		1, 
		'Akhilesh',
		'X', 
		'Naik', 
		1477976400000, 
		NULL, 
		2345678901, 
		'akhilesh_naik@surat.com', 
		234567891 
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_OFFC_BRRS 
				WHERE 	Hsng_Scty_Offc_Brrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND 
						Hsng_Scty_Offc_Brrs_Titl		=	'Secretary'						AND 
						Hsng_Scty_Offc_Brrs_Seqn_Nmbr 	=	1
);

INSERT INTO HSNG_SCTY_OFFC_BRRS (
	Hsng_Scty_Offc_Brrs_Regn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Titl, 
	Hsng_Scty_Offc_Brrs_Seqn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Name_Frst, 
	Hsng_Scty_Offc_Brrs_Name_Midl, 
	Hsng_Scty_Offc_Brrs_Name_Last, 
	Hsng_Scty_Offc_Brrs_Date_Strt, 
	Hsng_Scty_Offc_Brrs_Date_Fnsh, 
	Hsng_Scty_Offc_Brrs_Cntc_Nmbr, 
	Hsng_Scty_Offc_Brrs_Cntc_Mail, 
	Hsng_Scty_Offc_Brrs_Cntc_Wtsp 
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		'Treasurer', 
		2, 
		'Prashant',
		'X', 
		'Shah', 
		1477976400000, 
		NULL, 
		3456789012, 
		'prashant_shah@surat.com', 
		345678912 
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_OFFC_BRRS 
				WHERE 	Hsng_Scty_Offc_Brrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND 
						Hsng_Scty_Offc_Brrs_Titl		=	'Treasurer'						AND 
						Hsng_Scty_Offc_Brrs_Seqn_Nmbr 	=	2
);

INSERT INTO HSNG_SCTY_OFFC_BRRS (
	Hsng_Scty_Offc_Brrs_Regn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Titl, 
	Hsng_Scty_Offc_Brrs_Seqn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Name_Frst, 
	Hsng_Scty_Offc_Brrs_Name_Midl, 
	Hsng_Scty_Offc_Brrs_Name_Last, 
	Hsng_Scty_Offc_Brrs_Date_Strt, 
	Hsng_Scty_Offc_Brrs_Date_Fnsh, 
	Hsng_Scty_Offc_Brrs_Cntc_Nmbr, 
	Hsng_Scty_Offc_Brrs_Cntc_Mail, 
	Hsng_Scty_Offc_Brrs_Cntc_Wtsp 
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		'Committee Member', 
		3, 
		'Nimesh',
		'X', 
		'Parmar', 
		1477976400000, 
		NULL, 
		4567890123, 
		'prashant_shah@surat.com', 
		4567890123
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_OFFC_BRRS 
				WHERE 	Hsng_Scty_Offc_Brrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND 
						Hsng_Scty_Offc_Brrs_Titl		=	'Committee Member'				AND 
						Hsng_Scty_Offc_Brrs_Seqn_Nmbr 	=	3
);

INSERT INTO HSNG_SCTY_OFFC_BRRS (
	Hsng_Scty_Offc_Brrs_Regn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Titl, 
	Hsng_Scty_Offc_Brrs_Seqn_Nmbr, 
	Hsng_Scty_Offc_Brrs_Name_Frst, 
	Hsng_Scty_Offc_Brrs_Name_Midl, 
	Hsng_Scty_Offc_Brrs_Name_Last, 
	Hsng_Scty_Offc_Brrs_Date_Strt, 
	Hsng_Scty_Offc_Brrs_Date_Fnsh, 
	Hsng_Scty_Offc_Brrs_Cntc_Nmbr, 
	Hsng_Scty_Offc_Brrs_Cntc_Mail, 
	Hsng_Scty_Offc_Brrs_Cntc_Wtsp 
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		'Committee Member', 
		4, 
		'Sunjoy',
		'X', 
		'Verma', 
		1477976400000, 
		NULL, 
		5678901234, 
		'prashant_shah@surat.com', 
		5678901234
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_OFFC_BRRS 
				WHERE 	Hsng_Scty_Offc_Brrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND 
						Hsng_Scty_Offc_Brrs_Titl		=	'Committee Member'				AND 
						Hsng_Scty_Offc_Brrs_Seqn_Nmbr 	=	4
);

--	Start of HSNG_SCTY_SCTN

CREATE TABLE IF NOT EXISTS HSNG_SCTY_SCTN
(
    Hsng_Scty_Sctn_Regn_Nmbr			VARCHAR(255)	PRIMARY KEY,
    Hsng_Scty_Sctn_Totl					INT 			NOT NULL,
	FOREIGN KEY (Hsng_Scty_Sctn_Regn_Nmbr) REFERENCES HSNG_SCTY_ROOT(Hsng_Scty_Regn_Nmbr)
 );

INSERT INTO HSNG_SCTY_SCTN (
	Hsng_Scty_Sctn_Regn_Nmbr, 
	Hsng_Scty_Sctn_Totl
)
SELECT	'REG/SRT/SA(HAA) 02468/2016', 
		2
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_SCTN 
				WHERE 	Hsng_Scty_Sctn_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'
);

INSERT INTO HSNG_SCTY_SCTN (
	Hsng_Scty_Sctn_Regn_Nmbr, 
	Hsng_Scty_Sctn_Totl
)
SELECT	'REG/SRT/SA(HAA) 13579/2018', 
		0
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_SCTN 
				WHERE 	Hsng_Scty_Sctn_Regn_Nmbr	=	'REG/SRT/SA(HAA) 13579/2018'
);

--	Start of HSNG_SCTY_SCTN_DTLS

CREATE TABLE IF NOT EXISTS HSNG_SCTY_SCTN_DTLS
(
    Hsng_Scty_Sctn_Dtls_Regn_Nmbr		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Sctn_Dtls_Name			VARCHAR(255)	NOT NULL,
    Hsng_Scty_Sctn_Dtls_Flrs			BIGINT			NOT NULL,
    PRIMARY KEY (Hsng_Scty_Sctn_Dtls_Regn_Nmbr, Hsng_Scty_Sctn_Dtls_Name),
	FOREIGN KEY (Hsng_Scty_Sctn_Dtls_Regn_Nmbr) REFERENCES HSNG_SCTY_ROOT(Hsng_Scty_Regn_Nmbr)
 );

INSERT INTO HSNG_SCTY_SCTN_DTLS (
	Hsng_Scty_Sctn_Dtls_Regn_Nmbr, 
	Hsng_Scty_Sctn_Dtls_Name,
	Hsng_Scty_Sctn_Dtls_Flrs
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		9
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_SCTN_DTLS 
				WHERE 	Hsng_Scty_Sctn_Dtls_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016' AND
						Hsng_Scty_Sctn_Dtls_Name		=	'A'
);

INSERT INTO HSNG_SCTY_SCTN_DTLS (
	Hsng_Scty_Sctn_Dtls_Regn_Nmbr, 
	Hsng_Scty_Sctn_Dtls_Name,
	Hsng_Scty_Sctn_Dtls_Flrs
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		9
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_SCTN_DTLS 
				WHERE 	Hsng_Scty_Sctn_Dtls_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016' AND
						Hsng_Scty_Sctn_Dtls_Name		=	'B'
);

--	Start of HSNG_SCTY_FLRS

CREATE TABLE IF NOT EXISTS HSNG_SCTY_FLRS
(
    Hsng_Scty_Flrs_Regn_Nmbr		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Flrs_Sctn_Name		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Flrs_Flor_Nmbr		BIGINT			NOT NULL,
    PRIMARY KEY (Hsng_Scty_Flrs_Regn_Nmbr, Hsng_Scty_Flrs_Sctn_Name, Hsng_Scty_Flrs_Flor_Nmbr),
	FOREIGN KEY (Hsng_Scty_Flrs_Regn_Nmbr, Hsng_Scty_Flrs_Sctn_Name) REFERENCES HSNG_SCTY_SCTN_DTLS(Hsng_Scty_Sctn_Dtls_Regn_Nmbr, Hsng_Scty_Sctn_Dtls_Name)
 );

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		1
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	1
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		2
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	2
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		3
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	3
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		4
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	4
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		5
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	5
);


INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		6
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	6
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		7
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	7
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		8
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	8
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'A',
		9
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'A'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	9
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		1
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	1
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		2
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	2
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		3
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	3
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		4
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	4
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		5
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	5
);


INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		6
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	6
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		7
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	7
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		8
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	8
);

INSERT INTO HSNG_SCTY_FLRS (
	Hsng_Scty_Flrs_Regn_Nmbr, 
	Hsng_Scty_Flrs_Sctn_Name,
	Hsng_Scty_Flrs_Flor_Nmbr
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		9
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_FLRS 
				WHERE 	Hsng_Scty_Flrs_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Flrs_Sctn_Name	=	'B'								AND
						Hsng_Scty_Flrs_Flor_Nmbr	=	9
);


--	Start of HSNG_SCTY_APMT

CREATE TABLE IF NOT EXISTS HSNG_SCTY_APMT
(
    Hsng_Scty_Apmt_Regn_Nmbr		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Apmt_Sctn_Name		VARCHAR(255)	NOT NULL,
    Hsng_Scty_Apmt_Flor_Nmbr		BIGINT			NOT NULL,
    Hsng_Scty_Apmt_Nmbr				BIGINT			NOT NULL,
    Hsng_Scty_Apmt_Size				BIGINT			NOT NULL,
    Hsng_Scty_Apmt_Size_Unit		VARCHAR(255)	NOT NULL,
    
    PRIMARY KEY (Hsng_Scty_Apmt_Regn_Nmbr, Hsng_Scty_Apmt_Sctn_Name, Hsng_Scty_Apmt_Flor_Nmbr, Hsng_Scty_Apmt_Nmbr),
	FOREIGN KEY (Hsng_Scty_Apmt_Regn_Nmbr, Hsng_Scty_Apmt_Sctn_Name, Hsng_Scty_Apmt_Flor_Nmbr) REFERENCES HSNG_SCTY_FLRS(Hsng_Scty_Flrs_Regn_Nmbr, Hsng_Scty_Flrs_Sctn_Name, Hsng_Scty_Flrs_Flor_Nmbr)
 );

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		1,
		101,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	1								AND
						Hsng_Scty_Apmt_Nmbr			=	101
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		1,
		102,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	1								AND
						Hsng_Scty_Apmt_Nmbr			=	102
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		2,
		201,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	2								AND
						Hsng_Scty_Apmt_Nmbr			=	201
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		2,
		202,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	2								AND
						Hsng_Scty_Apmt_Nmbr			=	202
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		3,
		301,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	3								AND
						Hsng_Scty_Apmt_Nmbr			=	301
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		3,
		302,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	3								AND
						Hsng_Scty_Apmt_Nmbr			=	302
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		3,
		303,
		2000,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	3								AND
						Hsng_Scty_Apmt_Nmbr			=	303
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		4,
		401,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	4								AND
						Hsng_Scty_Apmt_Nmbr			=	401
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		4,
		402,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	4								AND
						Hsng_Scty_Apmt_Nmbr			=	402
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		4,
		403,
		1400,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	4								AND
						Hsng_Scty_Apmt_Nmbr			=	403
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		4,
		404,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	4								AND
						Hsng_Scty_Apmt_Nmbr			=	404
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		5,
		501,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	5								AND
						Hsng_Scty_Apmt_Nmbr			=	501
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		5,
		502,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	5								AND
						Hsng_Scty_Apmt_Nmbr			=	502
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		5,
		504,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	5								AND
						Hsng_Scty_Apmt_Nmbr			=	504
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		6,
		601,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	6								AND
						Hsng_Scty_Apmt_Nmbr			=	601
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		6,
		602,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	6								AND
						Hsng_Scty_Apmt_Nmbr			=	602
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		6,
		603,
		1400,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	6								AND
						Hsng_Scty_Apmt_Nmbr			=	603
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		6,
		604,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	6								AND
						Hsng_Scty_Apmt_Nmbr			=	604
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		7,
		701,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	7								AND
						Hsng_Scty_Apmt_Nmbr			=	701
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		7,
		702,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	7								AND
						Hsng_Scty_Apmt_Nmbr			=	702
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		7,
		704,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	7								AND
						Hsng_Scty_Apmt_Nmbr			=	704
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		8,
		801,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	8								AND
						Hsng_Scty_Apmt_Nmbr			=	801
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		8,
		802,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	8								AND
						Hsng_Scty_Apmt_Nmbr			=	802
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		8,
		803,
		1400,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	8								AND
						Hsng_Scty_Apmt_Nmbr			=	803
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		8,
		804,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	8								AND
						Hsng_Scty_Apmt_Nmbr			=	804
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		9,
		901,
		1575,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	9								AND
						Hsng_Scty_Apmt_Nmbr			=	901
);


INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		9,
		902,
		1525,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	9								AND
						Hsng_Scty_Apmt_Nmbr			=	902
);

INSERT INTO HSNG_SCTY_APMT (
	Hsng_Scty_Apmt_Regn_Nmbr, 
	Hsng_Scty_Apmt_Sctn_Name,
	Hsng_Scty_Apmt_Flor_Nmbr,
	Hsng_Scty_Apmt_Nmbr,
	Hsng_Scty_Apmt_Size,
	Hsng_Scty_Apmt_Size_Unit
)
SELECT	'REG/SRT/SA(HAA) 02468/2016',
		'B',
		9,
		904,
		1200,
		'Square Feet'
WHERE NOT EXISTS (
	SELECT 1	FROM	HSNG_SCTY_APMT
				WHERE 	Hsng_Scty_Apmt_Regn_Nmbr	=	'REG/SRT/SA(HAA) 02468/2016'	AND
						Hsng_Scty_Apmt_Sctn_Name	=	'B'								AND
						Hsng_Scty_Apmt_Flor_Nmbr	=	9								AND
						Hsng_Scty_Apmt_Nmbr			=	904
);

