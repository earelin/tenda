# Tenda

Internet commerce site demo

```mermaid
flowchart TD

    A[REST Interface] -->|command| B[Kafka]
    B --> D[Event DB]
    A -->|query - HTTP| C[Microservices]
    B -->|event - subscription| C
    C -->|event - publish| B
```
