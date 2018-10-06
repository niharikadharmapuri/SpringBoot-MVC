# SpringBoot MVC project:
This project is an implementation of MVC(Model View Controller) model.

# Using Amazon RDS:
        create an data base on Amazon RDS, use the endpoint for storing data for spring boot application.
# Running the SpringBoot application on EC2:
    create an EC2 instance on Amazon
    ssh form your local machine to the instance using:
        ssh -i ....pem ubuntu@publicIP
    install nginx on top of the remote
        sudo apt-get update
        sudo apt-get install nginx
    install java and mysql on the remote machine
        sudo apt-get update
        sudo add-apt-repository ppa:webupd8team/java
        sudo apt-get install oracle-java8-installer
    Create a jar file by running the maven
    run the SpringBoot jar on the remote machine using the command:
    java -jar .....pem .....jar
    
You can access the application at DNSaddress:8080/api (you can change the port in spring application if you want. )

#Load balancing with nginx:
    create a config file and add location and upsteam apiservers- add the ip addresses of the ec2 machines
    
# Dockerize the application
    Add Dockerfile to the applciatiion and add the jar file
    build the image using:
        docker build -f Dockerfile -t  dockerimagename
    run the image using:
        docker run -p 8099:8085  dockerimagename