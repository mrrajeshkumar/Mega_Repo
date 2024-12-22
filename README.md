Running the Project with Docker
This project contains a single controller with a GET mapping that returns string data for demonstration purposes.

Steps to Run with Docker
Build the Project
Open the project in your IDE and use Maven to install dependencies:

bash
Copy code
mvn install
Prepare Docker

Ensure Docker Desktop is running.
Navigate to the parent directory where the Dockerfile is located.
Build Docker Image
Run the following command in your Docker CLI to build the Docker image:

bash
Copy code
docker build -t <image_name> .
Verify Docker Image
Check if the image was created successfully:

bash
Copy code
docker images
Run the Docker Image
Use the following command to start a container from the image:

bash
Copy code
docker run -p 8080:8080 <image_name>
Access the Application
Visit http://localhost:8080 in your browser to test the GET endpoint.

Notes
Replace <image_name> with your desired image name when building and running the Docker image.
Ensure port 8080 is not already in use on your system.
