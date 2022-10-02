#  <p align="center">ParserFromXMLToJSON</p> 

<p align="center">
  <img src="https://user-images.githubusercontent.com/86559678/193443619-5a51c341-e218-467d-8b49-d2dfe0ef8f23.jpg" />
</p>

> ### The application handles the process of converting one or multiple XML file(s) to JSON file(s). 

## General Functionality 
- The application reads the XML file(s) from the input file located in the resources file.
- The XML file(s) are processed with the help of XML annotations.
- The JSON file(s) are exported in the output file located in the resources file.


## How to install
Make sure you have [Maven (Windows)](https://www.educba.com/install-maven/) or [Maven (Linux)](https://www.journaldev.com/33588/install-maven-linux-ubuntu) install.
Open the project by right-click the pom.xml and selecting your favorite editor (might take a minute for the dependencies to install).

Verify that maven is installed:

`mvn --version`

Build project:

`mvn package`

## Getting Started
The client needs to create new folder named `resources` align to the folder named `java`. Under the folder just created, create new folders: `input` and `output` and new file named `config.properties`.

Then, in the file just created, create two proties named: `inputPathFile` and `outputPathFile` which every one will contain the path of input folder as well as output file. This can be achieved by pressing right-click once on the input file and select `Copy Path/Reference ...` and select `Path From Content Root`. It is important to add a `/` to every property to read the imported XML file(s).
