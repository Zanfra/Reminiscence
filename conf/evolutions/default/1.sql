# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id						integer not null,
  label						varchar);

create table context (
  context_id                bigint not null,
  person_for_id             bigint,
  enabled                   boolean,
  constraint pk_context primary key (context_id))
;

create table fuzzy_date (
  fuzzy_date_id             bigint not null,
  decade                    integer,
  year                      integer,
  month                     integer,
  day                       integer,
  textual_date              varchar(255),
  constraint pk_fuzzy_date primary key (fuzzy_date_id))
;

create table location (
  location_id               bigint not null,
  country                   varchar(255),
  region                    varchar(255),
  city                      varchar(255),
  location_textual          varchar(255),
  constraint pk_location primary key (location_id))
;

create table public_memento (
  public_memento_id         bigint not null,
  headline                  varchar(255),
  text                      varchar(255),
  type                      varchar(255),
  resource_type             varchar(255),
  category                  varchar(255),
  resource_url              varchar(255),
  author                    varchar(255),
  locale                    varchar(255),
  creation_date             timestamp,
  resource_thumbnail_url    varchar(255),
  source                    varchar(255),
  source_url                varchar(255),
  fuzzy_startdate           bigint,
  location_start_id         bigint,
  fuzzy_enddate             bigint,
  location_end_id           bigint,
  constraint pk_public_memento primary key (public_memento_id))
;

create table task (
  id                        bigint not null,
  label                     varchar(255),
  constraint pk_task primary key (id))
;

create sequence context_seq;

create sequence fuzzy_date_seq;

create sequence location_seq;

create sequence public_memento_seq;

create sequence task_seq;

alter table public_memento add constraint fk_public_memento_startDate_1 foreign key (fuzzy_startdate) references fuzzy_date (fuzzy_date_id) on delete restrict on update restrict;
create index ix_public_memento_startDate_1 on public_memento (fuzzy_startdate);
alter table public_memento add constraint fk_public_memento_startId_2 foreign key (location_start_id) references location (location_id) on delete restrict on update restrict;
create index ix_public_memento_startId_2 on public_memento (location_start_id);
alter table public_memento add constraint fk_public_memento_endDate_3 foreign key (fuzzy_enddate) references fuzzy_date (fuzzy_date_id) on delete restrict on update restrict;
create index ix_public_memento_endDate_3 on public_memento (fuzzy_enddate);
alter table public_memento add constraint fk_public_memento_endId_4 foreign key (location_end_id) references location (location_id) on delete restrict on update restrict;
create index ix_public_memento_endId_4 on public_memento (location_end_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists context;

drop table if exists fuzzy_date;

drop table if exists location;

drop table if exists public_memento;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists context_seq;

drop sequence if exists fuzzy_date_seq;

drop sequence if exists location_seq;

drop sequence if exists public_memento_seq;

drop sequence if exists task_seq;

