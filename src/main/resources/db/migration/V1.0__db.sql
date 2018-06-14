
-- +migrate Up
create table oauth_clients
(
	id int unsigned auto_increment
		primary key,
	status tinyint(1) unsigned default '0' not null comment 'Вкл./выкл.',
	name varchar(200) not null comment 'Название',
	client_id varchar(200) not null comment 'client_id',
	client_secret varchar(200) not null comment 'client_secret',
	template varchar(50) null comment 'Внешний вид',
	ip varchar(96) not null comment 'IP-адрес клиента',
	url varchar(255) not null comment 'Адрес сайта',
	scope varchar(255) null comment 'Права доступа'
);

create index oauth_client_client_id_index
	on oauth_clients (client_id)
;

create index oauth_client_client_secret_index
	on oauth_clients (client_secret)
;

create index oauth_client_status_index
	on oauth_clients (status)
;

create table users
(
	id int unsigned auto_increment primary key,
	created_at timestamp default CURRENT_TIMESTAMP null comment 'Время создания',
	updated_at datetime null comment 'Время обновления',
	changed_at datetime null comment 'Время изменения',
	last_visit datetime null comment 'Последний вход',
	creator_id int unsigned null comment 'Создатель записи',
	editor_id int unsigned null comment 'Редактор записи',
	status tinyint(1) unsigned default '0' null comment 'Вкл./выкл.',
	merged text null comment 'Объединенные пользователи',
	nickname varchar(50) null comment 'Отображаемое имя',
	first_name varchar(100) null comment 'Имя',
	father_name varchar(100) null comment 'Отчество',
	last_name varchar(100) null comment 'Фамилия',
	birth_date date null comment 'Дата рождения',
	gender enum('m', 'f') null comment 'Пол',
	language varchar(255) null
);

create index users_creator_id_index
	on users (creator_id)
;

create index users_editor_id_index
	on users (editor_id)
;


create table passwords
(
	id int unsigned auto_increment
		primary key,
	user_id int unsigned not null,
	password varchar(32) null,
	created_at timestamp default CURRENT_TIMESTAMP not null,
	code varchar(100) null comment 'Код подтверждения'
);

create index passwords_code_index
	on passwords (code)
;

create index passwords_user_id_index
	on passwords (user_id)
;

create index passwords_password_index
	on passwords (password)
;


create table emails
(
	id int unsigned auto_increment primary key,
	user_id int unsigned not null,
	oauth varchar(255) null comment 'К каким внешним oauth-сервисам относится',
	email varchar(100) not null comment 'Адрес e-mail',
	status tinyint(1) unsigned default 1 not null comment 'Вкл./выкл.',
	is_default tinyint(1) unsigned default 0 not null comment 'Основной',
	confirm_date datetime null comment 'Подтвержден',
	code varchar(90) null comment 'Код активации',
	created_at timestamp default CURRENT_TIMESTAMP not null comment 'Создан'
);

create index emails_confirm_date_index
	on emails (confirm_date)
;

create index emails_email_index
	on emails (email)
;

create index emails_oauth_index
	on emails (oauth)
;

create index emails_user_id_index
	on emails (user_id)
;

create index emails_status_index
	on emails (status)
;


create table oauth_sessions
(
	id int unsigned auto_increment primary key,
	client_id int unsigned not null comment 'Клиент',
	user_id int unsigned null comment 'Пользователь',
	access_granted_at timestamp default CURRENT_TIMESTAMP not null comment 'Доступ открыт',
	access_expires_at datetime not null comment 'Доступ истекает',
	offset int(10) default '0' not null comment 'Разница во времени (сек, клиент - сервер)',
	code varchar(255) null comment 'Временный код',
	access_token varchar(100) null comment 'Код доступа',
	user_agent text null comment 'User Agent',
	remote_addr varchar(25) null comment 'REMOTE_ADDR',
	http_referer varchar(255) null comment 'HTTP_REFERER',
	constraint `UNIQUE`
		unique (client_id, user_id)
)
;

create index oauth_sessions_access_token_index
	on oauth_sessions (access_token)
;

create index oauth_sessions_access_expires_at_index
	on oauth_sessions (access_expires_at)
;

create index oauth_sessions_client_id_index
	on oauth_sessions (client_id)
;

create index oauth_sessions_user_id_index
	on oauth_sessions (user_id)
;


create table phones
(
	id int unsigned auto_increment
		primary key,
	user_id int unsigned not null,
	oauth varchar(255) null comment 'К каким внешним oauth-сервисам относится',
	phone bigint unsigned not null comment 'Номер телефона',
	status tinyint(1) default '1' not null comment 'Вкл./выкл.',
	is_default tinyint(1) default '0' not null comment 'Основной',
	confirm_date datetime null comment 'Подтвержден',
	code varchar(90) null comment 'Код активации',
	created_at datetime default CURRENT_TIMESTAMP not null comment 'Время создания'
)
;

create index phones_confirm_date_index
	on phones (confirm_date)
;

create index phones_oauth_index
	on phones (oauth)
;

create index phones_phone_index
	on phones (phone)
;

create index phones_status_index
	on phones (status)
;

create index phones_user_id_index
	on phones (user_id)
;


create table roles
(
	id int unsigned auto_increment
		primary key,
	code varchar(50) not null comment 'Код роли',
	name varchar(50) not null comment 'Название',
	description varchar(255) null comment 'Описание',
	synthetic tinyint(1) default '0' not null comment 'Синтетическая роль',
	created_at timestamp default CURRENT_TIMESTAMP null comment 'Время создания',
	updated_at datetime null comment 'Время обновления',
	creator_id int unsigned null comment 'Создатель записи',
	editor_id int unsigned null comment 'Редактор записи',
	status tinyint(1) unsigned default '0' null comment 'Вкл./выкл.',
	constraint code
		unique (code),
	constraint name
		unique (name)
)
comment 'Роли пользователей'
;

create index roles_creator_id_index
	on roles (creator_id)
;

create index roles_editor_id_index
	on roles (editor_id)
;


create table user_role
(
	id int unsigned auto_increment
		primary key,
	created_at timestamp default CURRENT_TIMESTAMP null,
	user_id int unsigned not null,
	role_id int unsigned not null,
	constraint user_role_user_id_role_id_unique
		unique (user_id, role_id)
)
;

create index user_role_role_id_index
	on user_role (role_id)
;

create index user_role_user_id_index
	on user_role (user_id)
;
