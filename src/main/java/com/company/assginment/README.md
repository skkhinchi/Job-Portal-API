
You sholud create all the tables for perform these API calls:
1: To create a new Candidate *
2:To update existing Candidate *
3:Show All the Candidates  *
4:Show candidate details by ID  *
5:For each candidate, which are the jobs they have applied for *
6: To create a new company  *
7:To update existing company *
8:Show company details by ID  *
9:Show All the companies  *
10: To create new jobs for a company.  *
11:To update existing job for the company *
12:Show All the Jobs  *
13: Show all available Jobs in Companies by particular Post *
14:Show All Candidate which they are Applied & With Status *
15: Update Job Status by id *
16: Get the status of candidate application of Job by Candidate ID *
17: For each job, which candidates have applied for the job *


Create Database : Company

Cadidate Table:

CREATE TABLE `candidates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `mobile_no` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) 

Company Table:

CREATE TABLE `companies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comp_name` varchar(45) NOT NULL,
  `comp_city` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) 


Job Table:

CREATE TABLE `jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `post` varchar(45) NOT NULL,
  `comp_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) 



Canjobmix Table:

CREATE TABLE `canjobsmix` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cand_id` int(11) NOT NULL,
  `job_id` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
)


