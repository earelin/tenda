# Tenda

Internet commerce site demo

```mermaid
flowchart TD
    subgraph Microservices
        direction LR 
        MA[Order] 
        MB[Catalog]
        MC[Warehouse]
        MD[Customer]
        ME[Checkout]
        MF[Delivery]
    end
    A[API Gateway] -->|command| B[Kafka]
    B --> D[Event DB]
    A -->|query - gRPC| Microservices
    B -->|subscription| Microservices
    Microservices -->|publish| B
    E[Application] -->|REST| A
```
