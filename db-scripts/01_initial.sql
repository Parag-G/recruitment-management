CREATE DATABASE recruitment_management;

USE recruitment_management;

CREATE TABLE recruitment_management.DOMAIN_MASTER (
    domain_master_id int unsigned primary key auto_increment,
    domain_name varchar(30) not null unique,
    domain_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null
);

CREATE TABLE recruitment_management.JOB_TYPE_MASTER (
    job_type_master_id int unsigned primary key auto_increment,
    job_type_name varchar(50) unique not null,
    job_type_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null
);

CREATE TABLE recruitment_management.JOB_DESCRIPTION (
    job_description_id int unsigned primary key auto_increment,
    domain_master_id int unsigned not null,
    job_position varchar(20) not null,
    experience varchar(50) not null,
    vacancies int not null,
    job_type_master_id int unsigned not null,
    job_description_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key(domain_master_id) references recruitment_management.DOMAIN_MASTER(domain_master_id),
    foreign key(job_type_master_id) references recruitment_management.JOB_TYPE_MASTER(job_type_master_id)
);

CREATE TABLE recruitment_management.JD_REQUIRED_SKILL (
    jd_required_skill_id int unsigned primary key auto_increment,
    job_description_id int unsigned not null,
    skill_id int not null,
    skill_name varchar(20) not null,
    jd_required_skill_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (job_description_id) references JOB_DESCRIPTION (job_description_id)
);

CREATE TABLE recruitment_management.SOURCE_MASTER (
    source_master_id int unsigned primary key auto_increment,
    source_name varchar(20) not null,
    source_status int(1) not null,
    comments varchar(50),
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null
);


CREATE TABLE recruitment_management.CANDIDATE (
    candidate_id int unsigned primary key auto_increment,
    candidate_first_name varchar(30) not null,
    candidate_middle_name varchar(30),
    candidate_last_name varchar(30) not null,
    candidate_address varchar(500) not null,
    candidate_phone varchar(30) not null,
    candidate_email_address varchar(50) not null,
    source_master_id int unsigned not null,
    candidate_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (source_master_id) references SOURCE_MASTER (source_master_id)
);

CREATE TABLE recruitment_management.REFERRAL_DETAILS (
    referral_id int unsigned primary key unique auto_increment,
    candidate_id int unsigned not null,
    employee_id int not null,
    emplpoyee_email_address varchar(30) not null,
    referral_detials_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (candidate_id) references CANDIDATE (candidate_id)
);

CREATE TABLE recruitment_management.INTERVIEWER (
    interviewer_id int unsigned primary key auto_increment,
    employee_id int not null,
    employee_email_address varchar(30) not null,
    skill_id int not null,
    skill_name varchar(20) not null,
    round_level int not null,
    interviewer_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null
);

CREATE TABLE INTERVIEWER_SKILL(
	interviewer_skill_id int unsigned primary key auto_increment, 
    interviewer_id int unsigned,
    skill_id int,
    skill_name varchar(50),
    interviewer_skill_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (interviewer_id) references INTERVIEWER (interviewer_id)
);

CREATE TABLE recruitment_management.INTERVIEW (
    interview_id int unsigned primary key auto_increment,
    candidate_id int unsigned not null,
    employee_id int not null,
    comments varchar(200),
    round_number int not null,
    result varchar(10) not null,
    interview_time timestamp not null,
    interview_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (candidate_id) references CANDIDATE (candidate_id)
);

CREATE TABLE recruitment_management.SELECTED_CANDIDATE (
    selected_candidate_id int unsigned primary key unique auto_increment,
    candidate_id int unsigned not null,
    joining_status int not null,
    expected_joining_date timestamp not null,
    comments varchar(500),
    offer_letter_sent_status int(1) not null,
    offer_letter_sent_on timestamp not null,
    selected_candidate_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (candidate_id) references CANDIDATE (candidate_id)
);