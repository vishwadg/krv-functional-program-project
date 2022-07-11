FROM openjdk
WORKDIR /app
COPY . .
WORKDIR /app/src
RUN ["javac", "Main.java"]
CMD ["java", "Main"]
