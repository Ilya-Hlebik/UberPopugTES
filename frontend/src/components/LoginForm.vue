<template>
  <section class="myform-area">
    <div class="log-container">
      <div class="form-area">
        <div class="form-input">
          <h2>Login Form</h2>
          <form>
            <div class="form-group">
              <input type="text" id="" name="name" required>
              <label>User Name</label>
            </div>
            <div class="form-group">
              <input type="password" id="" name="password" required>
              <label>password</label>
            </div>
            <router-link
              key="registration"
              to="/registration"
              active-class="active"
              tag="a">
              <span class="bm-item">Registration</span>
            </router-link>
            <div class="myform-button">
              <button class="myform-btn">Login</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
  export default {
    name: "LoginForm"
  }
</script>

<style>
  a, a:hover {
    text-decoration: none;
  }

  .myform-area {
    overflow: hidden;
    padding: 100px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate( -30%, -70%);

    display: flex;
    flex-wrap: wrap;
    flex-direction: column;
    align-items: center;
  }

  .log-container {
    width: 800px;
  }

   .myform-area .form-area .form-input {
    position: relative;
    width: 50%;
    height: 100%;
    box-sizing: border-box;
  }

  h2 {
    color: #fff;
  }


  .form-area .form-area .form-input {
    background-color: white;
    position: relative;
    overflow: hidden;
    box-shadow: 0 0 40px 0 #e1e1e1;
  }

  .myform-area .form-area .form-input {
    width: 50%;
    background: #fff;
    padding: 40px 30px;
  }

  .myform-area .form-area .form-input h2 {
    margin-bottom: 20px;
    color: #07315B;
  }

  .myform-area .form-area .form-input input {
    position: relative;
    height: 60px;
    padding: 20px 0;
  }

  .myform-area .form-area .form-input textarea {
    height: 120px;
    padding: 20px 0;
  }

  .myform-area .form-area .form-input input,
  .myform-area .form-area .form-input textarea {
    text-transform: capitalize;
    width: 100%;
    box-sizing: border-box;
    outline: none;
    border: none;
    border-bottom: 2px solid #e1e1e1;
    color: #07315B;
  }

  .myform-area .form-area .form-input form .form-group {
    position: relative;
  }

  .myform-area .form-area .form-input form .form-group label {
    position: absolute;
    text-transform: capitalize;
    top: 20px;
    left: 0;
    pointer-events: none;
    font-size: 14px;
    color: #595959;
    margin-bottom: 0;
    transition: all .6s;
  }

  .myform-area .form-area .form-input input:focus ~ label,
  .myform-area .form-area .form-input textarea:focus ~ label,
  .myform-area .form-area .form-input input:valid ~ label,
  .myform-area .form-area .form-input textarea:valid ~ label {
    top: -5px;
    opacity: 0;
    left: 0;
    color: rgba(103, 58, 183);
    font-size: 12px;
    color: #07315B;
    font-weight: bold;
  }

  .myform-area .form-area .form-input input:focus,
  .myform-area .form-area .form-input textarea:focus,
  .myform-area .form-area .form-input input:valid,
  .myform-area .form-area .form-input textarea:valid {
    border-bottom: 2px solid rgba(103, 58, 183);
  }

  .myform-area .form-area .form-text span a {
    color: rgba(103, 58, 183);
  }

  .myform-area .form-area .myform-button {
    margin-top: 30px;
  }

  .myform-area .form-area .myform-button .myform-btn {
    width: 100%;
    height: 50px;
    font-size: 17px;
    background: rgba(103, 58, 183);
    border: none;
    border-radius: 50px;
    color: #fff;
    cursor: pointer;
    -webkit-transition: all .5s;
    -o-transition: all .5s;
    transition: all .5s;
  }

  .myform-area .form-area .myform-button .myform-btn:hover {
    background: #07315B;
  }
</style>
