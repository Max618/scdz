--
-- PostgreSQL database dump
--

-- Dumped from database version 10.5 (Ubuntu 10.5-0ubuntu0.18.04)
-- Dumped by pg_dump version 10.5 (Ubuntu 10.5-0ubuntu0.18.04)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: employees; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.employees (
    id integer NOT NULL,
    name character varying(255),
    email character varying(255),
    password character varying(255),
    address character varying(255),
    cpf character varying(14),
    salary numeric(15,2),
    created_at timestamp
);


ALTER TABLE public.employees OWNER TO homestead;

--
-- Name: employees_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.employees_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.employees_id_seq OWNER TO homestead;

--
-- Name: employees_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.employees_id_seq OWNED BY public.employees.id;


--
-- Name: products; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.products (
    id integer NOT NULL,
    name character varying(255),
    quantity integer,
    price numeric(15,2),
    provider_id integer NOT NULL,
    created_at timestamp
);


ALTER TABLE public.products OWNER TO homestead;

--
-- Name: products_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.products_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.products_id_seq OWNER TO homestead;

--
-- Name: products_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.products_id_seq OWNED BY public.products.id;


--
-- Name: providers; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.providers (
    id integer NOT NULL,
    name character varying(255),
    cnpj character varying(50),
    email character varying(255),
    phone character varying(20),
    address character varying(255),
    created_at timestamp
);


ALTER TABLE public.providers OWNER TO homestead;

--
-- Name: providers_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.providers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.providers_id_seq OWNER TO homestead;

--
-- Name: providers_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.providers_id_seq OWNED BY public.providers.id;


--
-- Name: reports; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.reports (
    id integer NOT NULL,
    type character varying(255),
    created_at timestamp without time zone,
    start_date date,
    end_date date
);


ALTER TABLE public.reports OWNER TO homestead;

--
-- Name: reports_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.reports_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.reports_id_seq OWNER TO homestead;

--
-- Name: reports_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.reports_id_seq OWNED BY public.reports.id;


--
-- Name: sale_product; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.sale_product (
    id integer NOT NULL,
    quantity integer NOT NULL,
    sale_id integer NOT NULL,
    product_id integer NOT NULL,
    created_at timestamp
);


ALTER TABLE public.sale_product OWNER TO homestead;

--
-- Name: sale_product_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.sale_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sale_product_id_seq OWNER TO homestead;

--
-- Name: sale_product_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.sale_product_id_seq OWNED BY public.sale_product.id;


--
-- Name: sales; Type: TABLE; Schema: public; Owner: homestead
--

CREATE TABLE public.sales (
    id integer NOT NULL,
    date timestamp without time zone,
    value numeric(15,2),
    employee_id integer NOT NULL,
    created_at timestamp
);


ALTER TABLE public.sales OWNER TO homestead;

--
-- Name: sales_id_seq; Type: SEQUENCE; Schema: public; Owner: homestead
--

CREATE SEQUENCE public.sales_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sales_id_seq OWNER TO homestead;

--
-- Name: sales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: homestead
--

ALTER SEQUENCE public.sales_id_seq OWNED BY public.sales.id;


--
-- Name: employees id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.employees ALTER COLUMN id SET DEFAULT nextval('public.employees_id_seq'::regclass);


--
-- Name: products id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.products ALTER COLUMN id SET DEFAULT nextval('public.products_id_seq'::regclass);


--
-- Name: providers id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.providers ALTER COLUMN id SET DEFAULT nextval('public.providers_id_seq'::regclass);


--
-- Name: reports id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.reports ALTER COLUMN id SET DEFAULT nextval('public.reports_id_seq'::regclass);


--
-- Name: sale_product id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sale_product ALTER COLUMN id SET DEFAULT nextval('public.sale_product_id_seq'::regclass);


--
-- Name: sales id; Type: DEFAULT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sales ALTER COLUMN id SET DEFAULT nextval('public.sales_id_seq'::regclass);


--
-- Data for Name: employees; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.employees (id, name, email, password, address, cpf, salary) FROM stdin;
\.


--
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.products (id, name, quantity, price, provider_id) FROM stdin;
\.


--
-- Data for Name: providers; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.providers (id, name, cnpj, email, phone, address) FROM stdin;
\.


--
-- Data for Name: reports; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.reports (id, type, created_at, start_date, end_date) FROM stdin;
\.


--
-- Data for Name: sale_product; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.sale_product (id, quantity, sale_id, product_id) FROM stdin;
\.


--
-- Data for Name: sales; Type: TABLE DATA; Schema: public; Owner: homestead
--

COPY public.sales (id, date, value, employee_id) FROM stdin;
\.


--
-- Name: employees_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.employees_id_seq', 1, false);


--
-- Name: products_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.products_id_seq', 1, false);


--
-- Name: providers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.providers_id_seq', 1, false);


--
-- Name: reports_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.reports_id_seq', 1, false);


--
-- Name: sale_product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.sale_product_id_seq', 1, false);


--
-- Name: sales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: homestead
--

SELECT pg_catalog.setval('public.sales_id_seq', 1, false);


--
-- Name: employees employees_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);


--
-- Name: products products_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);


--
-- Name: providers providers_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.providers
    ADD CONSTRAINT providers_pkey PRIMARY KEY (id);


--
-- Name: reports reports_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.reports
    ADD CONSTRAINT reports_pkey PRIMARY KEY (id);


--
-- Name: sale_product sale_product_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sale_product
    ADD CONSTRAINT sale_product_pkey PRIMARY KEY (id);


--
-- Name: sales sales_pkey; Type: CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sales_pkey PRIMARY KEY (id);


--
-- Name: products products_provider_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_provider_id_fkey FOREIGN KEY (provider_id) REFERENCES public.providers(id);


--
-- Name: sale_product sale_product_product_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sale_product
    ADD CONSTRAINT sale_product_product_id_fkey FOREIGN KEY (product_id) REFERENCES public.products(id);


--
-- Name: sale_product sale_product_sale_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sale_product
    ADD CONSTRAINT sale_product_sale_id_fkey FOREIGN KEY (sale_id) REFERENCES public.sales(id);


--
-- Name: sales sales_employee_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: homestead
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sales_employee_id_fkey FOREIGN KEY (employee_id) REFERENCES public.employees(id);


--
-- PostgreSQL database dump complete
--

