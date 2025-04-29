# Use OpenJDK 17 base image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy your project
COPY casestudy/ /app/casestudy/

# Debugging step
RUN ls -R /app/casestudy

# Compile Java files manually by listing subfolders
RUN javac casestudy/realconstructor/*.java casestudy/lemigohotel/*.java casestudy/rwandanationalpolice/*.java

# Set the program to run (example: Police system)
CMD ["java", "casestudy.rwandanationalpolice.RwandaPoliceMain"]