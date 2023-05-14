# Tenda

Internet commerce site demo

```mermaid
flowchart TD

    A[REST Interface] -->|command| B[Kafka]
    B --> D[Event DB]
    A -->|query - HTTP| C[Microservices]
    B -->|subscription| C
    C -->|publish| B
```
