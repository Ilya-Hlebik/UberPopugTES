<template>
  <div >
    <span>Uber Popug Tes</span>
    <auth></auth>
    <router-view :key="$route.fullPath"></router-view>
  </div>
</template>

<script>
  import Auth from './components/Auth.vue';
  export default {
    name: "App",
    components: {Auth}
  }

</script>

<style scoped>

</style>
