# HNG12 Backend Task - Public API to Retrieve Basic Information

Welcome to my solution for the HNG12 Backend Stage 0 task! This project provides a public API to retrieve basic information such as my registered email address, the current date and time in ISO 8601 format, and the GitHub URL of the project's codebase.

## API Endpoint

**URL:** `https://hngtaskzero-production.up.railway.app/api`

**Method:** `GET`

### Example Response

```json
{
  "email": "ayomidefalade@gmail.com",
  "current_datetime": "2025-01-29T11:34:13.604564883Z",
  "github_url": "https://github.com/dmadindividual/hng_task_zero.git"
}
```

## Requirements

- **Technology Stack:**
  - Backend Framework: Java Spring Boot
  - Deployment: Railway (Publicly accessible endpoint)
  - CORS handling: The API is configured to handle CORS properly.
  - Response Format: The API responds with JSON.

- **Repository Hosting:**
  - GitHub: [HNG Task Zero GitHub Repository](https://github.com/dmadindividual/hng_task_zero.git)
  - Repository Visibility: Public

## Setup Instructions

To run the project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/dmadindividual/hng_task_zero.git
   ```
2. Navigate to the project directory:
   ```bash
   cd hng_task_zero
   ```
3. Install dependencies:
   ```bash
   ./mvnw clean install
   ```
4. Run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

The API should now be running locally at `http://localhost:8080/api`.

## API Documentation

### Endpoint: `GET /api`

#### Request

- **Method:** GET
- **URL:** `/api`

#### Response

The response is in JSON format and includes the following fields:

- **email**: The registered email address (used to register on the HNG12 Slack workspace).
- **current_datetime**: The current date and time in ISO 8601 format (UTC).
- **github_url**: The GitHub URL for the project's codebase.

#### Example Response

```json
{
  "email": "ayomidefalade@gmail.com",
  "current_datetime": "2025-01-29T11:34:13.604564883Z",
  "github_url": "https://github.com/dmadindividual/hng_task_zero.git"
}
```

## Backlink

For more details on hiring Java developers, check out: [HNG Java Developers](https://hng.tech/hire/java-developers)

## Deployment

The API is deployed on [Railway](https://railway.app/), and you can access it publicly through the following link:

**Production Endpoint:** [https://hngtaskzero-production.up.railway.app/api](https://hngtaskzero-production.up.railway.app/api)

### Performance

- The response time is optimized to be under 500ms.

## Conclusion

This project successfully implements a public API in Java Spring Boot, fulfilling the requirements of the HNG12 Backend task. It returns the requested information in JSON format, handles CORS appropriately, and is deployed on a public endpoint.
