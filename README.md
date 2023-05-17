# Tenda

Internet commerce site demo

```mermaid
flowchart TD 
    A[API Gateway] -->|command| B[Kafka]
    B --> D[Event DB]
    A -->|query - gRPC| C[Microservices]
    B -->|subscription| C
    C -->|publish| B
    E[Application] -->|REST| A
```
