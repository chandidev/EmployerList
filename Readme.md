The application is a minimal implementation to convert a list data to heirachical data.

use 'mvn test' command to test the application.

The application doesn't have a main class. The behaviour of the code is explained in the test cases.

Employers with managers not in the list are considered as top level employers since no requirements provided in the area.

The Heirachy class handles null or blank lists.

Employers without managers, Employers with Managers who are not in the Employer list are considered as top level managers since no requirement in that area provided.

Duplicate record checks are not done.

