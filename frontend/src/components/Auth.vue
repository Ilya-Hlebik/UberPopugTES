<template>
<div>
  <login-form v-show="needShowLoginFrom"></login-form>
  <registration-form v-show="needShowRegistrationForm"></registration-form>
</div>
</template>

<script>
  import {mapGetters} from 'vuex';
  import LoginForm from './LoginForm.vue';
  import RegistrationForm from './RegistrationForm.vue';
  export default {
    name: "Auth",
    computed:{
      ...mapGetters('login', {
        needShowLoginFrom: 'needShowLoginFrom',
        needShowRegistrationForm: 'needShowRegistrationForm',
      }),
    },
    components:{
      LoginForm, RegistrationForm
    }
  }
</script>

<style scoped>

</style>
