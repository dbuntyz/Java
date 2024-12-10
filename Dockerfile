# Build stage
FROM eclipse-temurin:18-jdk-jammy AS build

# Set working directory
WORKDIR /build

# Copy Java source file
COPY kkk.java .

# Compile the Java source file
RUN javac kkk.java

# Runtime stage
FROM eclipse-temurin:18-jre-jammy

# Create non-root user
ARG UID=10001
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "/nonexistent" \
    --shell "/sbin/nologin" \
    --no-create-home \
    --uid "${UID}" \
    appuser

# Switch to non-root user
USER appuser

# Copy compiled Java classes from the build stage
WORKDIR /app
COPY --from=build /build/kkk.class .

# Expose required port (if the application runs on a port)
# EXPOSE 8080 # Uncomment if applicable

# Entry point for the application
ENTRYPOINT ["java"]
CMD ["-Djava.util.prefs.systemRoot=/dev/null", "kkk"]
