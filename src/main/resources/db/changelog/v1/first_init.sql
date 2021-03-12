
CREATE TABLE public.users
(
    id bigint NOT NULL,
    email varchar(50) NOT NULL,
    password varchar(20),
    CONSTRAINT user_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;

-- Table: public.roles

-- DROP TABLE public.roles;

CREATE TABLE public.roles
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT roles_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.roles
    OWNER to postgres;

-- Table: public.users_roles

-- DROP TABLE public.users_roles;

CREATE TABLE public.users_roles
(
    user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    CONSTRAINT fk_roles FOREIGN KEY (role_id)
        REFERENCES public.roles (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_users FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

    TABLESPACE pg_default;

ALTER TABLE public.users_roles
    OWNER to postgres;

INSERT INTO public.roles(
    id, name)
VALUES (1, 'USER');
INSERT INTO public.roles(
    id, name)
VALUES (2, 'MANAGER');
INSERT INTO public.roles(
    id, name)
VALUES (3, 'ADMIN');