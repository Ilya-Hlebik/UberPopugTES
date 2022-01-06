import Vue from 'vue';
import VueRouter from 'vue-router';
import {store} from './store';
import LoginForm from './components/LoginForm.vue';
import RegistrationForm from './components/RegistrationForm.vue';

Vue.use(VueRouter);

const routes = [

  {
    name: 'login',
    path: '/login',
    component: LoginForm,
  },
  {
    name: 'registration',
    path: '/registration',
    component: RegistrationForm,
  },
  {
    path: '*',
    async beforeEnter(from, to, next) {
      console.log(1)
      const isLogged = await store.dispatch('login/checkAuthorization')
      if (isLogged === true) {
        next();
      }
      else {
        next('login')
      }
    }
  },
];

export const router = new VueRouter({
  routes,
  mode: 'history'
})
