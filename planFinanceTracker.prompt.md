## Plan: Finance Tracker Repo Roadmap

TL;DR: Turn this repo into a real finance tracking app by moving from a placeholder Vue + Spring Boot starter to a connected frontend/backend product with finance domain models, API integration, auth, tests, and deployment readiness.

**Steps**
1. Audit current code and fix the core integration issue.
   - Replace the mocked API client in `client/src/api/axios.js` with a real axios instance pointing to `http://localhost:8080`.
   - Update `client/src/App.vue` to use meaningful finance data and remove the placeholder greeting/person list.
   - Confirm `server/src/main/java/com/finance/server/controller/HelloController.java` is replaced or extended by finance-focused endpoints.

2. Define the finance domain.
   - Add backend entities for `Transaction`, `Account`, and `Category` (and optionally `Budget`).
   - Add repositories and service layers for these entities.
   - Build REST controllers under `/api/transactions`, `/api/accounts`, `/api/categories`.

3. Implement frontend finance UI.
   - Create reusable Vue components in `client/src/components/` for transaction list, add/edit transaction form, account summary, and dashboard.
   - Use Tailwind classes consistently and optionally leverage `naive-ui` components if desired.
   - Add client-side page state and form validation.

4. Improve backend configuration and infrastructure.
   - Move DB credentials out of `server/src/main/resources/application.properties` into environment-based configuration or use Spring Boot profiles.
   - Add CORS configuration to support development and production origins rather than hardcoding `http://localhost:3000`.
   - Add DB migrations with Flyway or Liquibase for schema evolution.

5. Add authentication and multi-user support.
   - Add a `User` entity with login/registration if the product should store multiple user accounts.
   - Add authentication with Spring Security and JWT or session auth.
   - Protect finance endpoints so each user sees only their own transactions.

6. Improve quality and readiness.
   - Add backend unit/integration tests for controllers and repositories.
   - Add frontend component tests or at least smoke tests.
   - Add OpenAPI/Swagger documentation for backend APIs.
   - Expand `README.md` with setup, development, and deployment instructions.

7. Plan deployment and dev productivity.
   - Add a root-level `README` or scripts to run frontend and backend together.
   - Consider adding Docker support for local development (database + backend + frontend).
   - Add CI pipeline later for build/test automation.

**Relevant files**
- `client/src/api/axios.js` — fix API connectivity and export a real axios client.
- `client/src/App.vue` — remove placeholder UI and wire finance pages.
- `server/src/main/java/com/finance/server/controller/HelloController.java` — replace with finance REST controllers.
- `server/src/main/resources/application.properties` — move secrets/config to env-managed properties.
- `server/build.gradle` — ensure dependencies support Spring Security, Flyway, and test libraries if added.

**Verification**
1. Run `yarn dev` in `client` and `./gradlew bootRun` in `server`, then confirm frontend fetches live API data.
2. Add a transaction through the Vue UI and verify it persists in PostgreSQL.
3. Run backend tests with `./gradlew test` and frontend bundle with `yarn build`.
4. Confirm `README.md` documents local setup and dev commands.

**Decisions**
- Use current Vue 3 + Webpack stack for now; modernize later if needed.
- Focus on building finance domain functionality first rather than full production deployment.
- Treat auth, docs, and CI as second-phase improvements.

**Further Considerations**
1. Do you want the app to support multiple users with login, or start as a single-user local tracker?
2. Should the frontend stay with Webpack, or would migrating to Vite/TypeScript be preferred once core features are stable?
3. Do you want a Docker-based local dev setup for the database/backend/frontend?
