# Smoke suite

* 1 User can register by filling all fields correctly
    * Open the registration page
    * Filling all required account fields correctly
    * Click on `Register` button
    * Check that page contains `Welcome $username` message
    * Check that page contains `Your account was created successfully. You are now logged in.`

* 2 User cannot register without filling required fields
    * Open the registration page
    * Click on `Register` button
    * Check that all fields contains `$field is required.` tooltip except `Phone` field

* 3 User can register without filling non-required fields
    * Open the registration page
    * Filling all required account fields correctly except `Phone` field
    * Click on `Register` button
    * Check that page contains `Welcome $username` message