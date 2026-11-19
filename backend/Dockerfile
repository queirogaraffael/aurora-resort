# ==========================================
# Estágio 1: Build / Gerar o JAR
# ==========================================
FROM eclipse-temurin:17-jdk-alpine AS builder

WORKDIR /app

# Copia arquivos de configuração do Gradle para cache de dependências
COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Garante permissão de execução do wrapper
RUN chmod +x ./gradlew

# Faz o download das dependências offline
RUN ./gradlew dependencies --no-daemon || true

# Copia o código-fonte e gera o pacote JAR
COPY src src
RUN ./gradlew bootJar --no-daemon -x test

# ==========================================
# Estágio 2: Runtime / Executar o JAR
# ==========================================
FROM eclipse-temurin:17-jre-alpine AS runner

WORKDIR /app

# Cria usuário não-root por boas práticas de segurança
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# Copia o jar gerado no estágio anterior
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
