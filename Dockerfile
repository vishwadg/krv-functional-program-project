FROM openjdk
WORKDIR /app
COPY . .
WORKDIR /app/src
CMD ["javac", "Main.java"]
CMD ["java", "Main"]
