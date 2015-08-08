[![Build Status](https://travis-ci.org/rajatguptarg/twu-biblioteca-rajatg.svg?branch=master)](https://travis-ci.org/rajatguptarg/twu-biblioteca-rajatg)

Biblioteca
===========

This is Library Management System which is used to manage the library operations. The operations are following:

**[1]** List All Books/Movies from Library

**[2]** Check Out books/movies from Library

**[3]** Return Books/Movies to Library

**[4]** List of Users who checked out items from library

Requirements
============
**[1]** IntelliJ IDEA

**[2]** JDK 7

**[3]** Ant

**[4]** JUnit 4.11

**[5]** Hamcrest 1.3

**[6]** Mockito 1.9.5

How to Compile Project
=======================

if you want to compile the project using Ant Build Tool, just go to project directory 
using the shell and fire following command in to shell:

    $ ant compile

How to Run JUnit Tests
=======================

If you want to run JUnit Tests, just go to project directory using the shell 
and fire following command in to shell:

    $ ant runjunit

How To Create Jar
=================

If you want to create JAR file of this application, just go to project directory using the shell
and fire following command in to shell:
    
    $ ant createjar

How To Run
===========

To run your Application, there are two ways:

**[1]** Open this project in IntelliJ, then run Main class by pressing **Options+Shift+F10**.

**[2]** Go to project directory from shell and type following command in shell:
    
    $ ant run
