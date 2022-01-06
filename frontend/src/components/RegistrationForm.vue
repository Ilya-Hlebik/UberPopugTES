<template>
  <section class="myform-area">
    <div class="log-container">
      <div class="form-area">
        <div class="form-input">
          <h2>Registration Form</h2>
          <form>
            <div class="form-group">
              <input type="text" id="" name="name" required>
              <label>User Name</label>
            </div>
            <div class="form-group">
              <input type="password" id="" name="password" required>
              <label>password</label>
            </div>
            <div class="myform-button">
              <button class="myform-btn">Registration</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
    export default {
        name: "RegistrationForm"
    }
</script>

<style scoped>

</style>
