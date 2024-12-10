# Create a stage for resolving and downloading dependencies.
FROM eclipse-temurin:18-jdk-jammy AS build

#Set Work DIR
WORKDIR /build

# Copy the Java source file.
COPY javaClass.java .

# Create a user for running the application.
ARG UID=10001
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "/nonexistent" \
    --shell "/sbin/nologin" \
    --no-create-home \
    --uid "${UID}" \
    appuser

# Change the ownership of the /build directory to the appuser.
RUN chown -R appuser:appuser /build
USER appuser

# Compile the Java source file.
RUN javac javaClass.java
CMD ["java", "-Djava.util.prefs.systemRoot=/dev/null", "javaClass"]
